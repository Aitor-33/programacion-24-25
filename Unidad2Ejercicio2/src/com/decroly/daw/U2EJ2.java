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
//EJERCICIO 8 

		
		
//EJERCICIO 9
		
		System.out.println("introduzca las horas:");
		int horas = reader.nextInt();
		System.out.println("introduzca los minutos:");
		int minutos = reader.nextInt();
		System.out.println("introduzca los segundos:");
		int segundos = reader.nextInt();
		segundos ++;
		if (segundos>= 60) {
			minutos ++;
			segundos = 0;
			
			
		if (minutos >= 60) {
			horas ++;
			minutos = 0;
			
		}
		}
		
		System.out.println(horas);
		System.out.println(minutos);
		System.out.println(segundos);
//EJERCICIO 10	
		
		int contador = 0;
        boolean haynegativos= false;
        while (contador < 10) {
        	 System.out.print("Introduce un numero no nulo: ");
        	int numero = reader.nextInt();
            
        	while (numero == 0) {
        		System.out.println("el numero introducido es nulo");
        		numero = reader.nextInt();	
        			
        	}
        	
        	if (numero<0) {
        		haynegativos = true;
        	}

        contador ++;	
        	
        }
        
    	if (haynegativos == true) {
    		System.out.println("hay un numero negativo");
    	}

//EJERCICIO 11	
    	int positivos = 0;
		int negativos = 0;
    	int contador1 = 0;
        boolean haynegativos1= false;
        while (contador1 < 10) {
        	 System.out.print("Introduce un numero no nulo: ");
        	int numero1 = reader.nextInt();
            positivos ++;
            
        	while (numero1 == 0) {
        		System.out.println("el numero introducido es nulo");
        		numero1 = reader.nextInt();	
        			
        	}
        	
        	if (numero1 < 0) {
        		haynegativos1 = true;
        		negativos ++;
        	}

        contador1 ++;	
        	
        }
        
    	if (haynegativos1 == true) {
    		System.out.println("hay un numero negativo");
    	}

		System.out.println(positivos);
		System.out.println(negativos);
		
//EJERCICIO 12
		
		int positivos1 = 0;
		int negativos1 = 0;
    	int contador2 = 0;
    	int numero2 = 0;
        boolean haynegativos2= false;
        
        do {
        	System.out.print("Introduce un numero: ");
        	numero2 = reader.nextInt();
            positivos1 ++;
            
        	
        	if (numero2 < 0) {
        		haynegativos1 = true;
        		negativos1 ++;
        	}

        	contador2 ++;
        	
        }while (numero2 != 0);

        
    	if (haynegativos2 == true) {
    		System.out.println("hay un numero negativo");
    	}

		System.out.println(positivos1);
		System.out.println(negativos1);
		
//EJERCICIO 13		
		
		System.out.println("la suma de los primeros 10 numeros naturales es:");
		int suma = 1+2+3+4+5+6+7+8+9+10;
		System.out.println(suma);
		
		System.out.println("el producto de los primeros 10 numeros naturales es:");
		int producto = 1*2*3*4*5*6*7*8*9*10;
		
		System.out.println(producto);
		
//EJERCICIO 14
//Escribe un programa que calcula el salario neto semanal de un trabajador en función del
//número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
//• Las primeras 35 horas se pagan a tarifa normal.
//• Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
//• Las tasas de impuestos son:
//• Los primeros 500 euros son libres de impuestos.
//• Los siguientes 400 tienen un 25% de impuestos.
//• Los restantes un 45% de impuestos.
//Escribir nombre, salario bruto, tasas y salario neto.		
		
		double tarifa;
		int horas1;
		int horasmas;
		double salarioBruto = 0;
		double salarioNeto = 0;
		double salarioNetoplus = 0;
		System.out.println("introduce la tarifa:");
		tarifa = reader.nextInt();
		horas1 = reader.nextInt();
		
		if (horas1 > 35){
			horasmas = horas1 - 35;
			salarioBruto = horasmas * 1.5 * tarifa + 35 * tarifa;
			System.out.println("el salario bruto es:" + salarioBruto);
		}
		else {
			salarioBruto = horas1 * tarifa;
			System.out.println("el salario bruto es:" + salarioBruto);
		}
		if (salarioBruto < 500) {
			salarioNeto = salarioBruto;
			System.out.println("el salario neto es:" + salarioNeto);
		}
		if (salarioBruto > 900) {
			salarioNetoplus = salarioBruto - 900 * 0.45;
			System.out.println("el salario neto es:" + salarioNetoplus);
		}
		else {
			salarioNeto = salarioBruto - 500 * 0.25;
			System.out.println("el salario neto es:" + salarioNeto);
		}
		
		
		
		
	}

}
