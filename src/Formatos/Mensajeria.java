package Formatos;

import javax.swing.*;

public class Mensajeria {
    
    public static void Message(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
    public static void messageType(String mensaje,String titulo,int tipo){
        JOptionPane.showMessageDialog(null,mensaje,titulo,tipo);
    }
    
    public static int Confirm(String mensaje,String titulo,int eleccion,int icono){
        return JOptionPane.showConfirmDialog(null,mensaje,titulo,eleccion,icono);
    }
    
    public static void Input(String mensaje){
        JOptionPane.showInputDialog(mensaje);
    }
    
}
