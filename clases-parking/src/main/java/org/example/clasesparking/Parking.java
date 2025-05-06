package org.example.clasesparking;

import java.sql.Time;
import java.time.LocalDateTime;

public class Parking {
    String nombre;
    String direccion;
    String ciudad;
    int codigoPostal;
    int capacidad;
    int plazasDisponibles;
    Time horaApertura;
    Time horaCierre;
    Double tarifaPorHora;
    LocalDateTime fechaRegistro;
    Boolean activo;


    public Parking(String nombre, String direccion, String ciudad, int codigoPostal, int capacidad, int plazasDisponibles, Time horaApertura, Time horaCierre, Double tarifaPorHora, LocalDateTime fechaRegistro, Boolean activo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.capacidad = capacidad;
        this.plazasDisponibles = plazasDisponibles;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.tarifaPorHora = tarifaPorHora;
        this.fechaRegistro = fechaRegistro;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPlazasDisponibles() {
        return plazasDisponibles;
    }

    public void setPlazasDisponibles(int plazasDisponibles) {
        this.plazasDisponibles = plazasDisponibles;
    }

    public Time getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(Time horaApertura) {
        this.horaApertura = horaApertura;
    }

    public Time getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(Time horaCierre) {
        this.horaCierre = horaCierre;
    }

    public Double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(Double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", capacidad=" + capacidad +
                ", plazasDisponibles=" + plazasDisponibles +
                ", horaApertura=" + horaApertura +
                ", horaCierre=" + horaCierre +
                ", tarifaPorHora=" + tarifaPorHora +
                ", fechaRegistro=" + fechaRegistro +
                ", activo=" + activo +
                '}';
    }

}
