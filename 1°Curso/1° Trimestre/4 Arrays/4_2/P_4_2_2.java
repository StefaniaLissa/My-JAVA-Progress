import java.util.*;
import javax.swing.JOptionPane;

	public class P_4_2_2{
		
		public static void main (String [] args){
			String producto [] = new String []{"Agua","Refresco","Zumo"};
			int precio [] = {50,75,95};
			int monedas [] = {200,100,50,20,10,5};
			int cantMonedas [] = {20,20,20,20,20,20};
			int pagado = 0;
			int opcion, cambio, beneficio=0;
			boolean sinCambio=false;
			
			do{
				opcion=menu(producto,precio);
				
				if(opcion<=producto.length-1){
					sinCambio=importeExacto(monedas,cantMonedas);
					cambio=realizarPago(opcion,precio,monedas,cantMonedas);
					if(!sinCambio && cambio!=0) {
						devolverCambio(monedas,cantMonedas,cambio);
					}
					JOptionPane.showMessageDialog(null, "Aqui tiene su botella de "+producto[opcion]);
					
					if(sinCambio){
						beneficio+=pagado;
					}else{
						beneficio+=precio[opcion];
					}
				}
			}while(opcion<producto.length);

			System.out.println("\nLas monedas que hay son:");
			for(int i=0;i<=cantMonedas.length-1;i++){
				if(cantMonedas[i]>0){
					System.out.println(cantMonedas[i]+" monedas de "+monedas[i]);
				}
			}
			System.out.println("El beneficio total de hoy fue de "+beneficio/100+" euros");
		}
		
		//METODOS
		//MENU
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
		
		//SIN CAMBIO
		public static boolean importeExacto(int[] m, int[] c) {
			boolean exacto=false;
			int contMonedas=0;
			for(int i=0;i<c.length && exacto==false;i++) {
				if (c[i]==0){
					contMonedas++;
					if (m[i]==5) exacto=true; 
				}
			}	
			if (contMonedas>=2 || exacto==true) {
				exacto=true;
				JOptionPane.showMessageDialog(null, "INTRODUZCA IMPORTE EXACTO\n LA MÁQUINA NO DEVOLVERÁ CAMBIO");
			}
			return exacto;
		}
		
		//REALIZAR PAGO
		public static int realizarPago (int opcion, int [] precio, int []monedas , int [] cantMonedas){
			int cambio, pagado=0, pago, i=0;
			boolean encontrado=false;
			
			do{
				pago = (int)(100*Double.parseDouble(JOptionPane.showInputDialog("Ingrese "+((precio[opcion])-pagado)+" centimos")));
				pagado=pago;
				
				while (i<monedas.length && !encontrado) {
					if(pago==monedas[i]) {
						encontrado=true;
						cantMonedas[i]++;
					}
					i++;
				}
			}while(pagado<precio[opcion]);
		
			cambio=pagado-precio[opcion];
			return cambio;
		}
		
		//DEVOLVER CAMBIO
		public static void devolverCambio (int []monedas, int [] cantMonedas, int cambio){
			System.out.println("El cambio es de:"+cambio);
			
			do {
				for(int i=0;i<monedas.length && cambio>0 ;i++) {
					while(monedas[i]<=cambio && cantMonedas[i]>0) {
						if(cantMonedas[i]!=0) {
							cantMonedas[i]--;
							cambio-=monedas[i];
							System.out.println("Moneda devuelta:"+monedas[i]);
						}
					}				
				}				
			}while(cambio!=0);		
		}
	}