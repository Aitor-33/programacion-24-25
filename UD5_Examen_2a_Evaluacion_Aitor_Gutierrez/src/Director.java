import java.time.LocalDate;
import java.util.Scanner;

public class Director extends Trabajador{

public int telefonoDirector;
public boolean estaReunido;
public boolean fueraDeOficina;

public Director(String nombre, LocalDate fechaNacimiento, String dni, String direccion, String numeroSS,
        String emailEmpresa, double salario, boolean estarOficina, Enumerado departamento, int telefonoDirector) {

    super(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, estarOficina, departamento);
    
    this.telefonoDirector = telefonoDirector;
    this.estaReunido = estaReunido;
    this.fueraDeOficina = fueraDeOficina;
    
}

public int getTelefonoDirector() {

    return telefonoDirector;

}

public boolean isEstaReunido() {

    return estaReunido;

}

public boolean isFueraDeOficina() {

    return fueraDeOficina;

}

public boolean menuOficina(){

Scanner reader = new Scanner(System.in);
String eleccionJugador;

                    System.out.println("a - el director esta en la oficina");
                    System.out.println("b - el director no esta en la oficina");
                    System.out.println("c - salir");
					eleccionJugador = reader.nextLine();

					    if(eleccionJugador.equals("a")){

                            fueraDeOficina = true;
                            System.out.println("ahora el director esta en la oficina");

                    }else if(eleccionJugador.equals("b")){
                        
                        fueraDeOficina = false;
                        System.out.println("el director ya no esta en la oficina");
                    
                    }else if(eleccionJugador.equals("c")){
        
                    System.out.println("has salido");
                    }

    return fueraDeOficina;
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Director{");
        sb.append("telefonoDirector=").append(telefonoDirector);
        sb.append(", estaReunido=").append(estaReunido);
        sb.append(", fueraDeOficina=").append(fueraDeOficina);
        sb.append('}');
        return sb.toString();
    }



}
