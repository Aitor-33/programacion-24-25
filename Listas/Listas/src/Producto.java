public class Producto {

    private String nombre;
    private int cantidad;
    
    public Producto(String nombre, int cantidad) {

        this.nombre = nombre;
        this.cantidad = cantidad;
        
    }

    public String getNombre() {

        return nombre;

    }

    public int getCantidad() {

        return cantidad;

    }

    @Override
    public String toString() {
        return "Producto  el nombre del producto es " + nombre + ", la cantidad de ese producto es " + cantidad;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;

    }


}
