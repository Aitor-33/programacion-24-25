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

                reader = new Scanner(System.in);
                System.out.println("\nescribe la cantidad del producto");
                int tipo = reader.nextInt();

                List<Producto> products = miDataPrueba.buscarProductoTipo(tipo);

                for(Producto c : products){
                    System.out.println(c);
                }

            }else if(eleccionJugador.equals("4")){
                reader = new Scanner(System.in);
                System.out.println("\nescribe la cantidad del producto");
                int cantidad = reader.nextInt();

                List<Producto> products = miDataPrueba.buscarProductocantidad(cantidad);

                for(Producto c : products){
                    System.out.println(c);
                }

            }else if(eleccionJugador.equals("5")){

                System.out.println("\nescribe la referencia del producto  ejemplo: REF001");
                String referencia = reader.nextLine();

                System.out.println("\nescribe el tipo del producto");
                int tipo = reader.nextInt();

                System.out.println("\nescribe el nombre del producto");
                String nombre = reader.nextLine();

                System.out.println("\nescribe la descripcion del producto");
                String descripcion = reader.nextLine();

                System.out.println("\nescribe el precio del producto");
                double precio = reader.nextDouble();

                System.out.println("\nescribe la cantidad del producto");
                int cantidad = reader.nextInt();

                System.out.println("\nescribe el descuento del producto");
                int descuento = reader.nextInt();

                System.out.println("\nescribe si el producto lleva descuento true/false");
                int iva = reader.nextInt();

                System.out.println("\nescribe si el producto lleva descuento true/false");
                boolean aplicar_dto = reader.nextBoolean();

                Producto producto = new Producto(referencia, -1, tipo, nombre, descripcion, precio, cantidad, descuento, iva, aplicar_dto );

                miDataPrueba.insertarProducto(producto);

            }else if(eleccionJugador.equals("6")){

                System.out.println("\nescribe la referencia del producto  ejemplo: REF001");
                String referencia = reader.nextLine();

                miDataPrueba.eliminarProductoReferencia(referencia);

            }else if(eleccionJugador.equals("7")){

                System.out.println("Vamos a actualizar un producto");
                List<Producto> todosProductos5 = miDataPrueba.getMostrartodos();
                for (Producto p : todosProductos5) {
                    System.out.println("Nombre: " + p.getNombre() + " / Referencia: " + p.getReferencia());
                }
                System.out.println("Escriba la referencia del producto que quieras actualizar: ");
                String referencia4 = reader.nextLine();
                List<Producto> invUpdate = miDataPrueba.getBuscarReferencia(referencia4);

                Producto productoActualizado = invUpdate.get(0);
                System.out.println("Escriba la nueva descripcion del producto: ");
                String nuevaDescripcion = reader.nextLine();
                System.out.println("Escriba la nueva cantidad del producto: ");
                int cantidad2 = reader.nextInt();
                System.out.println("Escriba el nuevo precio del producto: ");
                double precio2 = reader.nextDouble();
                System.out.println("Escriba el nuevo descuento del producto: ");
                int descuento2 = reader.nextInt();
                System.out.println("Escriba si aplica descuento del producto: Pon s o n");
                reader = new Scanner(System.in);
                String descuento4 = reader.nextLine();
                boolean tieneDescuento2 = false;
                if(descuento4.equalsIgnoreCase("s")){

                    tieneDescuento2 = true;
                }else {
                    tieneDescuento2 = false;
                }
                productoActualizado.setDescripcion(nuevaDescripcion);
                productoActualizado.setCantidad(cantidad2);
                productoActualizado.setPrecio(precio2);
                productoActualizado.setDescuento(descuento2);
                productoActualizado.setAplicar_dto(tieneDescuento2);
                miData.actualizarProducto(productoActualizado);

            }else if(eleccionJugador.equals("8")){

                System.out.println("\nescribe el nombre del nuevo tipo de producto");
                String nombreTipo = reader.nextLine();

                Tipo nuevoTipo = new Tipo(-1,nombreTipo);

                miDataPrueba.insertarTipo(nuevoTipo);

            }else{
                System.out.println("escoge una opcion valida");

            }

        }while(!eleccionJugador.equals("9"));

        System.out.println("has salido");



    }
}