package Controlador;

import Vista.*;
import Formatos.*;
import Modelo.*;
import Principal.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JInternalFrame;

public class CC_MenuPrincipal extends MouseAdapter implements ActionListener,Constantes{

    IU_MenuPrincipal vista;
    
    public CC_MenuPrincipal(IU_MenuPrincipal mp){
        vista=mp;
        vista.jbtnCERRAR_SESION.addActionListener(this);
        vista.jlblSALIR.addMouseListener(this);
        vista.jpanREGISTRAR_COMBUSTIBLE.addMouseListener(this);
        vista.jpanREGISTRAR_TANQUE.addMouseListener(this);
        vista.jpanREGISTRAR_PROVEEDOR.addMouseListener(this);
        vista.jpanGENERAR_SOLICITUDES.addMouseListener(this);
        vista.jpanRECOGER_PEDIDO.addMouseListener(this);
        vista.jpanRECEPCIONAR_PEDIDO.addMouseListener(this);
        vista.jpanCERRAR_COMPRA.addMouseListener(this);
        vista.jpanESTADO_TANQUES.addMouseListener(this);
        vista.setVisible(true);        
    }
    
    public void administrarPanelInterfaces(JInternalFrame iframe){
        vista.jdespPANEL_INTERFACES.removeAll();
        vista.jdespPANEL_INTERFACES.updateUI();
        vista.jdespPANEL_INTERFACES.add(iframe);          
        CentrarForma.CPanel(vista.jdespPANEL_INTERFACES,iframe);
    }    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == vista.jbtnCERRAR_SESION){    
            Main.iu_log = new IU_IniciarSesion();
            Main.cc_log = new CC_IniciarSesion(Main.iu_log);
            Main.iu_log.setVisible(true);
            vista.setVisible(false);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        
        /*LABEL SALIR*/
        if(me.getSource() == vista.jlblSALIR){
            System.exit(0);
        }
        /*PANEL REGISTRAR COMBUSTIBLE*/
        if(vista.jlblCargo.getText().equals(CARGOS[0])){
            
            if(me.getSource() == vista.jpanREGISTRAR_COMBUSTIBLE){
                Main.iu_rc = new IU_RegistrarCombustible();
                Main.cc_rc = new CC_RegistrarCombustible(Main.iu_rc);   
                administrarPanelInterfaces(Main.iu_rc);
            }   
        /*PANEL REGISTRAR TANQUE*/
            if(me.getSource() == vista.jpanREGISTRAR_TANQUE){
                Main.iu_rt = new IU_RegistrarTanque();
                Main.cc_rt = new CC_RegistrarTanque(Main.iu_rt);   
                administrarPanelInterfaces(Main.iu_rt);
            }
        /*PANEL REGISTRAR PROVEEDOR*/
            if(me.getSource() == vista.jpanREGISTRAR_PROVEEDOR){
                Main.iu_rprov = new IU_RegistrarProveedor();
                Main.cc_rprov = new CC_RegistrarProveedor(Main.iu_rprov);   
                administrarPanelInterfaces(Main.iu_rprov);
            }
        /*PANEL GENERAR SOLICITUD*/
            if(me.getSource() == vista.jpanGENERAR_SOLICITUDES){
                Main.iu_gs = new IU_GenerarSolicitud();
                Main.cc_gs = new CC_GenerarSolicitud(Main.iu_gs);   
                administrarPanelInterfaces(Main.iu_gs);
            }
        }else if (vista.jlblCargo.getText().equals(CARGOS[1])){
            
        /*PANEL RECOGER PEDIDO*/
            if(me.getSource() == vista.jpanRECOGER_PEDIDO){
                Main.iu_rp = new IU_RecogerPedido();
                Main.cc_rp = new CC_RecogerPedido(Main.iu_rp);   
                administrarPanelInterfaces(Main.iu_rp);
            }
        }else if(vista.jlblCargo.getText().equals(CARGOS[2])){
            
        /*PANEL RECEPCIONAR PEDIDO*/
            if(me.getSource() == vista.jpanRECEPCIONAR_PEDIDO){
                Main.iu_rped = new IU_RecepcionarPedido();
                Main.cc_rped = new CC_RecepcionarPedido(Main.iu_rped);   
                administrarPanelInterfaces(Main.iu_rped);
            }
        }else{ /*if(vista.jlblCargo.getText().equals(CARGOS[3])*/
            
        /*PANEL CERRAR COMPRA*/
            if(me.getSource() == vista.jpanCERRAR_COMPRA){
                Main.iu_ccom = new IU_CerrarCompra();
                Main.cc_ccom= new CC_CerrarCompra(Main.iu_ccom);   
                administrarPanelInterfaces(Main.iu_ccom);
            }  
        /*PANEL ESTADO TANQUES*/
            if(me.getSource() == vista.jpanESTADO_TANQUES){
                Main.iu_gt = new IU_GestionarTanque();
                Main.cc_gt = new CC_GestionarTanque(Main.iu_gt);   
                administrarPanelInterfaces(Main.iu_gt);
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {

        if(vista.jlblCargo.getText().equals(CARGOS[0])){
            if(me.getSource() == vista.jpanREGISTRAR_COMBUSTIBLE){vista.jpanREGISTRAR_COMBUSTIBLE.setBackground(new Color(230, 57, 70));}
            if(me.getSource() == vista.jpanREGISTRAR_TANQUE){vista.jpanREGISTRAR_TANQUE.setBackground(new Color(230, 57, 70));}
            if(me.getSource() == vista.jpanREGISTRAR_PROVEEDOR){vista.jpanREGISTRAR_PROVEEDOR.setBackground(new Color(230, 57, 70));}
            if(me.getSource() == vista.jpanGENERAR_SOLICITUDES){vista.jpanGENERAR_SOLICITUDES.setBackground(new Color(230, 57, 70));}
        }else if(vista.jlblCargo.getText().equals(CARGOS[1])){
            if(me.getSource() == vista.jpanRECOGER_PEDIDO){vista.jpanRECOGER_PEDIDO.setBackground(new Color(230, 57, 70));}
        }else if(vista.jlblCargo.getText().equals(CARGOS[2])){
            if(me.getSource() == vista.jpanRECEPCIONAR_PEDIDO){vista.jpanRECEPCIONAR_PEDIDO.setBackground(new Color(230, 57, 70));}
        }else{
            if(me.getSource() == vista.jpanCERRAR_COMPRA){vista.jpanCERRAR_COMPRA.setBackground(new Color(230, 57, 70));}
            if(me.getSource() == vista.jpanESTADO_TANQUES){vista.jpanESTADO_TANQUES.setBackground(new Color(230, 57, 70));}
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
        if(vista.jlblCargo.getText().equals(CARGOS[0])){
            if(me.getSource() == vista.jpanREGISTRAR_COMBUSTIBLE){vista.jpanREGISTRAR_COMBUSTIBLE.setBackground(new Color(69, 123, 157));}
            if(me.getSource() == vista.jpanREGISTRAR_TANQUE){vista.jpanREGISTRAR_TANQUE.setBackground(new Color(69, 123, 157));}
            if(me.getSource() == vista.jpanREGISTRAR_PROVEEDOR){vista.jpanREGISTRAR_PROVEEDOR.setBackground(new Color(69, 123, 157));}
            if(me.getSource() == vista.jpanGENERAR_SOLICITUDES){vista.jpanGENERAR_SOLICITUDES.setBackground(new Color(69, 123, 157));}
        }else if(vista.jlblCargo.getText().equals(CARGOS[1])){
            if(me.getSource() == vista.jpanRECOGER_PEDIDO){vista.jpanRECOGER_PEDIDO.setBackground(new Color(69, 123, 157));}            
        }else if(vista.jlblCargo.getText().equals(CARGOS[2])){
            if(me.getSource() == vista.jpanRECEPCIONAR_PEDIDO){vista.jpanRECEPCIONAR_PEDIDO.setBackground(new Color(69, 123, 157));}
        }else{
            if(me.getSource() == vista.jpanCERRAR_COMPRA){vista.jpanCERRAR_COMPRA.setBackground(new Color(69, 123, 157));}
            if(me.getSource() == vista.jpanESTADO_TANQUES){vista.jpanESTADO_TANQUES.setBackground(new Color(69, 123, 157));}
        }
    }   
}
