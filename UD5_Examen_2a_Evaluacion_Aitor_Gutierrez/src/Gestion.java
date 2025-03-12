import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) throws Exception {

//algunas de las funcionalidades no me salian como tu pedias y he intentado hacerlas de otra forma para que porlomenos el programa sea funcional.
Scanner reader = new Scanner(System.in);	
		
	String eleccionJugador;
    Director director = null;
    int contadorEmpleados = 0;
    int contadorDirectores = 0;
    int contadorGerentes = 0;
    int contadorTrabajadores = 0;
    Empresa miEmpresa = null;
    List<Director> listaDirector = new LinkedList<>();
    List<GerenteDep> listaGerente = new LinkedList<>();
    List<Trabajador> listaTrabajador = new LinkedList<>();
    final String patroncif = "[A-Z]{1}[0-9]{10}";
    final String patrondni = "[0-9]{8}[A-Z]{1}";
    final String patronSS = "[0-9]{10}";

    reader = new Scanner (System.in);
    String nombreE = reader.nextLine();
    String cif = MyUtils.comprobarPatronRepetidamente(patroncif, "Introduce el CIF de la empresa");
    LocalDate fechaFundacion = MyUtils.leerFecha("introduce la fecha de fundacion");
    Empresa mE = new Empresa(nombreE, cif, fechaFundacion);
    miEmpresa = mE;
    System.out.println(miEmpresa.toString());
	
	do {
		System.out.println("1 - registrar trabajador en empresa");
		System.out.println("2 - mostrar informacion de la empresa");
		System.out.println("3 - mostrar numero de trabajadores actuales");
		System.out.println("4 - mostrar informacion del departamento");
        System.out.println("5 - eliminar trabajador de la empresa");
        System.out.println("6 - agenda del director");
        System.out.println("7 - salir");

		eleccionJugador = reader.nextLine();
		
		if(eleccionJugador.equals("1")){
			
            System.out.println("a - registrar director -solo puede haber uno-");
		System.out.println("b - registrar gerente -solo puede haber 3-");
		System.out.println("c - registrar trabajador normal");
        eleccionJugador = reader.nextLine();

			if(eleccionJugador.equals("a")){
                
                System.out.println("introduce el nombre del director");
                String nombreDirector = reader.nextLine();
            
                System.out.println("introduce la fecha de naciemiento");
                LocalDate nacimientoDirector = MyUtils.leerFecha("introduce la fecha de nacimiento");

                System.out.println("introduce el dni del director");
                String dniDirector = MyUtils.comprobarPatronRepetidamente(patrondni, "Introduce el dni del director");
                
                System.out.println("introduce la direccion del director");
                String direccionDirector = reader.nextLine();

                System.out.println("introduce el numero de la seguridad social del director");
                String SSDirector = MyUtils.comprobarPatronRepetidamente(patronSS, "Introduce el numero de la SS del director");

                System.out.println("introduce el email de empresa del director");
                String eMailDirector = reader.nextLine();

                System.out.println("introduce el salario de empresa del director");
                double salarioDirector = reader.nextDouble();

                System.out.println("introduce si esta en la oficina o no true = si  false = no");
                boolean estaOficinaDirector = reader.nextBoolean();

                System.out.println("introduce el departamento del director");
                Enumerado depaDirector = MyUtils.menuGeneroPeliculas();

                System.out.println("introduce el telefono del director");
                int telefonoDirector = reader.nextInt();
            
                    Director director2 = new Director(nombreDirector, nacimientoDirector, dniDirector, direccionDirector, SSDirector, eMailDirector, 
                    salarioDirector, estaOficinaDirector, depaDirector, telefonoDirector);
                    director = director2;
                    System.out.println(director.toString());
                    listaDirector.add(director);
                    contadorEmpleados ++;
                    contadorDirectores ++;

            
            }else if(eleccionJugador.equals("b")){

                System.out.println("introduce el nombre del Gerente");
                String nombreGerente = reader.nextLine();
            
                System.out.println("introduce la fecha de naciemiento");
                LocalDate nacimientoGerente = MyUtils.leerFecha("introduce la fecha de nacimiento");

                System.out.println("introduce el dni del Gerente");
                String dniGerente = MyUtils.comprobarPatronRepetidamente(patrondni, "Introduce el dni del Gerente");
                
                System.out.println("introduce la direccion del Gerente");
                String direccionGerente = reader.nextLine();

                System.out.println("introduce el numero de la seguridad social del Gerente");
                String SSGerente = MyUtils.comprobarPatronRepetidamente(patronSS, "Introduce el numero de la SS del Gerente");

                System.out.println("introduce el email de empresa del director");
                String eMailGerente = reader.nextLine();

                System.out.println("introduce el salario de empresa del Gerente");
                double salarioGerente = reader.nextDouble();

                System.out.println("introduce si esta en la oficina o no true = si  false = no");
                boolean estaOficinaGerente = reader.nextBoolean();

                System.out.println("introduce el departamento del Gerente");
                Enumerado depaGerente = MyUtils.menuGeneroPeliculas();

                System.out.println("introduce el telefono del Gerente");
                int telefonoGerente = reader.nextInt();
            
                    GerenteDep gerente = new GerenteDep(nombreGerente, nacimientoGerente, dniGerente, direccionGerente, SSGerente, eMailGerente, salarioGerente, estaOficinaGerente, depaGerente, telefonoGerente);

                    System.out.println(gerente.toString());
                    listaGerente.add(gerente);
                    contadorEmpleados ++;
                    contadorGerentes ++;
                
            
            }else if(eleccionJugador.equals("c")){

            System.out.println("introduce el nombre del Gerente");
                String nombreTrabajador = reader.nextLine();
            
                System.out.println("introduce la fecha de naciemiento");
                LocalDate nacimientoTrabajador = MyUtils.leerFecha("introduce la fecha de nacimiento");

                System.out.println("introduce el dni del Gerente");
                String dniTrabajador = MyUtils.comprobarPatronRepetidamente(patrondni, "Introduce el dni del Gerente");
                
                System.out.println("introduce la direccion del Gerente");
                String direccionTrabajador = reader.nextLine();

                System.out.println("introduce el numero de la seguridad social del Gerente");
                String SSTrabajador = MyUtils.comprobarPatronRepetidamente(patronSS, "Introduce el numero de la SS del Gerente");

                System.out.println("introduce el email de empresa del director");
                String eMailTrabajador = reader.nextLine();

                System.out.println("introduce el salario de empresa del Gerente");
                double salarioTrabajador = reader.nextDouble();

                System.out.println("introduce si esta en la oficina o no true = si  false = no");
                boolean estaOficinaTrabajadore = reader.nextBoolean();

                System.out.println("introduce el departamento del Gerente");
                Enumerado depaTrabajador = MyUtils.menuGeneroPeliculas();

                System.out.println("introduce el telefono del Gerente");
                int telefonoTrabajador = reader.nextInt();
            
                    Trabajador trabajador = new GerenteDep(nombreTrabajador, nacimientoTrabajador, dniTrabajador, direccionTrabajador, SSTrabajador, eMailTrabajador, salarioTrabajador, estaOficinaTrabajadore, depaTrabajador, telefonoTrabajador);

                    System.out.println(trabajador.toString());
                    listaTrabajador.add(trabajador);
                    contadorEmpleados ++;
                    contadorTrabajadores ++;
            }


            }else if(eleccionJugador.equals("2")){

                for (Director d : listaDirector) {
            
                    System.out.println(d.toString());
    
                }
                for (GerenteDep gerente : listaGerente) {
            
                    System.out.println(gerente.toString());
    
                }
                for (Trabajador trabajador : listaTrabajador) {
            
                    System.out.println(trabajador.toString());
    
                }
			
            
            
            	}else if(eleccionJugador.equals("3")){
					System.out.println("este es el numero de empleados totales: " + contadorEmpleados);
                    System.out.println("este es el numero de directores totales: " + contadorDirectores);
					System.out.println("este es el numero de gerentes totales: " + contadorGerentes);
					System.out.println("este es el numero de trabajadores totales: " + contadorTrabajadores);
            	
            	}else if(eleccionJugador.equals("4")){
					
					
					
            
            	}else if(eleccionJugador.equals("5")){
                    System.out.println("introduzca el dni del empleado que desa eliminar");
					String dniEliminar = reader.nextLine();

                    for (Director d : listaDirector) {
            
                        if(director.getDni().equals(dniEliminar)){
        
                            listaDirector.remove(d);
                            System.out.println("ha sido eliminado con existo");
                            contadorDirectores --;
                            contadorEmpleados --;
                            System.out.println("este es el numero de empleados totales: " + contadorEmpleados);
                            System.out.println("este es el numero de directores totales: " + contadorDirectores);
                        }
                    }
        
                    for (GerenteDep gerente : listaGerente) {
            
                        if(gerente.getDni().equals(dniEliminar)){
        
                            listaGerente.remove(gerente);
                            System.out.println("ha sido eliminado con existo");
                            contadorGerentes --;
                            contadorEmpleados --;
                            System.out.println("este es el numero de empleados totales: " + contadorEmpleados);
                            System.out.println("este es el numero de gerentes totales: " + contadorGerentes);
                        }
                    }
                    for (Trabajador trabajador : listaTrabajador) {
            
                        if(trabajador.getDni().equals(dniEliminar)){
        
                            listaTrabajador.remove(trabajador);
                            System.out.println("ha sido eliminado con existo");
                            contadorTrabajadores --;
                            contadorEmpleados --;
                            System.out.println("este es el numero de empleados totales: " + contadorEmpleados);
                            System.out.println("este es el numero de trabajadores totales: " + contadorTrabajadores);
                        }
                    }
					
					
            	
            	}else if(eleccionJugador.equals("6")){
                    do {
                    System.out.println("a - convocar una reunion");
                    System.out.println("b - fuera de la oficina");
                    System.out.println("c - convocar a toda la empresa");
					System.out.println("d - salir");
                    eleccionJugador = reader.nextLine();
					    if(eleccionJugador.equals("a")){

            
			
            
            
                    }else if(eleccionJugador.equals("b")){
                        
                        director.menuOficina();
                        
                    
                    }else if(eleccionJugador.equals("c")){
        
                    
                    }
					
            	}while(!eleccionJugador.equals("d"));
            	System.out.println("has salido");
            }
		
        
		
            		else{
						System.out.println("escoge una opcion valida");
						
            			}
		
	}while(!eleccionJugador.equals("7"));

System.out.println("has salido");
    }
}
