import java.util.Arrays;

public class P_4_3_2 {
	public static void main (String[]args){
		int diagonal[][]= new int[5][5];
		
		for(int f=0;f<diagonal.length;f++ ){
			diagonal[f][f]=1;
			System.out.println(Arrays.toString(diagonal[f]));
		}
	}
}