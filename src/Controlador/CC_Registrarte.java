package Controlador;

import Vista.*;
import DAO.*;
import Modelo.*;
import Procesos.*;
import Formatos.*;
import Principal.*;
import java.awt.event.*;

public class CC_Registrarte extends MouseAdapter implements ActionListener{

    IU_Registrarse vista;
    DAO_Registrarte crud;
    Usuario usuario;
    
    public CC_Registrarte(IU_Registrarse r) {
        vista=r;
        vista.jbtnREGISTRARTE.addActionListener(this);
        vista.jlblVOLVER.addMouseListener(this);
        ProcesosRegistrarte.completarCombos(r);
        ProcesosRegistrarte.Presentacion(r);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==vista.jbtnREGISTRARTE){
            
            String password = vista.jpwdcontrasegna.getText();
            String confirmPassword = vista.jpwdconfirmarpass.getText();

            if(confirmPassword.equals(password)){
                
                usuario = ProcesosRegistrarte.leerUsuarios(vista);     
                crud = new DAO_Registrarte();           
                crud.registrarUsuario(usuario, vista);
                Main.iu_log = new IU_IniciarSesion();
                Main.cc_log = new CC_IniciarSesion(Main.iu_log);
                Main.iu_log.setVisible(true);
                vista.setVisible(false);
                
            }else{
                Mensajeria.messageType("Las contraseñas no coinciden","Contraseñas diferentes",2);
            }
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        
        if(me.getSource()==vista.jlblVOLVER){
            
            Main.iu_log = new IU_IniciarSesion();
            Main.cc_log = new CC_IniciarSesion(Main.iu_log);
            Main.iu_log.setVisible(true);
            vista.setVisible(false);
        }   
    }
}
