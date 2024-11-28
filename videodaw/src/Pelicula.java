
import java.time.LocalDateTime;

public class Pelicula {

    private String cod;
    private String titulo;
    private String genero;
    private LocalDateTime fechaRegistro;
    private LocalDateTime fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;
    

    public Pelicula(String cod, String titulo, String genero, boolean isAlquilada){

        this.fechaRegistro = LocalDateTime.now();

        this.fechaBaja = LocalDateTime.now();

        this.fechaAlquiler = LocalDateTime.now();

        this.cod = cod;

        this.titulo = titulo;

        this.genero = genero;

        this.isAlquilada = isAlquilada;

    }












}
