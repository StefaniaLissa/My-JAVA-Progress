package P11_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vecino extends Persona{
	//Atributos
	private String codigoVecino;
	private String codVivienda;
	private String finca;
	private static float cuota;
	
	//Constructores
	
	public Vecino() {}

	public Vecino(String codigoVecino, String codVivienda, String finca) {
		super();
		this.codigoVecino = codigoVecino;
		this.codVivienda = codVivienda;
		this.finca = finca;
	}

	public Vecino(String nombre, int edad, String dni, String codigoVecino, String codVivienda, String finca) {
		super(nombre, edad, dni);
		this.codigoVecino = codigoVecino;
		this.codVivienda = codVivienda;
		this.finca = finca;
	}

	public Vecino(String nombre, int edad, String codigoVecino, String codVivienda, String finca) {
		super(nombre, edad, "-");
		this.codigoVecino = codigoVecino;
		this.codVivienda = codVivienda;
		this.finca = finca;
	}

	//Getters y Setters
	
	public String getCodigoVecino() {
		return codigoVecino;
	}

	public void setCodigoVecino(String codigoVecino) {
		this.codigoVecino = codigoVecino;
	}

	public String getCodVivienda() {
		return codVivienda;
	}

	public void setCodVivienda(String codVivienda) {
		this.codVivienda = codVivienda;
	}

	public String getFinca() {
		return finca;
	}

	public void setFinca(String finca) {
		this.finca = finca;
	}

	public static float getCuota() {
		return cuota;
	}

	public static void setCuota(float cuota) {
		Vecino.cuota = cuota;
	}
	
	//Metodos
	 public boolean codigoValido() {
			Pattern Vecino = Pattern.compile("[V]{0, 1}[0-9]{0-5}");
			Matcher mat = Vecino.matcher(codigoVecino);
			return mat.matches();
	 }
	
	 public void modifCuota(float cuoNueva) {
		 cuota=cuoNueva;
	 }

	@Override
	public String toString() {
		return "Vecino [codigoVecino=" + codigoVecino + ", codVivienda=" + codVivienda + ", finca=" + finca
				+ ", toString()=" + super.toString() + "]";
	} 
	
}
