package Procesos;

import DAO.*;
import Modelo.*;
import Vista.*;
import Principal.*;
import java.text.SimpleDateFormat;

public class ProcesosGenerarSolicitud implements Constantes{
        
    public static Solicitud leerSolicitud(IU_GenerarSolicitud gs){
        
        Solicitud solicitud = new Solicitud();

        SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/dd");
        String fecha = SDF.format(gs.jdcfecha.getDate());
        System.out.println(fecha);
        java.util.Date dateUtil = new java.util.Date(fecha);                                                
        java.sql.Date dateSql = new java.sql.Date(dateUtil.getTime());
        
        solicitud.setFecha(dateSql);
        
        AdministrarIDS ids = new AdministrarIDS();
        
        solicitud.setProveedor_id(ids.recuperarID(ids.csl_proveedorId,gs.jcmbproveedor.getSelectedItem().toString()));
        solicitud.setCombustible_id(ids.recuperarID(ids.csl_combustibleId,gs.jcmbcombustible.getSelectedItem().toString()));
        solicitud.setTanque_id(ids.recuperarID(ids.csl_tanqueId,gs.jcmbtanque.getSelectedItem().toString()));
     
        solicitud.setCantidad(Integer.parseInt(gs.jtxtcantidad.getText()));
        solicitud.setGerente_id(Integer.parseInt(Main.iu_mp.jlblID.getText()));
        
        solicitud.setTransportista_id(ids.recuperarID(ids.csl_transportistaId,gs.jcmbtransportista.getSelectedItem().toString()));
        solicitud.setEstado(ESTADO_SOLICITUD[0]);
        
        return solicitud;
    }
    
    public static void limpiarEntradas(IU_GenerarSolicitud gs){
        
        gs.jdcfecha.setCalendar(null);
        gs.jcmbproveedor.setSelectedIndex(0);
        gs.jcmbcombustible.setSelectedIndex(0);
        gs.jcmbtanque.setSelectedIndex(0);
        gs.jtxtcantidad.setText("");
        gs.jcmbtransportista.setSelectedIndex(0);   
    }
    
    public static void completarCombos(IU_GenerarSolicitud gs){
        
        gs.jcmbproveedor.removeAllItems();
        gs.jcmbcombustible.removeAllItems();
        gs.jcmbtanque.removeAllItems();
        gs.jcmbtransportista.removeAllItems();
        
        ActualizarCombo ac = new ActualizarCombo();
        
        ac.cargarDatos(gs.jcmbproveedor,ac.consulta_proveedor);
        ac.cargarDatos(gs.jcmbcombustible,ac.consulta_combustible);
        ac.cargarDatos(gs.jcmbtanque,ac.consulta_tanque);
        ac.cargarDatos(gs.jcmbtransportista,ac.consulta_transportista);     
    }
    
    public static void limpiarEntradasReporte(IU_Reporte r){
        
        r.jtxtidsolicitud.setText("");
        r.jlblID.setText("");
        r.jlblfecha.setText("");
        r.jlblproveedor.setText("");
        r.jlblcombustible.setText("");
        r.jlbltanque.setText("");
        r.jlblcantidad.setText("");
        
        r.jtxtidsolicitud.requestFocus();
    }
}
