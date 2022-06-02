import java.util.*;

public class P_4_1_1{
	public static void main (String [] args){
		int[]array=new int[10];
		int mayor;
		mayor = array[0];
		int repite = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los valores del array");
		
		for(int a=0; a<array.length; a++){
			System.out.print(a+1+": ");
			array[a] = sc.nextInt();
		}
		
		for(int i=0; i<array.length; i++){
			if (array[i]>mayor){
				mayor=array[i];
				repite=1;
			}else{
				if (array[i]==mayor){
				repite++;
				}
			}
		}
		
		System.out.println("El numero mayor del array es: "+mayor+". Este se repite "+repite+" veces.");
		
	}
}