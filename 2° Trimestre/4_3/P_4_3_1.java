import java.util.Arrays;

public class P_4_3_1 {
	public static void main (String[]args){
		int tabla[][]= new int[10][10];
		
		for(int f=0;f<tabla.length;f++ ){
			if(f%2==0){
				Arrays.fill(tabla[f],1);
			}
			System.out.println(Arrays.toString(tabla[f]));
		}
	}
}