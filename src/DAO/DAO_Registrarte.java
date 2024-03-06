package DAO;

import Formatos.*;
import Vista.*;
import Modelo.*;

public class DAO_Registrarte extends ConectorDB{
    
    public void registrarUsuario(Usuario usuario, IU_Registrarse reg){
    
        String newUsuario = reg.jtxtusuario.getText();
        boolean encontrado = false;
        
        try{
            
            rs = st.executeQuery("SELECT usuario FROM Usuario");

            while(rs.next() && (encontrado != true)){

                String user = rs.getString(1);

                if(newUsuario.equals(user)){

                    Mensajeria.messageType("El usuario que usted ha ingresado ya existe, pruebe con otro...","Usuario existente",2);
                    encontrado = true;

                }else{
                    try{
                        ps = conexion.prepareStatement("INSERT INTO Usuario (nombres,apellidos,cargo,telefono,correo_electronico,usuario,contrasegna,estado) VALUES (?,?,?,?,?,?,?,?)");
                        ps.setString(1, usuario.getNombre());
                        ps.setString(2, usuario.getApellido());
                        ps.setString(3, usuario.getCargo());
                        ps.setString(4, usuario.getTelefono());
                        ps.setString(5, usuario.getCorreo());
                        ps.setString(6, usuario.getUsuario());
                        ps.setString(7, usuario.getContrasegna());
                        ps.setInt(8, usuario.getEstado());
                        ps.executeUpdate();
                        Mensajeria.Message("¡Se registro correctamente!");
                    }catch(Exception e){
                        Mensajeria.messageType("ERROR: No se puede insertar el usuario..."+e.getMessage(),"Error DB",0);
                        }
                        encontrado = true;
                        ps.close();
                    }
                }        
            rs.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se puede identificar el usuario..."+e.getMessage(),"Error DB",0);
        }  
    }
}
