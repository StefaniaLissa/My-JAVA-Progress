public class Persona {
    //Atributos
    private String Nombre;
    private int Telefono;
    private int Edad;

    //Constructures
    public Persona(String Nombre, int Telefono, int Edad){
        this.Nombre=Nombre;
        this.Telefono=Telefono;
        this.Edad=Edad;
    }

    public Persona(){
    }

    //Getters y Setters
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getTelefono() {
        return Telefono;
    }
    public void setTelefono(int telefono) {
        Telefono = telefono;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }


}
