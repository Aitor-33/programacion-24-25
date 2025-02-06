import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args){


//Ejercicio 1

Scanner reader = new Scanner(System.in);

try{
System.out.println("introduce una letra");
int A = reader.nextInt();
}
catch(InputMismatchException a){

System.out.println("valor erroneo, porfavor introduzca un numero");

System.out.println(a.getMessage()); 

}

//Ejercico 2
try{

    System.out.println("introduce un valor 1");    
        int A = reader.nextInt();
    System.out.println("introduce una letra 2");
        int b = reader.nextInt();

        System.out.println(A/b);

}
catch (InputMismatchException c){

System.out.println("valor erroneo introduzca un numero");

System.out.println(c.getMessage()); 

}
catch (ArithmeticException b){

    System.out.println("error de calculo introduzca una operacion que sea valida");

    System.out.println(b.getMessage()); 

}

//Ejercicio 3



double [] vector = new double [5];

    for(int i = 0; i < vector.length; i++) {
        try {
        System.out.println("introduzca los numeros del vector");
        vector[i] = reader.nextDouble();

        System.out.println("introduzca el numero de la division");
        double division = reader.nextDouble();

        System.out.println(vector[2]/division);
    } catch (InputMismatchException d) {

        System.out.println("valor erroneo introduzca un numero");
    
    }catch (ArithmeticException l) {
    
        System.out.println("error de calculo introduzca una operacion que sea valida");
    
    }
}



//Ejercicio 4

try {



} catch (Exception e) {



}




    }
}
