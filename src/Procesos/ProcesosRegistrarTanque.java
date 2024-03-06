package Procesos;

import Modelo.*;
import Principal.*;
import DAO.*;
import Vista.*;

public class ProcesosRegistrarTanque implements Constantes{
    
    public static Tanque leerTanque(IU_RegistrarTanque tc){
        
        Tanque tanque = new Tanque();
        
        tanque.setSerie(tc.jtxtserie.getText());
        
        AdministrarIDS ids = new AdministrarIDS();
        
        tanque.setCombustible_id(ids.recuperarID(ids.csl_combustibleId,tc.jcmbcombustible.getSelectedItem().toString()));
        
        tanque.setCapacidad_max(Double.parseDouble(tc.jtxtcapacidadmax.getText()));
        tanque.setCantidad(Double.parseDouble(tc.jtxtcantidad.getText()));
        tanque.setGerente_id(Integer.parseInt(Main.iu_mp.jlblID.getText()));
        tanque.setEstado(tc.jcmbestado.getSelectedItem().toString());
                
        return tanque;
    }
    
    public static void limpiarEntradas(IU_RegistrarTanque tc){
        
        tc.jtxtserie.setText("");
        tc.jcmbcombustible.setSelectedIndex(0);
        tc.jtxtcapacidadmax.setText("");
        tc.jtxtcantidad.setText("");
        tc.jcmbestado.setSelectedIndex(0);
        tc.jbtgGB_ESTADOS.clearSelection();
        tc.jtxtserie.requestFocus();
    }
    
    public static void completarCombos(IU_RegistrarTanque tc){
        
        tc.jcmbcombustible.removeAllItems();
        
        ActualizarCombo ac = new ActualizarCombo();
        ac.cargarDatos(tc.jcmbcombustible,ac.consulta_combustible);
        
        tc.jcmbestado.removeAllItems();
        
        for(int i = 0 ; i < ESTADO_TANQUE.length ; i++){
            tc.jcmbestado.addItem(ESTADO_TANQUE[i]);
        }
    }
}
