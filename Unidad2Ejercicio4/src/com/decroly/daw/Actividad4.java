package com.decroly.daw;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//EJERCICIO 1
	Scanner in = new Scanner (System.in);
	
	int[] vector = new int[10];
	
	
	
	System.out.println("introduce los valores:");
	
		for(int i = 0; i < vector.length; i++) {
			vector[i] = in.nextInt();

	System.out.println("los valores introducidos son:");
		}	
		for(int i = 0; i < vector.length; i++) {
			
			System.out.print(vector[i] + " ");
		System.out.println();
		}
//EJERCICIO 2
		Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;
        

        
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            	numeros[i] = scanner.nextDouble();
        }

        
        for(int i = 0; i < numeros.length; i++) {
            	suma += numeros[i];
        }

       
        System.out.println("La suma de todos los números es: " + suma);

     
    

		
	//EJERCICIO 3
        
        Scanner reader = new Scanner(System.in);  
        
        int[] numeros2 = new int[10];
        
        double maximo = numeros2[0];
        
        double minimo = numeros2[0];
        
        for(int i = 0; i < numeros2.length; i++) {
            
        	System.out.print("Introduce el número " + (i + 1) + ": ");
            	
            	numeros2[i] = (int) reader.nextDouble();
        }
        
        for(int i = 1; i < numeros2.length; i++) {
        	
        	maximo = Math.max(maximo, numeros2[i]);
        	minimo = Math.min(minimo, numeros2[i]);
        	
        }
        
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);	
	
		
     //EJERCICIO 4
        
        Scanner reader1 = new Scanner(System.in);
        
        int[] numeros3 = new int[20];
        
        int negativos = 0;
        int positivos = 0;
        
        for(int i = 0; i < numeros3.length; i++) {
        	
        	System.out.print("Introduce el número " + (i + 1) + ": ");
        	numeros3[i] =  reader.nextInt();
        }
        		
        for(int i = 0; i < numeros3.length; i++) {
        	
        	if(numeros3[i] >= 0) {
        		positivos++;
        	}else if(numeros3[i] < 0) {
        		negativos++;
        	}
        	
        }
        System.out.println(negativos + positivos);

        //EJERCICIO 5
        
        double[] numeros4 = new double[20];
        
        int suma2 = 0;
        
        for(int i = 0; i < numeros4.length; i++) {
        	
        	System.out.println("Introduce un numero:");
        	
        	numeros4[i] = reader.nextDouble();
        }
        
        for(int i = 0; i < numeros4.length; i++ ) {
        	
        	suma2 += numeros4[i];
        	
        }
        
        System.out.println("la media es:" + (suma2 / numeros4.length));
        
        
        //EJERCICIO 6
        
        int n;
        int m;
        System.out.println("introduzca n:");
        
        n = reader.nextInt();
        
        System.out.println("introduzca m:");
        
        m = reader.nextInt();
        
        int[] numeros5 = new int[n];
        
        for(int i = 0; i < n; i++ ) {
        	
        	numeros5[i] = m;
        
        }
        System.out.println("El array es: ");
        for (int value : numeros5) {
        	System.out.println(value + " ");
        }
        
       //EJERCICIO 7
        
        int p;
        int q;
        System.out.println("introduzca p:");
        
        p = reader.nextInt();
        
        System.out.println("introduzca q:");
        
        q = reader.nextInt(); 
        
        int[] numeros6 = new int[p - q];
        
        for(int i = 0; i < q; i++) {
        	
        }
        
       
        int[] array1 = new int[100];
        int[] array2 = new int[100];

        
        for (int i = 0; i < 100; i++) {
            array1[i] = i + 1;
        }

        
        for (int i = 0; i < 100; i++) {
            array2[i] = array1[99 - i];
        }

        
        System.out.println("Primer array:");
        for (int i = 0; i < 100; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        
        System.out.println("\nSegundo array (invertido):");
        for (int i = 0; i < 100; i++) {
            System.out.print(array2[i] + " ");
        }
        
		}	
	}


