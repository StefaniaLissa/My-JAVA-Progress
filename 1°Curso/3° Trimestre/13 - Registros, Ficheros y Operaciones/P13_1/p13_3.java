package P13_1;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class p13_3 {
	//LECTURA ESCRITURA RAMDOM
	public static void main(String [] args) {

		int repeticiones [] = new int [50];
		
		for (int i = 0; i<200; i++){
			repeticiones[(int) (Math.random()*50)]++;
		}
		
		try(RandomAccessFile miFichero = new RandomAccessFile("D:\\Perfiles\\at3Dam1\\Desktop\\FicheroRamdom1.dat","rw");) {
		
			for (int i : repeticiones) {
				System.out.print(" "+i+" ");
			}
			
			System.out.println(" ");
			for (int i = 0; i<repeticiones.length; i++){
				miFichero.writeInt(repeticiones[i]);
			}
			
			visualizarFichero(miFichero);
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
		} catch (IOException e1) {
			System.out.println("ERROR ENTRADA/SALIDA");
		}

	}
	
	public static void visualizarFichero(RandomAccessFile f) throws IOException {
		try {
			f.seek(0);
			f.skipBytes(4);
			int cont = 0;
			while(true) {
				System.out.println("Num "+ cont + " : "+f.readInt());
				cont++;
			
			}
		}catch(EOFException e) {
			System.out.println("Fin fichero");
		}
	}
}
