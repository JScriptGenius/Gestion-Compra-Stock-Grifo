package Controlador;

import Vista.*;
import DAO.*;
import Modelo.*;
import Principal.*;
import java.awt.event.*;

public class CC_IniciarSesion extends MouseAdapter implements ActionListener{

    IU_IniciarSesion vista;
    DAO_IniciarSesion crud;
    Usuario usuario;
    
    public CC_IniciarSesion(IU_IniciarSesion log){
        vista=log;
        vista.jbtnINGRESAR.addActionListener(this);
        vista.jlblREGISTRARTE.addMouseListener(this);
        vista.jlblOCULTAR.addMouseListener(this);
        vista.jlblMOSTRAR.addMouseListener(this);
        vista.jlblMOSTRAR.setVisible(false);
        vista.jpswcontrasegna.setEchoChar('•');
        log.setTitle("INICIAR SESIÓN");
        log.setLocationRelativeTo(null);
        log.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == vista.jbtnINGRESAR){
            crud = new DAO_IniciarSesion();
            crud.inicioSession(vista); 
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        if(me.getSource() == vista.jlblREGISTRARTE){
            
            Main.iu_reg = new IU_Registrarse();
            Main.cc_reg = new CC_Registrarte(Main.iu_reg);
            Main.iu_reg.setVisible(true);
            vista.setVisible(false);
        }
        if(me.getSource() == vista.jlblOCULTAR){
            
            vista.jlblMOSTRAR.setVisible(true);
            vista.jlblOCULTAR.setVisible(false);
            vista.jpswcontrasegna.setEchoChar((char)0);           
        }       
        if(me.getSource() == vista.jlblMOSTRAR){
            
            vista.jlblOCULTAR.setVisible(true);
            vista.jlblMOSTRAR.setVisible(false);
            vista.jpswcontrasegna.setEchoChar('•');
        }
    }   
}
