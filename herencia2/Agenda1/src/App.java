import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);
        
        do { 
            System.out.println("1 - añadir contacto a la agenda");
            String options = reader.nextLine();
            


            if(options.equals("1")){

                System.out.println("escribe el nombre del contacto:");
                String nombre = reader.nextLine();
                
                System.out.println("escribe el numero del contacto que quieres agregar");
                int telefono = reader.nextInt();


                Contacto info = new Contacto(nombre, telefono);
                System.out.println(info);

            }

            if(options.equals("2")){



            }

        } while (true);
        
        
        
        
        
        
        








        
    }
}
