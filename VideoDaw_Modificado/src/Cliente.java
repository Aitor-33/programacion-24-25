import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;

public class Cliente extends Persona{

    private int codSocio;
    private LocalDate fechaBaja;
    private LinkedList <Articulo> articulosAlquilados;
    private static int contadorSocio = 1;
    
    public Cliente(String dni, String nombre, String direccion, LocalDate fechaNacimiento) {

        super(dni, nombre, direccion, fechaNacimiento);
        this.codSocio = contadorSocio;
        contadorSocio++;
        this.fechaBaja = null;
        this.articulosAlquilados = new LinkedList<>();

    }

    public int getCodSocio() {

        return codSocio;

    }

    public LocalDate getFechaBaja() {

        return fechaBaja;

    }

    public LinkedList<Articulo> getArticulosAlquilados() {

        return articulosAlquilados;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Cliente: ");
        sb.append("codSocio: ").append(codSocio);
        sb.append(", dni: ").append(dni);
        sb.append(", nombre: ").append(nombre);
        sb.append(", direccion: ").append(direccion);
        sb.append(", fechaNacimiento: ").append(fechaNacimiento);
        sb.append('.');

        return sb.toString();

    }
    
    public void agregarArticuloAlquilado(Articulo articulo) {

        articulosAlquilados.add(articulo);

    }

    public void eliminarArticuloAlquilado(Articulo articulo) {

        articulosAlquilados.remove(articulo);

    }

    public String mostrarArticulosAlquilados(){

        Iterator <Articulo> itera = articulosAlquilados.iterator();
        Articulo cadaArticulo = null;

        while (itera.hasNext()){

            cadaArticulo = itera.next();

        }

        return cadaArticulo.toString();
        
    }
}
