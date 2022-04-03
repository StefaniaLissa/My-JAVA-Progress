package herencia_1;

public class Persona {
	//Atributos
	private String nombre;
	private String telefono;
	private int edad;
	
	//Constructores
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String telefono, int edad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
	}

	//Getters y Setters
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Metodos
	@Override
	public String toString() {
		return "Nnombre= " + nombre + ", Telefono= " + telefono + ", Edad= " + edad;
	}

	
	
	
	
	
	
	
}
