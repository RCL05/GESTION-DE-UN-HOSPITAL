package Gestion_Hopital;

import java.util.Date;

public class CitaMedica implements RealiarCita {
    private Date fechaCita;
    private int noCita;
    private String motivoCita;
    private String horaCita;
    Enfermero[] enfermeroList;
    EstadoCita estadoCita;
    Doctor[] doctorList;
    public void programarCita() {

    }

    public void cancelarCita() {

    }
    public void reprogramarCita() {

    }

    public CitaMedica (Date fechaCita, int noCita, String motivoCita, String horaCita) {
        this.fechaCita = fechaCita;
        this.noCita = noCita;
        this.motivoCita = motivoCita;
        this.horaCita = horaCita;
    }
    public Date getFechaCita() {
        return fechaCita;
    }
    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }
    public int getNoCita() {
        return noCita;
    }
    public void setNoCita(int noCita) {
        this.noCita = noCita;
    }
    public String getMotivoCita() {
        return motivoCita;
    }
    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }
    public String getHoraCita() {
        return horaCita;
    }
    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

}




