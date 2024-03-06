package Controlador;

import DAO.*;
import Formatos.*;
import Vista.*;
import Modelo.*;
import Procesos.*;
import Principal.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class CC_CerrarCompra implements ActionListener,Constantes{
    
    IU_CerrarCompra vista;
    DAO_ActualizarPedido crud;
    
    public CC_CerrarCompra(IU_CerrarCompra ccom){
        vista=ccom;
        vista.jbtnACTUALIZAR.addActionListener(this);
        vista.jbtnFILTRAR.addActionListener(this);
        vista.jbtnREFRESCAR.addActionListener(this);
        ProcesosGenerales.Presentacion(ccom,"CERRAR COMPRA");
        ProcesosGenerales.completarCombo(vista.jcmbestadop,ESTADO_SOLICITUD[3]);
        refrescarComponentes();
    }
    
    void refrescarComponentes(){
        crud = new DAO_ActualizarPedido();
        crud.mostrarTablaSolicitudes(vista.jtblSOLICITUDES,ESTADO_SOLICITUD[2],ESTADO_SOLICITUD[3]); 
        EstiloTabla.FormatoCabecera(vista.jtblSOLICITUDES);
        vista.jdcfecha.setCalendar(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == vista.jbtnACTUALIZAR){
            
            int fila = vista.jtblSOLICITUDES.getSelectedRow();
            int id = Integer.parseInt(vista.jtblSOLICITUDES.getValueAt(fila,0).toString());
            
            crud = new DAO_ActualizarPedido();
            crud.actualizaSolicitudContador(id,ESTADO_SOLICITUD[3],Integer.parseInt(Main.iu_mp.jlblID.getText()));          
            refrescarComponentes();
            crud.insertarAuditoriaContador(Integer.parseInt(Main.iu_mp.jlblID.getText()));
        }
        if(ae.getSource() == vista.jbtnFILTRAR){
            
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/dd");
        String fecha = SDF.format(vista.jdcfecha.getDate());
            
            crud = new DAO_ActualizarPedido();
            crud.mostrarSegunFecha(vista.jtblSOLICITUDES,fecha,ESTADO_SOLICITUD[2],ESTADO_SOLICITUD[3]);            
        }
        if(ae.getSource() == vista.jbtnREFRESCAR){
            refrescarComponentes();
        }  
    }    
}
