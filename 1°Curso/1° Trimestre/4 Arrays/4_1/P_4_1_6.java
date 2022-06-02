import java.util.*;

	public class P_4_1_6{
		public static void main (String [] args){
			double nota [] = new double [40];
			double media=0, sobre, aprobado=0, desaprobado=0;
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<nota.length-1; i++){
				/* System.out.print:(i+": ");
				nota[i]=sc.nextInt(); */
				nota[i]=(Math.random()*(40));
				media+=nota[i];
			}
			
			media/=nota.length;
			
			for(int i=0; i<nota.length; i++){
				if(nota[i]>=5){
					aprobado++;
				}else{
					desaprobado++;
				}
				if(nota[i]>media){
					sobre++;
				}
			}
			System.out.println("Aprobado: "+aprobado);
			System.out.println("Desaprobado: "+desaprobado);
			System.out.println("Media: "+media);
			System.out.println("Sobre la media: "+sobre);
			
		}
	}