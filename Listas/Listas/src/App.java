import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        //apartado 1

        Producto Producto1 = new Producto( "rabas", 2);
        Producto Producto2 = new Producto("patatas bravas", 3);
        Producto Producto3 = new Producto("pincho de tortilla", 1);
        Producto Producto4 = new Producto("cafe", 4);
        Producto Producto5 = new Producto("espetos", 25);

        //apartado 2

        ArrayList<String> arrayList = new ArrayList<>();

        //apartado 3

        ArrayList<Producto> productos = new ArrayList<Producto>();

        productos.add(Producto1);
        productos.add(Producto2);
        productos.add(Producto3);
        productos.add(Producto4);
        productos.add(Producto5);

        //apartado 4
        Iterator<Producto> itera = productos.iterator();
        Producto cadaProducto;
        
        while (itera.hasNext()){

            cadaProducto = itera.next();

            System.out.println("el nombre del producto es: " + cadaProducto.getNombre() + " /la cantidad es: " + cadaProducto.getCantidad());
        }

        //apartado 5

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








    }
}
