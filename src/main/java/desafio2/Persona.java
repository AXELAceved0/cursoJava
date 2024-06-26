package desafio2;

import java.util.Objects;

public class Persona {
    String nombre;
    String apellido;
//CONSTRUCTOR
    public Persona(){}
    protected Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
//GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //METODO TO STRING PARA BUSCAR Y VER LA INFORMACION
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

    //EQUALS Y HASHCODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
