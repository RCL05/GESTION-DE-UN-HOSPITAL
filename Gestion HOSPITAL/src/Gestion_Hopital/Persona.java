package Gestion_Hopital ;


import java.util.Date;

public abstract class Persona implements Atencion{


    protected String nombre;
    protected String apellido;
    protected String identificacion;
    protected  String telefono;
    protected String direccion;
    protected String email;

    public Persona(Date fechaCita, int noCita, String motivoCita, String horaCita) {
    }

    public void fechaAtencion() {

    }
    public Persona(String nombre, String apellido, String identificacion, String telefono, String direccion, String s) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String setApellido(String apellido) {
        this.apellido = apellido;
        return apellido;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public String setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
        return identificacion;
    }
    public String getTelefono() {
        return telefono;
    }
    public String setTelefono(String telefono) {
        this.telefono = telefono;
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public String setDireccion(String direccion) {
        this.direccion = direccion;
        return direccion;
    }
    public String getEmail() {
        return email;
    }
    public String setEmail(String email) {
        this.email = email;
        return email;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);
        System.out.println("Email: " + email);
    }

public void mostrarDatos(String nombre, String apellido, String identificacion, String telefono, String direccion, String email) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);
        System.out.println("Email: " + email);
    }

}
