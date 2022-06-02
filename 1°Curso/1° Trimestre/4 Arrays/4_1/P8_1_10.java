import java.util.*;

public class P8_1_10{
	
    public static void main(String[]args) {
		
		
		
        Scanner entrada=new Scanner(System.in);
		int numero;
		String num_cadena;
		
	
	
		System.out.println("Escribe un numero entero ");
		numero=entrada.nextInt();
	
	
		num_cadena=Integer.toString(numero);
	
		int numeros[]=new int[num_cadena.length()];
		int numeros2[]=new int[num_cadena.length()];
		
		for(int i=0;i<num_cadena.length();i++){
		
            numeros[i]=num_cadena.charAt(i)	;
		}
			System.out.print("\n");
		 
		//invertir vector
		for(int j=0;j<numeros.length;j++){
		
			numeros2[j]=numeros[numeros.length-1-j];
		
		}
		//Comparar numeros y numeros2
		boolean capicua=true;
		
	   for(int i=0;i<numeros.length && capicua;i++){
			
			if(numeros[i]!=numeros2[i]){
				capicua=false;
				
			}
            
		}
	   if(capicua)
	   System.out.print("El numero "+ numero+ " es capicua");
	   else 
	    System.out.print("El numero "+ numero+ " no es capicua");
    }

}

		
		
	
		
		
	