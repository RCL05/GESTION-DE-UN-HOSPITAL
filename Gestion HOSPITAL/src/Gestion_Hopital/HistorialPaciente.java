package Gestion_Hopital;

public class HistorialPaciente  extends ExpedienteMedico{

    private String fechainicio;
    private String fechafin;
    private String enfermedad;
    Paaciente paaciente;


    public HistorialPaciente(String nombrePaciente, String Diagnostico, String Tratamiento, String Medicamentos, String fechainicio, String fechafin, String enfermedad) {
        super(nombrePaciente, Diagnostico, Tratamiento, Medicamentos);
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.enfermedad = enfermedad;
    }

}
