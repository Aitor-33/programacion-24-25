import java.time.LocalDateTime;

public class Canario extends Aves{
private String Color;
    private String Canta;

    public Canario(String Nombre, double Edad, boolean Estado, LocalDateTime FechaDeNacimiento, String pico, String vuela, String Color, String Canta) {

        super(Nombre, Edad, Estado, FechaDeNacimiento,pico,vuela);

        this.Color = Color;
        this.Canta = Canta;
    }

    public String getColor() {
        return Color;
    }

    public String getCanta() {
        return Canta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Mascota\n");
        sb.append("Nombre de la mascota= ").append(super.getNombre());
        sb.append(", Edad de la mascota= ").append(super.getEdad());
        sb.append(", Esta vivo?= ").append(super.isEstado());
        sb.append(", Fecha de nacimiento de la mascota= ").append(super.getFechaDeNacimiento());
        sb.append("Nombre de la mascota= ").append(super.getPico());
        sb.append(", Edad de la mascota= ").append(super.getVuela());
        sb.append("Nombre de la mascota= ").append(Color);
        sb.append(", Edad de la mascota= ").append(Canta);
        
        return sb.toString();
    }
}
