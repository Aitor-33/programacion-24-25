package org.example.repaso_examen;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mascota implements Serializable {

    private static final long serialVersionUID = 8828669022365350303L;

    private String nombre;
    private String pasaporte;
    private LocalDate fechaNacimiento;
    private Double peso;
    private Propietario propietario;
    private Tipo tipo;


    public Mascota(String nombre, String pasaporte, LocalDate fechaNacimiento, Double peso, Propietario propietario, Tipo tipo) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.propietario = propietario;
        this.tipo = tipo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Tipo getTipo() {
        return tipo;
    }

    //llamamos al to string de las dos clases para que nos de la informacion.
    //modificaremos el to string de las otras clases segun lo que queramos enseñar
    //tambien se puede hacer con por ejemplo el getter del dato que quieras de esa clase ejemplo propietario.getDni()
    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre +
                ", pasaporte='" + pasaporte +
                ", fechaNacimiento=" + fechaNacimiento +
                ", peso=" + peso +
                ", propietario=" + propietario.toString() +
                ", tipo=" + tipo.toString() +
                '}';
    }
}
