
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula {

    private String cod;
    private String titulo;
    private Genero genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;
    

    public Pelicula(String cod, String titulo, Genero genero, boolean isAlquilada){

        this.fechaRegistro = LocalDate.now();

        this.cod = cod;

        this.titulo = titulo;

        this.genero = genero;

        this.isAlquilada = false;

    }


    public LocalDate getFechaRegistro(){

        return this.fechaRegistro;

    }

    public LocalDate getFechaBaja(){

        return this.fechaBaja;

    }

    public LocalDateTime getFechaAlquiler(){

        return this.fechaAlquiler;

    }

    public Genero getGenero(){

        return this.genero;

    }

    public String getTitulo(){

        return this.titulo;

    }

    public String getCod(){

        return this.cod;

    }


    public boolean getIsAlquilada(){

        return this.isAlquilada;

    }

public String getInfoPelicula(){

    String getPelicula = String.format("fecha de registro: %s, fecha de baja: %s, fecha del alquiler: %s, genero de la pelicula: %s, titulo de la pelicula: %s, codigo: %s, esta alquilada: %s", 
    this.fechaRegistro, this.fechaBaja, this.fechaAlquiler, this.genero, this.titulo, this.cod, this.isAlquilada );

        return getPelicula;

    }


public void setFechaAlquiler(LocalDateTime fechaAl) {

    this.fechaAlquiler = fechaAl;

    if(fechaAlquiler != null){

        this.isAlquilada = true;

    }
    

}


public void setAlquilada(boolean isAlquilada) {

    this.isAlquilada = isAlquilada;

}




    

}


