

public class ContactoPersona extends Contacto{

    private String fechaCumpleaños;

    public ContactoPersona(String nombre, String telefono, String fechaCumpleaños){

        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaCumpleaños = fechaCumpleaños;

    }

    public String getFechaCumpleaños() {
    
        return fechaCumpleaños;
    
    }

    @Override
    public String toString(){

    StringBuilder sb = new StringBuilder();
    sb.append("\n Persona \n ");
    sb.append("el nombre es = ").append(super.getNombre());
    sb.append("el telefono es = ").append(super.getTelefono());
    sb.append("la fecha de cumpleaños es = ").append(fechaCumpleaños);
    
    return sb.toString();

}



    
}
