import java.util.*;
import javax.swing.JOptionPane;

	public class P_4_2_2{
		
		public static void main (String [] args){
			String producto [] = new String []{"agua","refresco","zumo"};
			int precio [] = {50,75,95};
			int monedas [] = {200,100,50,20,10,5};
			int cantMonedas [] = {20,20,20,20,20,20};
			int pagado = 0;
			int opcion, sobra, cambio, falta=0;
			boolean sinCambio=false;
			
			
			do{
				opcion=menu(producto,precio);
				
				sinCambio=impExacto(cantMonedas,monedas);
				
				if(opcion<producto.length){

					if(sinCambio){
						JOptionPane.showMessageDialog(null, "INTRODUZCA IMPORTE EXACTO");
					}

					do{
						String pago = JOptionPane.showInputDialog("Ingrese "+(precio[opcion]-pagado)+" centimos");
						pagado=Integer.valueOf(pago);
						if(pagado<5){
							System.out.print("No se aceptan monedas de 1 o 2 euros");
						}else{
							pagado+=pagado;
						}
					}while(pagado<precio[opcion]);
					
					sobra=pagado-precio[opcion];
					cambio=sobra;
					
					if (cambio!=0||sinCambio==false){
						do{
							System.out.print("Su vuelto es:");
							for(int i=0;i<7;i++){
								cambio=sobra/monedas[i];
								if (cambio!=0){
									System.out.println(cambio+" monedas de "+monedas[i]+" centimos");
								}
								cambio=cambio-(sobra/monedas[i]);
							}
						}while(cambio!=0);
					}
				}
				
			}while(opcion<producto.length);

			System.out.println("Las monedas que hay son:");
			for(int i=0;i<cantMonedas.length;i++){
				if(cantMonedas[i]>0){
					System.out.println(cantMonedas[i]+" de "+monedas[i]);
				}
			}
			
		}
		
		public static int menu(String [] producto,int [] precio){
			Scanner sc = new Scanner(System.in);
			int opcion;
			
			do{
				for(int i=0;i<producto.length;i++){
						System.out.println((i+1)+" "+producto[i]+"- "+precio[i]+" centimos");
					}
				System.out.println((producto.length+1)+"-Salir");
				opcion=sc.nextInt();
				opcion-=1;
			}while(opcion>producto.length+1);
			return opcion;
		}
		
		public static boolean impExacto(int [] cantMonedas,int []monedas){
			int falta=0;
			boolean sinCambio=false;
			
			for(int i=0;i<cantMonedas.length;i++){
				if(cantMonedas[i]==0){
					falta++;
					if(falta>1||monedas[5]==0){
						sinCambio=true;
					}
				}
			}
			return sinCambio;
		}
	}