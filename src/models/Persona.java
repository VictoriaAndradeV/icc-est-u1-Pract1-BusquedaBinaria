package models;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(){ //Constructor vacío

    }

    public Persona(String nombre, int edad) { //Constructor
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters y setters de los dos atributos de persona
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }


}
