import java.time.LocalDateTime;

public class Perro extends Mascotas{
private String Raza;
    private boolean pulgas = false;
    
    public Perro(String Nombre, double Edad, boolean Estado, LocalDateTime FechaDeNacimiento, String Raza, boolean pulgas) {

        super(Nombre, Edad, Estado, FechaDeNacimiento);

        this.Raza = Raza;
        this.pulgas = pulgas;
    }

    public String getRaza() {
        return Raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Mascota\n");
        sb.append("Nombre de la mascota= ").append(super.getNombre());
        sb.append(", Edad de la mascota= ").append(super.getEdad());
        sb.append(", Esta vivo?= ").append(super.isEstado());
        sb.append(", Fecha de nacimiento de la mascota= ").append(super.getFechaDeNacimiento());
        sb.append("La raz de la mascota es = ").append(Raza);
        sb.append(", Tiene Pulgas?= ").append(pulgas);
        
        return sb.toString();
    }
}
