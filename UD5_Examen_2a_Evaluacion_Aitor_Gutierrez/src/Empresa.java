
import java.time.LocalDate;
import java.util.LinkedList;

public class Empresa {
public String nombreDeEmpresa;
public String CIF;
public LocalDate fechaFundacion;
public LinkedList <Persona> dnis;

public Empresa(String nombreDeEmpresa, String CIF, LocalDate fechaFundacion) {

    this.nombreDeEmpresa = nombreDeEmpresa;
    this.CIF = CIF;
    this.fechaFundacion = fechaFundacion;
    this.dnis = new LinkedList<>();

}

public String getNombreDeEmpresa() {
    return nombreDeEmpresa;
}

public String getCIF() {
    return CIF;
}

public LocalDate getFechaFundacion() {
    return fechaFundacion;
}

public LinkedList<Persona> getDnis() {
    return dnis;
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("nombreDeEmpresa=").append(nombreDeEmpresa);
        sb.append(", CIF=").append(CIF);
        sb.append(", fechaFundacion=").append(fechaFundacion);
        sb.append(", dnis=").append(dnis);
        sb.append('}');
        return sb.toString();
    }





}
