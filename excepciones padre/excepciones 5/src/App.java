import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.println("escribe el nombre de tu gato acontinuacion");
        String nombre = reader.nextLine();

        System.out.println("escribe la edad de tu gato acontinuacion");
        int edad = reader.nextInt();

        try {

            Gato gato = new Gato(nombre, edad);

            System.out.println(gato.toString());

        } catch (RuntimeException e) {

            System.out.println(e.getMessage());

            System.out.println("el nombre o la edad no estan en un formato correcto");
            
        }
    }
}
