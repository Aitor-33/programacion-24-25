import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        //apartado 1 array list

        System.out.println("esto es el apartado 1");

        Producto Producto1 = new Producto( "rabas", 2);
        Producto Producto2 = new Producto("patatas bravas", 3);
        Producto Producto3 = new Producto("pincho de tortilla", 1);
        Producto Producto4 = new Producto("cafe", 4);
        Producto Producto5 = new Producto("espetos", 25);

        //apartado 2 array list

        System.out.println("esto es el apartado 2");

        ArrayList<String> arrayList = new ArrayList<>();

        //apartado 3 array list

        System.out.println("esto es el apartado 3");

        ArrayList<Producto> productos = new ArrayList<Producto>();

        productos.add(Producto1);
        productos.add(Producto2);
        productos.add(Producto3);
        productos.add(Producto4);
        productos.add(Producto5);

        //apartado 4 array list

        System.out.println("esto es el apartado 4");

        Iterator<Producto> itera = productos.iterator();
        Producto cadaProducto;
        
        while (itera.hasNext()){

            cadaProducto = itera.next();

            System.out.println("el nombre del producto es: " + cadaProducto.getNombre() + " /la cantidad es: " + cadaProducto.getCantidad());
        }

        //apartado 5 array list

        System.out.println("esto es el apartado 5");

        itera = productos.iterator();

        while (itera.hasNext()){

            cadaProducto = itera.next();

            if (cadaProducto.getNombre().equals("cafe")) {
                
                itera.remove();

            }

            if (cadaProducto.getNombre().equals("espetos")) {
                
                itera.remove();

            }

        }

        for(Producto p : productos){

            System.out.println(p);

        }

        //apartado 6 array list

        System.out.println("esto es el apartado 6");

        Producto Producto6 = new Producto("lasaña", 5);

        productos.add(2, Producto6);

        itera = productos.iterator();

        for(Producto p : productos){

            System.out.println(p);

        }


        //apartado 7 array list

        System.out.println("esto es el apartado 7");

        itera = productos.iterator();

        for(Producto p : productos){

            System.out.println(p);

        }

        //apartado 8 array list

        System.out.println("esto es el apartado 8");






    }
}
