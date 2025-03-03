public class Producto {
    private int codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    private static int contador = 0;
    
        public Producto(int cantidad, String nombre, double precio) {
            this.cantidad = cantidad;
            this.codigo = contador;
            this.contador++;
            this.nombre = nombre;
            this.precio = precio;
        }
    
        public int getCodigo() {
            return codigo;
        }
    
        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public int getCantidad() {
            return cantidad;
        }
    
        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }
    
        public double getPrecio() {
            return precio;
        }
    
        public void setPrecio(int precio) {
            this.precio = precio;
        }
    
        public int getContador() {
            return contador;
        }
    
        public void setContador(int contador) {
            this.contador = contador;
        }
    
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Producto ");
            sb.append(" codigo del producto = ").append(codigo);
            sb.append(", nombre del producto = ").append(nombre);
            sb.append(", cantidad del producto = ").append(cantidad);
            sb.append(", precio del producto = ").append(precio);
            sb.append(" euros");
            
            return sb.toString();
        }
}
