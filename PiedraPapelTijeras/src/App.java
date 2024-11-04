import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
System.out.println("Hola bienvenido a Piedra Papel o Tijera.");
	System.out.println("Estas son las normas. Piedra le gana a Tijera, Tijera le gana a Papel y Papel le gana a Piedra.");
	System.out.println("Vas a tener tres opciones las cuales tendras que seleccionar escribiendo la inicial de la opcion que deseas escojer.");	
		
	Scanner reader = new Scanner(System.in);	
		
	String eleccionJugador;
	String eleccionMaquina;
	
	do {
		System.out.println("p - piedra");
		System.out.println("l - papel");
		System.out.println("t - tijeras");
		System.out.println("s - salir");
		
		eleccionJugador = reader.nextLine();
		
		 if(eleccionJugador.equals("p")){
			 
			 
            }
		 
            else if(eleccionJugador.equals("l")){
            	
				 
            	
            
            	}else if(eleccionJugador.equals("t")){
            	
            	
            	}
		 
           
		 
            		else{

            			}
		
	}while(!eleccionJugador.equals("s"));






    }
}
