package com.decroly.daw;

import java.util.Scanner;

public class U2E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader = new Scanner(System.in);
		//EJERCICIO 1
		
		
		
		
		
		
		
		
		//EJERCICIO 2
		
		String [] clientes = new String [10];
		int contador = 0;
		
		String opcion = "";
		
		
		do {
			System.out.println("1 - sumar");
			System.out.println("2 - restar");
			System.out.println("3 - multiplicar");
			System.out.println("4 - dividir");
			System.out.println("5 - salir");
			
			opcion = reader.nextLine();
			
			 if(opcion.equals("1")){
				 reader = new Scanner(System.in);
				 System.out.println("introduzca el primer numero:");
				 	double suma1 = reader.nextDouble();
				 	
				 System.out.println("introduzca el segundo numero:");
				 	double suma2 = reader.nextDouble();
				 
				 System.out.println("el resultado es:" + (suma1 + suma2));
				 
	            }
			 
	            else if(opcion.equals("2")){
	            	reader = new Scanner(System.in);
	            	 System.out.println("introduzca el primer numero:");
					 	double resta1 = reader.nextDouble();
					 	
					 System.out.println("introduzca el segundo numero:");
					 	double resta2 = reader.nextDouble();
					 
					 System.out.println("el resultado es:" + (resta1 - resta2));
					 
	            }
			 
	            else if(opcion.equals("3")){
	            	reader = new Scanner(System.in);
	            	 System.out.println("introduzca el primer numero:");
					 	double multi1 = reader.nextDouble();
					 	
					 System.out.println("introduzca el segundo numero:");
					 	double multi2 = reader.nextDouble();
	            	 
					 System.out.println("el resultado es:" + (multi1 * multi2));
	            	
	            	
	            	
	            }
			 
	            else if(opcion.equals("4")){
	            	reader = new Scanner(System.in);
	            	 System.out.println("introduzca el primer numero:");
					 	double division1 = reader.nextDouble();
					 	
					 System.out.println("introduzca el segundo numero:");
					 	double division2 = reader.nextDouble();	
	            	
					 System.out.println("el resultado es:" + (division1 % division2));
	            	 
	            }
			 
			 
	            else if(opcion.equals("5")){
	                
	            }
			 
	            else{

	            }
			
		}while(!opcion.equals("5"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
