package Controlador;

import DAO.*;
import Formatos.*;
import Vista.*;
import Modelo.*;
import Procesos.*;
import Principal.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class CC_RecepcionarPedido implements ActionListener,Constantes{
    
    IU_RecepcionarPedido vista;
    DAO_ActualizarPedido crud;
    
    public CC_RecepcionarPedido(IU_RecepcionarPedido rp) {
        vista=rp;
        vista.jbtnACTUALIZAR.addActionListener(this);
        vista.jbtnFILTRAR.addActionListener(this);
        vista.jbtnREFRESCAR.addActionListener(this);
        ProcesosGenerales.Presentacion(rp,"RECEPCIONAR PEDIDO");
        ProcesosGenerales.completarCombo(vista.jcmbestadop,ESTADO_SOLICITUD[2]);
        refrescarComponentes();
    }
    
     void refrescarComponentes(){
        crud = new DAO_ActualizarPedido();
        crud.mostrarTablaSolicitudes(vista.jtblSOLICITUDES,ESTADO_SOLICITUD[1],ESTADO_SOLICITUD[2]); 
        EstiloTabla.FormatoCabecera(vista.jtblSOLICITUDES);
        vista.jdcfecha.setCalendar(null);
    }
     
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == vista.jbtnACTUALIZAR){
            
            int fila = vista.jtblSOLICITUDES.getSelectedRow();
            int id = Integer.parseInt(vista.jtblSOLICITUDES.getValueAt(fila,0).toString());
            
            crud = new DAO_ActualizarPedido();
            crud.actualizaSolicitudJefe(id,ESTADO_SOLICITUD[2],Integer.parseInt(Main.iu_mp.jlblID.getText()));
            refrescarComponentes();
            crud.insertarAuditoriaJefe(Integer.parseInt(Main.iu_mp.jlblID.getText()));
        }
        if(ae.getSource() == vista.jbtnFILTRAR){
            
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/dd");
        String fecha = SDF.format(vista.jdcfecha.getDate());
            
            crud = new DAO_ActualizarPedido();
            crud.mostrarSegunFecha(vista.jtblSOLICITUDES,fecha,ESTADO_SOLICITUD[1],ESTADO_SOLICITUD[2]);            
        }
        if(ae.getSource() == vista.jbtnREFRESCAR){
            refrescarComponentes();
        }  
    }
}
