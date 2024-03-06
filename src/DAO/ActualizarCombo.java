package DAO;

import Modelo.*;
import Formatos.*;
import javax.swing.*;

public class ActualizarCombo extends ConectorDB implements Constantes{

    public String consulta_combustible="SELECT C.nombre FROM TipoCombustible C WHERE C.estado=1";
    public String consulta_proveedor="SELECT P.empresa FROM Proveedor P WHERE P.estado=1";
    public String consulta_tanque="SELECT T.serie FROM Tanque T WHERE T.estado='"+ESTADO_TANQUE[0]+"'";
    public String consulta_transportista="SELECT U.nombres FROM Transportista T INNER JOIN Usuario U ON T.usuario_id=U.usuario_id WHERE T.estado=1 AND U.cargo='"+CARGOS[1]+"'";
    
    public ActualizarCombo(){}
    
    public void cargarDatos(JComboBox combo,String consulta){

        try{
            rs = st.executeQuery(consulta);
            
            while(rs.next()){
                combo.addItem(rs.getString(1));
            }
        rs.close();
        }catch(Exception ex){
            Mensajeria.messageType("ERROR: No se puede cargar los combos..."+ex.getMessage(),"Error DB", 0);
        }
    }   
}
