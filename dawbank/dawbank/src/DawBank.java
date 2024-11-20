import java.util.Scanner;

public class dawbank {
    public static void main(String[] args) throws Exception {
        
        
        Scanner reader = new Scanner(System.in);	
		
	String eleccionJugador;
        
        
        
        do {
            System.out.println("1 - datos de la cuenta");
            System.out.println("2 - IBAN");
            System.out.println("3 - titular");
            System.out.println("4 - saldo");
            System.out.println("5 - ingreso");
            System.out.println("6 - retirada");
            System.out.println("7 - movimientos");
            System.out.println("8 - salir");
    
            
            eleccionJugador = reader.nextLine();
            
            if(eleccionJugador.equals("1")){
                
                
    
                }else if(eleccionJugador.equals("2")){
    
                    
                
                    }else if(eleccionJugador.equals("3")){
                        
                    
                    
                    }else if(eleccionJugador.equals("4")){




                    }else if(eleccionJugador.equals("5")){




                    }else if(eleccionJugador.equals("6")){




                    }else if(eleccionJugador.equals("7")){



        
        
                    }else{
                            System.out.println("escoge una opcion valida");
                            
                            }
            
        }while(!eleccionJugador.equals("8"));
    
    System.out.println("has salido");  

        
    }
}