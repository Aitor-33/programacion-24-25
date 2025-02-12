import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {
private static int contador = 0;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private int id;
    private LocalDateTime fecha;
    private Tipo tipo;
    private double cantidad;

    public Movimiento(Tipo tipo, double cantidad) {

        this.fecha = LocalDateTime.now(); 
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.id = contador;
        contador++;

    }

    public int getId() {

        return id;

    }

    public LocalDateTime getFecha() {

        return fecha;

    }

    public Tipo getTipo() {

        return tipo;

    }

    public double getCantidad() {

        return cantidad;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        
        sb.append("Movimiento ");
        sb.append(" formatter=").append(formatter);
        sb.append(", id= ").append(id);
        sb.append(", fecha= ").append(fecha);
        sb.append(", tipo= ").append(tipo);
        sb.append(", cantidad= ").append(cantidad);

        return sb.toString();
    }


    
}
