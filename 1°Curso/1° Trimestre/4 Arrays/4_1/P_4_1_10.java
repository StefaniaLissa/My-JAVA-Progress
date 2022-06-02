import java.util.*;

	public class P_4_1_10{
		public static void main (String [] args){

			String num_cadena;
			int numero;
			boolean capicua=false;
			
			Scanner sc = new Scanner(System.in);
		
			numero=sc.nextInt();

			int numeros [] = new int[num_cadena.length()];
			int inverso [] = new int[numeros];

			num_cadena=Integer.toString(numero);

			for (i=0; i<numeros.length;i++){
				numeros[i]=num_cadena.charAt(i);
			}		
			
			for (int j=0; j<num_cadena.length;j++){
				inverso[i]=numeros[numero.length-1-j];
			}
			
			for (i=0; i<numeros.length && capicua;i++){
				if(numeros[1]!=numeros2[i]){
					capicua=false;
				}
			}
			
			if(capicua)
				System.out.println("El numero es capicua");
			else
				System.out.println("El numero NO es capicua");
		}
	}