package org.example.repaso_examen;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Consulta implements Serializable {

    private static final long serialVersionUID = -2289621426918320550L;

    private long fecha;
    private int duracion;
    private String observaciones;
    private Mascota mascota;
    // no necesitamos propietario porque con la mascota podemas sacar el propietario


    public Consulta(long fecha, int duracion, String observaciones, Mascota mascota) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.observaciones = observaciones;
        this.mascota = mascota;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Mascota getMascota() {
        return mascota;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "fecha=" + fecha +
                ", duracion=" + duracion +
                ", observaciones='" + observaciones + '\'' +
                ", mascota=" + mascota.getNombre() + " - " + mascota.getPasaporte() +
                //cogemos propietario de la mascota y dentro de propietario su get nombre
                ", propietario=" + mascota.getPropietario().getNombre() + " - " + mascota.getPasaporte() +
                '}';
    }
}
