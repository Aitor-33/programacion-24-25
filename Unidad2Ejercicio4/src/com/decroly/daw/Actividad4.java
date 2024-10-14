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
		Scanner il = new Scanner (System.in);
		
		int[] vectors = new int[10];
		
		int j;
		
		System.out.println("introduce los valores:");
		
			for(j = 0; j < vectors.length; i++)
				vectors[j] = in.nextInt();

		System.out.println("los valores introducidos son:");
			
			for(j = 0; j < vectors.length; j++)
				
				System.out.print(vectors[j] + " ");
			System.out.println();
		
		
		
		
		
		
	}

}
