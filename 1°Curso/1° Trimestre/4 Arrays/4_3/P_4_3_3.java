import java.util.Arrays;

public class P_4_3_3 {
	public static void main (String[]args){
		int diagonal[][]= new int[5][5];
		int transpuesta[][]= new int[5][5];
		
		for(int f=0;f<diagonal.length;f++){
			diagonal[f][f]=1;
			System.out.println(Arrays.toString(diagonal[f]));
		}
		
		for(int f=diagonal.length;f<0;f++){
			for(int c=0;c<diagonal[f].length;c++){
				transpuesta[f][c]=diagonal[c][f];
				System.out.println(Arrays.toString(transpuesta[f]));
			}
		}
	}
}