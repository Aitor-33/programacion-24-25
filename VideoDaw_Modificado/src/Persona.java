import java.time.LocalDate;

public class Persona {

        protected String dni;
        protected String nombre;
        protected String direccion;
        protected LocalDate fechaNacimiento;
        
        public Persona(String dni, String nombre, String direccion, LocalDate fechaNacimiento) {

            this.dni = dni;
            this.nombre = nombre;
            this.direccion = direccion;
            this.fechaNacimiento = fechaNacimiento;

        }

        public String getDni() {

            return dni;

        }

        public String getNombre() {

            return nombre;

        }

        public String getDireccion() {

            return direccion;

        }

        public LocalDate getFechaNacimiento() {

            return fechaNacimiento;

        }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Persona: ");
        sb.append("dni: ").append(dni);
        sb.append(", nombre: ").append(nombre);
        sb.append(", direccion: ").append(direccion);
        sb.append(", fechaNacimiento: ").append(fechaNacimiento);
        sb.append('.');
        
        return sb.toString();

    }
}
