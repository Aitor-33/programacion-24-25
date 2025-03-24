public class Producto {
private String referencia;
private String nombre;
private String descripcion;
private String tipo;
private int cantidad;
private Double precio;
private int descuento;
private int iva;


public Producto(String referencia, String nombre, String descripcion, String tipo) {

    this.referencia = referencia;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.tipo = tipo;

}
public Producto(String referencia, String nombre, String descripcion, String tipo, int cantidad, Double precio,
        int descuento, int iva) {

    this.referencia = referencia;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.tipo = tipo;
    this.cantidad = cantidad;
    this.precio = precio;
    this.descuento = descuento;
    this.iva = iva;
    
}
public String getReferencia() {
    return referencia;
}
public String getNombre() {
    return nombre;
}
public String getDescripcion() {
    return descripcion;
}
public String getTipo() {
    return tipo;
}
public int getCantidad() {
    return cantidad;
}
public Double getPrecio() {
    return precio;
}
public int getDescuento() {
    return descuento;
}
public int getIva() {
    return iva;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}
public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
}
public void setPrecio(Double precio) {
    this.precio = precio;
}
public void setDescuento(int descuento) {
    this.descuento = descuento;
}
public void setIva(int iva) {
    this.iva = iva;
}

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Producto{");
        sb.append("referencia=").append(referencia);
        sb.append(", nombre=").append(nombre);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", tipo=").append(tipo);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precio=").append(precio);
        sb.append(", descuento=").append(descuento);
        sb.append(", iva=").append(iva);
        sb.append('}');

        return sb.toString();
        
    }














}
