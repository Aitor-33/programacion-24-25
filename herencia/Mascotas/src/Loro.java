import java.time.LocalDateTime;

public class Loro extends Aves{
private String Origen;
    private String Habla ;

    public Loro(String Nombre, double Edad, boolean Estado, LocalDateTime FechaDeNacimiento, String pico, String vuela, String Origen, String habla) {

        super(Nombre, Edad, Estado, FechaDeNacimiento,pico,vuela);

        this.Origen = Origen;
        this.Habla = habla;
    }

    public String getOrigen() {
        return Origen;
    }

    public String getHabla() {
        return Habla;
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
        sb.append("Nombre de la mascota= ").append(Origen);
        sb.append(", Edad de la mascota= ").append(Habla);
        
        return sb.toString();
    }
}
