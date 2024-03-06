package Modelo;
import DAO.*;
import java.sql.*;
public class Solicitud{
    
    private int solicitud_id;
    private Date fecha;
    private int proveedor_id;
    private int combustible_id;
    private int tanque_id;
    private int cantidad;
    private int gerente_id;
    private int transportista_id;
    private int jefe_id;
    private int contador_id;
    private String estado;

    public Solicitud(){}

    public int getSolicitud_id() {return solicitud_id;}
    public void setSolicitud_id(int solicitud_id) {this.solicitud_id = solicitud_id;}
    public Date getFecha() {return fecha;}
    public void setFecha(Date fecha) {this.fecha = fecha;}
    public int getProveedor_id() {return proveedor_id;}
    public void setProveedor_id(int proveedor_id) {this.proveedor_id = proveedor_id;}
    public int getCombustible_id() {return combustible_id;}
    public void setCombustible_id(int combustible_id) {this.combustible_id = combustible_id;}
    public int getTanque_id() {return tanque_id;}
    public void setTanque_id(int tanque_id) {this.tanque_id = tanque_id;}
    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}
    public int getGerente_id() {return gerente_id;}
    public void setGerente_id(int gerente_id) {this.gerente_id = gerente_id;}
    public int getTransportista_id() {return transportista_id;}
    public void setTransportista_id(int transportista_id) {this.transportista_id = transportista_id;}
    public int getJefe_id() {return jefe_id;}
    public void setJefe_id(int jefe_id) {this.jefe_id = jefe_id;}
    public int getContador_id() {return contador_id;}
    public void setContador_id(int contador_id) {this.contador_id = contador_id;}
    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
    
    public Object [] coleccionSolicitudes(){
        
        AdministrarIDS ai = new AdministrarIDS();
        String combustible = ai.obtenerNombre(ai.csl_combustibleNombre,combustible_id);
        String proveedor = ai.obtenerNombre(ai.csl_proveedorNombre,proveedor_id);
        String tanque = ai.obtenerNombre(ai.csl_tanqueSerie,tanque_id);
        String transportista = ai.obtenerNombre(ai.csl_transportistaNombre,transportista_id);
        
        Object [] fila={solicitud_id,fecha,proveedor,combustible,tanque,cantidad,transportista,estado};
        return fila;
    }
}