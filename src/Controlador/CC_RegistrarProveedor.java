package Controlador;

import Procesos.*;
import Vista.*;
import DAO.*;
import Formatos.EstiloTabla;
import Formatos.Mensajeria;
import Modelo.*;
import java.awt.event.*;

public class CC_RegistrarProveedor extends MouseAdapter implements ActionListener{
    
    IU_RegistrarProveedor vista;
    DAO_RegistrarProveedor crud;
    Proveedor p;
    
    public CC_RegistrarProveedor(IU_RegistrarProveedor rp){
        vista=rp;
        vista.jbtnREGISTRAR.addActionListener(this);
        vista.jbtnACTUALIZAR.addActionListener(this);
        vista.jbtnELIMINAR.addActionListener(this);
        vista.jtblPROVEEDORES.addMouseListener(this);
        ProcesosGenerales.Presentacion(rp,"REGISTRAR PROVEEDOR");
        actualizarTabla();
    }
    
    void actualizarTabla(){
        crud = new DAO_RegistrarProveedor();
        ProcesosRegistrarProveedor.limpiarEntradas(vista);
        crud.mostrarTabla(vista.jtblPROVEEDORES);
        EstiloTabla.FormatoCabecera(vista.jtblPROVEEDORES);
        vista.jbtnREGISTRAR.setEnabled(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==vista.jbtnREGISTRAR){
            
            p = ProcesosRegistrarProveedor.leerProveedor(vista);
            crud = new DAO_RegistrarProveedor();
            crud.registrarProveedor(p);
            actualizarTabla();
        }
        if(ae.getSource()==vista.jbtnACTUALIZAR){
            
            int fila = vista.jtblPROVEEDORES.getSelectedRow();
            int id = Integer.parseInt(vista.jtblPROVEEDORES.getValueAt(fila,0).toString());
            
            p = ProcesosRegistrarProveedor.leerProveedor(vista);
            crud = new DAO_RegistrarProveedor();
            crud.actualizarProveedor(p,id);
            actualizarTabla();
        }
        if(ae.getSource()==vista.jbtnELIMINAR){
            
            int respuesta = Mensajeria.Confirm("¿Esta seguro de eliminar el proveedor "+vista.jtxtempresa.getText()+"?","Eliminar proveedor",0,2);
            
            switch(respuesta){
                case 0:
                    int fila = vista.jtblPROVEEDORES.getSelectedRow();
                    int id = Integer.parseInt(vista.jtblPROVEEDORES.getValueAt(fila,0).toString());

                    p = ProcesosRegistrarProveedor.leerProveedor(vista);
                    crud = new DAO_RegistrarProveedor();
                    crud.eliminarProveedor(id);
                    actualizarTabla();
                break;
            }
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent me){
        
        if(me.getSource() == vista.jtblPROVEEDORES){
            
            vista.jbtnREGISTRAR.setEnabled(false);
            
            int fila = vista.jtblPROVEEDORES.getSelectedRow();
            int id = Integer.parseInt(vista.jtblPROVEEDORES.getValueAt(fila,0).toString());
            
            crud = new DAO_RegistrarProveedor();
            p = crud.completarCampos(id);
            
            vista.jtxtempresa.setText(p.getEmpresa());
        }   
    }
}
