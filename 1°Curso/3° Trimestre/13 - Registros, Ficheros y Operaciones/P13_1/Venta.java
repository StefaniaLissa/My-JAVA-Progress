package P13_1;

public class Venta {

	private int cliente;
	private Double importe;
	private char formaPago;
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public char getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(char formaPago) {
		this.formaPago = formaPago;
	}
	
	public Venta(int cliente, Double importe, char formaPago) {
		super();
		this.cliente = cliente;
		this.importe = importe;
		this.formaPago = formaPago;
	}
	
	
}
