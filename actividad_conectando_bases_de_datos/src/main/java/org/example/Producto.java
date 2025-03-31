package org.example;

public class Producto {

    int id;
    String referencia;
    String nombre;
    String descripcion;
    int tipo;
    int cantidad;
    double precio;
    int descuento;
    int iva;

    public Producto(int cantidad, int tipo, String referencia, double precio, String descripcion, int descuento, int id, int iva, String nombre) {
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.referencia = referencia;
        this.precio = precio;
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.id = id;
        this.iva = iva;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getDescuento() {
        return descuento;
    }

    public int getId() {
        return id;
    }

    public int getIva() {
        return iva;
    }

    public String getNombre() {
        return nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTipo() {
        return tipo;
    }

    @Override
    public String toString() {

        return "Producto{" +
                "cantidad=" + cantidad +
                ", id=" + id +
                ", referencia='" + referencia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo=" + tipo +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", iva=" + iva +
                '}';

    }
}
