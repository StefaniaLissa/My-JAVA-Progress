import java.util.Arrays;

public class P_4_3_4 {
	public static void main (String[]args){
		int tabla[][]= new int[4][4];
		boolean identidad;
		Scanner sc = new Scanner (System.in);
		
		for(int c=0;c<5;c++ ){
			for(int f=0;f<tabla.length;f++ ){
				tabla[f][c]=sc.nextInt;
				
				if(tabla[f%2]==1){
					identidad;
				}else{
					!identidad;
				}
				System.out.println(Arrays.toString(tabla[f]));
			}
		}
		if(identidad){
			System.out.println("La tabla es identidad");
		}else{
			System.out.println("La tabla no es identidad");
		}
	}
}