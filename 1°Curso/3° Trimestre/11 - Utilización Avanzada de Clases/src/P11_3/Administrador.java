package P11_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Administrador extends Persona{
	//Atributos
	private String codigoAdminist;
	private String finca;
	private int numVecino;
	private float salario;
	
	//Constructores
	public Administrador() {}

	public Administrador(String codigoAdminist, String finca, int numVecino, float salario) {
		super();
		this.codigoAdminist = codigoAdminist;
		this.finca = finca;
		this.numVecino = numVecino;
		this.salario = salario;
	}

	public Administrador(String nombre, int edad, String dni, String codigoAdminist, String finca, int numVecino,
			float salario) {
		super(nombre, edad, dni);
		this.codigoAdminist = codigoAdminist;
		this.finca = finca;
		this.numVecino = numVecino;
		this.salario = salario;
	}

	//Getters y Setters
	

	public String getCodigoAdminist() {
		return codigoAdminist;
	}

	public void setCodigoAdminist(String codigoAdminist) {
		this.codigoAdminist = codigoAdminist;
	}

	public String getFinca() {
		return finca;
	}

	public void setFinca(String finca) {
		this.finca = finca;
	}

	public int getNumVecino() {
		return numVecino;
	}

	public void setNumVecino(int numVecino) {
		this.numVecino = numVecino;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	//Metodos
	
	public boolean codigoValido() {
		Pattern Admin = Pattern.compile("[A]{0, 1}[0-9]{0-5}");
		Matcher mat = Admin.matcher(codigoAdminist);
		return !mat.matches();
	}
	
	public float salarioMaximo(float c) {
		return (numVecino*c)/2;
	}

	@Override
	public String toString() {
		return "Administrador [codigoAdminist=" + codigoAdminist + ", finca=" + finca + ", numVecino=" + numVecino
				+ ", salario=" + salario + ", toString()=" + super.toString() + "]";
	}
	
	

}
