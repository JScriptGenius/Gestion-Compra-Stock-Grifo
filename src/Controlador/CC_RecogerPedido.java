package Controlador;

import DAO.*;
import Formatos.*;
import Vista.*;
import Modelo.*;
import Procesos.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class CC_RecogerPedido implements ActionListener,Constantes{

    IU_RecogerPedido vista;
    DAO_ActualizarPedido crud;
    Solicitud s;
    
    public CC_RecogerPedido(IU_RecogerPedido me) {
        vista=me;
        vista.jbtnACTUALIZAR.addActionListener(this);
        vista.jbtnFILTRAR.addActionListener(this);
        vista.jbtnREFRESCAR.addActionListener(this);
        ProcesosGenerales.Presentacion(me,"RECOGER PEDIDO");
        ProcesosGenerales.completarCombo(vista.jcmbestadop,ESTADO_SOLICITUD[1]);
        refrescarComponentes();
    }
    
    void refrescarComponentes(){
        crud = new DAO_ActualizarPedido();
        crud.mostrarTablaSolicitudes(vista.jtblSOLICITUDES,ESTADO_SOLICITUD[0],ESTADO_SOLICITUD[1]); 
        EstiloTabla.FormatoCabecera(vista.jtblSOLICITUDES);
        vista.jdcfecha.setCalendar(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == vista.jbtnACTUALIZAR){
            
            int fila = vista.jtblSOLICITUDES.getSelectedRow();
            int id = Integer.parseInt(vista.jtblSOLICITUDES.getValueAt(fila,0).toString());
            
            crud = new DAO_ActualizarPedido();
            crud.actualizaSolicitudTransportista(id,ESTADO_SOLICITUD[1]);          
            refrescarComponentes();             
        }
        if(ae.getSource() == vista.jbtnFILTRAR){
            
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/dd");
        String fecha = SDF.format(vista.jdcfecha.getDate());
            
            crud = new DAO_ActualizarPedido();
            crud.mostrarSegunFecha(vista.jtblSOLICITUDES,fecha,ESTADO_SOLICITUD[0],ESTADO_SOLICITUD[1]);            
        }
        if(ae.getSource() == vista.jbtnREFRESCAR){
            refrescarComponentes();
        }  
    }
}
