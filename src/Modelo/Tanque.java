package Modelo;

import DAO.*;

public class Tanque {
    
    private int tanque_id;
    private String serie;
    private int combustible_id;
    private double capacidad_max;
    private double cantidad;
    private int gerente_id;
    private int contador_id;
    private String estado;
    
    public Tanque(){}

    public int getTanque_id() {return tanque_id;}
    public void setTanque_id(int tanque_id) {this.tanque_id = tanque_id;}  
    public String getSerie() {return serie;}
    public void setSerie(String serie) {this.serie = serie;}
    public int getCombustible_id() {return combustible_id;}
    public void setCombustible_id(int combustible_id) {this.combustible_id = combustible_id;}
    public double getCapacidad_max() {return capacidad_max;}
    public void setCapacidad_max(double capacidad_max) {this.capacidad_max = capacidad_max;}
    public double getCantidad() {return cantidad;}
    public void setCantidad(double cantidad) {this.cantidad = cantidad;}
    public int getGerente_id() {return gerente_id;}
    public void setGerente_id(int gerente_id) {this.gerente_id = gerente_id;}
    public int getContador_id() {return contador_id;}
    public void setContador_id(int contador_id) {this.contador_id = contador_id;}
    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
    
    public Object [] coleccionTanque(){
        
        AdministrarIDS ai = new AdministrarIDS();
        String combustible = ai.obtenerNombre(ai.csl_combustibleNombre,combustible_id);
        
        Object [] fila={tanque_id,serie,combustible,capacidad_max,cantidad,estado};
        return fila;
    }  
}
