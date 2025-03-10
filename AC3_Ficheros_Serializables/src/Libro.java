
import java.time.LocalDate;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;

    public Libro(int iSBN, String titulo, String autor, LocalDate fechaPublicacion) {

        ISBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;

    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Libro ");
        sb.append("ISBN=").append(ISBN);
        sb.append(", titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", fechaPublicacion=").append(fechaPublicacion);

        return sb.toString();
    }

    
    

}
