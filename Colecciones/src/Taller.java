import java.util.HashMap;
import java.util.Map;
public class Taller {

public String matricula;

Map<String, Coche> coches = new HashMap<String, Coche>();


public Taller(Map<String, Coche> coches) {
    this.coches = coches;
}


public void agregarElemento(String matricula, String color, String marca){

Coche coche = new Coche(color, marca);

coches.put(matricula, coche);

System.out.println("el coche se ha añadido");

if(coches.containsKey(matricula)){

    System.out.println("matricula ya usada");

}else{

    this.coches.put(matricula, coche);

}
}







}
