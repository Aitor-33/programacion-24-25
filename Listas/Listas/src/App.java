import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

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
        
        Collections.sort(productos, Comparator.comparing(Producto::getNombre));

        for (Producto t : productos){

            System.out.println(t.getNombre() + t.getCantidad());

        }


        
        //apartado 9 array list

        productos.clear();
        




        //apartado 1 linked list 

        Producto Productos1 = new Producto( "lentejas", 2);
        Producto Productos2 = new Producto("almejas", 3);
        Producto Productos3 = new Producto("cangrejo", 1);
        Producto Productos4 = new Producto("colacao", 4);
        Producto Productos5 = new Producto("bocartes", 25);


        //apartado 2 linked list 


        System.out.println("esto es el apartado 2");

        LinkedList<String> linkedList = new LinkedList<>();

        //apartado 3 Linked list

        System.out.println("esto es el apartado 3");

        LinkedList<Producto> productoslinked = new LinkedList<Producto>();

        productoslinked.add(Productos1);
        productoslinked.add(Productos2);
        productoslinked.add(Productos3);
        productoslinked.add(Productos4);
        productoslinked.add(Productos5);

        //apartado 4 Linked list

        System.out.println("esto es el apartado 4");

        Iterator<Producto> iteras = productoslinked.iterator();
        Producto cadaProductos;
        
        while (iteras.hasNext()){

            cadaProductos = iteras.next();

            System.out.println(" el nombre del producto es: " + cadaProductos.getNombre() + " /la cantidad es: " + cadaProductos.getCantidad());
        }

        //apartado 5 Linked list

        System.out.println("esto es el apartado 5");

        iteras = productoslinked.iterator();

        while (iteras.hasNext()){

            cadaProductos = iteras.next();

            if (cadaProductos.getNombre().equals("colacao")) {
            
                iteras.remove();

            }

            if (cadaProductos.getNombre().equals("bocartes")) {
                
                iteras.remove();

            }

        }

        for(Producto l : productoslinked){

            System.out.println(l);

        }

        //apartado 6 Linked list

        System.out.println("esto es el apartado 6");

        Producto Productos6 = new Producto("pizza", 5);

        productoslinked.add(2, Productos6);

        iteras = productoslinked.iterator();

        for(Producto l : productoslinked){

            System.out.println(l);

        }


        //apartado 7 Linked list

        System.out.println("esto es el apartado 7");

        iteras = productoslinked.iterator();

        for(Producto l : productoslinked){

            System.out.println(l);

        }

        //apartado 8 Linked list

        System.out.println("esto es el apartado 8");
        
        Collections.sort(productoslinked, Comparator.comparing(Producto::getNombre));

        for (Producto r : productoslinked){

            System.out.println(r.getNombre() + r.getCantidad());
            
        }

        
        //apartado 9 Linked list

        productoslinked.clear();




    }

}
