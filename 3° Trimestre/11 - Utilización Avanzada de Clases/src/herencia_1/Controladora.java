package herencia_1;

import java.io.IOException;
import java.util.*;

public class Controladora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TRABAJADOR 1
		Trabajador trabajador1 = new Trabajador();
		
		trabajador1.setNombre("Nombre1");
		trabajador1.setEdad(1);
		trabajador1.setTelefono("111");
		trabajador1.setCategoriaProfesional('A');
		trabajador1.setAntiguedad(10);
		
		// TRABAJADOR 2 CON EXCEPCIONES
		boolean error;
		char cat = 'A';
		do {
			try {
				System.out.print("Categoria Profesional del trabajador 2: ");
				error = false;
				cat = (char) System.in.read();
				
			} catch (IOException e) {
				System.out.println("Informacion getMessage "+e.getMessage());           
		        System.out.println("Informacion toString "+e.toString());
				e.printStackTrace();
				error = true;
			}
		} while(error || (cat!='A' && cat!='B' && cat!='C'));
			
		
		int ant=0;
		do {
			try{
				System.out.print("Antiguedad del trabajador 2: ");
				error = false;
				ant =sc.nextInt();
			} catch(InputMismatchException a) {
	             	System.out.println("EL NUMERO INTRODUCIDO DEBE SER UN ENTERO");
		            System.out.println("Informacion getMessage ");
		            System.out.println(a.getMessage());           
		            System.out.println("Informacion toString ");
			        System.out.println(a.toString());  
			        error = true;
	        }
		} while (error);
		
		
		Trabajador trabajador2 = new Trabajador("Nombre2", "222", 2,  cat, ant);
				
		// TRABAJADOR MAS ANTIGUO
		if (trabajador1.getEdad()>trabajador2.getEdad()) {
			System.out.println("\nEl trabajador mas antiguo es:"+trabajador1.getNombre());
		}else {
			System.out.println("El trabajador mas antiguo es:"+trabajador2.getNombre());
		}
		
		// TO STRING
		System.out.println("Trabajador 1 :"+trabajador1.toString());
		System.out.println("Trabajador 2 :"+trabajador2.toString());
				
	}

}
