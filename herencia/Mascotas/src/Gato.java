import java.time.LocalDateTime;

public class Gato extends Mascotas{
  private String Color;
    private boolean peloLargo = false;

    public Gato(String Nombre, double Edad, boolean Estado, LocalDateTime FechaDeNacimiento, String Color, boolean peloLargo) {

        super(Nombre, Edad, Estado, FechaDeNacimiento);

        this.Color = Color;
        this.peloLargo = peloLargo;
    }

    public String getColor() {
        return Color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Mascota\n");
        sb.append("Nombre de la mascota = ").append(super.getNombre());
        sb.append(", Edad de la mascota = ").append(super.getEdad());
        sb.append(", Esta vivo? = ").append(super.isEstado());
        sb.append(", Fecha de nacimiento de la mascota = ").append(super.getFechaDeNacimiento());
        sb.append("De que color es? = ").append(Color);
        sb.append(", tiene el pelo largo? = ").append(peloLargo);
        
        return sb.toString();
    }

}
