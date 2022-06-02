package P13_1;

	import java.io.EOFException;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.RandomAccessFile;
	import java.util.ArrayList;
	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class P13_6 {
	    public static Scanner in = new Scanner(System.in); 
	    public static ArrayList <Venta> miLista = new ArrayList<>();
	    
		public static void main(String[] args) {
			try(RandomAccessFile fVentas = new RandomAccessFile("D:\\Perfiles\\at3Dam1\\Desktop\\VentasMayo.dat","rw")
				){
				registrarVentas(fVentas);
				visualizarFichero(fVentas);
				informeVentasMes(fVentas);
				pasoAArrayList(fVentas);
				generarFicheroErrores(fVentas);
				
			}catch(FileNotFoundException e) {
				System.out.println("El fichero no existe o no está en esa ubicación");	
			} catch (IOException e) {			
				System.out.println("ERROR DE E/S DE DATOS");
			}		
		}

		public static void generarFicheroErrores(RandomAccessFile fVentas){
			try(RandomAccessFile fErrores = new RandomAccessFile ("D:\\Perfiles\\at3Dam1\\Desktop\\Errores.dat","rw")){
				int cliente = fVentas.readInt();
				double importe = fVentas.readDouble();
				char formaPago = fVentas.readChar();
				
				while (true) {
					if(formaPago!='C' && formaPago!='M')
						fErrores.writeInt(cliente);
						fErrores.writeDouble(importe);
				}	
			}catch(FileNotFoundException e) {
				System.out.println("El fichero no existe o no está en esa ubicación");	
			} catch (IOException e) {			
				System.out.println("ERROR DE E/S DE DATOS");
			}
		}
			
		public static void pasoAArrayList(RandomAccessFile fVentas) throws IOException {
			fVentas.seek(0);
			try {
				while (true) {
					miLista.add( new Venta(fVentas.readInt(),fVentas.readDouble(),fVentas.readChar()));
				}
			} catch(EOFException e) {
				System.out.println("Fin de Fichero encontrado");
			}
		}
		
		public static void informeVentasMes(RandomAccessFile fVentas) throws IOException {
			fVentas.seek(0);
			int codigoCliente=0,codigoNuevo;
			double totalVentasMes=0,totalVentasCliente=0;
			double ventasTarjeta=0, ventasMetalico=0, ventasErroneo=0, importe=0;
			char formaPago;
			try {
				codigoCliente=fVentas.readInt();
				codigoNuevo=codigoCliente;
				while (true) {					
					//while(fVentas.getFilePointer()<fVentas.length())
					while(codigoNuevo==codigoCliente) {
						importe = fVentas.readDouble();
						totalVentasCliente+=importe;
						formaPago=fVentas.readChar();
						switch (formaPago) {
							case 'M':
								ventasMetalico+=importe;
								break;
							case 'C':
								ventasTarjeta+=importe;
								break;
							default: 
								ventasErroneo+=importe;							
						}
						codigoNuevo=fVentas.readInt();					
					}
					System.out.printf("Cliente: %S Ventas Totales: %.2f \n",codigoCliente,totalVentasCliente);
					totalVentasMes+=totalVentasCliente;
					totalVentasCliente=0;
					codigoCliente=codigoNuevo;			
				}
			} catch(EOFException e) {
				System.out.printf("Cliente: %S Ventas Totales: %.2f \n",codigoCliente,totalVentasCliente);
				totalVentasMes+=totalVentasCliente;
				System.out.printf("Ventas Totales Mes: %.2f \n",totalVentasMes);
				System.out.printf("Total ventas tarjeta: %.2f \n Total ventas metálico: %.2f \n Total ventas pago erroneo: %.2f \n"
						,ventasTarjeta,ventasMetalico,ventasErroneo);
			}
			
		}
		public static void registrarVentas(RandomAccessFile fVentas) throws IOException  {
			int numCliente;
			double importeVenta;
			char formaPago;
			//fVentas.seek(fVentas.length());
			try {
				System.out.print("Introduzca código de cliente:");
				numCliente=in.nextInt();
				in.nextLine();
				while(numCliente !=0) {
					System.out.print("Introduzca importe venta:");
					importeVenta=in.nextDouble();
					in.nextLine();
					System.out.print("Introduzca forma de pago:");
					formaPago=in.next().charAt(0);
					System.out.println("Posic. Puntero al principo del registro:"+fVentas.getFilePointer());
					fVentas.writeInt(numCliente);
					fVentas.writeDouble(importeVenta);
					fVentas.writeChar(formaPago);
					System.out.print("Introduzca código de cliente:");
					numCliente=in.nextInt();
				}
			} catch(InputMismatchException e) {
				System.out.println("El dato introducido no tiene el formato correcto");
				
			}
			
		}
		
		public static void visualizarFichero(RandomAccessFile fVentas) throws IOException {
			fVentas.seek(0);
			try {
				while (true) {
					//System.out.print("puntero:"+fVentas.getFilePointer());
					System.out.printf(" %d %.2f %S \n",fVentas.readInt(),fVentas.readDouble(),fVentas.readChar()    );
				}
			} catch(EOFException e) {
				System.out.println("Fin de Fichero encontrado");
			}
			
		}


	}

