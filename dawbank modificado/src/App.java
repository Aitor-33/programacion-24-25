import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenido a DawBank tu banco de confianza je je je");

        final String patronIban = "[A-Z]{2}[0-9]{22}";

    
        String iban = MiUtils.comprobarPatronRepetidamente(patronIban, "Introduzca el IBAN");

        System.out.println("acontinuacion vamos a crear un cliente");

        String nombre = MiUtils.leerTextoPantalla("Introduzca el nombre del cliente: ");

        LocalDate fechaNacimiento = MiUtils.leerFecha("Introduce la fecha de nacimiento: ");

        String numeroTeléfono = MiUtils.leerTextoPantalla("Introduzca su número de teléfono: ");

        String dni = MiUtils.leerTextoPantalla("Intdocuce su dni");

        String direccion = MiUtils.leerTextoPantalla("Introduce su direccion: ");

        Cliente nuevoCliente = new Cliente(nombre, dni, fechaNacimiento, numeroTeléfono, dni, direccion);
        CuentaBancaria miCuenta = new CuentaBancaria(nuevoCliente, iban);

        String opcion = "";
        Scanner reader;
        do {

            reader = new Scanner(System.in);
            
            imprimirMenuOpciones();

            opcion = reader.nextLine();

            menuBanca(miCuenta, opcion);


        } while (!opcion.equalsIgnoreCase("8"));
    }

    private static void imprimirMenuOpciones() {

        System.out.println("Escoga la opcion que desee");

        System.out.println("1 - Datos de la cuenta");
        System.out.println("2 - mostrar IBAN");
        System.out.println("3 - info del cliente");
        System.out.println("4 - Saldo actual");
        System.out.println("5 - hacer un Ingreso");
        System.out.println("6 - hacer una Retirada");
        System.out.println("7 - mostrar numero de Movimientos");
        System.out.println("8 - Salir");

    }

    private static void menuBanca(CuentaBancaria miCuenta, String opcion) {

        switch (opcion) {

            case "1":
                System.out.println(miCuenta.toString());
                break;

            case "2":
                System.out.println(miCuenta.getIban());
                break;

            case "3":
                System.out.println(miCuenta.getClienteNuevo());
                break;
            case "4":
                System.out.println(miCuenta.getSaldo());
                break;

            case "5":
            try{
                double cantidad = MiUtils.leerDoublePantalla("Introduzca la cantidad a ingresar");
                miCuenta.ingresar(cantidad);
            }
            catch(AvisarHaciendaException a){
            
                System.out.println(a.getMessage());

            }
            catch(CuentaException e){

                System.out.println(e.getMessage());

            }
                break;

            case "6":
try{
                double cantidadR = MiUtils.leerDoublePantalla("Introduzca la cantidad a retirar");

                if((miCuenta.getSaldo()-cantidadR) < -50){

                    System.out.println("“AVISO: Saldo negativo, no se puede realizar la retirada");

                }
                else{
                    miCuenta.retirar(cantidadR);
                }
            }
            catch(CuentaException c){
                System.out.println(c.getMessage());
            }
                break;

            case "7":
                System.out.println(miCuenta.toString());
                break;
            case "8":
                System.out.println("Se cerrara el programa. Sayonra baby!!!");
                break;

            default:
                System.out.println("Opcion incorrecta, vuelva a escoger");
        }
    }
}
