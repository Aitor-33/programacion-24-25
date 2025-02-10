import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner reader = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<Gato>();
        int contGatos = 0;
        System.out.println("Vamos a guardar 5 gatos");
        do{
            
            try {

                System.out.println("Dime el nombre (minimo 3 caracteres)");
                String nombre = reader.nextLine();

                reader = new Scanner(System.in);
                System.out.println("Dime la edad (mayor que 0)");
                String edadString = reader.nextLine();
                int edad = Integer.parseInt(edadString); //El scaner da error y solo se soluciona con el interger

                Gato gato = new Gato(nombre, edad);
                
                System.out.println(gato.toString());
                gatos.add(gato);

                contGatos++;
                
            } catch (NumberFormatException e) {

                System.out.println("Error: La edad debe ser un número entero");

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }
    } while (contGatos < 5);

    System.out.println("Estos son los gatos que has creado:");
    for (Gato gato : gatos){
        System.out.println(gato.toString());
    }
    }
}
