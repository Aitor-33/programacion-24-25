
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List <Producto> productos = new LinkedList<>();

    //leer el fichero csv
    try (FileReader file = new FileReader("Recursos\\productos.csv"); BufferedReader reader = new BufferedReader(file);) {
            String linea = reader.readLine();
            while(linea != null){
                
                String[] datos = linea.split("/");
                
                String referencia = datos[0];
                String nombre = datos[1];
                String descripcion = datos[2];
                String tipo = datos[3];

                Producto p =  new Producto(referencia, nombre, descripcion, tipo);

            
                productos.add(p);

                linea = reader.readLine();
            }

            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Pinto por pantalla mis lista de productos
        for (Producto linea : productos) {
            System.out.println(linea);
        }

        //eliminar productos








    }
}
