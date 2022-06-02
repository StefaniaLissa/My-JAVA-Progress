package P11_2;

import java.util.Date;

public class testHerencia {

	public static void main (String args[]) {
		
		Date fechaCad = new Date (1,1,20);
		Date fechaEnv = new Date (1,1,1);
		
		Productos vecProductos [] = new Productos [11];
		
		//PRODUCTOS FRESCOS
		vecProductos [0] = new ProductosFrescos(1, fechaCad, fechaEnv, "Pais");
		vecProductos [1] = new ProductosFrescos();
		
		//PRODUCTOS REFIGERADOS
		vecProductos [2] = new ProductosRefrigerados();
		vecProductos [3] = new ProductosRefrigerados("OrgSupAli", 24);
		vecProductos [4] = new ProductosRefrigerados(2, fechaCad, fechaEnv, "Pais3", "OrgSupAli", 30);
		
		//PRODUCTOS CONGELADOS POR AGUA
		vecProductos [5] = new CongeladoAgua(10);
		vecProductos [6] = new CongeladoAgua(4, fechaCad, fechaEnv, "Pais1", 34, 10);
		
		//PRODUCTOS CONGELADOS POR AIRE
		vecProductos [7] = new CongeladosAire(10, 10, 10, 70);
		vecProductos [8] = new CongeladosAire(5, fechaCad, fechaEnv, "Pais2", 34, 10, 10, 10, 70);

		//PRODUCTO CONGELADO
		vecProductos [9] = new ProductosCongelados(5, fechaCad, fechaEnv, "PaisOrigen", -2);
				
		//PRODUCTO CONGELADO POR NITROGENO
		vecProductos [10] = new CongeladosNitrogeno(6, fechaCad, fechaEnv, "PaisOrigen",-10, 120, "MetodoInfo");
		
		System.out.println("TO STRING");
		for (int i = 0; i < vecProductos.length; i++) {
			System.out.println(vecProductos[i].toString());
		}
		
		System.out.print("DESCRIPCIONES");
		for (Productos i: vecProductos){
			 if (i instanceof ProductosCongelados) {
				 ((ProductosCongelados) i).descripcion();
			 }
		}
		
		
		
	}

}
