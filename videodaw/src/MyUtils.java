import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtils {
	Scanner reader = new Scanner(System.in);

    public static void imprimir(String mensaje){
    	
        System.out.println(mensaje);
        
    }

    public static String leerTextoPantalla(String mensaje){
    	
        Scanner reader = new Scanner(System.in);
        System.out.println(mensaje);
        String valor = reader.nextLine();
        return valor;
        
    }

    public static boolean comprobarPatron(String patron, String texto){
    	
        boolean isOk = false;
        Pattern pat = Pattern.compile(patron);
        Matcher mat = pat.matcher(texto);
        isOk = mat.matches();
        return isOk;
        
    }

    public static String comprobarPatronRep(String patron, String mensaje){
    	
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

    public static LocalDate leerFecha(){
    	
        Scanner reader = new Scanner(System.in);

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        MyUtils.imprimir("Escribe tu fecha de nacimiento con este formato DD/MM/AAAA");
        String dateString = reader.nextLine();


        LocalDate fechaLocalDate = LocalDate.parse(dateString, formatter);
        return fechaLocalDate;
        
    }
    
    public static int leerNumeroPantalla(int mensaje){
        
    	Scanner reader = new Scanner(System.in);
        System.out.println(mensaje);
        int valor = reader.nextInt();
        return valor;
        
    }







}
