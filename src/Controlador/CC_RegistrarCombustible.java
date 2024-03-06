package Controlador;

import Vista.*;
import Modelo.*;
import Procesos.*;
import DAO.*;
import Formatos.*;
import java.awt.event.*;

public class CC_RegistrarCombustible extends MouseAdapter implements ActionListener{
    
    IU_RegistrarCombustible vista;
    DAO_RegistrarCombustible crud;
    Combustible c;
    
    public CC_RegistrarCombustible(IU_RegistrarCombustible rc){
        vista=rc;
        vista.jbtnREGISTRAR.addActionListener(this);
        vista.jbtnACTUALIZAR.addActionListener(this);
        vista.jbtnELIMINAR.addActionListener(this);
        vista.jtblCOMBUSTIBLES.addMouseListener(this);
        ProcesosGenerales.Presentacion(rc,"REGISTRAR COMBUSTIBLE");
        actualizarTabla();
    }
    
    void actualizarTabla(){
        
        crud = new DAO_RegistrarCombustible();
        ProcesosRegistrarCombustible.limpiarEntradas(vista);
        crud.mostrarTabla(vista.jtblCOMBUSTIBLES);
        EstiloTabla.FormatoCabecera(vista.jtblCOMBUSTIBLES);
        vista.jbtnREGISTRAR.setEnabled(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == vista.jbtnREGISTRAR){
            
            c = ProcesosRegistrarCombustible.leerCombustible(vista);
            crud = new DAO_RegistrarCombustible();
            crud.registrarCombustible(c);
            actualizarTabla();
        }
        if(ae.getSource() == vista.jbtnACTUALIZAR){
            
            int fila = vista.jtblCOMBUSTIBLES.getSelectedRow();
            int id = Integer.parseInt(vista.jtblCOMBUSTIBLES.getValueAt(fila,0).toString());
            
            c = ProcesosRegistrarCombustible.leerCombustible(vista);
            crud = new DAO_RegistrarCombustible();
            crud.actualizarCombustible(c,id);
            actualizarTabla();
        }
        if(ae.getSource() == vista.jbtnELIMINAR){
        
        int respuesta = Mensajeria.Confirm("¿Esta seguro de eliminar el combustible "+vista.jtxtnombre.getText()+"?","Eliminar combustible",0,2);
            
            switch(respuesta){
                case 0:
                    int fila = vista.jtblCOMBUSTIBLES.getSelectedRow();
                    int id = Integer.parseInt(vista.jtblCOMBUSTIBLES.getValueAt(fila,0).toString());

                    crud = new DAO_RegistrarCombustible();
                    crud.eliminarCombustible(id);
                    actualizarTabla();
                break;
            }
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent me){
        
        if(me.getSource() == vista.jtblCOMBUSTIBLES){
            
            vista.jbtnREGISTRAR.setEnabled(false);
            
            int fila = vista.jtblCOMBUSTIBLES.getSelectedRow();
            int id = Integer.parseInt(vista.jtblCOMBUSTIBLES.getValueAt(fila,0).toString());
            
            crud = new DAO_RegistrarCombustible();
            c = crud.completarCampos(id);
            
            vista.jtxtnombre.setText(c.getNombre());
            vista.jtxtoctanaje.setText(""+c.getOctanaje()); 
        }   
    }  
}
