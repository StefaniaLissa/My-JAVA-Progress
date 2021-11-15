import java.util.Scanner;

public class P_3_8_3{
	public static void main (String args[]){
		int lado, i, a, caracter;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Longitud del lado del cuadrado: ");
		lado = sc.nextInt();

		System.out.print("Caracter ASCII ");
		caracter = sc.nextInt();

		char caracterChar = (char)caracter;

		for (i=0;i<lado;i++){
			 System.out.print (caracterChar);
		}
		System.out.println();
		
		for(i=0;i<lado-2;i++){
			 System.out.print (caracterChar);
				for(a=0;a<lado-2;a++){
					System.out.print(" ");
				}
			System.out.print (caracterChar);
			System.out.println();
		}
		
		for (i=0;i<lado;i++){
			 System.out.print (caracterChar);
		}
	}
}