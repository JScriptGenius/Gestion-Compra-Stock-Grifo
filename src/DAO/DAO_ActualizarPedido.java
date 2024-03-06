package DAO;

import Formatos.Mensajeria;
import Modelo.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAO_ActualizarPedido extends ConectorDB{
            
    String [] encabezado = {"ID","FECHA","PROVEEDOR","COMBUSTIBLE","TANQUE","CANTIDAD","TRANSPORTISTA","ESTADO"};
    DefaultTableModel modelo = new DefaultTableModel(null,encabezado);
        
    public void mostrarTablaSolicitudes(JTable tabla,String estadoA,String estadoN){

        tabla.setModel(modelo);
        Solicitud s = new Solicitud();
        
        try{
            rs = st.executeQuery("SELECT solicitud_id,fecha,proveedor_id,combustible_id,tanque_id,cantidad,transportista_id,estado FROM SolicitudCompra"
                               + " WHERE estado='"+estadoA+"' OR estado='"+estadoN+"'");
            
            while(rs.next()){
                
                s.setSolicitud_id(rs.getInt(1));
                s.setFecha(rs.getDate(2));
                s.setProveedor_id(rs.getInt(3));
                s.setCombustible_id(rs.getInt(4));
                s.setTanque_id(rs.getInt(5));
                s.setCantidad(rs.getInt(6));
                s.setTransportista_id(rs.getInt(7));
                s.setEstado(rs.getString(8));
                
                modelo.addRow(s.coleccionSolicitudes());
            }
            conexion.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo mostrar la tabla solicitud compra..."+e.getMessage(),"Error DB",0);
        }       
    }

    public void mostrarSegunFecha(JTable tabla,String fecha,String estadoA,String estadoN){
        
        tabla.setModel(modelo);
        Solicitud s = new Solicitud();
        
        try{
            rs = st.executeQuery("SELECT solicitud_id,fecha,proveedor_id,combustible_id,tanque_id,cantidad,transportista_id,estado FROM SolicitudCompra"
                               + " WHERE fecha='"+fecha+"' AND (estado='"+estadoA+"' OR estado='"+estadoN+"')");
            
            while(rs.next()){
                
                s.setSolicitud_id(rs.getInt(1));
                s.setFecha(rs.getDate(2));
                s.setProveedor_id(rs.getInt(3));
                s.setCombustible_id(rs.getInt(4));
                s.setTanque_id(rs.getInt(5));
                s.setCantidad(rs.getInt(6));
                s.setTransportista_id(rs.getInt(7));
                s.setEstado(rs.getString(8));
                
                modelo.addRow(s.coleccionSolicitudes());
            }
            conexion.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo mostrar la tabla segun la fecha..."+e.getMessage(),"Error DB",0);
        }       
    }
    
    public void actualizaSolicitudTransportista(int ID,String estado){
        
        try{
            ps = conexion.prepareStatement("UPDATE SolicitudCompra SET estado=? WHERE solicitud_id="+ID);
            ps.setString(1, estado);
            ps.executeUpdate();
            Mensajeria.Message("¡Estado de solicitud actualizado correctamente!");
            ps.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo actualizar la solicitud de compra..."+e.getMessage(),"Error DB",0);
        }
    }
    
    public void actualizaSolicitudJefe(int ID,String estado,int idJefe){
        
        try{
            ps = conexion.prepareStatement("UPDATE SolicitudCompra SET estado=?,jefe_id=? WHERE solicitud_id="+ID);
            ps.setString(1, estado);
            ps.setInt(2, idJefe);
            ps.executeUpdate();
            Mensajeria.Message("¡Estado de solicitud actualizado correctamente!");
            ps.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo actualizar la solicitud de compra..."+e.getMessage(),"Error DB",0);
        }
    }
    
    public void insertarAuditoriaJefe(int id){
        
        try{
            rs = st.executeQuery("EXECUTE PROC_INSERTAR_JEFE_AUDITORIA @id = "+id);
            rs.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo insertar el id en la tabla adutoria..."+e.getMessage(),"Error DB",0);
        }
    }
    
    public void actualizaSolicitudContador(int ID,String estado,int idContador){
        
        try{
            ps = conexion.prepareStatement("UPDATE SolicitudCompra SET estado=?,contador_id=? WHERE solicitud_id="+ID);
            ps.setString(1, estado);
            ps.setInt(2, idContador);
            ps.executeUpdate();
            Mensajeria.Message("¡Estado de solicitud actualizado correctamente!");
            ps.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo actualizar la solicitud de compra..."+e.getMessage(),"Error DB",0);
        }
    }
    
    public void insertarAuditoriaContador(int id){
        
        try{
            rs = st.executeQuery("EXECUTE PROC_INSERTAR_CONTADOR_AUDITORIA "+id);
            rs.close();
        }catch(Exception e){
            //Mensajeria.messageType("ERROR: No se pudo insertar el id en la tabla adutoria..."+e.getMessage(),"Error DB",0);
        }
    }
}
