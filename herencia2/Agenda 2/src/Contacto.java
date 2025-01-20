public class Contacto {
    
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {

        this.nombre = nombre;
        this.telefono = telefono;

    }

    public String getNombre() {

        return nombre;

    }

    public String getTelefono() {

        return telefono;

    }

    public boolean esIgual(Contacto nuevo) {

        return this.nombre.equals(nuevo.nombre);

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("\n Agenda \n");
        sb.append("el nombre es = ").append(nombre);
        sb.append(", el numero de telefono es = ").append(telefono);
        
        return sb.toString();
        
    }
}
