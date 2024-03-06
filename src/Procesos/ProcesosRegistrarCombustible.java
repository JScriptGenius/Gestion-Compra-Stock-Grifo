package Procesos;

import Vista.*;
import Modelo.*;
import Principal.*;

public class ProcesosRegistrarCombustible implements Constantes{
    
    public static Combustible leerCombustible(IU_RegistrarCombustible rc){
        
        Combustible combustible = new Combustible();
        
        combustible.setNombre(rc.jtxtnombre.getText());
        combustible.setOctanaje(Integer.parseInt(rc.jtxtoctanaje.getText()));
        combustible.setGerente_id(Integer.parseInt(Main.iu_mp.jlblID.getText()));
        combustible.setEstado(ACTIVADO);
        
        return combustible;
    }
    
    public static void limpiarEntradas(IU_RegistrarCombustible rc){
        
        rc.jtxtnombre.setText("");
        rc.jtxtoctanaje.setText("");
        rc.jtxtnombre.requestFocus();
    } 
}
