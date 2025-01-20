public abstract class Contacto {

    protected String nombre;
    protected String telefono;

    public String getNombre() {

        return nombre;

    }

    public String getTelefono() {

        return telefono;

    }

    public boolean esIgual(Contacto nuevo) {

        return this.nombre.equals(nuevo.nombre);

    }

}
