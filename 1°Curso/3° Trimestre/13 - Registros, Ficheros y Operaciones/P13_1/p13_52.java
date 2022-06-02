package P13_1;

import java.io.*;

public class p13_52 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try (FileReader ficheroAutor = new FileReader ("D:\\Autor.dat");
			RandomAccessFile rAutor = new RandomAccessFile ("D:\\RAutor.txt","rw");){
			//COPIAR LOS DATOS DEL FICHERO DE TEXTO al Aleatorio
			copiarDatos(ficheroAutor, rAutor);
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e1) {
			System.out.println("Error E/S");
		}

	}
	
	public static void copiarDatos(FileReader fA, RandomAccessFile rA) throws IOException {
		
		try(BufferedReader miBuffer = new BufferedReader(fA)){
			String autor,nombre,apellidos,nacionalidad;
			int codigo;
			
			autor=miBuffer.readLine();
			while(autor!=null) {
				String lectura [] = autor.split(";");
				
				codigo=Integer.parseInt(lectura[0]);
				nombre=ajustar(lectura[1], 15);
				apellidos=ajustar(lectura[2], 20);
				nacionalidad=ajustar(lectura[3], 15);

				rA.seek((codigo-1)*60);
				rA.writeInt(codigo);
				rA.writeUTF(nombre);
				rA.writeUTF(apellidos);
				rA.writeUTF(nacionalidad);
				
				autor=miBuffer.readLine();
			}
		}
	}
	
	public static String ajustar (String s, int n) {
		if (s.length()>=n) {
			s=s.substring(0,n);
		}else {
			s = String.format("%-"+n+"S", s);
		}
		return s;
	}

}