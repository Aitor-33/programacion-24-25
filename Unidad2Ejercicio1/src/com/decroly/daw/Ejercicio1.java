
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
		Scanner millas = new Scanner(System.in);
		
		System.out.println("introduzca las millas:");
		
		double vmillas = millas.nextDouble();
		
		System.out.println("son: "+(vmillas * 1.852)+ " metros");
//EJERCICO 8		
		
		Scanner numeros1 = new Scanner(System.in);
		System.out.println("introduzca un numero:");
		double mayor = numeros1.nextDouble(); 
		
		
	
		Scanner numeros2 = new Scanner(System.in);
		System.out.println("introduzca un numero:");
		double menor = numeros2.nextDouble();
		
		System.out.println("los numeros en orden ascendente son:");
		
		double menores = Math.min(mayor, menor);
		
		double mayores = Math.max(mayor, menor);
		
		System.out.println(menores);
		System.out.println(mayores);
//EJERCICIO 9
		numeros1 = new Scanner(System.in);
		
		System.out.println("introduce el primer numero:");
		
		double menor1 = numeros1.nextDouble();
		
		System.out.println("introduce el segundo numero:");
		
		double mayor1 =numeros1.nextDouble();
		
		System.out.println("el primer numero es mayor:"+ (menor1>mayor1));
		
		System.out.println("el segundo numero es mayor:"+ (menor1<mayor1));
		
		System.out.println("el primer numero es igual a el segundo numero:"+ (menor1==mayor1));
//EJERCICIO 10
		numeros1 = new Scanner(System.in);
		
		System.out.println("introduce el primer numero:");
		
		double maximo1 = numeros1.nextDouble();
		
		System.out.println("introduce el segundo numero:");
		
		double maximo2 = numeros1.nextDouble();
		
		System.out.println("introduce el tercer numero:");
		
		double maximo3 = numeros1.nextDouble();
		
		System.out.println("el numero mayor es:"+ (Math.max(maximo1,(Math.max(maximo2, maximo3)))));
		
//EJERCICIO 11
		
		Scanner reader4 = new Scanner(System.in);
		
		Scanner reader5 = new Scanner(System.in);
	
		System.out.println("intriduce un numero:");	
		
		double numero5 = reader4.nextDouble();
		
		System.out.println("intriduce un numero:");	
		
		double numero6 = reader5.nextDouble();
		
		System.out.println("la suma es:"+(numero5 + numero6));
		
		System.out.println("la resta es:"+(numero5 - numero6));
		
		System.out.println("el producto es:"+(numero5 * numero6));
		
		System.out.println("la division es:"+(numero5 / numero6));	
//EJERCICIO 12
		numeros1 = new Scanner(System.in);
		
		System.out.println("introduce el primer numero:");
		
		double maximo4 = numeros1.nextDouble();
		
		System.out.println("introduce el segundo numero:");
		
		double maximo5 = numeros1.nextDouble();
		
		System.out.println("el numero mayor es:"+(Math.max(maximo4, maximo5)));
		
//EJERCICIO 13		
		
		numeros1 = new Scanner(System.in);
		
		System.out.println("introduce el primer numero:");
		
		double maximo6 = numeros1.nextDouble();
		
		double valor = Math.signum(maximo6);
		
		System.out.println("el valor de este numero es:");
		System.out.println(valor);
		System.out.println("si el valor es 1 es positivo y si es -1 es negativo");
	}

}
