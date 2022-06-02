import java.util.*;

	public class P_4_1_9{
		public static void main (String [] args){
			int numeros [] = new int [10];
			String num_cadena;
			int numero;
			
			Scanner sc = new Scanner(System.in);
		
			numero=sc.nextInt();

			num_cadena=Integer.toString(numero);
			
			
			
			for (i=0; i<numeros.length;i++){
				numeros[i]=num_cadena.charAt(i);
				System.out.print((char)numeros[i]+" ")
			}		
		}
	}