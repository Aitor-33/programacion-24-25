package org.example;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        SQLAcces miDataPrueba = new SQLAcces();

        String eleccionJugador;

        do {
            System.out.println("1 - Mostrar todos los Productos en el Inventario.");
            System.out.println("2 - Buscar producto por referencia.");
            System.out.println("3 - Buscar productos por tipo.");
            System.out.println("4 - Buscar producto por cantidad.");
            System.out.println("5 - Insertar un nuevo producto (no permitir referencias repetidas)");
            System.out.println("6 - Eliminar Producto por referencia.");
            System.out.println("7 - Actualizar producto (descripción, cantidad, precio, descuento, AplicarDto).");
            System.out.println("8 - Insertar un nuevo tipo de producto.");
            System.out.println("9 - salir");

            eleccionJugador = reader.nextLine();

            if(eleccionJugador.equals("1")){
                reader = new Scanner(System.in);
                List names = miDataPrueba.getListaProductos();


                if (names.isEmpty()) {
                    System.out.println("No hay datos");
                } else {
                    for (Object name : names) { // Mostrar todo el contenido por nombres
                        System.out.println(name);
                    }
                }


            }else if(eleccionJugador.equals("2")){
                reader = new Scanner(System.in);
                System.out.println("\nescribe la referencia del producto");
                String referencia = reader.nextLine();

                List<Producto> products = miDataPrueba.buscarProductoReferencia(referencia);

                for(Producto c : products){
                    System.out.println(c);
                }

            }else if(eleccionJugador.equals("3")){



            }else if(eleccionJugador.equals("4")){
                reader = new Scanner(System.in);
                System.out.println("\nescribe la cantidad del producto");
                int cantidad = reader.nextInt();

                List<Producto> products = miDataPrueba.buscarProductocantidad(cantidad);

                for(Producto c : products){
                    System.out.println(c);
                }

            }else if(eleccionJugador.equals("5")){
                System.out.println("\nescribe la cantidad del producto");
                String referencia = reader.nextLine();

                System.out.println("\nescribe la cantidad del producto");
                String nombre = reader.nextLine();

                System.out.println("\nescribe la cantidad del producto");
                String descripcion = reader.nextLine();

                System.out.println("\nescribe la cantidad del producto");
                int cantidad = reader.nextInt();

                System.out.println("\nescribe la cantidad del producto");
                double precio = reader.nextDouble();

                System.out.println("\nescribe la cantidad del producto");
                int descuento = reader.nextInt();

                System.out.println("\nescribe la cantidad del producto");
                boolean aplicar_dto = reader.nextBoolean();


            }else if(eleccionJugador.equals("6")){


            }else if(eleccionJugador.equals("7")){



            }else if(eleccionJugador.equals("9")){



            }else{
                System.out.println("escoge una opcion valida");

            }

        }while(!eleccionJugador.equals("9"));

        System.out.println("has salido");



    }
}