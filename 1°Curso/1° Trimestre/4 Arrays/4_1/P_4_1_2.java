import java.util.*;

public class P_4_1_2{
	public static void main (String [] args){
		int[]vector1=new int[15];
		int[]vector2=new int[15];
		int[]vector3=new int[15];
		
		Scanner sc = new Scanner(System.in);
		
		for(int a=0; a<vector1.length; a++){
			vector1[a] = (int)(Math.random()*(101));
		}
		
		for(int a=0; a<vector2.length; a++){
			vector2[a] = (int)(Math.random()*(101));
		}
		
		System.out.println("Al sumar el contenido de los 2 vectores:");
		
		for(int a=0; a<vector3.length; a++){
			vector3[a]=vector1[a]+vector2[a];
		}
		
		System.out.print("Contenido del vector 3");
		
		for(int a=0; a<vector3.length; a++){
			System.out.println(vector1[a]+" + "+vector2[a]+" = "+vector3[a]);
		}
	}
}