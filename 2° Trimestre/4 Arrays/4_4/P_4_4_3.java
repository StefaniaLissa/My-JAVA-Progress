import java.util.*;

public class P_4_4_3 {
	public static void main (String[]args){
		int matriz[][]= new int[4][4];
		int contadorC = 0;
		int contadorF = 0;
		int contadorD = 0;
		
		Scanner sc = new Scanner (System.in);
		
		for(int c=0;c<matriz.length;c++){
			for(int f=0;f<matriz.length;f++ ){
				System.out.print("Fila "+f+" Columna "+c+" :");
				matriz[f][c]=sc.nextInt();
			}
		}
		
		for(int f=0;f<matriz.length;f++){
			for(int c=0;c<matriz[f].length;c++){
				contadorF=contadorC+matriz[f][c];
				if (f==c){
					contadorD=contadorD+matriz[f][c];
				}
			}
		}
		
		for(int c=0;c<matriz.length;c++){
			for(int f=0;f<matriz.length;f++){
				contadorC=contadorC+matriz[f][c];
				if (f==c){
					contadorD=contadorD+matriz[f][c];
				}
			}
		}
		System.out.print("contadorC: "+contadorC);
		System.out.print("contadorF: "+contadorF);
		System.out.print("contadorD: "+contadorD);
		
		if (contadorC==contadorF && contadorF==contadorD){
			System.out.print("La matriz es mágica");
		}else{
			System.out.print("La matriz no es mágica");
		}
	}
}