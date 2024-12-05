public class Cliente {

    private String dni;
    private String nombre;
    private String numSocio;
    private String direccion;
    private String fechaNacimiento;
    private String fechaBaja;
    private Pelicula alquiladas[];


    public Cliente(String dni, String nombre, String numSocio, String direccion, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }



    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNumSocio() {
        return numSocio;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getFechaBaja() {
        return fechaBaja;
    }
    public Pelicula[] getAlquiladas() {
        return alquiladas;
    }
    
    





}
