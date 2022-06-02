package P11_2;

import java.util.Date;

public class ProductosRefrigerados extends Productos{
	//Atributos
	private String orgSupAlim;
	private int temRecomendada;
	

	//Constructores
	
	public ProductosRefrigerados() {
		super();
	}
	
	public ProductosRefrigerados(String orgSupAlim, int temRecomendada) {
		super();
		this.orgSupAlim = orgSupAlim;
		this.temRecomendada = temRecomendada;
	}
	
	public ProductosRefrigerados(int loteNum, Date fechaCaducidad, Date fechaEnvasado, String paisOrigen, String orgSupAlim, int temRecomendada) {
		super(loteNum, fechaCaducidad, fechaEnvasado, paisOrigen);
		this.orgSupAlim = orgSupAlim;
		this.temRecomendada = temRecomendada;
	}


	//Getters y Setters
	
	public String getOrgSupAlim() {
		return orgSupAlim;
	}

	public void setOrgSupAlim(String orgSupAlim) {
		this.orgSupAlim = orgSupAlim;
	}

	public int getTemRecomendada() {
		return temRecomendada;
	}

	public void setTemRecomendada(int temRecomendada) {
		this.temRecomendada = temRecomendada;
	}

	@Override
	public String toString() {
		return super.toString() + "\torgSupAlim=" + orgSupAlim + "\ttemRecomendada=" + temRecomendada;
	}
	
}
