package DAO;

import Formatos.*;
import Modelo.*;

public class DAO_GestionarTanque extends ConectorDB{
    
    public Tanque completarTanque(int ID){
        
        Tanque t = null;
        
        try{
            rs = st.executeQuery("SELECT serie,cantidad FROM Tanque WHERE tanque_id="+ID);

            if(rs.next()){
                
                t = new Tanque();
                t.setSerie(rs.getString(1));
                t.setCantidad(rs.getDouble(2));
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo completar los campos..."+e.getMessage(),"Error DB",0);
        }
    return t;    
    }
    
    public Solicitud completarSolicitud(int ID){
        
        Solicitud s = null;
        
        try{
            rs = st.executeQuery("SELECT cantidad FROM SolicitudCompra WHERE solicitud_id="+ID);

            if(rs.next()){
                
                s = new Solicitud();
                s.setCantidad(rs.getInt(1));
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo completar los campos..."+e.getMessage(),"Error DB",0);
        }
    return s;    
    }
    
    
    public void lleado(String serie,int cantidad){
        
        try{
            ps = conexion.prepareStatement("UPDATE Tanque SET cantidad=cantidad+"+cantidad+" WHERE serie='"+serie+"'");
            ps.executeUpdate();
            Mensajeria.Message("¡Se realizo el llenado del tanque con exito!");
            ps.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo actualizar la cantidad del tanque..."+e.getMessage(),"Error DB",0);
        }
    }
    public void vaciado(String serie,int cantidad){
        
        try{
            ps = conexion.prepareStatement("UPDATE Tanque SET cantidad=cantidad-"+cantidad+" WHERE serie='"+serie+"'");
            ps.executeUpdate();
            Mensajeria.Message("¡Se realizo el vaciado del tanque con exito!");
            ps.close();
        }catch(Exception e){
            Mensajeria.messageType("ERROR: No se pudo actualizar la cantidad del tanque..."+e.getMessage(),"Error DB",0);
        }
    }
}
