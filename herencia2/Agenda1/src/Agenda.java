public class Agenda extends Contacto{

private Contacto [] listaContactos;

public Agenda(String nombre, int telefono, Contacto[] listaContactos) {

    super(nombre, telefono);
    this.listaContactos = listaContactos;

}

@Override
public String toString() {

    StringBuilder sb = new StringBuilder();

    sb.append("contacto");

    sb.append("el nombre del contacto es = ").append(super.getNombre());

    sb.append(", su numero de telefono es = ").append(super.getTelefono()   );

    return sb.toString();

}

}
