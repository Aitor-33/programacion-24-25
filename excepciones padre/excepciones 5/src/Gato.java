public class Gato {
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) throws Exception {

        if (nombre == null || nombre.length() < 3){

            throw new Exception ("nombre demasiado corto debe tener almenos 3 caracteres");

        }

        this.nombre = nombre;

    }

    public int getEdad() {

        return edad;

    }

    public void setEdad(int edad) throws Exception{

        if (edad < 0){

            throw new Exception ("no puede haber una edad negativa");

        }

        this.edad = edad;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Gato");
        sb.append("el nombre del gato es: ").append(nombre);
        sb.append(", la edad del gato es: ").append(edad);

        return sb.toString();

    }
    


    
}
