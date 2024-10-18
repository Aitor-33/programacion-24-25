package com.decroly.daw;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//EJERCICIO 1
	Scanner in = new Scanner (System.in);
	
	int[] vector = new int[10];
	
	int i;
	
	System.out.println("introduce los valores:");
	
		for(i = 0; i < vector.length; i++)
			vector[i] = in.nextInt();

	System.out.println("los valores introducidos son:");
		
		for(i = 0; i < vector.length; i++)
			
			System.out.print(vector[i] + " ");
		System.out.println();
		
//EJERCICIO 2
		Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;
        

        
        for(int j = 0; j < numeros.length; j++) {
            System.out.print("Introduce el número " + (j + 1) + ": ");
            	numeros[j] = scanner.nextDouble();
        }

        
        for(int j = 0; j < numeros.length; j++) {
            	suma += numeros[j];
        }

       
        System.out.println("La suma de todos los números es: " + suma);

     
    

		
	//EJERCICIO 3
        
        Scanner reader = new Scanner(System.in);  
        
        int[] numeros2 = new int[10];
        
        double maximo = numeros2[0];
        
        double minimo = numeros2[0];
        
        for(int l = 0; l < numeros2.length; l++) {
            System.out.print("Introduce el número " + (l + 1) + ": ");
            	numeros2[l] = (int) reader.nextDouble();
        }
        
        for(int l = 1; l < numeros2.length; l++) {
        	
        	maximo = Math.max(maximo, numeros2[l]);
        	minimo = Math.min(minimo, numeros2[l]);
        	
        }
        
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);	
	
		
     //EJERCICIO 4
        
        Scanner reader1 = new Scanner(System.in);
        
        int[] numeros3 = new int[20];
        
        int negativos = 0;
        int positivos = 0;
        
        for(int t = 0; t < numeros3.length; t++) {
        	
        	System.out.print("Introduce el número " + (t + 1) + ": ");
        	numeros3[t] =  reader.nextInt();
        }
        		
        for(int t = 0; t < numeros3.length; t++) {
        	
        	if(numeros3[t] >= 0) {
        		positivos++;
        	}else if(numeros3[t] < 0) {
        		negativos++;
        	}
        	
        }
        System.out.println(negativos + positivos);

        //EJERCICIO 5
        
        
        
        
        
        
		}	
	}


