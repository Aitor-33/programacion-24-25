
import java.text.DateFormat;

public class ContactoPersona {
    private String NombrePersona;
    private String TelefonoPersona;
    private DateFormat fechaCumpleaños;

    public ContactoPersona(String NombrePersona, String TelefonoPersona, DateFormat fechaCumpleaños){

        this.NombrePersona = NombrePersona;
        this.TelefonoPersona = TelefonoPersona;

    }

    public String getNombrePersona() {

        return NombrePersona;
    
    }

    public String getTelefonoPersona() {
    
        return TelefonoPersona;
    
    }

    public DateFormat getFechaCumpleaños() {
    
        return fechaCumpleaños;
    
    }




    
}
