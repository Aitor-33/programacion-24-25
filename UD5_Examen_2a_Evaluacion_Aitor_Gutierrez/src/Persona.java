
import java.time.LocalDate;

public class Persona {

public String nombre;
public LocalDate fechaNacimiento;
public String dni;
public String direccion;

public Persona(String nombre, LocalDate fechaNacimiento, String dni, String direccion) {
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.dni = dni;
    this.direccion = direccion;
}

public String getNombre() {
    return nombre;
}

public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
}

public String getDni() {
    return dni;
}

public String getDireccion() {
    return direccion;
}

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", dni=").append(dni);
        sb.append(", direccion=").append(direccion);
        sb.append('}');

        return sb.toString();
        
    }




}
