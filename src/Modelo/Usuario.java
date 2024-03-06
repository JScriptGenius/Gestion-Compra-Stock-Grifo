package Modelo;

public class Usuario {
    
    private int usuario_id;
    private String nombre;
    private String apellido;
    private String cargo;
    private String telefono;
    private String correo;
    private String usuario;
    private String contrasegna;
    private int estado;
    
    public Usuario(){}

    public int getUsuario_id() {return usuario_id;}
    public void setUsuario_id(int usuario_id) {this.usuario_id = usuario_id;} 
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}
    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}
    public String getContrasegna() {return contrasegna;}
    public void setContrasegna(String contrasegna) {this.contrasegna = contrasegna;}
    public int getEstado() {return estado;}
    public void setEstado(int estado) {this.estado = estado;}
}
