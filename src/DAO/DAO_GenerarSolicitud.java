package DAO;

import Formatos.*;
import Modelo.*;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAO_GenerarSolicitud extends ConectorDB implements Constantes{
    
    
    public void mostrarTablaTanque(JTable tabla){
        
        String [] encabezadoT = {"ID","SERIE","COMBUSTIBLE","CAPACIDAD MAX","CANTIDAD","ESTADO"};
        DefaultTableModel modeloT = new DefaultTableModel(null,encabezadoT);
        
        tabla.setModel(modeloT);
        Tanque t = new Tanque();
        
        try{
            rs = st.executeQuery("SELECT tanque_id,serie,combustible_id,capacidadMax,cantidad,estado FROM Tanque WHERE estado='"+ESTADO_TANQUE[0]+"'");
            
            while(rs.next()){
                
                t.setTanque_id(rs.getInt(1));
                t.setSerie(rs.getString(2));
                t.setCombustible_id(rs.getInt(3));
                t.setCapacidad_max(rs.getDouble(4));
                t.setCantidad(rs.getDouble(5));
                t.setEstado(rs.getString(6));
                
                modeloT.addRow(t.coleccionTanque());
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo mostrar la tabla tanque..."+e.getMessage(),"Error DB",0);
        }       
    }
    
    public void mostrarTablaSolicitudes(JTable tabla){
        
        String [] encabezadoS = {"ID","FECHA","PROVEEDOR","COMBUSTIBLE","TANQUE","CANTIDAD","TRANSPORTISTA","ESTADO"};
        DefaultTableModel modeloS = new DefaultTableModel(null,encabezadoS);
        
        tabla.setModel(modeloS);
        Solicitud s = new Solicitud();
        
        try{
            rs = st.executeQuery("SELECT solicitud_id,fecha,proveedor_id,combustible_id,tanque_id,cantidad,transportista_id,estado FROM SolicitudCompra WHERE estado <> '"+ESTADO_SOLICITUD[4]+"'");
            
            while(rs.next()){
                
                s.setSolicitud_id(rs.getInt(1));
                s.setFecha(rs.getDate(2));
                s.setProveedor_id(rs.getInt(3));
                s.setCombustible_id(rs.getInt(4));
                s.setTanque_id(rs.getInt(5));
                s.setCantidad(rs.getInt(6));
                s.setTransportista_id(rs.getInt(7));
                s.setEstado(rs.getString(8));
                
                modeloS.addRow(s.coleccionSolicitudes());
            }
            conexion.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo mostrar la tabla solicitud compra..."+e.getMessage(),"Error DB",0);
        }       
    }
    
    public void registrarSolicitudCompra(Solicitud s){
        
        try{
            ps = conexion.prepareStatement("INSERT INTO SolicitudCompra (fecha,proveedor_id,combustible_id,tanque_id,cantidad,gerente_id,transportista_id,estado) VALUES (?,?,?,?,?,?,?,?)");
            ps.setDate(1, s.getFecha());
            ps.setInt(2, s.getProveedor_id());
            ps.setInt(3, s.getCombustible_id());
            ps.setInt(4, s.getTanque_id());
            ps.setInt(5, s.getCantidad());
            ps.setInt(6, s.getGerente_id());
            ps.setInt(7, s.getTransportista_id());
            ps.setString(8, s.getEstado());
            ps.executeUpdate();
            Mensajeria.Message("¡Solicitud de compra registrado correctamente!");
            conexion.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo insertar la solicitud de compra..."+e.getMessage(),"Error DB",0);
        }
    }
    
    public Solicitud completarCampos(int ID){
        
        Solicitud s = null;
        
        try{
            rs = st.executeQuery("SELECT solicitud_id,fecha,proveedor_id,combustible_id,tanque_id,cantidad,transportista_id FROM SolicitudCompra WHERE solicitud_id="+ID);

            if(rs.next()){
                
                s = new Solicitud();
                s.setSolicitud_id(rs.getInt(1));
                s.setFecha(rs.getDate(2));
                s.setProveedor_id(rs.getInt(3));
                s.setCombustible_id(rs.getInt(4));
                s.setTanque_id(rs.getInt(5));
                s.setCantidad(rs.getInt(6));
                s.setTransportista_id(rs.getInt(7));
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo completar los campos..."+e.getMessage(),"Error DB",0);
        }
    return s;    
    }
    
    public void actualizarSolicitudCompra(Solicitud s,int ID){
        
        try{
            ps = conexion.prepareStatement("UPDATE SolicitudCompra SET fecha=?,proveedor_id=?,combustible_id=?,tanque_id=?,cantidad=?,transportista_id=? WHERE solicitud_id="+ID);
            ps.setDate(1, s.getFecha());
            ps.setInt(2, s.getProveedor_id());
            ps.setInt(3, s.getCombustible_id());
            ps.setInt(4, s.getTanque_id());
            ps.setInt(5, s.getCantidad());
            ps.setInt(6, s.getTransportista_id());
            ps.executeUpdate();
            Mensajeria.Message("¡Solicitud de compra actualizado correctamente!");
            ps.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo actualizar la solicitud de compra..."+e.getMessage(),"Error DB",0);
        }
    }
    
    public void cancelarSolicitudCompra(int ID){
        
        try{
            ps = conexion.prepareStatement("UPDATE SolicitudCompra SET estado=? WHERE solicitud_id="+ID);
            ps.setString(1, ESTADO_SOLICITUD[4]);
            ps.executeUpdate();
            ps.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo eliminar la solicitud de compra..."+e.getMessage(),"Error DB",0);
        }
    }
    
    
    public void obtenerDatosReporte(JLabel lid,JLabel lprov,JLabel lcomb,JLabel ltanq,JLabel cant,JLabel fecha,int id){
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        
        try{
            
            cs = conexion.prepareCall("{call PROC_REPORTE_SOLICITUDES("+id+")}");
            rs = cs.executeQuery();
            
            while(rs.next()){
                
                lid.setText("REPORTE SOLICITUD N° "+rs.getInt(1));
                fecha.setText(sdf.format(rs.getDate(2)));
                lprov.setText(rs.getString(3));
                lcomb.setText(rs.getString(4));
                ltanq.setText(rs.getString(5));
                cant.setText(""+rs.getInt(6));
            }
            conexion.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo recuperar los datos para el reporte..."+e.getMessage(),"Error DB",0);
        }
    }   
}
