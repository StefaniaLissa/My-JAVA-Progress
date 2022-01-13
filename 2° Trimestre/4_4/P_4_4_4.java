import java.util.*;

public class P_4_4_4 {
	public static void main (String[]args){
		int f1= a.length, c1= a[0].length, f2=b.length, c2= b[0].length;

		int a[][]={{2,0,1},{3,0,0},{5,1,1}};

		int b[][]={{1,0,1},{1,2,1},{1,1,0}};

		int resul [][] = new int [f1][c1];

		for(int i = 0; i < f1; i++){    
			for(int j = 0; j < c2; j++){    
				for(int k = 0; k < f2; k++){    
					resul[i][j] = resul[i][j] + a[i][k] * b[k][j];     
				}    
			}    
		}   
		 for (int i =0; i<f1; i++){
			 for(int j=0; j<col2; j++){
				 System.out.print(resul[i][j]+" ");
			 }
			 System.out.println();
		 } 
		 
	}
}