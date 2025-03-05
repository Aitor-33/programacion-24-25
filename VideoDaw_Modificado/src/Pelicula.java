import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula extends Articulo{

    private Genero_Pelicula generoP;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss");
    
    public Pelicula(String titulo, Genero_Pelicula generoP) {

        super(titulo);
        this.generoP = generoP;
        this.fechaAlquiler = fechaAlquiler;
        this.isAlquilada = isAlquilada;

    }

    public Genero_Pelicula getGenero() {

        return generoP;

    }

    public LocalDateTime getFechaAlquiler() {

        return fechaAlquiler;

    }

    public boolean isAlquilada() {

        return isAlquilada;

    }
    
    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {

        this.fechaAlquiler = fechaAlquiler;

    }

    public void setIsAlquilada(boolean isAlquilada) {

        this.isAlquilada = isAlquilada;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Pelicula: ");
        sb.append("cod: ").append(cod);
        sb.append(" ,titulo: ").append(titulo);
        sb.append(" ,genero: ").append(generoP);
        sb.append('.' + "\n");

        return sb.toString();
        
    }  
}
