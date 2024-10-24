package com.decroly.daw;

import java.util.Scanner;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		
		 int[] secval = new int[55];
		 
	        int p = 0;

	        
	        for (int i = 1; i <= 10; i++) {
	        	
	            for (int j = 0; j < i; j++) {
	            	
	                secval[p] = i;
	                
	                p++;
	                
	            }
	        }

	        
	        for (int num : secval) {
	        	
	            System.out.print(num);
	            
	        }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
