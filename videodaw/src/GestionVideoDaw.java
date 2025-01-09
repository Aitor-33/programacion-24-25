import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class GestionVideoDaw {
    public static void main(String[] args) throws Exception {

Scanner reader = new Scanner(System.in);	
Scanner generador = new Scanner(System.in);
String eleccionUsuario;
VideoDaw franquicia = null;
Pelicula peliculaNueva = null;
Cliente clientenuevo = null;
final String patronCif = "[A-Z]{1}[0-9]{8}";
final String patronDNI = "[0-9]{8}[A-Z]{1}";


		do {

	            System.out.println("1 - Crear y registrar VideoClub en la franquicia.");
	            System.out.println("2 - Registrar pelicula en videoclub");
	            System.out.println("3 - Crear y registrar cliente en videoclub.");
	            System.out.println("4 - Alquilar pelicula.");
	            System.out.println("5 - Devolver pelicula.");
	            System.out.println("6 - Dar de baja cliente.");
	            System.out.println("7 - Dar de baja pelicula");
	            System.out.println("8 - salir");
	            
	            System.out.println("selecciona una opcion del menu:");
	            
	            eleccionUsuario = reader.nextLine();
	            
	            if(eleccionUsuario.equals("1")){

	            	reader = new Scanner(System.in);
					System.out.println("crea tu nueva franquicia");


					String cif = MyUtils.comprobarPatronRep(patronCif, "escriba el cif de su empresa");
					String direccion = MyUtils.leerTextoPantalla("escriba su direccion");


					franquicia = new VideoDaw(cif, direccion);
					System.out.println("has registrado una nueva franquicia");
					System.out.println(franquicia.InfoVideoDaw());
	                
	            
	            }else if(eleccionUsuario.equals("2")){
	                    
	    				if(franquicia != null){
	    					reader = new Scanner(System.in);
	    					System.out.println("pelicula nueva");	


	    					String titulo = MyUtils.leerTextoPantalla("titulo de la pelicula");

	    					
	    					for(int i = 0; i < 1; i++){

	    						System.out.println("de que genero es la pelicula " + " 1 - ACCION" + " 2 - COMEDIA" + " 3 - ROMANCE" + " 4 - FANTASIA" + " 5 - TERROR");
	    						generador = new Scanner(System.in);
	    						int nGenero = generador.nextInt();

	    						if (nGenero == 1){
	    							peliculaNueva = new Pelicula(titulo, Genero.ACCION);	
	    						}
	    						if (nGenero == 2){
	    							peliculaNueva = new Pelicula(titulo, Genero.COMEDIA);
	    						}
	    						if (nGenero == 3){
	    							peliculaNueva = new Pelicula(titulo, Genero.ROMANCE);
	    						}
	    						if (nGenero == 4){
	    							peliculaNueva = new Pelicula(titulo, Genero.FANTASIA);
	    						}
	    						if (nGenero == 5){
	    							peliculaNueva = new Pelicula(titulo, Genero.TERROR);
	    						}
	    					
	    					} 
	                    
	                    }else if(eleccionUsuario.equals("3")){
	                    
                                

                                String nombre = MyUtils.leerTextoPantalla("Introduzca el nombre: ");
                                String dni = MyUtils.comprobarPatronRep(patronDNI, "Introduzca el DNI: ");
                                String direccionUsuario = MyUtils.leerTextoPantalla("Introduzca la direccion: ");
                                LocalDate fechaNacimiento = MyUtils.leerFecha();
            
                                LocalDate hoy = LocalDate.now();
                                Period edad = Period.between(fechaNacimiento, hoy);
                                
                                if (edad.getYears() > 18) {
                                    
                                    clientenuevo = new Cliente(dni, nombre, direccionUsuario, fechaNacimiento);
                                    
                                    if (franquicia.nuevoCliente(clientenuevo) == true) {

                                        System.out.println("Cliente registrado.");
                                    
                                    }else{

                                        System.out.println("El cliente ya existe.");

                                    }

                                    }

                                    else{

                                    System.out.println("El cliente debe ser mayor de edad.");

                                    }   
                                    
                            

	                    }else{
                            System.out.println("El cliente debe estar registrado en un VideoCLub");
                        }
	                    
	                    }else if(eleccionUsuario.equals("4")){

	                    	reader = new Scanner(System.in);

	        				
	        				if(franquicia != null && franquicia.getNpeliculas() > 0 &&
	        						clientenuevo != null && clientenuevo != null){

	        					
	        					System.out.println("Quien va a alquilar la pelicula");
	        					System.out.println(franquicia.mostrarClientes());	 
	        					int cliente = reader.nextInt();
	        				
	        					
	        					System.out.println("¿Que pelicula quieres alquilar?");
	        					System.out.println(franquicia.mostrarPeliculasNoAlquiladas());
	        					int pelicula = reader.nextInt();

	        					
	        					if(franquicia.PeliculaPosicion(pelicula).isAlquilada() == false){

	        						
	        						franquicia.alquilarPelicula(cliente, pelicula);
	        						franquicia.ClientePosicion(cliente).addPelicula(peliculaNueva);

	        						
	        						System.out.println(franquicia.ClientePosicion(cliente).mostrarPeliculas());	
	        						
	        					} else {
	        						
	        						System.out.println("La pelicula seleccionada ya esta alquilada");
	        						
	        					}
	        		
	        				}else {
	        					System.out.println("Para alquilar la pelicula, registra primero Peliculas en el videoclub.");
	        					}

	                    }else if(eleccionUsuario.equals("5")){
	                    		
	                    	
	        				if( franquicia != null && franquicia.getNclientes() > 0 && 
	        				peliculaNueva != null && clientenuevo != null){

	        					
	        					System.out.println(franquicia.mostrarClientes());	 
	        					int bajacliente = reader.nextInt();

	        					
	        					if(franquicia.ClientePosicion(bajacliente).getNalquiladas() > 0){

	        						
	        						System.out.println("pelicula a devolver");
	        						System.out.println(franquicia.ClientePosicion(bajacliente).mostrarPeliculas());
	        						int bajapelicula = reader.nextInt();

	        						
	        						franquicia.devolverPelicula(bajacliente, bajapelicula);
	        						franquicia.ClientePosicion(bajacliente).elimPelicula
	        						(franquicia.PeliculaPosicion(bajapelicula));

	        						
	        						System.out.println("movimientos: ");
	        						franquicia.ClientePosicion(bajacliente).mostrarPeliculas();
	        					} else{
	        						System.out.println("No hay peliculas alquiladas");
	        						}	
	        				} else {
	        					System.out.println("registra primero Peliculas en el videoclub.");
	        					}
	        				
	                    }else if(eleccionUsuario.equals("6")){
	                    	
	                    	System.out.println(franquicia.mostrarClientes());
	        				System.out.println("cliente a dar de baja");
	        		    	int numSocio = reader.nextInt();

	        				
	        				franquicia.BajaCliente(clientenuevo, numSocio);
	        				
	                    }else if(eleccionUsuario.equals("7")){

	                    	reader = new Scanner(System.in);

	        				
	        				if(franquicia != null && franquicia.getNpeliculas() > 0){

	        				
	        				System.out.println("posicion de la pelicula a dar de baja");
	        				System.out.println(franquicia.mostrarPeliculas());
	        				int cod = reader.nextInt();
	        				
	        				
	        				franquicia.BajaPelicula(peliculaNueva, cod);

	        				} else {

	        					System.out.println("No hay peliculas");

	        				}
	                        
	                    }else{

	                            System.out.println("escoge una opcion valida");
	                            
	                            }
	                            
	        }while(!eleccionUsuario.equals("8"));
	    
	    System.out.println("has salido");
		
		
		
	}

        
    }

