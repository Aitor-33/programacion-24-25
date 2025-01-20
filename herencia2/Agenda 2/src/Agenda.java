public class Agenda {
    private Contacto[] contactos;
    private int contador;

    public Agenda(){

        this.contactos = new Contacto[50];
        this.contador = 0;
        
    }
    public boolean añadirContacto(Contacto c) {

        if (contador >= 50) {

            System.out.println("no hay mas espacio en la agenda");

            return false;

        }

        if (nombreExistente(c.getNombre())) {

            System.out.println("el nombre de este contacto ya existe ");

            return false;

        }

        contactos[contador++] = c;

        return true;

    }

    public boolean eliminarContacto(String nombre) {

        int posicion = buscaContacto(nombre);

        if (posicion == -1) {

            System.out.println("El contacto no existe.");

            return false;

        }

        for (int i = posicion; i < contador - 1; i++) {

            contactos[i] = contactos[i + 1];

        }

        contactos[--contador] = null;

        return true;

    }

    public boolean nombreExistente(String nombre) {

        return buscaContacto(nombre) != -1;

    }

    public void listaContactosExistentes() {

        if (contador == 0) {

            System.out.println("La agenda está vacía.");

        } else {

            for (int i = 0; i < contador; i++) {
            
                System.out.println(contactos[i].toString());

            }

        }

    }

    public int buscaContacto(String nombre) {

        for (int i = 0; i < contador; i++) {

            if (contactos[i].getNombre().equals(nombre)) {

                return i;

            }

        }

        return -1;

    }
}
