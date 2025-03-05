import java.time.LocalDate;

public class Articulo extends Persona {

    protected int cod;
    protected String titulo;
    protected LocalDate fechaRegistro;
    protected LocalDate fechaBaja;
    protected static int codArticulo = 1;

    public Articulo(String titulo) {

        this.cod = codArticulo;
        codArticulo++;
        this.titulo = titulo;
        this.fechaRegistro = LocalDate.now();
        this.fechaBaja = fechaBaja;

    }

    public int getCod() {

        return cod;

    }
    public String getTitulo() {

        return titulo;

    }
    public LocalDate getFechaRegistro() {

        return fechaRegistro;

    }
    public LocalDate getFechaBaja() {

        return fechaBaja;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Articulo:");
        sb.append("cod: ").append(cod);
        sb.append(", titulo: ").append(titulo);
        sb.append(", fechaRegistro: ").append(fechaRegistro);
        sb.append('.');

        return sb.toString();
        
    }
}
