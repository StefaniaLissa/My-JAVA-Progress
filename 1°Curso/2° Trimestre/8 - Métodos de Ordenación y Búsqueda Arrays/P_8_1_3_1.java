import java.util.*;

public class P_8_3_1{
	public static void main (String [] args){
		int array [] = new int [10];
		Scanner sc = new Scanner (System.in);
		int max = 5;
		
		int[][] contar = new int[2][max+1];

		for(int i=0; i<=max; i++){
			contar[0][i]=i;
		}

		for(int f = 0; f < contar.length; f++){
			for(int i=0; i<10; i++){
				array[i]=(int)Math.floor(Math.random()*(max)+1);
				System.out.print(array[i]+" ");
				contar[1][array[i]]=+1;
			}
		}

		for(int c = 0; c < max-1; c++){
			for(int f = 0; f < contar.length; f++){
	
			}
		}

		for(int f = 0; f < contar.length; f++){
			for(int c = 0; c < contar[f].length; c++)
				System.out.print(contar[f][c] + " ");
				System.out.println();
		}
		
	}

	public static void Visualizar() {
		for(int f = 0; f < contar.length; f++){
			for(int c = 0; c < contar[f].length; c++)
				System.out.print(contar[f][c] + " ");
				System.out.println();
		}
	}
}