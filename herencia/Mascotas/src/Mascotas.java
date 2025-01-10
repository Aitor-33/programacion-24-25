import java.time.LocalDateTime;

public class Mascotas {
 private String Nombre;
    private double Edad;
    private boolean Estado = true;
    private LocalDateTime FechaDeNacimiento;

    public Mascotas (String Nombre, double Edad, boolean Estado, LocalDateTime FechaDeNacimiento){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Estado = Estado;
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getEdad() {
        return Edad;
    }

    public boolean isEstado() {
        return Estado;
    }

    public LocalDateTime getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Mascota \n");
        sb.append("Nombre de la mascota = ").append(Nombre);
        sb.append(", Edad de la mascota = ").append(Edad);
        sb.append(", Esta vivo? = ").append(Estado);
        sb.append(", Fecha de nacimiento de la mascota = ").append(FechaDeNacimiento);
        
        return sb.toString();
    }

}
