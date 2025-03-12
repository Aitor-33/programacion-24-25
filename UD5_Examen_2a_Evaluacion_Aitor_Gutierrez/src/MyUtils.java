import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtils {

    public static void imprimir(String mensaje){

        System.out.println(mensaje);

    }

public static LocalDate leerFecha(String mensaje){
            Scanner reader = new Scanner(System.in);
            DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("\nEscribe la fehca de fundacion de la empresa en formato DD/MM/AAAA");
            String dateString = reader.next();
            LocalDate fechaLocalDate = LocalDate.parse(dateString, formatter);
            return fechaLocalDate;
    }

    public static String leerTextoPantalla(String mensaje){
        Scanner reader = new Scanner(System.in);
        System.out.println(mensaje);
        String valor = reader.nextLine();
        return valor;
    }

    public static boolean comprobarPatron(String patron, String texto){

            boolean isOk = false;
            Pattern pat = Pattern.compile(patron); //"[0-9]{7,8}[A-Za-z]"
            Matcher mat = pat.matcher(texto);
            isOk = mat.matches();

            return isOk;

        }

        public static String comprobarPatronRepetidamente(String patron, String mensaje){
            
            boolean isOk = false;
            String texto;
            do { 
                texto = MyUtils.leerTextoPantalla(mensaje);
                isOk = MyUtils.comprobarPatron(patron, texto);
                if(!isOk){
                    MyUtils.imprimir("El formato es incorrecto");
                }
            } while (!isOk);
            return texto;
        }
        public static Enumerado menuGeneroPeliculas(){
            Scanner entrada = new Scanner(System.in);

            Enumerado generoP =  null;
            System.out.println("Seleccione el departamento:");
            for (int i = 0; i < Enumerado.values().length; i++) {
                System.out.println((i+1) + ". " + Enumerado.values()[i]);
            }
            System.out.println("Introduce el numero relacionado con el nombre del departamento");
            int opcion = entrada.nextInt();
            if (opcion >= 1 && opcion <= Enumerado.values().length){
                generoP = Enumerado.values()[opcion - 1];
                System.out.println("El depaartamento seleccionado es: " + generoP);
            }
            return generoP;
        }
}
