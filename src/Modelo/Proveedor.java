package Modelo;

public class Proveedor {
    
    private int proveedor_id;
    private String empresa;
    private int estado;
    
    public Proveedor(){}

    public int getProveedor_id() {return proveedor_id;}
    public void setProveedor_id(int proveedor_id) {this.proveedor_id = proveedor_id;}  
    public String getEmpresa() {return empresa;}
    public void setEmpresa(String empresa) {this.empresa = empresa;}
    public int getEstado() {return estado;}
    public void setEstado(int estado) {this.estado = estado;}
    
    public Object [] coleccionProveedor(){
        
        Object [] fila={proveedor_id,empresa};
        return fila;
    }
}
