import java.util.*;

	public class P_4_1_8{
		public static void main (String [] args){
			int TB_NUM [] = new int [100];
			int pos;
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<TB_NUM.length-1; i++){
				/* System.out.print:(i+": ");
				TB_NUM[i]=sc.nextInt(); */
				TB_NUM[i]=(int)(Math.random()*(101));
			}
			
			for (int var : TB_NUM){
				System.out.print(TB_NUM[var]+" ");
			}

			System.out.println("Introdusca una posición: ");
			pos = sc.nextInt();
			
			for(int i=pos-1;i<TB_NUM.length-1;i++){
				TB_NUM[i]=TB_NUM[i+1];
			}
			
			TB_NUM[TB_NUM.length-1]=0;
			
			for (int var : TB_NUM){
				System.out.print(TB_NUM[var]+" ");
			}		
		}
	}