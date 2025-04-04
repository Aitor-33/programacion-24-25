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
    boolean aplicar_dto;

    public Producto(String referencia, int id, int tipo, String nombre, String descripcion, double precio, int cantidad, int descuento, int iva, boolean aplicar_dto) {

        this.referencia = referencia;
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.iva = iva;
        this.aplicar_dto = aplicar_dto;

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

    public boolean isAplicar_dto() {
        return aplicar_dto;
    }

    public void setAplicar_dto(boolean aplicar_dto) {
        this.aplicar_dto = aplicar_dto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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
