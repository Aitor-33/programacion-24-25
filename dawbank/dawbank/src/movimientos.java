
import java.time.LocalDateTime;

public class movimientos {


    private static int contador = 0;

    private int id;
    private String fecha;
    private String tipo;
    private double cantidad;

    public movimientos(String tipo, double cantidad){
        
        this.id = contador;
        this.contador ++;


        this.fecha = LocalDateTime.now().toString();
        this.tipo = tipo;
        this.cantidad = cantidad;

    }











}
