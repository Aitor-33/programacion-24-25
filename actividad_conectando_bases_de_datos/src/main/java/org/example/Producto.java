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

    public Producto(String referencia, int id, int tipo, String nombre, String descripcion, double precio, int cantidad, int descuento, int iva) {

        this.referencia = referencia;
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.iva = iva;

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
                "referencia='" + referencia + '\'' +
                ", id=" + id +
                ", tipo=" + tipo +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", descuento=" + descuento +
                ", iva=" + iva +
                '}';
    }
}
