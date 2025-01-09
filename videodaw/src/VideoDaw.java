import java.time.LocalDate;

public class VideoDaw {

 //ATRIBUTOS
    private String cif;
    private String direccion;
    private LocalDate alta;
    private int npeliculas;
    private int nclientes;
    
    private Cliente [] clientes;
    private Pelicula [] peliculas;

    //CONSTRUCTORES
    public VideoDaw(String cif, String direccion){

        this.cif = cif;
        this.direccion = direccion;
        this.alta = LocalDate.now();
        this.peliculas = new Pelicula[100];
        this.npeliculas = 0;
        this.clientes = new Cliente[100];
        this.nclientes = 0;

    }

    public String getCif() {

        return cif;

    }
    public String getDireccion() {

        return direccion;

    }
    public LocalDate getAlta() {

        return alta;

    }
    public int getNpeliculas() {

        return npeliculas;

    }
    public int getNclientes() {

        return nclientes;
        
    }


    public boolean nuevoCliente(Cliente nuevo){

        if (nuevo != null) {
        	
            for (int i = 0; i < nclientes; i++) {
            	
                if (clientes[i].getDni().equals(nuevo.getDni())) {
                	
                    return false;
                    
                }
                
            }
            
            this.clientes[nclientes] = nuevo;
            nclientes++;
            
            return true;
            
        }
        
        return false;
        
    }

    public boolean nuevaPelicula(Pelicula nueva){
    	
        boolean isAdd = false;
        
        if (nueva != null){
        	
            this.peliculas [npeliculas] = nueva;
            
            npeliculas++;
            
        }
        
        return isAdd;
        
    }


    public String InfoVideoDaw(){

        String getInfoVideoDaw = String.format("informacion sobre el videoclub" + "cif: %s, direccion: %s, fecha de alta: %s, Peliculas: %s, clientes %s", this.cif, this.direccion, this.alta, this.npeliculas, this.nclientes);
        
        return getInfoVideoDaw;

    }

    public String mostrarPeliculas(){

    String Disponibles = "";

    for(int i = 0; i < npeliculas; i++){

        System.out.println(i + "." + peliculas[i].InfoPelicula());

        }

    return Disponibles;

    }

    public String mostrarPeliculasNoAlquiladas(){

        String NoAlquiladas = "";

        if(npeliculas > 0){

        for(int i = 0; i < npeliculas; i++){

            if (peliculas[i].isAlquilada() == false){

                NoAlquiladas += (peliculas[i].InfoPelicula());

            }

        }

        }else{

            NoAlquiladas = "No hay peliculas";

        }
    return NoAlquiladas;

    }

    public String mostrarClientes(){
    	
        String mostrarClientes = "";
        
        if(clientes != null){   
        	
        for(int i = 0; i < nclientes; i++){
        	
            System.out.println(i + "." + clientes[i].InfoCliente());
            
            }
        
        }
        
        return mostrarClientes;
        
    }


    public Pelicula PeliculaPosicion(int i){
    	
        return this.peliculas[i];
        
    } 

    public Cliente ClientePosicion(int i){
    	
        return this.clientes[i];
        
    }

    

    public boolean alquilarPelicula(int c, int p){
    	
        this.ClientePosicion(c);
        this.PeliculaPosicion(p).Alquiler();

        boolean isAdd = false;

        return isAdd;
        
    }

    public boolean devolverPelicula(int c, int p){
    	
        this.ClientePosicion(c);
        this.PeliculaPosicion(p).devolver();

        boolean isEliminated = false;

        return isEliminated;
        
    }

    public void BajaCliente(Cliente c, int numSocio){
        
        if(this.clientes != null){

            this.clientes [numSocio] = null;

            for(int i = numSocio + 1; i < nclientes; i++){

                this.clientes [i-1] = this.clientes[i];

            }

            this.clientes [nclientes-1] = null;

            nclientes--;
            
            System.out.println("eliminado");
            
        }
        

    }

    public void BajaPelicula(Pelicula p, int cod){
    	
        
        if (cod >= 0 && cod < npeliculas) {
        	
            this.peliculas [cod] = null;
            
            for(int i = cod + 1; i < npeliculas; i++){
            	
                this.peliculas [i-1] = this.peliculas[i];
                
            }
            
            this.peliculas [npeliculas-1] = null;

            npeliculas--;

            System.out.println("eliminada");
            
        }

    }



}
