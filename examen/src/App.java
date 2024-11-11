import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {	
			
		Scanner reader = new Scanner(System.in);	
		

        
        int cantidadNumeros;
		String eleccion;
		String eleccion2;
        String eleccion3;
        int casilla;
        int casilla2;
        int suma = 0;
        int maximo = 0;
        int minimo = 2147483647; //esta puesto este valor porque es el maximo de int.
        int media = 0;
        int nuevaCantidad;
        
        
        System.out.println("Introducce la cantidad total de numeros a almacenar");

        cantidadNumeros = reader.nextInt();

        int[] numeros = new int[cantidadNumeros];

		//creo el menu
		do {
			System.out.println("a - modificar eleccion");
			System.out.println("b - estadisticas de la coleccion");
			System.out.println("c - ampliar el valor de la coleccion");
			System.out.println("s - salir");

			eleccion = reader.nextLine().toLowerCase();
			
			
			
			
			 if(eleccion.equals("a")){
				
                //creo el menu dentro de la opcion a
                do {
                    System.out.println("a - insertar numero");
                    System.out.println("b - borrar numero");
                    System.out.println("c - modificar un numero en una posicion especifica");
                    System.out.println("s - salir");
        
                    eleccion2 = reader.nextLine().toLowerCase();
                    //empieza la opcion insertar numero
                     if(eleccion2.equals("a")){
                        for(int i = 0; i < numeros.length; i++) {

                        System.out.println("introduzca los valores");

				        numeros[i] = reader.nextInt();
                        }
                            //empieza la opcion borrar numero de una posicion especifica
                            }else if(eleccion2.equals("b")){

                                System.out.println("introduzca la casilla que quieres borrar");
                                
                                casilla = reader.nextInt();


        
                                for(int i = 0; i < numeros.length; i++) {

                                    
            
                                    numeros[casilla] = 0;


                                    }  

                                    //empieza la opcion modificar numero de una posicion especifica
                            }else if(eleccion2.equals("c")){

                                int modificador;
                                
                                System.out.println("introduzca la casilla que quieres modificar teniendo en cuenta q la primera casilla simpre sera la 0");
                                
                                casilla2 = reader.nextInt();

                                System.out.println("introduzca el numero que quieres que se introduzca en esa posicion");

                                modificador = reader.nextInt();

                               

        
                                for(int i = 0; i < numeros.length; i++) {
            
                                    numeros[casilla2] = modificador;


                                    } 
                                
                            
                            }else{
                                    
                                    
                                    }
                    
                }while(!eleccion2.equals("s"));
				
				 //termina el menu dentro de a

	            
			 
                    }else if(eleccion.equals("b")){

                        //creo el menu dentro de b
                        do {
                            System.out.println("a - media de todos los valores no nulos");
                            System.out.println("b - suma de todos los valores no nulos");
                            System.out.println("c - maximo de coleccion");
                            System.out.println("d - minimo de la coleccion");
                            System.out.println("s - salir");
                
                            eleccion3 = reader.nextLine().toLowerCase();
                            
                            //creo la opcion media
                             if(eleccion3.equals("a")){
                                for(int i = 0; i < numeros.length; i++) {
                                            
                                    suma += numeros[i];
                                    
                                   media = suma / numeros.length;
                                    }
                                System.out.println("la media es " + media);

                                    //creo la opcion suma
                                    }else if(eleccion3.equals("b")){
                                        for(int i = 0; i < numeros.length; i++) {
                                            
                                            suma += numeros[i];
                                            
        
                                            } 
                                            System.out.println("la suma de los numeros es " + suma);
        
                                    //creo la opcion maximo
                                    }else if(eleccion3.equals("c")){
                                        for(int i = 1; i < numeros.length; i++) {
	        	
                                            maximo = Math.max(maximo, numeros[i]);
                                            
                                            
                                        }
                                        
                                        System.out.println("El numero maximo es: " + maximo);
                                        
                                        
                                    //creo la opcion minimo
                                    }else if(eleccion3.equals("d")){
                                        for(int i = 1; i < numeros.length; i++) {

                                        minimo = Math.min(minimo, numeros[i]);

                                        

                                        }
                                        System.out.println("El numero minimo es: " + minimo);
                                    }else{
                                            
                                            
                                            }
                            
                        }while(!eleccion3.equals("s"));
		
					 //termino el menu dentro de b
					 
	            	
	            
	            	}else if(eleccion.equals("c")){

						System.out.println("introduzca el nuevo valor.");

						nuevaCantidad = reader.nextInt();

                        cantidadNumeros = nuevaCantidad;
	            	
	            	}
			 
	           
			 
	            		else{
							
							
	            			}
			
		}while(!eleccion.equals("s"));

	 System.out.println("has salido");
    }
}
