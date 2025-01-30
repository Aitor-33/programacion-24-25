import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String eleccionJugador;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("1 - añadir coche");
            System.out.println("2 - papel");
            System.out.println("s - salir");
            
            eleccionJugador = reader.nextLine();
            
            if(eleccionJugador.equals("1")){
                
                System.out.println("introduzca el color de su coche");
                String color = reader.nextLine();

                System.out.println("introduzca la marca de su coche");
                String marca = reader.nextLine();

                System.out.println("introduzca la matricula de su coche");
                String matricula = reader.nextLine();
    
                }
            
                else if(eleccionJugador.equals("2")){
    
                
                    
                }else{
                            System.out.println("escoge una opcion valida");
                            
                            }
            
        }while (!eleccionJugador.equals("s"));


    }
}
