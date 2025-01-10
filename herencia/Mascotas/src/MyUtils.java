import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyUtils {
Scanner reader = new Scanner(System.in);

    public static void imprimir(String mensaje){
        System.out.println(mensaje);
    }

    public static LocalDate leerFecha(){
        Scanner entrada = new Scanner(System.in);

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        MyUtils.imprimir("\nEscribe la fecha de nacimiento en formato DD/MM/AAAA");
        String dateString = entrada.nextLine();

        
        LocalDate fechaLocalDate = LocalDate.parse(dateString, formatter);
        return fechaLocalDate;
    }
}
