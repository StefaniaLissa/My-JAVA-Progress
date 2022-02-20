import java.util.Scanner;
public class P_8_1_3 {
	public static void main (String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int vector[] = new int[10];
			for (int i = 0; i < vector.length; i++) {
				System.out.println("Inserte el numero: ");
				vector[i]=sc.nextInt();
			}
			/*for (int i = 0; i < vector.length; i++) {
				System.out.print(vector[i]+"\t");
			}*/
			int pasada, aux;
			for (pasada = 1; pasada < vector.length; pasada++) {
				for (int i = 0; i < vector.length-pasada; i++) {
					if (vector[i]>vector[i+1]) {
						aux=vector[i];
						vector[i]=vector[i+1];
						vector[i+1]=aux;
					}
				}
			}
			/*for (int i = 0; i < vector.length; i++) {
				System.out.print("\t"+vector[i]+"\t");
				if(i%20==0) System.out.println();
			}*/
			System.out.println();
			/*for (int i = 0; i < vector.length; i++) {
				if(i==vector.length-1) System.out.println("El mayor valor del vector es "+vector[i]);
			}*/
			System.out.println("El mayor valor del vector es "+vector[vector.length-1]);
			int mayor=vector[vector.length-1];
			int repeticionMayor=0;
			for (int i = vector.length-1; i >= 0 && vector[i]==mayor; i--) {
				repeticionMayor++; 
			}
			System.out.println("El mayor valor del vector se repite "+repeticionMayor+" veces");
		}
	}
}
