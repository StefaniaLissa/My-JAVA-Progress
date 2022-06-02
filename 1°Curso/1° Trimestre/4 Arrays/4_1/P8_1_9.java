import java.util.*;

public class P8_1_9{
	public static void main (String args[]){

	Scanner entrada=new Scanner(System.in);
	int numero;
	String num_cadena;
	
	
	
	System.out.println("Escribe un numero entero ");
	numero=entrada.nextInt();
	
	
	num_cadena=Integer.toString(numero);
	
	int numeros[]=new int[num_cadena.length()];
	
	for(int i=0;i<numeros.length;i++){
		
            numeros[i]=num_cadena.charAt(i);
			
			
            System.out.print((char)numeros[i]+"  ");
		
		
		
	}
	
	
		
	}
	
}