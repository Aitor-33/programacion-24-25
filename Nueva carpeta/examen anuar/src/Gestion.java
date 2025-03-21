import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String eleccionJugador;

do {
		System.out.println("1 - registrar trabajador en empresa");
		System.out.println("2 - mostrar informacion de la empresa");
		System.out.println("3 - mostrar numero de trabajadores actuales");
		System.out.println("4 - mostrar informacion del departamento");
        System.out.println("5 - eliminar trabajador de la empresa");
        System.out.println("6 - agenda del director");
        System.out.println("7 - salir");
        
        reader = new Scanner (System.in);
		eleccionJugador = reader.nextLine();
		
		if(eleccionJugador.equals("1")){
			
        System.out.println("a - registrar director -solo puede haber uno-");
		System.out.println("b - registrar gerente -solo puede haber 3-");
		System.out.println("c - registrar trabajador normal");

        eleccionJugador = reader.nextLine();

			if(eleccionJugador.equals("a")){
                
            
            
            }else if(eleccionJugador.equals("b")){

                
                
            
            }else if(eleccionJugador.equals("c")){

            
            }


            }else if(eleccionJugador.equals("2")){

                
            
                }else if(eleccionJugador.equals("3")){
					
                }else if(eleccionJugador.equals("4")){
					
					
					
            
                }else if(eleccionJugador.equals("5")){
                    
					
					
                    
                }else if(eleccionJugador.equals("6")){
                    do {
                    System.out.println("a - convocar una reunion");
                    System.out.println("b - fuera de la oficina");
                    System.out.println("c - convocar a toda la empresa");
					System.out.println("d - salir");
                    eleccionJugador = reader.nextLine();


				if(eleccionJugador.equals("a")){

            
			
            
            
                    }else if(eleccionJugador.equals("b")){
                        
                        
                        
                    
                    }else if(eleccionJugador.equals("c")){
        
                    
                    }
					
                }while(!eleccionJugador.equals("d"));
                System.out.println("has salido");
            }
		
        
		
                    else{
						System.out.println("escoge una opcion valida");
						
                        }
		
	}while(!eleccionJugador.equals("7"));

System.out.println("has salido");


    }
}
