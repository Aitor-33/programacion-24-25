package com.decroly.daw;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//EJERCICIO 1
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("intoduce texto: ");
		
		 String texto = reader.nextLine();
		
		
		 String [] palabras = texto.split(" ");
		 
	     String mitexto = texto.substring(1, texto.length());

	     String texAux = texto.replaceAll(" ", "");

	        texAux = texto.toLowerCase();
	        
	        	for (int i = 0; i < texto.length(); i++) {
	        	
	            char c = texto.charAt(i);
	            char z = texto.charAt(texto.length() - 1);
	            
	        	}

	        	for(String palabra : texto.split(" ")){
	        	
	            System.out.println(palabra);
	            
	        	}

	   //EJERCICIO 2
	   
	        	System.out.println("intoduce texto: ");
	    		
	   		 	String texto1 = reader.nextLine();
	   		
	   		 	System.out.println("intoduce texto: ");
	    		
	   		 	String texto2 = reader.nextLine();
	   		
	   		 	
	   		 	if(texto1.equals(texto2)) {
	   		 		
	   		 		System.out.println("las cadenas son exactamente iguales");
	   		 		
	   		 	} else {
	   		 		
	   		 		System.out.println("las cadenas no son exactamente iguales");
	   		 		
	   		 	}
		
	   		 	if(texto1.equalsIgnoreCase(texto2)) {
	   		 		
	   		 		System.out.println("son iguales ignorando las mayusculas y miniusculas");
	   		 		
	   		 	} else {
	   		 		
	   		 		System.out.println("no son iguales ignorando las mayusculas y miniusculas");
	   		 		
	   		 	}
		
		//EJERCICIO 3
	   		 	
	   		 System.out.println("intoduce el nombre: ");
	    		
	   		 String textos1 = reader.nextLine();

	   		 ;
	   		
	   		 System.out.println("intoduce el apellido: ");
	    		
	   		 String textos2 = reader.nextLine();
	   		 
	   		 ;
		
	   		 System.out.println("intoduce el segundo apellido: ");
    		
	   		 String textos3 = reader.nextLine();
	   		 
	   		 String codigo = textos1.substring(0, 3).toUpperCase() + textos2.substring(0,3).toUpperCase() + textos3.substring(0, 3).toUpperCase();
	   		 System.out.println(codigo);
		
	   		 
	   	//EJERCICIO 4
	   		
	   		 
	   		 
	   		 
	   		 
	   		 
	   		 
	   		 
	   		 
	   		 
	   		 
	   		 
	}

}
