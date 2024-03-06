USE COMARSA;

SELECT * FROM Gerente;
SELECT * FROM JefePlaya;
SELECT * FROM Contador;
SELECT * FROM Transportista;
SELECT * FROM Usuario;
SELECT * FROM Auditoria;
SELECT * FROM SolicitudCompra;
SELECT * FROM TipoCombustible;
SELECT * FROM Proveedor;
SELECT * FROM Tanque;
GO

/*
############################ TRIGGER PARA INSERTAR IDS DE ENTIDADES EN SUS TABLAS CORRESPONDIENTES ############################
*/

CREATE TRIGGER TR_INSERTAR_ENTIDAD
	ON Usuario
	FOR INSERT
AS
	DECLARE @CARGO VARCHAR(20)
	SELECT @CARGO=E.cargo FROM INSERTED E

IF @CARGO = 'GERENTE'
	INSERT INTO Gerente VALUES((SELECT I.usuario_id FROM INSERTED I),DEFAULT)

IF @CARGO = 'TRANSPORTISTA'
	INSERT INTO Transportista VALUES((SELECT I.usuario_id FROM INSERTED I),DEFAULT)

IF @CARGO = 'JEFE PLAYA'
	INSERT INTO JefePlaya VALUES((SELECT I.usuario_id FROM INSERTED I),DEFAULT)

IF @CARGO = 'CONTADOR'
	INSERT INTO Contador VALUES((SELECT I.usuario_id FROM INSERTED I),DEFAULT)
GO

/*
############################ TRIGGER PARA INSERTAR GERENTE EN AUDITORIA ############################
*/
CREATE TRIGGER TR_GERENTE_SOLICITUD
ON SolicitudCompra
FOR INSERT
AS
	INSERT INTO Auditoria VALUES
	((SELECT (SELECT usuario_id 
	FROM Gerente WHERE gerente_id=I.gerente_id) FROM INSERTED I),
	'SOLICITUD COMPRA',
	NULL,
	'GERENTE',
	(SELECT (SELECT U.usuario
	FROM Gerente G 
	INNER JOIN Usuario U ON G.usuario_id=U.usuario_id 
	WHERE G.gerente_id=I.gerente_id) FROM INSERTED I),
	'INSERCION',
	GETDATE())
GO

/*
############################ TRIGER PARA INSERTAR ACCIONES DE ENTIDADES EN AUDITORIA ############################
*/
CREATE TRIGGER TR_ACTUALIZACION_ESTADO_SC
ON SolicitudCompra
AFTER UPDATE
AS
	DECLARE @ESTADO VARCHAR(20)
	SELECT @ESTADO=I.estado FROM INSERTED I

	IF @ESTADO = 'EN PROCESO'
		INSERT INTO Auditoria VALUES(
		(SELECT (SELECT usuario_id FROM Transportista WHERE transportista_id=I.transportista_id) FROM INSERTED I),
		'SOLICITUD COMPRA','ESTADO','TRANSPORTISTA',
		(SELECT (SELECT U.usuario 
		FROM Transportista T INNER JOIN Usuario U ON T.usuario_id=U.usuario_id WHERE T.transportista_id=I.transportista_id) FROM INSERTED I)
		,'ACTUALIZACION',GETDATE())
	
	IF @ESTADO = 'ENTREGADO'	
		INSERT INTO Auditoria VALUES(
		(SELECT (SELECT usuario_id FROM JefePlaya WHERE jefe_id=I.jefe_id) FROM INSERTED I),
		'SOLICITUD COMPRA','ESTADO'
		,'JEFE PLAYA',(SELECT (SELECT U.usuario FROM JefePlaya J INNER JOIN Usuario U ON J.usuario_id=U.usuario_id WHERE J.jefe_id=I.jefe_id) FROM INSERTED I)
		,'ACTUALIZACION',GETDATE())

	IF @ESTADO = 'FINALIZADO'	
		INSERT INTO Auditoria VALUES(
		(SELECT (SELECT usuario_id FROM Contador WHERE contador_id=I.contador_id) FROM INSERTED I),
		'SOLICITUD COMPRA','ESTADO','CONTADOR',
		(SELECT (SELECT U.usuario FROM Contador C INNER JOIN Usuario U ON C.usuario_id=U.usuario_id WHERE C.contador_id=I.contador_id) FROM INSERTED I)
		,'ACTUALIZACION',GETDATE())

	IF @ESTADO = 'CANCELADO'	
		INSERT INTO Auditoria VALUES(
		(SELECT (SELECT usuario_id FROM Gerente WHERE gerente_id=I.gerente_id) FROM INSERTED I),
		'SOLICITUD COMPRA','ESTADO','GERENTE',
		(SELECT (SELECT U.usuario FROM Gerente G INNER JOIN Usuario U ON G.usuario_id=U.usuario_id WHERE G.gerente_id=I.gerente_id) FROM INSERTED I)
		,'ACTUALIZACION',GETDATE())
GO

/*
############################ PROCEDIMIENTO PARA INSERTAR JEFE EN AUDITORIA ############################
*/
CREATE PROCEDURE PROC_INSERTAR_JEFE_AUDITORIA
@id INT
AS
DECLARE @idUsuario	INT,
		@cargo VARCHAR(25),
		@nombreUsuario VARCHAR(50)
BEGIN
	SELECT @idUsuario=U.usuario_id,
		   @cargo=U.cargo,
		   @nombreUsuario=U.usuario		
	FROM Usuario U 
	INNER JOIN JefePlaya J ON U.usuario_id=J.usuario_id WHERE J.jefe_id=@id

	INSERT INTO Auditoria VALUES(@idUsuario,
	'SOLICITUD COMPRA','ESTADO',
	@cargo,@nombreUsuario,'ACTUALIZACION',GETDATE())
END
GO

/*
############################ PROCEDIMIENTO PARA INSERTAR CONTADOR EN AUDITORIA ############################
*/
CREATE PROCEDURE PROC_INSERTAR_CONTADOR_AUDITORIA
@id INT
AS
DECLARE @idUsuario	INT,
		@cargo VARCHAR(25),
		@nombreUsuario VARCHAR(50)
BEGIN
	SELECT @idUsuario=U.usuario_id,
		   @cargo=U.cargo,
		   @nombreUsuario=U.usuario 
	FROM Usuario U 
	INNER JOIN Contador C ON U.usuario_id=C.usuario_id WHERE C.contador_id=@id

	INSERT INTO Auditoria VALUES(@idUsuario,
	'SOLICITUD COMPRA','ESTADO',
	@cargo,@nombreUsuario,'ACTUALIZACION',GETDATE())
END
GO

SELECT * FROM SolicitudCompra;

CREATE PROCEDURE PROC_REPORTE_SOLICITUDES
(
@ID_SOLICITUD INT
)
AS
BEGIN
	SELECT S.solicitud_id,
		   S.fecha,
		   P.empresa,
		   C.nombre,
		   T.serie,
		   S.cantidad
	FROM SolicitudCompra S
	INNER JOIN Proveedor P ON S.proveedor_id=P.proveedor_id
	INNER JOIN TipoCombustible C ON S.combustible_id=C.combustible_id
	INNER JOIN Tanque T ON S.tanque_id=T.tanque_id
	WHERE S.solicitud_id=@ID_SOLICITUD;
END
GO


