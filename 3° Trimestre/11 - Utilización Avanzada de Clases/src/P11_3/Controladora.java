package P11_3;

import java.util.*;

public class Controladora {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Vecino vecino1 = new Vecino("VNombre", 16, "V12345", "CODVIVIENDA", "FINCA");
		do {
			System.out.println("Introduce DNI/NIE: ");vecino1.setDni(sc.nextLine());
		} while (!vecino1.dniValido());

		if(vecino1.getEdad()<18) {
			System.out.println("EDAD ACTUALIZADA");
			vecino1.setEdad(18);
			}
		
		Administrador admin1 = new Administrador("AdNombre", 16, "12345678A", "A12345", "FINCA2", 2, 100);
		
		if(admin1.getEdad()<18) {
			System.out.println("EDAD ACTUALIZADA");
			admin1.setEdad(18);
			}
		
		if (admin1.getSalario()>admin1.salarioMaximo(vecino1.getCuota())) {
			System.out.println("SALARIO ACTUALIZADO");
			admin1.setSalario(admin1.salarioMaximo(vecino1.getCuota()));
			}
		
		System.out.println(vecino1.toString());
		System.out.println(admin1.toString());
	}

}
