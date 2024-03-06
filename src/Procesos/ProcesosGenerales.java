package Procesos;

import javax.swing.*;

public class ProcesosGenerales{
    
    public static void Presentacion(JInternalFrame me,String titulo){
        me.setTitle(titulo);       
        me.setVisible(true);
    }
    public static void completarCombo(JComboBox cmb,String estado){
        cmb.removeAllItems();
        cmb.addItem(estado);
    }
}
