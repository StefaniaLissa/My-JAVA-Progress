package P13_1;

public class Autor {

	int codigo;
	String nombre;
	String apellido;
	String nacionalidad;
	
	public Autor(int codigo, String nombre, String apellido, String nacionalidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Autor [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad="
				+ nacionalidad + "]";
	}
	
	
}
