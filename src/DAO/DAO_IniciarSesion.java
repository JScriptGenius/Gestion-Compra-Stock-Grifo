package DAO;

import Controlador.*;
import Formatos.*;
import Modelo.*;
import Principal.*;
import Vista.*;

public class DAO_IniciarSesion extends ConectorDB implements Constantes{
    
    public void inicioSession(IU_IniciarSesion log){
        
        String user = log.jtxtusuario.getText();
        String pass = log.jpswcontrasegna.getText();
        boolean encontrado = false;
        
        try{
            
            rs = st.executeQuery("SELECT (SELECT G.gerente_id FROM Gerente G WHERE G.usuario_id= U.usuario_id),"
                                + "(SELECT T.transportista_id FROM Transportista T WHERE T.usuario_id= U.usuario_id),"
                                + "(SELECT J.jefe_id FROM JefePlaya J WHERE J.usuario_id= U.usuario_id),"
                                + "(SELECT C.contador_id FROM Contador C WHERE C.usuario_id= U.usuario_id),"
                                + "U.usuario,U.contrasegna,U.cargo,U.nombres FROM Usuario U");
                        
            while(rs.next() && (encontrado != true)){
                
                int idGerente = rs.getInt(1);
                int idTransporista = rs.getInt(2);
                int idJefePlaya = rs.getInt(3);
                int idContador= rs.getInt(4);
                
                String usu = rs.getString(5);
                String contra = rs.getString(6);
                String cargo = rs.getString(7);
                String nombre = rs.getString(8);
                
                if(user.equals(usu) && pass.equals(contra)){
                    
                    if(cargo.equals(CARGOS[0])){
                        Main.iu_mp = new IU_MenuPrincipal();
                        Main.cc_mp = new CC_MenuPrincipal(Main.iu_mp);
                        Main.iu_mp.jlblID.setText(idGerente+"");
                        Main.iu_mp.jlblNombre.setText(nombre);
                        Main.iu_mp.jlblCargo.setText(cargo);
                        Main.iu_mp.jlblUsuario.setText(usu);
                        Main.iu_mp.setVisible(true);
                        log.setVisible(false);
                        encontrado=true;
                    }else if(cargo.equals(CARGOS[1])){
                        Main.iu_mp = new IU_MenuPrincipal();
                        Main.cc_mp = new CC_MenuPrincipal(Main.iu_mp);
                        Main.iu_mp.jlblID.setText(idTransporista+"");
                        Main.iu_mp.jlblNombre.setText(nombre);
                        Main.iu_mp.jlblCargo.setText(cargo);
                        Main.iu_mp.jlblUsuario.setText(usu);
                        Main.iu_mp.setVisible(true);
                        log.setVisible(false);
                        encontrado=true;
                    }else if(cargo.equals(CARGOS[2])){
                        Main.iu_mp = new IU_MenuPrincipal();
                        Main.cc_mp = new CC_MenuPrincipal(Main.iu_mp);
                        Main.iu_mp.jlblID.setText(idJefePlaya+"");
                        Main.iu_mp.jlblNombre.setText(nombre);
                        Main.iu_mp.jlblCargo.setText(cargo);
                        Main.iu_mp.jlblUsuario.setText(usu);
                        Main.iu_mp.setVisible(true);
                        log.setVisible(false);
                        encontrado=true; 
                    }else{
                        Main.iu_mp = new IU_MenuPrincipal();
                        Main.cc_mp = new CC_MenuPrincipal(Main.iu_mp);
                        Main.iu_mp.jlblID.setText(idContador+"");
                        Main.iu_mp.jlblNombre.setText(nombre);
                        Main.iu_mp.jlblCargo.setText(cargo);
                        Main.iu_mp.jlblUsuario.setText(usu);
                        Main.iu_mp.setVisible(true);
                        log.setVisible(false);
                        encontrado=true;  
                    }   
                }      
            }
            if (encontrado != true) {
                Mensajeria.messageType("El usuario o la contraseña no coinciden.","Sin coincidencia", 2);
            }
            rs.close();
        }catch(Exception ex){
            Mensajeria.messageType("ERROR: PROBLEMAS CON LA BASE DE DATOS..."+ex.getMessage(),"Error BaseDatos", 0);
        }
    }
}
