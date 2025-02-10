import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner reader = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<Gato>();
        int contador = 0;


        do{

            try {

                System.out.println("escribe el nombre de tu gato acontinuacion");
                String nombre = reader.nextLine();

                reader = new Scanner(System.in);

                System.out.println("escribe la edad de tu gato acontinuacion");

                String edades = reader.nextLine();

                int edad = Integer.parseInt(edades);

                Gato gato = new Gato(nombre, edad);
                
                System.out.println(gato.toString());
                gatos.add(gato);

                contador++;
                
            } catch (NumberFormatException e) {

                System.out.println("la edad del gato debe de ser un numero entero. Gracias");

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }
    } while (contador < 5);

    System.out.println("estos son todos los gatos registrados:");

    for (Gato gato : gatos){

        System.out.println(gato.toString());
        
    }
    }
}
