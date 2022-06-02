package P11_2;

import java.util.Date;

public class CongeladoAgua  extends ProductosCongelados{
	//Atributos
	private String salinidad;

	//Constructores
	public CongeladoAgua() {
		super();
	}
	
	public CongeladoAgua(int salinidad) {
		setSalinidad(salinidad);
	}
	
	public CongeladoAgua(int loteNum, Date fechaCaducidad, Date fechaEnvasado, String paisOrigen, int temRecomendada, int salinidad) {
		super(loteNum, fechaCaducidad, fechaEnvasado, paisOrigen, temRecomendada);
		setSalinidad(salinidad);
	}

	
	//Getters y Setters

	public String getSalinidad() {
		return salinidad= salinidad+"g/l";
	}

	public void setSalinidad(int salinidad) {
		this.salinidad = salinidad+"g/l";
	}

	@Override
	public String toString() {
		return super.toString() + "\tSalinidad=" + salinidad;
	}
	
	public void descripcion() {
		System.out.println("\n-CONGELADO POR AGUA");
		System.out.println("N° de Lote\t\t\t:"+getLoteNum());
		System.out.println("Temperatura de Mantenimiento\t:"+getTemRecomendada());
		System.out.println("Salinidad\t\t\t:"+salinidad);
	}

}
