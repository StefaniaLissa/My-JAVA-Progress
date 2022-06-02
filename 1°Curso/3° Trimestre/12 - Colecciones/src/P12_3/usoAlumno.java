package P12_3;

import java.util.*;

public class usoAlumno {
	
	static Scanner sc = new Scanner(System.in);
	
	public static LinkedList<Alumno> ArrayAlumno = new LinkedList<>();

	public static LinkedList<Alumno> LinkedAlumno = new LinkedList<>();
	
	public static Iterator <Alumno> itAlumno = LinkedAlumno.iterator();

	public static void main(String[] args) {
		
		//COMPARACION ENTRE LINKED Y ARRAY LISTS (CRONOMETRO)
		//ARRAYLIST
		int max=ArrayAlumno.size();
		
		Date tiempo1 = new Date();
		System.out.println("ARRAYLIST\n"+tiempo1);
		
		for (int i=0; i < 10000000 ; i++) {
			 int random = (int)Math.floor(Math.random()*(max+1));
			 ArrayAlumno.add(random, new Alumno ());
		}
		
		Date tiempo2 = new Date();
		System.out.println(tiempo2);
		
		//LINKEDLIST
		max=LinkedAlumno.size();
		
		Date tiempo3 = new Date();
		System.out.println("LINKEDLIST\n"+tiempo3);
		
		for (int i=0; i < 10000000 ; i++) {
			 int random = (int)Math.floor(Math.random()*(max+1));
			 LinkedAlumno.add(random, new Alumno ());
		}
		
		Date tiempo4 = new Date();
		System.out.println(tiempo4);
		
		//EJERCICIO LinkedList e Iterator PRACTICA 3 
		
		LinkedList<String> pais = new LinkedList<>();
		LinkedList<String> capital = new LinkedList<>();
		
		pais.add("Pais1");pais.add("Pais2");pais.add("Pais3");
		pais.add("Pais4");pais.add("Pais5");
		
		capital.add("Cap1");capital.add("Cap2");capital.add("Cap3");
		capital.add("Cap4");pais.add("Cap5");
		
		//1)
		ListIterator <String> iterator0 = pais.listIterator();
		ListIterator <String> iterator1 = capital.listIterator();
		
		while(iterator1.hasNext()) {
			if(iterator0.hasNext()) {
				iterator0.next();
			}
			iterator0.add(iterator1.next());
		}
		
		System.out.println("1:");
		for(int i = 0; i < pais.size(); i++) {
			System.out.println(pais.get(i));
		}
		
		//2)
		while(iterator1.hasNext()) {
			iterator1.next();
			if(iterator1.hasNext()) {
				iterator1.next();
				iterator1.remove();
			}
		}
		
		System.out.println(capital);
		
		//3)
		pais.removeAll(capital);
		
		System.out.println("3.");
		for(int i = 0; i < pais.size(); i++) {
			System.out.println(pais.get(i));
		}
	}
}
