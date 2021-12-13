import java.util.*;
import javax.swing.JOptionPane;

	public class P_4_2_2{
		public static void main (String [] args){
			String producto [] = new String []{"agua","refresco","zumo"};
			int precio [] = {50,75,95};
			int monedas [] = {200,100,50,20,10,5};
			int cantMonedas [] = {20,20,20,20,20,20};
			int pagado = 0;
			int opcion, sobra, cambio;
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<producto.length;i++){
				System.out.println((i+1)+" "+producto[i]+"- 0,"+precio[i]);
			}
			opcion=sc.nextInt();
			opcion-=1;
			
			do{
				String pago = JOptionPane.showInputDialog("Ingrese "+(precio[opcion]-pagado)+" centimos");
				pagado=Integer.valueOf(pago);
				pagado-=pagado;
			}while(pagado>=precio[opcion]);
			
			if (pagado-precio[opcion]!=0){
				sobra=pagado-precio[opcion];
				cambio=sobra;
				
				do{
					System.out.print("Su vuelto es:");
					for(int i=0;i<7;i++){
						cambio=sobra/monedas[i];
						if (cambio!=0){
							System.out.print(cambio+" monedas de"+monedas[i]);
						}
						cambio=cambio-(sobra/monedas[i]);
					}
				}while(cambio!=0);
			}
		}
	}