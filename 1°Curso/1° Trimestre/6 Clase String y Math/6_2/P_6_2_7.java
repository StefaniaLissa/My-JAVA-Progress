import java.util.*;

public class P_6_2_7{
    public static void main (String args[]){
        String str = new String();
        String invertida = new String();
		int longitud;
		
		invertida="";

        Scanner sc = new Scanner (System.in);

        System.out.print(" Introduce una frase: ");
        str = sc.nextLine();

        str = str.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		
		longitud = str.length();
		
		/*for(int i=longitud-1;i>=0;i--){
			invertida=invertida+str.charAt(i);
		}*/
		boolean palindromo=true;
		for(int i=longitud-1;i>longitud/2 && palindromo;i--){
			if(str.charAt(i)!=str.charAt(str.length()-i)
				palindromo=false;
				//System.out.println("La frase no es un palindromo");
		}
		if(invertida.equals(str))
			System.out.println("La frase es un palindromo");
		else System.out.println("La frase no es un palindromo");
    }
}