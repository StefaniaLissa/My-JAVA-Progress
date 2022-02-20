package empleado;


public class Empleado {
	//Atributos
	String nombre;
	String departamento;
	int edad;
	double salario;
	
	//Constructores
	public Empleado() {	
	}
	
	public Empleado (String nombre, String departamento, int edad, double salario) {
		this.nombre = nombre;
		this.departamento = departamento;
		this.edad = edad;
		this.salario = salario;
	}
	
	@Override
	public String toString(){
		return "Empleado{" + "nombre=" + this.nombre + ", departamento=" + this.departamento + ", edad=" + this.edad + ", salario=" + this.salario;   
	}
}


