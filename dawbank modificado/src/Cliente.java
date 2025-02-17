
import java.time.LocalDate;

public class Cliente extends Persona{

public String nTelefono;
public String email;
public String direccion;

public Cliente(String nombre, String dni, LocalDate fechaNacimiento, String nTelefono, String email, String direccion) {

    super(nombre, dni, fechaNacimiento);
    this.nTelefono = nTelefono;
    this.email = email;
    this.direccion = direccion;
    
}

public String getnTelefono() {
    return nTelefono;
}

public void setnTelefono(String nTelefono) {
    this.nTelefono = nTelefono;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Cliente ");
        sb.append("su numero de telefono es: ").append(nTelefono);
        sb.append(", su email es: ").append(email);
        sb.append(", su direccion es: ").append(direccion);
        sb.append(", su nombre es: ").append(super.getNombre());
        sb.append(", el dni es: ").append(super.getDni());
        sb.append(", la fecha de nacimiento es: ").append(super.getFechaNacimiento());
        
        return sb.toString();

    }




}
