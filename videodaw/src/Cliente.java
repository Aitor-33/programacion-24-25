import java.time.LocalDate;

public class Cliente {

    private static int contador = 0;


    private String dni;
    private String nombre;
    private int cod;
    private String direccion;
    private LocalDate nacimiento;
    private LocalDate fechaBaja;
    private int nalquiladas;

    private int nPelicula;
    private Pelicula [] peliculasCliente;


    public Cliente(String dni, String nombre, String direccion, LocalDate nacimiento){
        this.cod = this.contador;
        this.contador++;

        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.nalquiladas = 0;
        this.peliculasCliente = new Pelicula[100];
        this.nPelicula = 0;
        this.fechaBaja = fechaBaja;
    }
    
    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCod() {
        return cod;
    }
    public String getDireccion() {
        return direccion;
    }
    public LocalDate getNacimiento() {
        return nacimiento;
    }
    public LocalDate getBaja() {
        return fechaBaja;
    }
    public int getNalquiladas() {
        return nalquiladas;
    }

    public int getNpeliculas(){
        return nPelicula;
    }
    

    public String InfoCliente(){
        String getInfoCliente = String.format( 
        "dni: %s, nombre: %s, codigo: Soc-%s, direccion: %s, fecha de acimiento %s, Alquiladas %s",  
        this.dni, this.nombre, this.cod, this.direccion, this.nacimiento, this.nalquiladas );
        return getInfoCliente;
    }

    public String mostrarPeliculas(){ 
        String peliculasAlquiladas = "";
        for(int i = 0; i < nPelicula; i++){
            peliculasAlquiladas += peliculasCliente[i].InfoPelicula();
            }
        return peliculasAlquiladas;
    }


    public boolean addPelicula(Pelicula p){
    	
    
        boolean isAdd = false;
        
        if (p != null){
            
        	this.peliculasCliente[nPelicula] = p;
            
        	nalquiladas++;
            
        	nPelicula++;
        	
        }
        
        return isAdd;
        
    }

    public boolean elimPelicula(Pelicula p){
    
    	boolean isEliminated = false;
        
    	if (p != null){
            
    		nalquiladas--;
    		
        }
        return isEliminated;
    }

    public LocalDate baja(){ 
        LocalDate fechaBaja = LocalDate.now();
        return fechaBaja;
	    

}

}
