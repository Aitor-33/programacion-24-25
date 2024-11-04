import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
System.out.println("Hola bienvenido a Piedra Papel o Tijera.");
	System.out.println("Estas son las normas. Piedra le gana a Tijera, Tijera le gana a Papel y Papel le gana a Piedra.");
	System.out.println("Vas a tener tres opciones las cuales tendras que seleccionar escribiendo la inicial de la opcion que deseas escojer.");	
		
	Scanner reader = new Scanner(System.in);	
		
	String eleccionJugador;
	Random random = new Random();
	
	do {
		System.out.println("p - piedra");
		System.out.println("l - papel");
		System.out.println("t - tijeras");
		System.out.println("s - salir");

		int eleccionMaquina = random.nextInt(3);

		//0 sera piedra. 1 sera papel. 2 sera tijeras
		
		eleccionJugador = reader.nextLine();
		
		 if(eleccionJugador.equals("p")){
			
			if(eleccionMaquina == 0){
				
				System.out.println("los dos habeis escogido piedra ¡¡¡empate!!!");
			 
			}else if(eleccionMaquina == 1){
			 
				System.out.println("la maquina ha escogido papel ¡¡¡has perdido!!!");

			 }else if(eleccionMaquina == 2){

				System.out.println("la maquina ha escogido tijeras ¡¡¡has ganado!!!");

			 }

            }
		 
            else if(eleccionJugador.equals("l")){

            	if(eleccionMaquina == 0){
				
					System.out.println("la maquina ha escogido piedra ¡¡¡has ganado!!!");
				 
				}else if(eleccionMaquina == 1){
				 
					System.out.println("los dos habeis escogido papel ¡¡¡empate!!!");
	
				 }else if(eleccionMaquina == 2){
	
					System.out.println("la maquina ha escogido tijeras ¡¡¡has perdido!!!");
	
				 }
				 
            	
            
            	}else if(eleccionJugador.equals("t")){
					
					if(eleccionMaquina == 0){
				
						System.out.println("la maquina ha escogido piedra ¡¡¡has perdido!!!");
					 
					}else if(eleccionMaquina == 1){
					 
						System.out.println("la maquina ha escogido papel ¡¡¡has ganado!!!");
		
					 }else if(eleccionMaquina == 2){
		
						System.out.println("los dos habeis escogido tijeras ¡¡¡empate!!!");
		
					 }
            	
            	}
		 
           
		 
            		else{
						System.out.println("escoge una opcion valida");
						
            			}
		
	}while(!eleccionJugador.equals("s"));

 System.out.println("has salido");	





    }
}
