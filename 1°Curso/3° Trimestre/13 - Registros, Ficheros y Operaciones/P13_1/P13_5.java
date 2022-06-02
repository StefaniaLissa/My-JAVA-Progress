package P13_1;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class P13_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String escritura;
		//FICHERO AUTOR
		try(RandomAccessFile autor = new RandomAccessFile ("D:\\Autor.dat","rw")){
			//CODIGO_AUTOR ; NOMBRE ; APELLIDO ; NACIONALIDAD
			autor.seek(0);
	
			for (int i = 3; i>=1 ; i--) {
				autor.writeInt(i);
				
				escritura = ";\"NOMBRE\";";
				autor.writeUTF(longitud(escritura, 15));
				
				escritura = "\"APELLIDO\";";
				autor.writeUTF(longitud(escritura, 20));
				
				escritura = "\"NACIONALIDAD\";";
				autor.writeUTF(longitud(escritura, 15));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado en la ubicacion");
		}catch(EOFException e) {
			System.out.println("Fin fichero");
		}
		
		//FICHERO LIBRO
		try(RandomAccessFile libro = new RandomAccessFile ("D:\\Libro.dat","rw")){
			//NUMERO_REGISTRO ; TITULO ; EDITORIAL ; PRECIO ; EXISTENCIAS ; COD_AUTOR
			libro.seek(0);

			for (int i = 30; i>=10 ; i--) {
				libro.writeInt(i);
				
				escritura = ";\"TITULO\";";
				libro.writeUTF(longitud(escritura, 30));
				
				escritura = "\"EDITORIAL\";";
				libro.writeUTF(longitud(escritura, 25));
				
				libro.writeInt(i);
				libro.writeUTF(";");
				libro.writeInt(i*10);
				libro.writeUTF(";");
				libro.writeInt(i/10);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado en la ubicacion");
		}catch(EOFException e) {
			System.out.println("Fin fichero");
		}

		//PASAR AUTOR.TXT A UN FICHERO SEGUN COD AUTOR
		try(RandomAccessFile Nuevo = new RandomAccessFile ("D:\\Autor_ORDENADO.dat","rw")){
			Nuevo.seek(0);
			for (int i=0; i<3; i++) {
				while(true) {
					if(Nuevo.readInt()==i) {
						Nuevo.seek(-4);
						Nuevo.writeInt(Nuevo.readInt());
						Nuevo.writeUTF(Nuevo.readUTF());
						Nuevo.writeUTF(Nuevo.readUTF());
						Nuevo.writeUTF(Nuevo.readUTF());
					}else {
						Nuevo.skipBytes(50);
					}
				}	
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado en la ubicacion");
		}catch(EOFException e) {
			System.out.println("Fin fichero");
		}
	}
	
	public static String longitud (String s, int n) {
		if (s.length()>n) {
			s=s.substring(0,n);
		}else {
			s = String.format("%"+n+"S", s);
		}
		return s;
	}

}
