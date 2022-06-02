package EJEMPLOS;

import java.io.*;
import java.util.*;

public class Ejemplo7_RandomReservaHotel {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		try(RandomAccessFile ficheroReservas = new RandomAccessFile ("D:\\Perfiles\\at3Dam1\\Desktop\\FicheroReservas1.dat","rw")){	
			int opc = 0;

			do {
				System.out.println("\n1 - RESERVAR\n2 - LISTAR RESERVAS \n3 - CONSULTAR CLIENTE \n4 - INFORME MENSUAL");
				System.out.print("Que quiere hacer? ");
				opc = sc.nextInt();
				sc.nextLine();
				
				switch (opc) {
				case 1:
					registrarReserva(ficheroReservas);
					break;
				case 2:
					listarReservas(ficheroReservas);
					break;
				case 3:
					consultaCliente(ficheroReservas);
					break;
				case 4:
					informeMensual(ficheroReservas);
					break;
				}
			} while (opc<5);

	
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado en la ubicacion");
		} catch (IOException e) {
			System.out.println("Error de acceso a fichero");
		}		
	}
	
	public static void registrarReserva(RandomAccessFile f) throws IOException {
		try {
			f.seek(f.length());
			System.out.println("Nombre del cliente: ");
			f.writeUTF(sc.nextLine());
			System.out.println("Fecha de entrada: ");
			f.writeUTF(sc.nextLine());
			System.out.println("Nº de noches: ");
			f.writeInt(sc.nextInt());
			System.out.println("Precio/noche: ");
			f.writeDouble(sc.nextDouble());
			sc.nextLine();
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado en la ubicacion");
		} catch (IOException e) {
			System.out.println("Error de acceso a fichero");
		}
	}
	
	public static void listarReservas(RandomAccessFile f) throws IOException {
		try {
			f.seek(0);
			int cont=1;
			while(true) {
				System.out.println("\nReserva Nº"+cont);
				System.out.println("Posicion del puntero "+f.getFilePointer()+" Nombre del cliente: " +f.readUTF());
				System.out.println("Posicion del puntero "+f.getFilePointer()+" Fecha de entrada: " +f.readUTF());
				System.out.println("Posicion del puntero "+f.getFilePointer()+" Num de noches: " +f.readInt());
				System.out.println("Posicion del puntero "+f.getFilePointer()+" Precio noche: " +f.readDouble());
				System.out.println("");
				cont++;
			}				
			
		}catch(EOFException e) {
			System.out.println("Fin fichero");
		}
	}
	
	public static void consultaCliente(RandomAccessFile f) throws IOException {
		System.out.println("Nombre del cliente que busca: ");
		String busqueda = sc.nextLine();
		try {
			f.seek(0);
			
			while(true) {
				String encontrado = f.readUTF();
				if(encontrado.equalsIgnoreCase(busqueda)) {
					System.out.println(" Fecha de entrada: " +f.readUTF());
					System.out.println(" Num de noches: " +f.readInt());
					System.out.println(" Precio noche: " +f.readDouble());
					System.out.println("");
				}
				f.readUTF();
				f.readInt();
				f.readDouble();
			}				
			
		}catch(EOFException e) {
			System.out.println("Fin fichero");
		}
	}
	
	public static void informeMensual(RandomAccessFile f) throws IOException {
		double ventas=0;
		
		System.out.println("Mes del informe: ");
		String busqueda = sc.next();
		//busqueda = String.format("%02S", busqueda);
		try {
			f.seek(0);
			while(true) {
				f.readUTF();
				String encontrado = f.readUTF();
				encontrado = encontrado.substring(3,5);
				
				if(encontrado.equals(busqueda)) {
					ventas = ventas + f.readInt()*f.readDouble();
				}else {
					f.skipBytes(12);
				}
				
				System.out.println(ventas);
			}				

			
		}catch(EOFException e) {
			System.out.println("Fin fichero");
		}
	}
}
