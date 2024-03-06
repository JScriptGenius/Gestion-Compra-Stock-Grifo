package Controlador;

import Vista.*;
import Modelo.*;
import Procesos.*;
import DAO.*;
import Formatos.*;
import java.awt.event.*;

public class CC_RegistrarTanque extends MouseAdapter implements ActionListener,Constantes{

    IU_RegistrarTanque vista;
    DAO_RegistrarTanque crud;
    Tanque t;
    
    public CC_RegistrarTanque(IU_RegistrarTanque tc) {
        vista=tc;
        vista.jbtnREGISTRAR.addActionListener(this);
        vista.jbtnACTUALIZAR.addActionListener(this);
        vista.jbtnREFRESCAR.addActionListener(this);
        vista.jtblTANQUES.addMouseListener(this);
        vista.jrbhabilitado.addActionListener(this);
        vista.jrbinhabilitado.addActionListener(this);
        ProcesosGenerales.Presentacion(tc,"REGISTRAR TANQUE");
        ProcesosRegistrarTanque.completarCombos(tc);
        actualizarTabla();
    }
    
    void actualizarTabla(){
        crud = new DAO_RegistrarTanque();
        ProcesosRegistrarTanque.limpiarEntradas(vista);
        crud.mostrarTabla(vista.jtblTANQUES);
        EstiloTabla.FormatoCabecera(vista.jtblTANQUES);
        vista.jbtnREGISTRAR.setEnabled(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == vista.jbtnREGISTRAR){
           
            Tanque tanque = ProcesosRegistrarTanque.leerTanque(vista);
            crud =  new DAO_RegistrarTanque();
            crud.registrarTanque(tanque);
            actualizarTabla();
        }
        if(ae.getSource() == vista.jbtnACTUALIZAR){
            
            int fila = vista.jtblTANQUES.getSelectedRow();
            int id = Integer.parseInt(vista.jtblTANQUES.getValueAt(fila,0).toString());
            
            t = ProcesosRegistrarTanque.leerTanque(vista);
            crud = new DAO_RegistrarTanque();
            crud.actualizarTanque(t,id);
            actualizarTabla();
        }       
        if(ae.getSource() == vista.jbtnREFRESCAR){
            
            crud = new DAO_RegistrarTanque();
            crud.mostrarTabla(vista.jtblTANQUES);
        }
        if(ae.getSource() == vista.jrbhabilitado){
            
            crud = new DAO_RegistrarTanque();
            crud.mostrarSegunEstado(vista.jtblTANQUES,ESTADO_TANQUE[0]);       
        }
        if(ae.getSource() == vista.jrbinhabilitado){
            
            crud = new DAO_RegistrarTanque();
            crud.mostrarSegunEstado(vista.jtblTANQUES,ESTADO_TANQUE[1]);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent me){
        
        if(me.getSource() == vista.jtblTANQUES){
            
            vista.jbtnREGISTRAR.setEnabled(false);
            
            int fila = vista.jtblTANQUES.getSelectedRow();
            int id = Integer.parseInt(vista.jtblTANQUES.getValueAt(fila,0).toString());
            
            crud = new DAO_RegistrarTanque();
            t = crud.completarCampos(id);
            
            vista.jtxtserie.setText(t.getSerie());
            
            AdministrarIDS ai = new AdministrarIDS();
            String combustible = ai.obtenerNombre(ai.csl_combustibleNombre,t.getCombustible_id());
            
            vista.jcmbcombustible.setSelectedItem(combustible); 
            vista.jtxtcapacidadmax.setText(""+t.getCapacidad_max());
            vista.jtxtcantidad.setText(""+t.getCantidad());
            vista.jcmbestado.setSelectedItem(t.getEstado());
        }   
    }
}
