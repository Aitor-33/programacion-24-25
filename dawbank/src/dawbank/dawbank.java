package dawbank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dawbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner reader = new Scanner(System.in);	
		
        String eleccionUsuario;
        
        Cuentabancaria cuenta;
        
        System.out.println("te damos la bienvenida a dawbank ahora es momento de crearte una cuenta");
        System.out.println("introduzca su nombre porfavor: ");
        
        String datos = reader.nextLine();
        
        System.out.println("Introduzca su iban profavor: ");
        
		String iban = reader.nextLine();
		
		Pattern patteiban = Pattern.compile("[A-Z]{2}[0-9]{22}");
		
		Matcher matchiban = patteiban.matcher(iban);
		
		while (!matchiban.matches()) {
			
			System.out.println("el iban introducido en tiene un formato correcto porfavor introduzca uno valido: ");
			
			System.out.println("recuerde que debe contener 2 letras y 22 numeros");
			
			iban = reader.nextLine();
			
			matchiban = patteiban.matcher(iban);
			
		}
        
		cuenta = new Cuentabancaria(iban, datos, 0);
		
        do {
            System.out.println("1 - datos de la cuenta");
            System.out.println("2 - IBAN");
            System.out.println("3 - titular");
            System.out.println("4 - saldo");
            System.out.println("5 - ingreso");
            System.out.println("6 - retirada");
            System.out.println("7 - movimientos");
            System.out.println("8 - salir");
            
            System.out.println("selecciona una opcion del menu:");
            
            eleccionUsuario = reader.nextLine();
            
            if(eleccionUsuario.equals("1")){
                
                System.out.println(cuenta.informacioncuenta());
                
                }else if(eleccionUsuario.equals("2")){
                    
                    System.out.println(cuenta.mostrariban());
                    
                    }else if(eleccionUsuario.equals("3")){
                        
                    System.out.println(cuenta.mostrartitular());
                    
                    }else if(eleccionUsuario.equals("4")){

                    System.out.println(cuenta.mostrarsaldo());

                    }else if(eleccionUsuario.equals("5")){

                    	System.out.println("introduce la cantidad que quieres ingresar");
                    
                    	double cantingreso = reader.nextDouble();
                    	
                    		if(cantingreso >= 3000) {
                    		
                    			System.out.println("debe notificar este ingrso ha hacienda");
                    		
                    		}
                    		
                    Movimiento ingreso = new Movimiento("Ingreso",cantingreso);
                    
    				cuenta.Ingreso(ingreso);
    				
    				System.out.println("este es tu saldo espues del ingreso: " + cuenta.mostrarsaldo());		
                    
                    
                    
                    }else if(eleccionUsuario.equals("6")){

                        System.out.println("introduce la cantidad que quieres retirar");
                        
                    	double cantretirada = reader.nextDouble();
                    	
                    Movimiento retirada = new Movimiento("Retirada",cantretirada);
                    
					cuenta.Retirada(retirada);
					
					System.out.println("este es tu saldo despues de la retirada" + cuenta.mostrarsaldo());		
                    			
                    		

                    }else if(eleccionUsuario.equals("7")){

                    
                    System.out.println(cuenta.mostrarmovimiento());
                        
                        
                    }else{
                            System.out.println("escoge una opcion valida");
                            
                            }
                            
        }while(!eleccionUsuario.equals("8"));
    
    System.out.println("has salido");  
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
