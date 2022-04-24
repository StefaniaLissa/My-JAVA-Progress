package P12_2;

public class Comercial extends Empleado{

	//ATRIBUTOS
	private double comision;

	//CONSTRUCTORES
	public Comercial() {}
	
	public Comercial(double comision) {
		super();
		this.comision = comision;
	}

	public Comercial(String nombre, String nSS, double sueldoBase, double comision) {
		super(nombre, nSS, sueldoBase);
		this.comision = comision;
	}
	
	//GETTERS Y STETTERS
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	//METODOS
	
	@Override
	public String toString() {
		return super.toString() + "Comercial [comision=" + comision + "]";
	}
	
	@Override
	public double calcularSueldo() {
		return getSueldoBase() + comision;
	}
}
