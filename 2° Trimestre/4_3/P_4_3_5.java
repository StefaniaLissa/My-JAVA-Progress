import java.util.*;

public class P_4_3_5 {
	public static void main (String[]args){
		int matriz[][]= new int[5][5];
		boolean identidad;
		int sumaF=0;
		int sumaC=0;
		Scanner sc = new Scanner (System.in);
		
		for(int c=0;c<5;c++){
			for(int f=0;f<matriz.length;f++ ){
				matriz[f][c]=sc.nextInt();
				sumaC=sumaC+matriz[f][c];
			}
			System.out.println("Columna N°"+c+" - "+sumaC);
		}
		
		for(int f=0;f<5;f++){
			for(int c=0;c<matriz.length;c++){
				sumaF=sumaF+matriz[f][c];
			}
			System.out.println(Arrays.toString(matriz[f]));
			System.out.println("Fila N°"+f+" - "+sumaC);
		}
	}
}