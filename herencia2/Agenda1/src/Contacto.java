public class Contacto{

private String nombre;
private int telefono;


public Contacto(String nombre, int telefono) {

    this.nombre = nombre;
    this.telefono = telefono;
    
}

public String getNombre() {

    return nombre;

}

public int getTelefono() {

    return telefono;

}

@Override
public String toString() {

    StringBuilder sb = new StringBuilder();

    sb.append("contacto");

    sb.append("el nombre del contacto es = ").append(this.nombre);

    sb.append(", su numero de telefono es = ").append(this.telefono);

    return sb.toString();

}



}
