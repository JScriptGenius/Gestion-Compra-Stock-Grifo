--ELIMINACION DATABASE COMARSA--
DROP DATABASE COMARSA;

--CREACION DATABASE COMARSA--
CREATE DATABASE COMARSA

--USAR DATABASE COMARSA--
USE COMARSA

--CREACION DE LA TABLA USUARIO--
CREATE TABLE Usuario(
	usuario_id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	nombres VARCHAR(50) NOT NULL,
	apellidos VARCHAR(50) NOT NULL,
	cargo VARCHAR(25) NOT NULL,
	telefono VARCHAR(20) NOT NULL,
	correo_electronico VARCHAR(100) NOT NULL,
	usuario VARCHAR(50) NOT NULL,
	contrasegna VARCHAR(40) NOT NULL,
	estado INT DEFAULT 1 NULL
);

--CREACION DE LA TABLA JEFEPLAYA--
CREATE TABLE JefePlaya (
	jefe_id INT IDENTITY(1,1) PRIMARY KEY NOT NULL, 
	usuario_id INT NOT NULL,
	estado INT DEFAULT 1 NULL,
	FOREIGN KEY (usuario_id) REFERENCES Usuario(usuario_id) 
);

--CREACION DE LA TABLA GERENTE--
CREATE TABLE Gerente (
	gerente_id INT IDENTITY(1,1) PRIMARY KEY NOT NULL, 
	usuario_id INT NOT NULL,
	estado INT DEFAULT 1 NULL,
	FOREIGN KEY (usuario_id) REFERENCES Usuario(usuario_id) 
);

--CREACION DE LA TABLA CONTADOR--
CREATE TABLE Contador (
	contador_id INT IDENTITY(1,1) PRIMARY KEY NOT NULL, 
	usuario_id INT NOT NULL,
	estado INT DEFAULT 1 NULL,
	FOREIGN KEY (usuario_id) REFERENCES Usuario(usuario_id) 
);

--CREACION DE LA TABLA TRANSPORTISTA--
CREATE TABLE Transportista (
	transportista_id INT IDENTITY(1,1) PRIMARY KEY NOT NULL, 
	usuario_id INT NOT NULL,
	estado INT DEFAULT 1 NULL,
	FOREIGN KEY (usuario_id) REFERENCES Usuario(usuario_id) 
);

--CREACION DE LA TABLA PROVEEDOR--
CREATE TABLE Proveedor(
	proveedor_id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	empresa VARCHAR(100) NOT NULL,
	estado INT DEFAULT 1 NULL
);

--CREACION DE LA TABLA TIPO_COMBUSTIBLE--
CREATE TABLE TipoCombustible (
  combustible_id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  octanaje INT NOT NULL,
  gerente_id INT NULL,
  estado INT DEFAULT 1 NULL,
  FOREIGN KEY (gerente_id) REFERENCES Gerente(gerente_id)
);

--CREACION DE LA TABLA TANQUE--
CREATE TABLE Tanque(
  tanque_id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  serie CHAR(6) NOT NULL,
  combustible_id INT NOT NULL,
  capacidadMax INT NOT NULL,
  cantidad INT NOT NULL,
  gerente_id INT NULL,
  contador_id INT DEFAULT NULL,
  estado VARCHAR(20) DEFAULT 'HABILITADO',
  FOREIGN KEY (combustible_id) REFERENCES TipoCombustible(combustible_id),
  FOREIGN KEY (gerente_id) REFERENCES Gerente(gerente_id),
  FOREIGN KEY (contador_id) REFERENCES Contador(contador_id)
);

--CREACION DE LA TABLA AUDITORIA--
CREATE TABLE Auditoria(
	usuario_id INT NOT NULL,
	tabla VARCHAR(50) NOT NULL,
	campo VARCHAR(50) NULL,
	cargo VARCHAR(25) NULL,
	usuario VARCHAR(20) NULL,
	operacion VARCHAR(20) NULL,
	fecha DATE NULL,
	FOREIGN KEY (usuario_id) REFERENCES Usuario(usuario_id)
);

/*CREACION DE LA TABLA SOLICITUD_COMPRA*/
CREATE TABLE SolicitudCompra (
  solicitud_id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  fecha DATE NOT NULL,
  proveedor_id INT NOT NULL,
  combustible_id INT NOT NULL,
  tanque_id INT NOT NULL,
  cantidad DECIMAL NOT NULL,
  gerente_id INT NOT NULL,
  transportista_id INT NOT NULL,
  jefe_id INT DEFAULT NULL,
  contador_id INT DEFAULT NULL,
  estado VARCHAR(20) DEFAULT 'GENERADO',
  FOREIGN KEY (proveedor_id) REFERENCES Proveedor(proveedor_id),
  FOREIGN KEY (transportista_id) REFERENCES Transportista(transportista_id),
  FOREIGN KEY (combustible_id) REFERENCES TipoCombustible(combustible_id),
  FOREIGN KEY (tanque_id) REFERENCES Tanque(tanque_id),
  FOREIGN KEY (jefe_id) REFERENCES JefePlaya(jefe_id),
  FOREIGN KEY (gerente_id) REFERENCES Gerente(gerente_id),
  FOREIGN KEY (contador_id) REFERENCES Contador(contador_id)
);