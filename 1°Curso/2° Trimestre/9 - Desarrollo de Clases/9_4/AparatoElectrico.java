package practica9_4;

public class AparatoElectrico {

	private int potencia ;
	private boolean encendido;
	private static double consumoTotal;
	
	public static double getConsumoTotal() {
		return consumoTotal;
	}

	public static void setConsumoTotal(double consumoTotal) {
		AparatoElectrico.consumoTotal = consumoTotal;
	}

	public AparatoElectrico() {
	}

	public AparatoElectrico(int potencia, boolean estado) {
		this.potencia = potencia;
		this.encendido = estado;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEstado(boolean encendido) {
		this.encendido = encendido;
	}

	
	@Override
	public String toString() {
		return "AparatoElectrico [potencia=" + potencia + ", encendido=" + encendido + "]";
	}
	
	
	public void enciende() {
		if (!encendido) {
			consumoTotal+=potencia;
			encendido=true;
		}
	}
	public void apaga() {
		if (encendido) {
			consumoTotal-=potencia;
			encendido=false;
		}
	}
	
	
}
