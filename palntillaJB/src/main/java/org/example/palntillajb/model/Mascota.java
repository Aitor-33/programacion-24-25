package org.example.palntillajb.model;

import java.time.LocalDateTime;

public class Mascota {
    private String pasaporte;
    private String nombre;
    private LocalDateTime fechaNacimiento;
    private Double peso;
    private String tipo;
    private Propietario propietario;


    public Mascota(String pasaporte, String nombre, Double peso, LocalDateTime fechaNacimiento, String tipo, Propietario propietario) {
        this.pasaporte = pasaporte;
        this.nombre = nombre;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = tipo;
        this.propietario = propietario;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "pasaporte='" + pasaporte + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", peso=" + peso +
                ", tipo='" + tipo + '\'' +
                ", propietario=" + propietario +
                '}';
    }
}
