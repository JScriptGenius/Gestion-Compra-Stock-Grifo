package DAO;

import Formatos.*;
import Modelo.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAO_RegistrarTanque extends ConectorDB implements Constantes{
    
    String [] encabezado = {"ID","SERIE","COMBUSTIBLE","CAPACIDAD MAX","CANTIDAD","ESTADO"};
    DefaultTableModel modelo = new DefaultTableModel(null,encabezado);
    
    public void mostrarTabla(JTable tabla){
        
        tabla.setModel(modelo);
        Tanque t = new Tanque();
        
        try{
            rs = st.executeQuery("SELECT tanque_id,serie,combustible_id,capacidadMax,cantidad,estado FROM Tanque");
            
            while(rs.next()){
                
                t.setTanque_id(rs.getInt(1));
                t.setSerie(rs.getString(2));
                t.setCombustible_id(rs.getInt(3));
                t.setCapacidad_max(rs.getDouble(4));
                t.setCantidad(rs.getDouble(5));
                t.setEstado(rs.getString(6));
                
                modelo.addRow(t.coleccionTanque());
            }
            conexion.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo mostrar la tabla tanque..."+e.getMessage(),"Error DB",0);
        }       
    }
    
    public void mostrarSegunEstado(JTable tabla,String estado){
        
        tabla.setModel(modelo);
        Tanque t = new Tanque();
        
        try{
            rs = st.executeQuery("SELECT tanque_id,serie,combustible_id,capacidadMax,cantidad,estado FROM Tanque WHERE estado='"+estado+"'");
            
            while(rs.next()){
                
                t.setTanque_id(rs.getInt(1));
                t.setSerie(rs.getString(2));
                t.setCombustible_id(rs.getInt(3));
                t.setCapacidad_max(rs.getDouble(4));
                t.setCantidad(rs.getDouble(5));
                t.setEstado(rs.getString(6));
                
                modelo.addRow(t.coleccionTanque());
            }
            conexion.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo mostrar la tabla segun el estado..."+e.getMessage(),"Error DB",0);
        }       
    }

    public void registrarTanque(Tanque t){
        
        try{
            ps = conexion.prepareStatement("INSERT INTO Tanque (serie,combustible_id,capacidadMax,cantidad,gerente_id,estado) VALUES (?,?,?,?,?,?)");
            ps.setString(1, t.getSerie());
            ps.setInt(2, t.getCombustible_id());
            ps.setDouble(3, t.getCapacidad_max());
            ps.setDouble(4, t.getCantidad());
            ps.setInt(5, t.getGerente_id());
            ps.setString(6, t.getEstado());
            ps.executeUpdate();
            Mensajeria.Message("¡Tanque registrado correctamente!");
            conexion.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo insertar el tanque..."+e.getMessage(),"Error DB",0);
        }
    }
    
    public Tanque completarCampos(int ID){
        
        Tanque t = null;
        
        try{
            rs = st.executeQuery("SELECT serie,combustible_id,capacidadMax,cantidad,estado FROM Tanque WHERE tanque_id="+ID);

            if(rs.next()){
                
                t = new Tanque();
                t.setSerie(rs.getString(1));
                t.setCombustible_id(rs.getInt(2));
                t.setCapacidad_max(rs.getDouble(3));
                t.setCantidad(rs.getDouble(4));
                t.setEstado(rs.getString(5));         
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo completar los campos..."+e.getMessage(),"Error DB",0);
        }
    return t;    
    }
    
    public void actualizarTanque(Tanque t,int ID){
        
        try{
            ps = conexion.prepareStatement("UPDATE Tanque SET serie=?,combustible_id=?,capacidadMax=?,cantidad=?,estado=? WHERE tanque_id="+ID);
            ps.setString(1, t.getSerie());
            ps.setInt(2, t.getCombustible_id());
            ps.setDouble(3, t.getCapacidad_max());
            ps.setDouble(4, t.getCantidad());
            ps.setString(5, t.getEstado());
            ps.executeUpdate();
            Mensajeria.Message("¡Combustible actualizado correctamente!");
            ps.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo actualizar el tanque..."+e.getMessage(),"Error DB",0);
        }
    }   
}
