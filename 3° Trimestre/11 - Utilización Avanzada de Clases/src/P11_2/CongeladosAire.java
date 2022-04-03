package P11_2;

import java.util.Date;
import java.util.Scanner;

public class CongeladosAire extends ProductosCongelados{
	//Atributos
	private int porcNitrogeno;
	private int porcOxigeno;
	private int porcDioxCarb;
	private int porcVaporAgua;
	
	//Constructores
	
	public CongeladosAire() {
		super();
	}
	
	public CongeladosAire(int porcNitrogeno, int porcOxigeno, int porcDioxCarb, int porcVaporAgua) {
		super();
		this.porcNitrogeno = porcNitrogeno;
		this.porcOxigeno = porcOxigeno;
		this.porcDioxCarb = porcDioxCarb;
		this.porcVaporAgua = porcVaporAgua;
		procentajesError();
	}
	
	public CongeladosAire(int loteNum, Date fechaCaducidad, Date fechaEnvasado, String paisOrigen, int temRecomendada,
			int porcNitrogeno, int porcOxigeno, int porcDioxCarb, int porcVaporAgua) {
		super(loteNum, fechaCaducidad, fechaEnvasado, paisOrigen, temRecomendada);
		this.porcNitrogeno = porcNitrogeno;
		this.porcOxigeno = porcOxigeno;
		this.porcDioxCarb = porcDioxCarb;
		this.porcVaporAgua = porcVaporAgua;
		procentajesError();
	}

	//Getters y Setters
	
	public int getPorcNitrogeno() {
		return porcNitrogeno;
	}

	public void setPorcNitrogeno(int porcNitrogeno) {
		this.porcNitrogeno = porcNitrogeno;
	}

	public int getPorcOxigeno() {
		return porcOxigeno;
	}

	public void setPorcOxigeno(int porcOxigeno) {
		this.porcOxigeno = porcOxigeno;
	}

	public int getPorcDioxCarb() {
		return porcDioxCarb;
	}

	public void setPorcDioxCarb(int porcDioxCarb) {
		this.porcDioxCarb = porcDioxCarb;
	}

	public int getPorcVaporAgua() {
		return porcVaporAgua;
	}

	public void setPorcVaporAgua(int porcVaporAgua) {
		this.porcVaporAgua = porcVaporAgua;
	}

	@Override
	public String toString() {
		return super.toString() + "\tNitrogeno=" + porcNitrogeno + "\tOxigeno=" + porcOxigeno + "\tDioxCarb="
				+ porcDioxCarb + "\tVaporAgua=" + porcVaporAgua;
	}
	
	public void procentajesError() {
		Scanner sc = new Scanner(System.in);
		boolean error=true;
		do {
			if ((porcNitrogeno+porcOxigeno+porcDioxCarb+porcVaporAgua)!=100) {
				error=true;
				System.out.print("Porcentajes Erroneos");
				System.out.print("Introducir % Nitrogeno: ");porcNitrogeno=sc.nextInt();
				System.out.print("Introducir % Oxigeno: ");porcOxigeno=sc.nextInt();
				System.out.print("Introducir % Diox de Carbono: ");porcDioxCarb=sc.nextInt();
				System.out.print("Introducir % Vapor de Agua: ");porcVaporAgua=sc.nextInt();
			}else {
				error=false;
			}	
		} while (error);
	}
	
	
}
