package empleado;

import java.util.*;

public class Practica_7_6_VectorObjetos {
	
	public static void main (String[]args) {
		double salarioTotal = 0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Cauntos Empleados tiene?");
		int e = sc.nextInt();
		
		Empleado [] vectorEmple = new Empleado[e];
		
		vectorEmple[0]= new Empleado ("A", "A", 1, 1.5);
		vectorEmple[1]= new Empleado ("B", "B", 2, 2.5);
		vectorEmple[2]= new Empleado ("C", "C", 3, 3.5);
		vectorEmple[3]= new Empleado ("D", "D", 4, 4.5);
		vectorEmple[4]= new Empleado ("E", "E", 5, 5.5);
	
		System.out.printf("DEPARTAMENTO "+" EMPLEADO "+" SALARIO ");
		for(int i=0; i<e; i++) {
			System.out.println(vectorEmple[i].departamento+" "+vectorEmple[i].nombre+" "+vectorEmple[i].salario);
		}
		
		System.out.println("Salario total de todos los Empleados: ");
		for(int i=0; i<e; i++) {
			salarioTotal=salarioTotal+vectorEmple[i].salario;
		}
		System.out.println(salarioTotal);
	}
}
