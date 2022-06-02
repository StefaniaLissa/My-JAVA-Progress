import java.util.*;

public class P_4_1_3{
	public static void main (String [] args){
		int array[] = new int [10];
		
		Scanner sc = new Scanner (System.in);
		
		for(int i=0; i<array.length; i++){
			/* array[i] = sc.nextInt;	 */	
			array[i]=(int)(Math.random()*(100));
			
			if(array[i]%2==0){
				System.out.println(array[i]+" es par y se encuentra en la posicion "+i+1);
			}
		}
	}
}