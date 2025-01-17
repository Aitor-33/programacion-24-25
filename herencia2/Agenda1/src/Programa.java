import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);
        
        do { 
            System.out.println("1 - añadir contacto a la agenda");
            System.out.println("2 - eliminar un contacto ya existente");
            System.out.println("3 - mostrar lista de contactos");
            System.out.println("4 - buscar un contacto");

            String options = reader.nextLine();
            
            if(options.equals("1")){

                System.out.println("escribe el nombre del contacto:");
                String nombre = reader.nextLine();

                

                System.out.println("escribe el numero del contacto que quieres agregar");
                String telefono = reader.nextLine();


                Contacto info = new Contacto(nombre, telefono);
                System.out.println(info);

            }

            if(options.equals("2")){
                
                System.out.println("escriba el nombre del contacto a eliminar:");
                String nombre = reader.nextLine();
                

            }

            if(options.equals("3")){



                
            }



        } while (true);

    }
}
