package DAO;

import Formatos.*;

public class AdministrarIDS extends ConectorDB{
    
    /*OBTENER COMBUSTIBLE*/
    public final String csl_combustibleId="SELECT C.combustible_id FROM TipoCombustible C WHERE C.nombre=?";  
    public final String csl_combustibleNombre="SELECT nombre FROM TipoCombustible WHERE combustible_id=?";
    
    /*OBTENER PROVEEDOR*/
    public final String csl_proveedorId="SELECT P.proveedor_id FROM Proveedor P WHERE P.empresa=?";  
    public final String csl_proveedorNombre="SELECT P.empresa FROM Proveedor P WHERE P.proveedor_id=?";
    
    /*OBTENER TANQUE*/
    public final String csl_tanqueId="SELECT T.tanque_id FROM Tanque T WHERE T.serie=?";  
    public final String csl_tanqueSerie="SELECT serie FROM Tanque WHERE tanque_id=?";
    
    /*OBTENER TRANSPORTISTA*/
    public final String csl_transportistaId="SELECT T.transportista_id FROM Transportista T"+
                                            " INNER JOIN Usuario U ON T.usuario_id=U.usuario_id WHERE U.nombres=?";  
    public final String csl_transportistaNombre="SELECT U.nombres FROM Transportista T"+
                                            " INNER JOIN Usuario U ON T.usuario_id=U.usuario_id WHERE transportista_id=?";
    
    public AdministrarIDS(){}
    
    public String obtenerNombre(String consulta,int parametro){
        
        String nombre="";
        
        try{
            ps = conexion.prepareStatement(consulta);
            ps.setInt(1, parametro);
            rs = ps.executeQuery();
            
            if(rs.next()){
                nombre = rs.getString(1);
            }
            ps.close();
        }catch(Exception ex){
            Mensajeria.messageType("ERROR: No se puede recuperar el nombre..."+ex.getMessage(),"Error DB",0);
        }       
        return nombre;
    }
    
    public int recuperarID(String consulta,String parametro){
        
        int id = 0;
        
        try {
            ps = conexion.prepareStatement(consulta);
            ps.setString(1, parametro);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                id = rs.getInt(1);
            }
            ps.close();
        } catch (Exception ex) {
            Mensajeria.messageType("ERROR: No se puede recuperar el ID..."+ex.getMessage(), "Error DB",0);
        }
        return id;
    }
}
