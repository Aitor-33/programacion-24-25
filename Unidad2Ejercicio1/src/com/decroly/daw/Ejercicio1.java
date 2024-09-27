
package com.decroly.daw;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//EJERCICIO 1
		
		System.out.println("Buenos dias");
//EJERCICIO 2
		int lado1 = 5;
		int lado2 = 5;
		
		System.out.println("el area del cuadrado es:"+(lado1 * lado2));
//EJERCICIO 3		
			Scanner reader = new Scanner(System.in);
		System.out.println("intriduce un numero:");		
		double lado =	reader.nextDouble();
		
		
		System.out.println("el area del segundo cuadrado es:"+(lado * lado));
//EJERCICIO 4
			Scanner reader1 = new Scanner(System.in);
		
			Scanner reader2 = new Scanner(System.in);
		
		System.out.println("intriduce un numero:");	
		
		double numero1 = reader1.nextDouble();
		
		System.out.println("intriduce un numero:");	
		
		double numero2 = reader2.nextDouble();
		
		System.out.println("la suma es:"+(numero1 + numero2));
		
		System.out.println("la resta es:"+(numero1 - numero2));
		
		System.out.println("el producto es:"+(numero1 * numero2));
		
		System.out.println("la division es:"+(numero1 / numero2));
//EJERCICIO 5
			Scanner reader3 = new Scanner(System.in);
			
		System.out.println("introduzca el radio:");
				
		double radio = reader3.nextDouble();
		
		System.out.println("la longitud del circulo es:"+(Math.PI * Math.pow(radio, 2)));
		
		System.out.println("el area del circulo es:"+(Math.PI * (radio + radio)));
		
		System.out.println("el volumen de la esfera es:"+(4/3 * Math.PI * Math.pow(radio, 3)));		
//EJERCICIO 6
		Scanner porcentaje = new Scanner(System.in);
		System.out.println("intoduzca el precio del articulo");
		double precio1 = porcentaje.nextDouble();
		
		Scanner porcentaje2 = new Scanner(System.in);
		System.out.println("intoduzca el precio de venta real");
		double precio2 = porcentaje2.nextDouble();
		
		System.out.println("el porcentaje es:"+(precio1 / precio2 *100)+"%");
//EJERCICIO 7
		
		
		
		
	

		
		
		
	}

}
