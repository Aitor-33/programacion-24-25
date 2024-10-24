package com.decroly.daw;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//EJERCICIO 1
		
		int [][] matriz = new int [5][5];
			
			int numeros = 1;
			
			for (int i = 0; i < 5; i++) {
				
				for (int j = 0; j < 5; j++) {
					
					matriz[i][j] = numeros;
					
					numeros ++;
					
					System.out.println("los numeros de la matriz son: " + matriz[i][j]);
					
				}
			}
			
			
	//EJERCICIO 2
			
		int [][] tablasMulti = new int [10][10];
		
		 for (int i = 0; i < 10; i++) {
			 
	         for (int j = 0; j < 10; j++) {
	        	 
	             tablasMulti[i][j] = (i + 1) * (j + 1);
	             
	             	System.out.println(tablasMulti[i][j]);
			
	         }
	         System.out.println("siguiente tabla de multiplicar: ");
		 }
			
	//EJERCICIO 3
		 
		 Scanner reader = new Scanner(System.in);

		 
		 System.out.println("introduzca el valor de n: ");
		 
		 int n = reader.nextInt();
		 
		 System.out.println("introduzca el valor de m: ");
		 
		 int m = reader.nextInt();
		 
		 int [][] matriz2 = new int [n][m];
		 
		 for (int i = 0; i < n; i++) {
			 
			 for (int j = 0; j < m; j++) {
				 
				 System.out.println("Valor en posición [" + i + "][" + j + "]: ");
				 
				 matriz2[i][j] = reader.nextInt();
				 
			 }
			 
		 }
		 
		 int mayores = 0;
				 
		 int menores = 0;
		 
		 int iguales = 0;
		 
		 for (int i = 0; i < n; i++) {
			 
			 for (int j = 0; j < m; j++) {
				 
	             if (matriz2[i][j] > 0) {
	            	 
	                 mayores++;
	                 
	             } else if (matriz2[i][j] < 0) {
	            	 
	                 menores++;
	                 
	             } else {
	            	 
	                 iguales++;
	                 
	             }
	         }
		 }
		 
		System.out.println("resultados: "); 
		System.out.println("mayores que cero: " + mayores);
		System.out.println("menores que cero: " + menores);
		System.out.println("iguales que cero: " + iguales);
		 
		 
		
	//EJERCICIO 4
		
		 int alumnos = 4;
	     int asignaturas = 5;

	     
	     double[][] notas = new double[alumnos][asignaturas];

	     
	     for (int i = 0; i < alumnos; i++) {
	    	 
	         System.out.println("introduce las notas del Alumno " + (i + 1) + ":");
	         
	         for (int j = 0; j < asignaturas; j++) {
	        	 
	             System.out.print("nota de la asignatura " + (j + 1) + ": ");
	             
	             notas[i][j] = reader.nextDouble();
	             
	         }
	     }

	    
	     for (int i = 0; i < alumnos; i++) {
	    	 
	         double suma = 0;
	         double notaMin = notas[i][0];
	         double notaMax = notas[i][0];

	         for (int j = 0; j < asignaturas; j++) {
	        	 
	             double notaActual = notas[i][j];
	             
	             suma += notaActual;
	             
	             
	             if (notaActual < notaMin) {
	            	 
	                 notaMin = notaActual;
	                 
	             }
	             if (notaActual > notaMax) {
	            	 
	                 notaMax = notaActual;
	                 
	             }
	         }

	         
	         double media = suma / asignaturas;

	         
	         System.out.println("alumno " + (i + 1) + ":");
	         System.out.println("nota minima: " + notaMin);
	         System.out.println("nota maxima: " + notaMax);
	         System.out.println("nota media: " + media);
	     }

	//EJERCICIO 5
	  
	     System.out.print("introduce el numero de personas: ");
	     
	     int numeroPersonas = reader.nextInt();

	     
	     double[][] datos = new double[numeroPersonas][2]; 

	     
	     double sumaHombres = 0, sumaMujeres = 0;
	     
	     int contHombres = 0, contMujeres = 0;

	     
	     for (int i = 0; i < numeroPersonas; i++) {
	    	 
	         System.out.println("\npersona " + (i + 1) + ":");
	         
	         System.out.print("introduce el genero 0 hombre, 1 mujer: ");
	         
	         int genero = reader.nextInt();

	         
	         while (genero != 0 && genero != 1) {
	        	 
	             System.out.print("introduce un genero valido: ");
	             
	             genero = reader.nextInt();
	             
	         }

	         System.out.print("introduce el sueldo: ");
	         double sueldo = reader.nextDouble();

	         
	         datos[i][0] = genero;
	         datos[i][1] = sueldo;

	         
	         if (genero == 0) {
	        	 
	             sumaHombres += sueldo;
	             
	             contHombres++;
	             
	         } else if (genero == 1) {
	        	 
	             sumaMujeres += sueldo;
	             
	             contMujeres++;
	             
	         }
	     }


	     double mediaHombres = (contHombres > 0) ? sumaHombres / contHombres : 0;
	     double mediaMujeres = (contMujeres > 0) ? sumaMujeres / contMujeres : 0;


	     
	     System.out.println("sueldo medio hombres: " + mediaHombres);
	     System.out.println("sueldo medio mujeres: " + mediaMujeres);
		
		
		
		
	}

}
