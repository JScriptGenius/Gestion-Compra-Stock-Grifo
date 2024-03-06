package DAO;

import Formatos.*;
import java.sql.*;

public class ConectorDB{
    
    String cadena="jdbc:sqlserver://localhost:1433"+";"+"databaseName="+"COMARSA"+";integratedSecurity=false; trustServerCertificate=true;"+"user=Jhosep;"+"password=123;";
    
    
    Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData mdata;
    CallableStatement cs;
    
    /*CONSTRUCTOR*/
    public ConectorDB(){
        
        try{        
            conexion = DriverManager.getConnection(cadena);
            st = conexion.createStatement();           
        }catch(SQLException e){
            Mensajeria.Message("ERROR: NO SE PUDO CONECTAR CON LA BASE DE DATOS. "+e.getMessage());
        }
    }
}
