import java.time.LocalDateTime;

public class Aves extends Mascotas{
private String pico ;
    private String vuela;

    public Aves(String Nombre, double Edad, boolean Estado, LocalDateTime FechaDeNacimiento, String pico, String vuela) {

        super(Nombre, Edad, Estado, FechaDeNacimiento);

        this.pico = pico;
        this.vuela = vuela;
    }

    public String getPico() {
        return pico;
    }

    public String getVuela() {
        return vuela;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Mascotas\n");
        sb.append("Nombre de la mascota= ").append(super.getNombre());
        sb.append(", Edad de la mascota= ").append(super.getEdad());
        sb.append(", Esta vivo?= ").append(super.isEstado());
        sb.append(", Fecha de nacimiento de la mascota= ").append(super.getFechaDeNacimiento());
        sb.append("Pico de la mascota= ").append(pico);
        sb.append(", vuela?= ").append(vuela);
        
        return sb.toString();
    }
}
