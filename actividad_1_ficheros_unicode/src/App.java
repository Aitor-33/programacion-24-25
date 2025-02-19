import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);	
		
        String eleccionUsuario;
		
        ArrayList<Producto> productos = new ArrayList<Producto>();
        do {
            System.out.println("1 - Crear producto");
            System.out.println("2 - Mostrar productos existentes");
            System.out.println("3 - Eliminar producto por código");
            System.out.println("4 - Guardar productos en el fichero");
            System.out.println("5 - salir");
            
            eleccionUsuario = reader.nextLine();
            
            if(eleccionUsuario.equals("1")){

                System.out.println("introduzca el nombre del producto: ");
                String nombre = reader.nextLine();

                System.out.println("introduzca la cantidad del producto: ");
                int cantidad = reader.nextInt();

                System.out.println("introduzca el precio del producto: ");
                int precio = reader.nextInt();

                Producto p = new Producto(cantidad, nombre, precio);
                
                System.out.println(p.toString());
                productos.add(p);
                
                }else if(eleccionUsuario.equals("2")){
                    
                    for(int i = 0; i<productos.size();i++){

                        System.out.println(productos.get(i).toString());

                    }

                    } else if(eleccionUsuario.equals("3")){

                    System.out.println("intoduce el codigo del producto que quieres eliminar");
                    int codigo = reader.nextInt();

                    Producto eliminaProducto = null;

                        for (Producto producto1 : productos) {

                            if(producto1.getCodigo() == codigo){

                                eliminaProducto = producto1;

                            }
                        }
                        
                        productos.remove(eliminaProducto);
                        System.out.println("el producto se elimino");

                    }else if(eleccionUsuario.equals("4")){
                    

                    
                    }  
        }while(!eleccionUsuario.equals("5"));
    
    System.out.println("has salido");  

    }
}
