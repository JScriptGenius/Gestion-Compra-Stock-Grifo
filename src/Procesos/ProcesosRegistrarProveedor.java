package Procesos;

import Modelo.*;
import Vista.*;

public class ProcesosRegistrarProveedor implements Constantes{
    
    public static Proveedor leerProveedor(IU_RegistrarProveedor rp){
        
        Proveedor proveedor = new Proveedor();
        
        proveedor.setEmpresa(rp.jtxtempresa.getText());
        proveedor.setEstado(ACTIVADO);
        
        return proveedor;
    }
    
    public static void limpiarEntradas(IU_RegistrarProveedor rp){
        
        rp.jtxtempresa.setText("");
        rp.jtxtempresa.requestFocus();
    }
}
