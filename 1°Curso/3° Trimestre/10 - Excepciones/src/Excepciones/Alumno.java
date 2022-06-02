package Excepciones;

public class Alumno{
    //Atributos
    private String nombre;
    private String genero;
    private int edad;

    //Constructores
    public Alumno() {}

    public Alumno(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    //Getter y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return "Nombre=" + nombre + " \tEdad=" + edad + ", \tGenero=" + genero;
    }

}
