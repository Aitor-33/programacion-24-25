public class Agenda{

    private Contacto[] contactos;
    private int contador;

    public Agenda(){

        this.contactos = new Contacto[20];
        this.contador = 0;
        
    }
    public int buscaContacto(String nombre) {

        for (int i = 0; i < contador; i++) {

            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {

                return i;

            }
        }

        return -1;

    }

    public boolean existeContacto(String nombre) {

        return buscaContacto(nombre) != -1;

    }


    public boolean añadirContacto(Contacto b) {

        if (existeContacto(b.getNombre())) {

            return false; 

        }

        contactos[contador++] = b;

        return true;

    }

    public boolean eliminarContacto(String nombre) {

        for (int i = 0; i < contador; i++) {

            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {

                System.arraycopy(contactos, i + 1, contactos, i, contador - i - 1);
                
                contactos[--contador] = null;
                return true;

            }

        }

        return false;

    }

}
