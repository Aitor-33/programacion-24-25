package com.decroly.daw;

import java.util.Scanner;

public class U2EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//EJERCICIO 1
		Scanner reader = new Scanner(System.in);
		System.out.println("Ponga aqui su edad:");
		int edad = reader.nextInt();
				
		if (edad >= 18) {
			
		System.out.println("eres mayor de edad");	
		}
		
//EJERCICIO 2
		System.out.println("Ponga aqui su edad:");
		int edad1 = reader.nextInt();
				
		if (edad1 >= 18) {
			
		System.out.println("eres mayor de edad");	
		
		} else if (edad1 < 18) {
			System.out.println("eres menor de edad");
		}
		
		
//EJERCICIO 3
		int cont;
		for(cont=1;cont<=20;cont++) {
			System.out.print(cont + " ");
		
			System.out.print("\n");
		}
//EJERCICIO 4
			int conta;
			for(conta=0;conta<=200;conta+=2) {
				System.out.print(conta + " ");
			
				System.out.print("\n");
			}	
			
//EJERCICIO 5
			
//pagina 4 ejercicio 7		
		
		
		
		
	}

}
