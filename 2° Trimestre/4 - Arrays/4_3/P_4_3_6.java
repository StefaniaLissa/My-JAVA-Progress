import java.util.*;

public class P_4_3_6 {
	public static void main (String[]args){
		double suma, mediaAsignatura, mediaClase, mediaAlumno
		double[][] notas = new double[3][15];
		String[] asignatura = new String[3]; 
			asignaturas[0] = "Programacion";
			asignaturas[1] = "BBDD";
			asignaturas[2] = "LDM";
			
		String[] alumno = new String[15]; 
			alumnos[0] = "I";
			alumnos[1] = "II";
			alumnos[2] = "III";
		
		Scanner sc = new Scanner (System.in);
		
		for(int f=0;f<asignatura.length;f++){
			for(int c=0;c<alumno.length;c++){
				System.out.println("El alumno " + alumnos[c] + 
				" en la asignatura " + asignaturas[f] + " tiene una nota de : ";
				//notas[f][c]=sc.nextDouble();
				notas[f][c]=(int)(Math.random() * ((10 - 1) + 1));
				
				mediaAlumno=mediaAlumno+notas[f][c];
				mediaAlumno=mediaAlumno/3;
				System.out.println("La media del alumno "+alumno[c]+
				" es ="+mediaAlumno)
				
				suma=suma+notas[f][c];
				mediaAsignatura=suma/6;
				System.out.println("La asignatura " + asignatura[f] + 
				" Tiene de nota media = " + mediaAsignatura);
			}
			mediaClase=mediaClase+mediaAsignatura;
			System.out.println("La media de la clase = " + mediaClase);
		}
		
		
}