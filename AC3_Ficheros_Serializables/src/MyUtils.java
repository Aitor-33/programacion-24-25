import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyUtils {
    public static void imprimir(String mensaje){

            System.out.println(mensaje);

        }

        public static LocalDate leerFecha(){

        Scanner reader = new Scanner(System.in);
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        MyUtils.imprimir("\nEscribe la fecha de publicacion en formato DD/MM/AAAA");
        String dateString = reader.nextLine();
        
        LocalDate fechaLocalDate = LocalDate.parse(dateString, formatter);

        return fechaLocalDate;
    }
}
