package Modelo;

public class Combustible {
    
    private int combustible_id;
    private String nombre;
    private int octanaje;
    private int gerente_id;
    private int estado;

    public Combustible(){}
    
    public int getCombustible_id() {return combustible_id;}
    public void setCombustible_id(int combustible_id) {this.combustible_id = combustible_id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getOctanaje() {return octanaje;}
    public void setOctanaje(int octanaje) {this.octanaje = octanaje;}

    public int getGerente_id() {return gerente_id;}
    public void setGerente_id(int gerente_id) {this.gerente_id = gerente_id;}

    public int getEstado() {return estado;}
    public void setEstado(int estado) {this.estado = estado;}
    
    public Object [] coleccionCombustible(){
        Object [] fila={combustible_id,nombre,octanaje};
        return fila;
    }
}
