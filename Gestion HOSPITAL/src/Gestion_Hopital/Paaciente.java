package Gestion_Hopital;

import java.util.Date;

public class Paaciente extends Persona { // Error: extends is not allowed in a class declaration

    private String tipoSangre;
    private String alergias;
    private String enfermedades;

    HistorialPaciente historialPaciente;

    public Paaciente(String tipoSangre, String alergias, String enfermedades, String nombre, String apellido, String direccion, String telefono, String email, String identificacion) {
        super(nombre, apellido, direccion, telefono, email, identificacion);
        this.tipoSangre = tipoSangre;
        this.alergias = alergias;
        this.enfermedades = enfermedades;
    }

    public Paaciente (Date fechaCita, int noCita, String motivoCita, String horaCita, String tipoSangre, String alergias, String enfermedades, String nombre, String apellido, String direccion, String telefono, String email, String identificacion) {
        super(fechaCita, noCita, motivoCita, horaCita);
        this.tipoSangre = tipoSangre;
        this.alergias = alergias;
        this.enfermedades = enfermedades;
    }

}
