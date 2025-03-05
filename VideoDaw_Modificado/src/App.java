import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
            Scanner reader = new Scanner(System.in);
            final String patroncif = "[A-Z]{1}[0-9]{8}";
            final String patrondni = "[0-9]{8}[A-Z]{1}";
            VideoDaw vc = null;
            Cliente cliente = null;
            Pelicula pelicula = null;
            Videojuego vj = null;
            String opcion;

            do { 
                
                System.out.println("1. Crear y registrar VideoClub");
                System.out.println("2. Registrar articulo");
                System.out.println("3. Crear y registrar cliente");
                System.out.println("4. Alquilar articulo");
                System.out.println("5. Devolver articulo");
                System.out.println("6. Dar de baja cliente");
                System.out.println("7. Dar de baja articulo");
                System.out.println("8. Salir");
                System.out.print("Selecciona una opcion: ");
                opcion = reader.nextLine();
    
                switch(opcion){

                    case "1":

                        reader = new Scanner (System.in);
                        String cif = myUtils.comprobarPatronRepetidamente(patroncif, "Introduce el CIF del videoclub");
                        String direccion = myUtils.leerTextoPantalla("Introduce la direccion del videoclub");
                        VideoDaw v = new VideoDaw(cif, direccion);
                        vc = v;
                        System.out.println(vc.toString());

                        break;

                    case "2":

                        if(vc!=null){

                            reader = new Scanner(System.in);
                            System.out.println("Pulsa 1 para registrar una pelicula, 2 para un videojuego");
                            String opcion1 = reader.nextLine();

                            try {

                                switch (opcion1) {

                                        case "1":

                                            System.out.println("Registrar pelicula");
                                            String titulo = myUtils.leerTextoPantalla("Introduce el titulo de la pelicula");
                                            Genero_Pelicula gp = myUtils.menuGeneroPeliculas();
                                            Pelicula peli = new Pelicula(titulo, gp);
                                            vc.registrarPelicula(peli);
                                            pelicula = peli;
                                            System.out.println(peli.toString());

                                        break;

                                        case "2":

                                            System.out.println("Registrar videojuego");
                                            String titulo1 = myUtils.leerTextoPantalla("Introduce el titulo del videojuego");
                                            Genero_Videojuegos gv = myUtils.menuGeneroVideojuegos();
                                            Videojuego v1 = new Videojuego(titulo1, gv);
                                            vc.registrarVideojuego(v1);
                                            vj = v1;
                                            System.out.println(v1.toString());

                                        break;

                                }

                            } catch (Exception e) {

                                System.out.println("Error: " + e.getMessage());

                            }
                        }

                    break;

                    case "3":

                        if(vc != null){

                            reader = new Scanner (System.in);
                            String dni = myUtils.comprobarPatronRepetidamente(patrondni, "Introduce el dni del cliente"); 
                            String nombre = myUtils.leerTextoPantalla("Introduce el nombre del cliente");
                            String direccion1 = myUtils.leerTextoPantalla("Introduce la direccion del cliente");
                            LocalDate fechaNacimiento = myUtils.leerFecha("Escribe la fecha de nacimiento del cliente con el siguiente formato: DD/MM/YYYY");

                            LocalDate fechaActual = LocalDate.now();
                            Period mayorEdad = Period.between(fechaNacimiento, fechaActual);

                            if(mayorEdad.getYears() >= 18){

                                try {

                                Cliente c = new Cliente(dni, nombre, direccion1, fechaNacimiento);
                                cliente = c;
                                vc.registrarCliente(cliente);
                                System.out.println(cliente.toString());

                                } catch (ClienteYaRegistradoException e) {

                                    System.out.println(e.getMessage());

                                }

                            } else{

                            System.out.println("La edad minima para registrarse como cliente es de 18.");

                            }

                        } else{

                            System.out.println("Antes de registrar un cliente, crea un videoclub.");

                        }

                        break;

                    case "4":

                        if(vc != null) {

                            reader = new Scanner (System.in);

                            System.out.println("Quien va a alquilar?");
                            System.out.println(vc.mostrarClientes());
                            int c1 = reader.nextInt();

                            System.out.println(vc.mostrarArticulosNoAlquilados(vc));
                            int v1 = reader.nextInt();

                            vc.alquilarArticulo(v1, c1);
                            System.out.println(cliente.mostrarArticulosAlquilados());
                        }

                    break;

                    case "5":

                    if(vc != null) {

                        reader = new Scanner (System.in);

                        System.out.println("Quien va a devolver?");
                        System.out.println(vc.mostrarClientes());
                        int c1 = reader.nextInt();

                        System.out.println(cliente.mostrarArticulosAlquilados());
                        int v1 = reader.nextInt();

                        vc.devolverArticulo(v1, c1);
                        System.out.println(vc.mostrarArticulosNoAlquilados(vc));

                    }

                    break;

                    case "6":

                        if(vc != null && cliente != null){

                            reader = new Scanner (System.in);
                            System.out.println("Selecciona el cliente que quieres dar de baja.");
                            System.out.println(vc.mostrarClientes());

                            int codSocio = reader.nextInt();
                            vc.darBajaCliente(codSocio);

                        }

                    break;

                    case "7":

                        if(vc != null && (pelicula != null || vj != null)){

                            reader = new Scanner (System.in);

                            System.out.println("Selecciona el articulo que quieres dar de baja.");
                            System.out.println(vc.mostrarArticulosNoAlquilados(vc));
                            int a2 = reader.nextInt();

                            vc.darBajaArticulo(a2);

                        }

                    break;

                    case "8":

                        System.out.println("has salido de gestion videodaw");

                        break;

                }

            } while (!opcion.equals("8"));
        
    }
}
