package Controlador;

import Vista.*;
import Modelo.*;
import DAO.*;
import Formatos.*;
import Principal.*;
import Procesos.*;
import java.awt.event.*;

public class CC_GenerarSolicitud extends MouseAdapter implements ActionListener {
    
    IU_GenerarSolicitud vista;
    DAO_GenerarSolicitud crud;
    Solicitud s;
    
    public CC_GenerarSolicitud(IU_GenerarSolicitud gs){
        vista=gs;
        vista.jbtnGENERAR.addActionListener(this);
        vista.jbtnACTUALIZAR.addActionListener(this);
        vista.jbtnCANCELAR.addActionListener(this);
        vista.jtblSOLICITUDES.addMouseListener(this);
        vista.jlblREPORTE.addMouseListener(this);
        ProcesosGenerales.Presentacion(gs,"GENERAR SOLICITUD");
        ProcesosGenerarSolicitud.completarCombos(gs);
        actualizarTabla();
    }
    
    void actualizarTabla(){    
        crud = new DAO_GenerarSolicitud();
        ProcesosGenerarSolicitud.limpiarEntradas(vista);
        crud.mostrarTablaTanque(vista.jtblTANQUES);
        crud.mostrarTablaSolicitudes(vista.jtblSOLICITUDES); 
        EstiloTabla.FormatoCabecera(vista.jtblTANQUES);
        EstiloTabla.FormatoCabecera(vista.jtblSOLICITUDES);
        vista.jbtnGENERAR.setEnabled(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == vista.jbtnGENERAR){
            
            s = ProcesosGenerarSolicitud.leerSolicitud(vista);
            crud = new DAO_GenerarSolicitud();
            crud.registrarSolicitudCompra(s);
            actualizarTabla();
        }
        if(ae.getSource() == vista.jbtnACTUALIZAR){
            
            int fila = vista.jtblSOLICITUDES.getSelectedRow();
            int id = Integer.parseInt(vista.jtblSOLICITUDES.getValueAt(fila,0).toString());
            
            s = ProcesosGenerarSolicitud.leerSolicitud(vista);
            crud = new DAO_GenerarSolicitud();
            crud.actualizarSolicitudCompra(s,id);          
            actualizarTabla();  
        }
        if(ae.getSource() == vista.jbtnCANCELAR){
            
            int respuesta = Mensajeria.Confirm("¿Esta seguro de cancelar la solicitud de compra con ID_"+vista.jlblID.getText()+"?","Cancelar solicitud compra",0,2);
            
            switch(respuesta){
                case 0:
                    int fila = vista.jtblSOLICITUDES.getSelectedRow();
                    int id = Integer.parseInt(vista.jtblSOLICITUDES.getValueAt(fila,0).toString());
                    
                    crud = new DAO_GenerarSolicitud();
                    crud.cancelarSolicitudCompra(id);   
                    actualizarTabla();
                break;
            }            
        }   
    }
    
    @Override
    public void mouseClicked(MouseEvent me){
        
        if(me.getSource() == vista.jtblSOLICITUDES){
            
            vista.jbtnGENERAR.setEnabled(false);
            
            int fila = vista.jtblSOLICITUDES.getSelectedRow();
            int id = Integer.parseInt(vista.jtblSOLICITUDES.getValueAt(fila,0).toString());
            
            crud = new DAO_GenerarSolicitud();
            s = crud.completarCampos(id);
            
            vista.jdcfecha.setDate(s.getFecha());
            
            AdministrarIDS ai = new AdministrarIDS();
            String proveedor = ai.obtenerNombre(ai.csl_proveedorNombre,s.getProveedor_id());
            String combustible = ai.obtenerNombre(ai.csl_combustibleNombre,s.getCombustible_id());
            String tanque = ai.obtenerNombre(ai.csl_tanqueSerie,s.getTanque_id());
            String transportista = ai.obtenerNombre(ai.csl_transportistaNombre,s.getTransportista_id());
            
            vista.jlblID.setText(""+s.getSolicitud_id());
            vista.jcmbproveedor.setSelectedItem(proveedor); 
            vista.jcmbcombustible.setSelectedItem(combustible);           
            vista.jcmbtanque.setSelectedItem(tanque);
            vista.jtxtcantidad.setText(""+s.getCantidad());
            vista.jcmbtransportista.setSelectedItem(transportista);
        }
        
        if(me.getSource() == vista.jlblREPORTE){
            
            Main.iu_rport = new IU_Reporte();
            Main.cc_rport = new CC_Reporte(Main.iu_rport);
            Main.iu_rport.setVisible(true);
        }
    }  
}
