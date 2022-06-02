package P12_2;

public class Empleado {
	
	//ATRIBUTOS
	private String nombre;
	private String nSS;
	private double sueldoBase;
	
	//CONSTRUCTORES
	public Empleado(){}
	
	public Empleado(String nombre, String nSS, double sueldoBase) {
		super();
		this.nombre = nombre;
		this.nSS = nSS;
		this.sueldoBase = sueldoBase;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getnSS() {
		return nSS;
	}

	public void setnSS(String nSS) {
		this.nSS = nSS;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	//METODOS
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nSS=" + nSS + ", sueldoBase=" + sueldoBase + "]";
	}

	public double calcularSueldo() {
		return sueldoBase;
	}
	
	
}