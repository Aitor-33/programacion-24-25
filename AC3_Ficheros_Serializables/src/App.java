import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);	
		List<Libro> libros = new LinkedList<>();
        String eleccionUsuario;
		
        
        do {

            reader = new Scanner(System.in);
            System.out.println("1 - Crear libro");
            System.out.println("2 - Mostrar libros existentes");
            System.out.println("3 - Eliminar libro por ISBN");
            System.out.println("4 - Guardar libro en el fichero");
            System.out.println("5 - guardar y salir");
            
            eleccionUsuario = reader.nextLine();
            
            if(eleccionUsuario.equals("1")){
                
                reader = new Scanner(System.in);

                System.out.println("introduzca el ISBN del libro: ");
                int ISBN = reader.nextInt();

                reader = new Scanner(System.in);
                
                System.out.println("introduzca el titulo del libro: ");
                String titulo = reader.nextLine();

                System.out.println("introduzca el autor del libro: ");
                String autor = reader.nextLine();

                System.out.println("introduzca la fecha de publicacion del libro: ");
                LocalDate fechaPublicacion = MyUtils.leerFecha();

                Libro L = new Libro(ISBN, titulo, autor, fechaPublicacion);
                libros.add(L);

                
                }else if(eleccionUsuario.equals("2")){
                    
                    for(Libro L : libros){

                        System.out.println(L);

                    }

                    } else if(eleccionUsuario.equals("3")){
                        
                        reader = new Scanner(System.in);
                        System.out.println("introduzca el ISBN del libro: ");
                        int ISBN = reader.nextInt();


                    }else if(eleccionUsuario.equals("4")){


                        
                    }
        }while(!eleccionUsuario.equals("5"));
    
    System.out.println("has salido");  



    }
}
