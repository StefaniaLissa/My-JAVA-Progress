package P11_2;

import java.util.Date;

public class CongeladosNitrogeno extends ProductosCongelados{
	//Atributos
	private int nitExpoSegundos;
	private String infoMetodo;
	
	//Constructores
	public CongeladosNitrogeno() {
		super();
	}
	
	public CongeladosNitrogeno(int nitExpoSegundos, String infoMetodo) {
		super();
		this.nitExpoSegundos = nitExpoSegundos;
		this.infoMetodo = infoMetodo;
	}

	public CongeladosNitrogeno(int loteNum, Date fechaCaducidad, Date fechaEnvasado, String paisOrigen,
			int temRecomendada, int nitExpoSegundos, String infoMetodo) {
		super(loteNum, fechaCaducidad, fechaEnvasado, paisOrigen, temRecomendada);
		this.nitExpoSegundos = nitExpoSegundos;
		this.infoMetodo = infoMetodo;
	}

	//Getters y Setters
	public int getNitExpoSegundos() {
		return nitExpoSegundos;
	}

	public void setNitExpoSegundos(int nitExpoSegundos) {
		this.nitExpoSegundos = nitExpoSegundos;
	}

	public String getInfoMetodo() {
		return infoMetodo;
	}

	public void setInfoMetodo(String infoMetodo) {
		this.infoMetodo = infoMetodo;
	}

	@Override
	public String toString() {
		return super.toString() + "\tExpoSegundos=" + nitExpoSegundos + "\tinfoMetodo=" + infoMetodo;
	}
	
	public void descripcion() {
		System.out.println("\n-CONGELADO POR NITROGENO");
		System.out.println("N° de Lote\t\t\t:"+getLoteNum());
		System.out.println("Temperatura de Mantenimiento\t:"+getTemRecomendada());
		System.out.println("Metodo de Congelacion\t\t:"+infoMetodo);
		System.out.println("Tiempo de Exposicion\t\t:"+nitExpoSegundos);
	}
	

}
