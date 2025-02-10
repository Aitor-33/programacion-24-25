public class Gato {

    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {

        setNombre(nombre);
        setEdad(edad);

    }

    public String getNombre() {

        return nombre;

    }

    public int getEdad() {

        return edad;

    }

    public void setNombre(String nombre) throws Exception {

        if (nombre == null || nombre.length() < 3){

            throw new Exception ("El nombre debe tener minimo 3 caracteres");

        }

        this.nombre = nombre;

    }

    public void setEdad(int edad) throws Exception{

        if (edad < 0){

            throw new Exception ("La edad no puede ser negativa");

        }

        this.edad = edad;
        
    }
}
