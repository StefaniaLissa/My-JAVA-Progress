import java.util.*;

	public class P_4_1_7{
		public static void main (String [] args){
			int Remplazo;
			int TB_NUM [] = new int [100];
			int i = 0; 
			
			Scanner sc = new Scanner(System.in);
			
			for(i=0; i<TB_NUM.length-1; i++){
				/* System.out.print:(i+": ");
				TB_NUM[i]=sc.nextInt(); */
				TB_NUM[i]=(int)(Math.random()*(101));
			}
			
			Arrays.sort(TB_NUM);
			
			for(i=0; i<TB_NUM.length; i++){
				System.out.print(" "+TB_NUM[i]);
			}

			System.out.print("\tIntroduzca un numero: ");
			Remplazo = sc.nextInt();
			i = 0;
			
			while (i<TB_NUM.length){
				if(TB_NUM[i]>=Remplazo || i==TB_NUM.length-1){
					TB_NUM[i]=Remplazo;
					i=TB_NUM.length;
				}
				i++;
			}
			
			for(i=0; i<TB_NUM.length; i++){
				System.out.print(" "+TB_NUM[i]);
			}
		}
	}