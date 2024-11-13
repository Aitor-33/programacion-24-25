
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

    public int getid() {
        return this.id;
    }
    
    public String getfecha() {
        return this.fecha;
    }
    
    public String gettipo() {
        return this.tipo;
    }
    
    public double getcantidad() {
        return this.cantidad;
    }
    
    public void setcantidad(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
            
        }else{
            System.out.println("el numero debe de ser mayor que 0");
            
        }
    }
    
    public String mostrarInfoMovimientos(){
        
        String mostrar = String.format("movimientos - id: %s, fecha: %s, tipo: %s, cantidad: %s", this.id, this.fecha, this.tipo, this.cantidad);

        return mostrar;
    }











}
