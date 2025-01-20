
public class ContactoEmpresa extends Contacto{

    private String PaginaWeb;

public ContactoEmpresa(String nombre, String telefono, String PaginaWeb){

        this.telefono = telefono;
        this.nombre = nombre; 
        this.PaginaWeb = PaginaWeb;

    }

    @Override
    public String toString(){
    
        StringBuilder sb = new StringBuilder();
        sb.append("\n Empresa \n ");
        sb.append("el nombre es = ").append(super.getNombre());
        sb.append("el telefono es = ").append(super.getTelefono());
        sb.append("tu pagina web es = ").append(PaginaWeb);
        
        return sb.toString();
    
    }






}
