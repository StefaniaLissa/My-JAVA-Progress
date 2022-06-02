package P11_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private String dni;
	
	//Constructor
	public Persona() {}

	public Persona(String nombre, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	
	//Getters y Setters

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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	//Metodos
	public boolean esMayorDeEdad() {
		boolean mayor=false;
		if (edad>=18)mayor=true;
		return mayor;
	}
	
	public boolean dniValido() {
		Pattern dniPat = Pattern.compile("[A-Za-z][0-9]{7,8}[A-Za-z]?");
		Matcher mat = dniPat.matcher(dni);
		return mat.matches();
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
	
}
