package alumno2;

public class Practica_9_0 {

	public static void main(String[] args) {
		
		String [] modulos = {"Programacion", "Bases de Datos", "Sistemas Operativos"};
		Alumno alumno1 = new Alumno ("Ellev", "Lawliet", 24, modulos);
		
		String [] modulos2 = {"Programacion", "Bases de Datos"};
		Alumno alumno2 = new Alumno ("Pepito", "Perez");
		alumno2.edad=21;
		alumno2.modulos= modulos2;
		
		String [] modulos3 = {"Programacion", "Lenguaje de Marcas"};
		Alumno alumno3 = new Alumno ("Javi", "Madrid", 20, modulos3);
		
		System.out.println("Datos del tercer objecto: "+alumno3.toString());
		
		
	}

}
