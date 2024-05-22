package Gestion_Hopital;

public class Doctor extends Persona {

    protected String especialidad;
    protected int noPacientes;
    protected String identificacion;
   private Especialidad especialidadList;
    private ExpedienteMedico expedienteMedico;
    public Doctor(String especialidad, int noPacientes, String identificacion, String nombre, String apellido, String direccion, String telefono, String email, String genero, int edad) {
        super(nombre, apellido, direccion, telefono, email, genero);
        this.especialidad = especialidad;
        this.noPacientes = noPacientes;
        this.identificacion = identificacion;
    }

}
