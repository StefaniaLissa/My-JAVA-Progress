import java.util.*;

public class P_4_1_4{
	public static void main (String [] args){
		int sumaPar=0;
		int sumaImpar=0;
		int array [] = new int [10];
		
		Scanner sc = new Scanner (System.in);
		
		for(int i=0; i<array.length; i++){
			/* System.out.print:(i+": ");
			array[i]=sc.nextInt(); */
			array[i]=(int)(Math.random()*(100));
		}
		
		for(int i=0; i<9; i++){
			if(i%2==0){
				sumaPar=sumaPar+array[i];
			}else{
				sumaImpar=sumaImpar+array[i];
			}
		}
		
		sumaPar=sumaPar/10;
		sumaImpar=sumaImpar/10;
		
		System.out.println("Media pares: "+(double)sumaPar/array.length);
		System.out.println("Media impares: "+(double)sumaImpar/array.length);
	}
}