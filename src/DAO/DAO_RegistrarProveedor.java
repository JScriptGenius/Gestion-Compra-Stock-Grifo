package DAO;

import Modelo.*;
import Formatos.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAO_RegistrarProveedor extends ConectorDB implements Constantes{
    
    String [] encabezado = {"ID","EMPRESA"};
    DefaultTableModel modelo = new DefaultTableModel(null,encabezado);
    
    public void mostrarTabla(JTable tabla){
        
        tabla.setModel(modelo);
        Proveedor p = new Proveedor();
        
        try{
            rs = st.executeQuery("SELECT proveedor_id,empresa FROM Proveedor WHERE estado=1");
            
            while(rs.next()){
                
                p.setProveedor_id(rs.getInt(1));
                p.setEmpresa(rs.getString(2));
                
                modelo.addRow(p.coleccionProveedor());
            }
            conexion.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo mostrar la tabla proveedor..."+e.getMessage(),"Error DB",0);
        }
        
    }
    
    public void registrarProveedor(Proveedor p){

        try{
            ps = conexion.prepareStatement("INSERT INTO Proveedor (empresa,estado) VALUES (?,?)");
            ps.setString(1, p.getEmpresa());
            ps.setInt(2, p.getEstado());
            ps.executeUpdate();
            Mensajeria.Message("¡Proveedor registrado correctamente!");
            conexion.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo insertar el proveedor..."+e.getMessage(),"Error DB",0);
        }
    }
    
    public Proveedor completarCampos(int ID){
        
        Proveedor p = null;
        
        try{
            rs = st.executeQuery("SELECT empresa FROM Proveedor WHERE proveedor_id="+ID);

            if(rs.next()){
                
                p = new Proveedor();
                p.setEmpresa(rs.getString(1));
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo completar los campos..."+e.getMessage(),"Error DB",0);
        }
    return p;    
    }
    
    public void actualizarProveedor(Proveedor p,int ID){
        
        try{
            ps = conexion.prepareStatement("UPDATE Proveedor SET empresa=? WHERE proveedor_id="+ID);
            ps.setString(1, p.getEmpresa());
            ps.executeUpdate();
            Mensajeria.Message("¡Proveedor actualizado correctamente!");
            ps.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo actualizar el proveedor..."+e.getMessage(),"Error DB",0);
        }
    }
    
    public void eliminarProveedor(int ID){
        
        try{
            ps = conexion.prepareStatement("UPDATE Proveedor SET estado=? WHERE proveedor_id="+ID);
            ps.setInt(1, DESACTIVADO);
            ps.executeUpdate();
            ps.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo eliminar el proveedor..."+e.getMessage(),"Error DB",0);
        }
    }
    
}
