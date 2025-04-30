package org.example.demofx2;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String telefono;

    public Persona(String apellido, int edad, String email, String nombre, String telefono) {
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Persona() {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
