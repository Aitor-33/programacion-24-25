import java.time.LocalDate;
import java.util.LinkedList;

public class GerenteDep extends Trabajador{
public int numeroTrabajadoresDepa;
public int numeroTelefono;
public LinkedList <Trabajador> listaTrabajadoresDep;

public GerenteDep(String nombre, LocalDate fechaNacimiento, String dni, String direccion, String numeroSS,
        String emailEmpresa, double salario, boolean estarOficina, Enumerado departamento,int numeroTelefono) {

    super(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, estarOficina, departamento);

    this.numeroTrabajadoresDepa = numeroTrabajadoresDepa;
    this.numeroTelefono = numeroTelefono;
    this.listaTrabajadoresDep =  new LinkedList<>();
    
}

public int getNumeroTrabajadoresDepa() {
    return numeroTrabajadoresDepa;
}

public int getNumeroTelefono() {
    return numeroTelefono;
}

public LinkedList<Trabajador> getListaTrabajadoresDep() {
    return listaTrabajadoresDep;
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GerenteDep{");
        sb.append("numeroTrabajadoresDepa=").append(numeroTrabajadoresDepa);
        sb.append(", numeroTelefono=").append(numeroTelefono);
        sb.append(", listaTrabajadoresDep=").append(listaTrabajadoresDep);
        sb.append('}');
        return sb.toString();
    }







}
