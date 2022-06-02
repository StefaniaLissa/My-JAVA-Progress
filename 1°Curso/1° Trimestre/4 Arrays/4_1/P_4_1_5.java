import java.util.*;

public class P_4_1_5{
	public static void main (String [] args){
		double alturas [] = new double [10];
		double media=0;
		int sobre=0, debajo=0;
		
		
		Scanner sc = new Scanner (System.in);
		
		for(int i=0; i<alturas.length; i++){
			/* System.out.print:(i+": ");
			alturas[i]=sc.nextInt(); */
			alturas[i]=(Math.random()*(101));
			media+=alturas[i];
		}
		
		media/=alturas.length;
		
		for(int i=0; i<alturas.length; i++){
			if(alturas[i]>media){
				sobre++;
			}else{
				debajo++;
			}
		}
		System.out.println("Media: "+media);
		System.out.println("Sobre la media: "+sobre);
		System.out.println("Debajo de la media: "+debajo);
	}
}