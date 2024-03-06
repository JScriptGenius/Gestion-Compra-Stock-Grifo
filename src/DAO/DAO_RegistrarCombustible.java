package DAO;

import Formatos.*;
import Modelo.*;
import javax.swing.JTable;
import javax.swing.table.*;

public class DAO_RegistrarCombustible extends ConectorDB implements Constantes{
    
    String [] encabezado = {"ID","NOMBRE","OCTANAJE"};
    DefaultTableModel modelo = new DefaultTableModel(null,encabezado);
    
    public void mostrarTabla(JTable tabla){
        
        tabla.setModel(modelo);
        Combustible c = new Combustible();
        
        /*PARA CONSULTAS SELECT EL RESULSET CON EL STATEMENT y METODO EXECUTEQUERY*/
        try{
            rs = st.executeQuery("SELECT combustible_id,nombre,octanaje FROM TipoCombustible WHERE estado=1");
            
            /*RECORREMOS CON WHILE PARA RELLENAR TODOS LOS CAMPOS y REGISTROS*/
            while(rs.next()){
                
                c.setCombustible_id(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setOctanaje(rs.getInt(3));
                
                modelo.addRow(c.coleccionCombustible());
            }
            conexion.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo mostrar la tabla combustible..."+e.getMessage(),"Error DB",0);
        }
        
    }
    
    public void registrarCombustible(Combustible c){
        /*PARA INSERCIONES,ELIMINACIONES Y ACTUALIZACIONES EL PREPARETSTATEMENT CON LA CONEXION Y EL METODO PREPARESTATEMENT*/
        try{
            ps = conexion.prepareStatement("INSERT INTO TipoCombustible (nombre,octanaje,gerente_id,estado) VALUES (?,?,?,?)");
            ps.setString(1, c.getNombre());
            ps.setInt(2, c.getOctanaje());
            ps.setInt(3, c.getGerente_id());
            ps.setInt(4, c.getEstado());
            ps.executeUpdate();
            Mensajeria.Message("¡Combustible registrado correctamente!");
            conexion.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo insertar el combustible..."+e.getMessage(),"Error DB",0);
        }
    }
    
    public Combustible completarCampos(int ID){
        
        Combustible c = null;
        
        try{
            rs = st.executeQuery("SELECT nombre,octanaje FROM TipoCombustible WHERE combustible_id="+ID);
            /*COLOCAMOS EL IF PARA DETENERSE CUANDO SE CUMPLE LA CONDICION*/
            if(rs.next()){
                
                c = new Combustible();
                c.setNombre(rs.getString(1));
                c.setOctanaje(rs.getInt(2));
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo completar los campos..."+e.getMessage(),"Error DB",0);
        }
    return c;    
    }
    
    public void actualizarCombustible(Combustible c,int ID){
        
        try{
            ps = conexion.prepareStatement("UPDATE TipoCombustible SET nombre=?,octanaje=? WHERE combustible_id="+ID);
            ps.setString(1, c.getNombre());
            ps.setInt(2, c.getOctanaje());
            ps.executeUpdate();
            Mensajeria.Message("¡Combustible actualizado correctamente!");
            ps.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo actualizar el combustible..."+e.getMessage(),"Error DB",0);
        }
    }
    
    public void eliminarCombustible(int ID){
        
        try{
            ps = conexion.prepareStatement("UPDATE TipoCombustible SET estado=? WHERE combustible_id="+ID);
            ps.setInt(1, DESACTIVADO);
            ps.executeUpdate();
            ps.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo eliminar el combustible..."+e.getMessage(),"Error DB",0);
        }
    }
}
