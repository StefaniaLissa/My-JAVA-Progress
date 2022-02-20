package alumno;

import java.util.Arrays;

public class Alumno {
	//Atributos
	String nombre;
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

	@Override
	public String toString(){
		return "Alumno{" + "nombre=" + this.nombre + ", apellidos=" + this.apellidos + ", edad=" + this.edad + ", modulos=" + Arrays.toString(this.modulos) + '}';   
	}
	
	
}
