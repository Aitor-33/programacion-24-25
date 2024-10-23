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
        
        //EJERCICIO 8
        
        int conta = 0;

        double[] numeros7 = new double[100];

        for (int i = 0; i < numeros7.length; i++) {
        	
            numeros7[i] = Math.random();
            
        }

        

        System.out.print("introduce un numero entre 0 y 1:");

        double o = reader.nextDouble();

        for (int i = 0; i < numeros7.length; i++) {
        	
            if (numeros7[i] >= o) {
            	
                conta++;
                
            }
            
        }

        System.out.println(conta + " numeros mayores o iguales a " + o);
        
        
       //EJERCICIO 9
        
        int[] numeros8 = new int[100];
        
        for (int i = 0; i < numeros8.length; i++) {
        	
            numeros8[i] = (int)(1 + Math.random() * 10);
            
        }


        System.out.print("Introduce un número entre 1 y 10: ");
        
        int f = reader.nextInt();

        System.out.println("El número " + f + " aparece en las posiciones:");
        
        boolean encontrado = false;

        for (int i = 0; i < numeros8.length; i++) {
        	
            if (numeros8[i] == f) {
            	
                System.out.println("Posición " + i);
                
                	encontrado = true;
            }
            
        }

        if (!encontrado) {
        	
            	System.out.println("El número no se encuentra en el array");
            	
        }

        
        //EJERCICIO 10
        
        in = new Scanner(System.in);
        
        double suma3 = 0;
        
        double media;
        
        double max;
        
        double min;
        
        int personasArriba = 0, personasAbajo = 0;


        System.out.print("Introduce el número de personas: ");
        
        int S = scanner.nextInt();

        double[] alturas = new double[S];

        for (int i = 0; i < S; i++) {
            System.out.print("Introduce la altura de la persona " + (i+1) + " (en metros): ");
            alturas[i] = scanner.nextDouble();
            suma += alturas[i];
        }

        media = suma / S;


        max = alturas[0];
        
        min = alturas[0];


        for (int i = 0; i < S; i++) {
        	
            if (alturas[i] > max) {
            	
                max = alturas[i];
                
            }
            if (alturas[i] < min) {
            	
                min = alturas[i];
                
            }
            if (alturas[i] > media) {
            	
                personasArriba++;
                
            } else if (alturas[i] < media) {
            	
                personasAbajo++;
                
            }
        }

        
        System.out.printf("media:", media);
        
        System.out.printf("maxima:", max);
        
        System.out.printf("minima:", min);
        
        System.out.println("por encima de la media: " + personasArriba);
        
        System.out.println("por debajo de la media: " + personasAbajo);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       //EJERCICIO 11
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

        
        System.out.println("Segundo array:");
        
        for (int i = 0; i < 100; i++) {
        	
            System.out.print(array2[i] + " ");
            
        }
        
        
        
        //EJERCICIO12
        
        String [] clientes = new String [10];
        
		int contador = 0;
		
		int enteros;
		
		String opcion = "";
		
		
		do {
			System.out.println("a - mostrar valores");
			
			System.out.println("b - introducir valor");
			
			System.out.println("c - salir");
			
			
			opcion = reader.nextLine();
			
			 if(opcion.equals("a")){
				 
				 for(int i = 0; i < clientes.length; i++) {
					 
					 System.out.println(i);
					 
				 }
				 
	            }
			 
	            else if(opcion.equals("b")){
	            
					 
	            }
			 

	            else if(opcion.equals("c")){
	                
	            }
			 
	            else{

	            }
			
		}while(!opcion.equals("c"));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		}	
	}


