import java.util.HashMap;
import java.util.Map;
public class Taller {

public String matricula;

Map<String, Coche> coches = new HashMap<String, Coche>();

public Taller(){

}
public Taller(Map<String, Coche> coches) {

    this.coches = coches;

}


public void agregarCoche(String color, String marca, String matricula){

    Coche coche = new Coche (color, marca);

    if (coches.containsKey(matricula)){

    System.out.println("La matricula ya esta ingresada");

    }else{

    System.out.println("Coche ingresado correctamente");

    coches.put(matricula, new Coche(color, marca));

    }

}    

public void eliminarCoche(String matricula){

        if (coches.containsKey(matricula)) {

            coches.remove(matricula);

            System.out.println("el coche ha sido eliminado");

        } else {

            System.out.println("la matricula seleccionada no existe");

        }

    }

    public void verMatricula() {

        System.out.println(coches.keySet());

    }

    public void verCoche() {

        for (Coche coche : coches.values()) {

            System.out.println(coche);

        }

    }

    public void verTaller() {

        for (var entry : coches.entrySet()) {

            System.out.println("la matricula: " + entry.getKey() + ", " + entry.getValue());

        }

    }




}
