import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

String options = "";

        Scanner reader = new Scanner(System.in);

        Astros [] astros = new Astros[100]; 
    
        System.out.println("Pon los datos necesarios sobre el Astro\n");

        System.out.println("masa de su cuerpo:");
        double masa = reader.nextDouble();

        System.out.println("diametro medio del astro:");
        double diametro = reader.nextDouble();

        System.out.println("rotacion sobre su propio eje:");
        double rotacion = reader.nextDouble();

        System.out.println("periodo de traslacion:");
        double translacion = reader.nextDouble();

        System.out.println("distancia media al cuerpo:");
        double distancia = reader.nextDouble();

        Astros datos1 = new Astros(masa, diametro, rotacion, translacion, distancia);

        System.out.println(datos1);

        System.out.println("¿a cual de estos grupos pertenece tu astro?");

            System.out.println("1 - Planeta");
            System.out.println("2 - Satelite");
            System.out.println("3 - salir");
            
            reader = new Scanner(System.in);
            options = reader.nextLine();

            if (options.equals("1")){

                reader = new Scanner(System.in);
                System.out.println("Pon los datos necesarios para los planetas\n");
                System.out.println("Distancia al Sol:");
                double distanciaSol = reader.nextDouble();

                System.out.println("Orbita al Sol:");
                double orbitaSol = reader.nextDouble();

                System.out.println("¿posee satelites?:");
                
                System.out.println("escribe s para afirmar o n para negar");
                reader = new Scanner(System.in);
                String tieneSatelitesSi = reader.nextLine();

                boolean tieneSatelites = false;

                    if (tieneSatelitesSi.equalsIgnoreCase("s")){

                        tieneSatelites = true;
                    
                    }else if (tieneSatelitesSi.equalsIgnoreCase("n")){

                        tieneSatelites = false;
                    
                    }else System.out.println("es necesario escribir s para afirmar o n para negar");

                Planetas datos2 = new Planetas (masa, diametro, rotacion, translacion, distancia,distanciaSol,orbitaSol,tieneSatelites); 

                System.out.println(datos2);

            }if (options.equals("2")){
                
                reader = new Scanner(System.in);
                System.out.println("escribe los datos necesarios del satelite\n");
                System.out.println("distancia respecto al planeta:");
                reader = new Scanner(System.in);
                double distanciaPlaneta = reader.nextDouble();

                System.out.println("orbita al planeta:");
                reader = new Scanner(System.in);
                double orbitaPlaneta = reader.nextDouble();

                System.out.println("a que planeta pertenece");
                reader = new Scanner(System.in);
                String planetaPerteneciente = reader.nextLine();
                
                Satelites Info3 = new Satelites(masa, diametro, rotacion, translacion, distancia,distanciaPlaneta,orbitaPlaneta,planetaPerteneciente);
                System.out.println(Info3);

            }if (options.equals("3")){
            
            System.out.println("acabado");

            }



    }
}
