import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {

Agenda array = new Agenda();

        Scanner reader = new Scanner(System.in);
        String opcion;
        
        do{

            System.out.println("\nMenú de opciones:");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Verificar existencia");
            System.out.println("5. Listar todos los contactos");
            System.out.println("6. Salir");

            opcion = reader.nextLine();

            if (opcion.equals("1")) {

                System.out.print("Introduce el nombre del contacto: ");
                    String nombreAñadir = reader.nextLine();

                    System.out.print("Introduce el teléfono del contacto: ");
                    String telefonoAñadir = reader.nextLine();

                    Contacto nuevoContacto = new Contacto(nombreAñadir, telefonoAñadir);
                    if (array.añadirContacto(nuevoContacto)) {
                        System.out.println("Contacto añadido correctamente.");
                    } else {
                        System.out.println("No se pudo añadir el contacto.");
                    }

            } else if (opcion.equals("2")) {  
                
                System.out.print("Introduce el nombre del contacto a eliminar: ");
                String nombreEliminar = reader.nextLine();
                if (array.eliminarContacto(nombreEliminar)) {
                    System.out.println("Contacto eliminado correctamente.");
                } else {
                    System.out.println("No se pudo eliminar el contacto.");
                }
                
            } else if (opcion.equals("3")) {  
                
                System.out.print("Introduce el nombre del contacto a buscar: ");
                    String nombreBuscar = reader.nextLine();
                    int posicion = array.buscaContacto(nombreBuscar);
                    if (posicion != -1) {
                        System.out.println("Contacto encontrado en la posición: " + posicion);
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                
            } else if (opcion.equals("4")) { 

                System.out.print("Introduce el nombre del contacto a verificar: ");
                    String nombreVerificar = reader.nextLine();
                    
                    if (array.nombreExistente(nombreVerificar)) {

                        System.out.println("El contacto existe.");

                    } else {

                        System.out.println("El contacto no existe.");

                    }
                
            } else if (opcion.equals("5")) {  

                array.listaContactosExistentes();

            } else if (opcion.equals("6")){
            
                System.out.println("has salido");


            }  else {

                System.out.println("pon una opcion que sea correcta en el menu");

            }

        } while (!opcion.equals("6"));





    }
}
