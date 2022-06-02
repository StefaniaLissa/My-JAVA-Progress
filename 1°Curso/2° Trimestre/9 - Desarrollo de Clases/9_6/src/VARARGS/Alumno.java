package VARARGS;

public class Alumno {
	static String alumnoInfo(String nombre, int ... notas) {
		double media= 0.0;
		for (int i = 0; i<notas.length; i++) {
			media+=notas[i];
		}
		media=media/notas.length;
		return "El alumno "+nombre+" ha obtenido una calificacion media de: "+ media;
	}
	
	public static void main(String[] args) {
		System.out.print(alumnoInfo("Nombre", 1, 5, 10));
	}

}
