import java.time.LocalDate;

public class Trabajador extends Persona{

public String NumeroSS;
public String emailEmpresa;
public double salario;
public boolean estarOficina;
public Enumerado departamento;

public Trabajador(String nombre, LocalDate fechaNacimiento, String dni, String direccion, 
String numeroSS,String emailEmpresa, double salario, boolean estarOficina, Enumerado departamento) {

    super(nombre, fechaNacimiento, dni, direccion);

    this.NumeroSS = numeroSS;
    this.emailEmpresa = emailEmpresa;
    this.salario = salario;
    this.estarOficina = estarOficina;
    this.departamento = departamento;
    
}

public String getNumeroSS() {

    return NumeroSS;

}

public String getEmailEmpresa() {

    return emailEmpresa;

}

public double getSalario() {

    return salario;

}

public boolean isEstarOficina() {

    return estarOficina;

}

public Enumerado getDepartamento() {

    return departamento;

}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trabajador{");
        sb.append("NumeroSS=").append(NumeroSS);
        sb.append(", emailEmpresa=").append(emailEmpresa);
        sb.append(", salario=").append(salario);
        sb.append(", estarOficina=").append(estarOficina);
        sb.append(", departamento=").append(departamento);
        sb.append('}');
        return sb.toString();
    }




}
