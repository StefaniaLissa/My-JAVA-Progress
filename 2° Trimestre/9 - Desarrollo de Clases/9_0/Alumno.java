package alumno;

import java.util.Arrays;

public class Alumno {
	//Atributos
	private String nombre;
	String apellidos;
	 int edad;
	String [] modulos;

	//Constructores
	public Alumno() {
		modulos = new String[6];
	}
	
	public Alumno (String nombre, String apellidos, int edad, String [] modulos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.modulos = modulos;
	}
	
	public Alumno (String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	//Un constructor por cada Atributo
	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	public Alumno(String apellido) {
		this.apellido = apellido;
	}

	public Alumno(int edad) {
		this.edad = edad;
	}
	
	public Alumno(String[] modulos) {
		this.modulos = modulos;
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String[] getModulos() {
		return modulos;
	}

	public void setModulos(String[] modulos) {
		this.modulos = modulos;
	}

	@Override
	public String toString(){
		return "Alumno{" + "nombre=" + this.nombre + ", apellidos=" + this.apellidos + ", edad=" + this.edad + ", modulos=" + Arrays.toString(this.modulos) + '}';   
	}
	
	
}
