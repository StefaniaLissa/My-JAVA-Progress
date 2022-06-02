package P12_2;

public class Consultor extends Empleado{

	//ATRIBUTOS
	private double precioHoras;
	private int numHoras;
	
	//CONSTRUCTORES
	public Consultor() {}
	
	public Consultor(double precioHoras, int numHoras) {
		super();
		this.precioHoras = precioHoras;
		this.numHoras = numHoras;
	}

	public Consultor(String nombre, String nSS, double sueldoBase, double precioHoras, int numHoras) {
		super(nombre, nSS, sueldoBase);
		this.precioHoras = precioHoras;
		this.numHoras = numHoras;
	}

	//GETTERS Y SETTERS
	public double getPrecioHoras() {
		return precioHoras;
	}

	public void setPrecioHoras(double precioHoras) {
		this.precioHoras = precioHoras;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	
	//METODOS

	@Override
	public String toString() {
		return super.toString() + "Consultor [precioHoras=" + precioHoras + ", numHoras=" + numHoras 
				+ "]";
	}
	
	@Override
	public double calcularSueldo() {
		return getSueldoBase() + precioHoras * numHoras;
	}
	
}
