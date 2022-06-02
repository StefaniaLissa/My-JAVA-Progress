import java.util.Scanner;
public class p6_1_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pPalabra, palabra;
		int contador=0;
		System.out.print("Introduce una palabra");
		pPalabra=sc.next();
		do {
			System.out.print("Introduce otra palabra");
			palabra=sc.next();
			contador++;
					
		}while (!pPalabra.equals(palabra));
		System.out.print("Se han introducido "+contador+" palabras diferentes");
	}
}
