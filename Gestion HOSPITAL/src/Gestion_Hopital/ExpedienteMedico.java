package Gestion_Hopital;

public class ExpedienteMedico {

    protected String nombrePaciente;
    protected String Diagnostico;
    protected String Tratamiento;
    protected String Medicamentos;
    Doctor doctor;

    public ExpedienteMedico(String nombrePaciente, String Diagnostico, String Tratamiento, String Medicamentos) {
        this.nombrePaciente = nombrePaciente;
        this.Diagnostico = Diagnostico;
        this.Tratamiento = Tratamiento;
        this.Medicamentos = Medicamentos;
    }


    public String setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
        return nombrePaciente;
    }
    public String getNombrePaciente() {
        return nombrePaciente;
    }
    public String setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
        return Diagnostico;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }
    public String setTratamiento(String Tratamiento) {
        this.Tratamiento = Tratamiento;
        return Tratamiento;
    }
    public  String getTratamiento() {
        return Tratamiento;
    }
    public String setMedicamentos(String Medicamentos) {
        this.Medicamentos = Medicamentos;
        return Medicamentos;
    }
    public String getMedicamentos() {
        return Medicamentos;
    }





}
