import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    

        Scanner reader = new Scanner(System.in);	
		
        String eleccionUsuario;
		
        do {
            System.out.println("1 - numero positivo");
            System.out.println("2 - numero negativo");
            System.out.println("3 - salir");
            
            eleccionUsuario = reader.nextLine();
            
            if(eleccionUsuario.equals("1")){
                
                System.out.print("Introduzca un número: ");

                int positivo = reader.nextInt();

                mostrarNPositivo(positivo);
                
                }else if(eleccionUsuario.equals("2")){
                    
                    System.out.print("Introduzca un número: ");

                            int negativo = reader.nextInt();

                            mostrarNNegativo(negativo);
                    
                    }     
        }while(!eleccionUsuario.equals("3"));
    
    System.out.println("has salido");  
    }
    public static void mostrarNPositivo(int positivos) throws Exception {

        if (positivos < 0) {

            throw new Exception("el numero es negativo deberia ser positivo");

        }

    }
    
    public static void mostrarNNegativo(int negativos) throws Exception {

        if (negativos >= 0) {

            throw new Exception("el numero es positivo deberia ser negativo");

        }

    }
}
