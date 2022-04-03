package P11_2;

import java.util.Date;

public class ProductosCongelados extends Productos{
	//Atributos
	private String paisOrigen;
	private int temRecomendada;

	//Constructores
	public ProductosCongelados() {
		super();
	}
	
	public ProductosCongelados( String paisOrigen, int temRecomendada) {
		super();
		this.paisOrigen = paisOrigen;
		this.temRecomendada = temRecomendada;
	}
	
	
	public ProductosCongelados(int loteNum, Date fechaCaducidad, Date fechaEnvasado, String paisOrigen, int temRecomendada) {
		super(loteNum, fechaCaducidad, fechaEnvasado, paisOrigen);
		this.paisOrigen = paisOrigen;
		this.temRecomendada = temRecomendada;
	}

	//Getters y Setters

	public int getTemRecomendada() {
		return temRecomendada;
	}

	public void setTemRecomendada(int temRecomendada) {
		this.temRecomendada = temRecomendada;
	}

	@Override
	public String toString() {
		return super.toString() + "\t temRecomendada=" + temRecomendada;
	}
	
	
}
