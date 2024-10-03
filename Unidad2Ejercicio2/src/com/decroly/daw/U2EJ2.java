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
		System.out.println("los numeros pares son:");
		int cont2;
		for(cont2=1;cont2<=200;cont2+=1) {
			if (cont2 % 2 == 0) {
			System.out.println(cont2);
			}
		}
			
//EJERCICIO 6
		System.out.println("ponga el numero aqui:");
		int N = reader.nextInt();
		
		int conta3;
		for(conta3=1;conta3<=N;conta3+=1) {
			System.out.println(conta3 + "");
			System.out.print("\n");
		}
		
		
//EJERCICIO 7
		System.out.println("introduzca la nota aqui:");
		int nota = reader.nextInt();
		
		if (nota <= 3) {
			System.out.println("muy deficiente");
		}
		
		if (nota >= 3 && nota < 5) {
			System.out.println("insuficiente");
		}
		
		if (nota >= 5 && nota < 7) {
			System.out.println("bien");
		}
		
		if (nota >= 7 && nota < 9) {
			System.out.println("notable");
		}
		
		if (nota >= 9 && nota <= 10) {
			System.out.println("sobresaliente");
		}
		
		if (nota < 0) {
			System.out.println("las notas son de 0 a 10 introduzca un valor correcto");
		}
		
		if (nota > 10) {
			System.out.println("las notas son de 0 a 10 introduzca un valor correcto");
		}
		
//pagina 4 ejercicio 7		
		
		
		
		
	}

}
