package herencia_1;

public class Trabajador extends Persona {

	//Atributos
	private char categoriaProfesional;
	private int antiguedad;
	
	
	//Constructores
	public Trabajador() {
		super();
	}
	
	public Trabajador(char categoriaProfesional, int antiguedad) {
		this.categoriaProfesional = categoriaProfesional;
		this.antiguedad = antiguedad;
	}

	public Trabajador(String nombre, String telefono, int edad, char categoriaProfesional, int antiguedad) {
		super(nombre, telefono, edad);
		this.categoriaProfesional = categoriaProfesional;
		this.antiguedad = antiguedad;
	}

	//Getters y Setters
	public char getCategoriaProfesional() {
		return categoriaProfesional;
	}

	public void setCategoriaProfesional(char categoriaProfesional) {
		this.categoriaProfesional = categoriaProfesional;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

		
	//Metodos
	/*
	@Override
	public String toString() {
		return "Trabajador Categoria Profesional= " + categoriaProfesional + ", Antiguedad=" + antiguedad
				+ ", Nombre=" + getNombre() + ", Telefono=" + getTelefono() + ", Edad=" + getEdad();
	}
	*/
	
	@Override
	public String toString() {
		return "Trabajador Categoria Profesional= " + categoriaProfesional + ", Antiguedad=" + antiguedad
				+ super.toString();
	}
	
	
}
