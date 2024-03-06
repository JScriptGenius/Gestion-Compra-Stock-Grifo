package Procesos;

import Vista.*;
import Modelo.*;

public class ProcesosRegistrarte implements Constantes{
    
    public static void Presentacion(IU_Registrarse r){
        r.setTitle("REGISTRARTE");
        r.setLocationRelativeTo(null);
        r.setVisible(true);
    }
    
    public static Usuario leerUsuarios(IU_Registrarse r){
        
        Usuario usuario = new Usuario();
        
        usuario.setNombre(r.jtxtnombre.getText());
        usuario.setApellido(r.jtxtapellido.getText());
        usuario.setCargo(r.jcmbcargo.getSelectedItem().toString());
        usuario.setTelefono(r.jtxttelefono.getText());
        usuario.setCorreo(r.jtxtcorreo.getText());
        usuario.setUsuario(r.jtxtusuario.getText());
        usuario.setContrasegna(r.jpwdcontrasegna.getText());
        usuario.setEstado(ACTIVADO);
        
        return usuario;
    }

    public static void completarCombos(IU_Registrarse r){
        
        r.jcmbcargo.removeAllItems();
        
        for(int i = 0 ; i < CARGOS.length ; i++){
            r.jcmbcargo.addItem(CARGOS[i]);
        }
    }   
}
