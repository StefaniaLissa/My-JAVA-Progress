package P11_2;

import java.text.SimpleDateFormat;
import java.util.*;

public class Productos {
	//Atributos
	private int loteNum;
	private Date fechaCaducidad;
	private Date fechaEnvasado;
	private String paisOrigen;
	Date sinFecha = new Date(0,0,0);
	
	//Constructores
	public Productos() {
		this.fechaCaducidad = sinFecha;
		this.fechaEnvasado = sinFecha;
	}
	
	public Productos(int loteNum, Date fechaCaducidad, Date fechaEnvasado, String paisOrigen) {
		super();
		this.loteNum = loteNum;
		this.fechaCaducidad = fechaCaducidad;
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	//Getters y Setters
	
	public int getLoteNum() {
		return loteNum;
	}

	public void setLoteNum(int loteNum) {
		this.loteNum = loteNum;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	public Date getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(Date fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	@Override
	public String toString() {
		return "\t loteNum=" + loteNum + "\t fechaCaducidad=" + formato.format(fechaCaducidad) + "\tfechaEnvasado" + formato.format(fechaEnvasado) + "\tpaisOrigen=" + paisOrigen;
	}
	
}
