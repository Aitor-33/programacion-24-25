import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Taller taller = new Taller();
        String eleccionJugador;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("1 - añadir coche");
            System.out.println("2 - eliminar coche");
            System.out.println("3 - ver datos");
            System.out.println("s - salir");
            
            eleccionJugador = reader.nextLine();

            
            if(eleccionJugador.equals("1")){
                
                System.out.println("introduzca el color de su coche");
                String color = reader.nextLine();

                System.out.println("introduzca la marca de su coche");
                String marca = reader.nextLine();

                System.out.println("introduzca la matricula de su coche");
                String matricula = reader.nextLine();

                taller.agregarCoche(matricula, marca, color);
    
                }
            
                else if(eleccionJugador.equals("2")){

                    System.out.println("introduzca la matricula del coche a eliminar");
                    String cocheEliminado = reader.nextLine();
                    
                    taller.eliminarCoche(cocheEliminado);
                
                }else if(eleccionJugador.equals("3")){

                    System.out.println("la matricula es:");taller.verMatricula();

                    System.out.println("la informacion del coche es:");taller.verCoche();

                    System.out.println("informacion del taller:");taller.verTaller();

                }else{
                        
                            System.out.println("escoge una opcion valida");
                            
                            }
            
        }while (!eleccionJugador.equals("s"));


    }
}
