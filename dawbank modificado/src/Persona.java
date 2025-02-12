
import java.util.Date;

public class Persona {

public String nombre;
public String dni;
public Date FechaNacimiento;


public Persona(String nombre, String dni, Date fechaNacimiento) {
    this.nombre = nombre;
    this.dni = dni;
    FechaNacimiento = fechaNacimiento;
}

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getDni() {
    return dni;
}
public void setDni(String dni) {
    this.dni = dni;
}
public Date getFechaNacimiento() {
    return FechaNacimiento;
}
public void setFechaNacimiento(Date fechaNacimiento) {
    FechaNacimiento = fechaNacimiento;
}

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Persona ");
        sb.append(" su nombre es: ").append(nombre);
        sb.append(", el dni es: ").append(dni);
        sb.append(", la fecha de nacimiento es: ").append(FechaNacimiento);

        return sb.toString();

    }




}
