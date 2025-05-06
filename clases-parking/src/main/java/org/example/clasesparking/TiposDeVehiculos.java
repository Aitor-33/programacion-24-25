package org.example.clasesparking;

public class TiposDeVehiculos {

    String nombre;
    String descripcion;
    Double tarifaAdicional;

    public TiposDeVehiculos(String nombre, String descripcion, Double tarifaAdicional) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tarifaAdicional = tarifaAdicional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getTarifaAdicional() {
        return tarifaAdicional;
    }

    public void setTarifaAdicional(Double tarifaAdicional) {
        this.tarifaAdicional = tarifaAdicional;
    }

    @Override
    public String toString() {
        return "TiposDeVehiculos{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tarifaAdicional=" + tarifaAdicional +
                '}';
    }
}
