package P11_2;

import java.util.Date;

public class testHerencia {

	public static void main(String[] args) {
		
		Date fechaCad = new Date (1,1,20);
		Date fechaEnv = new Date (1,1,1);
		
		//PRODUCTOS FRESCOS
		ProductosFrescos prodFresco1 = new ProductosFrescos(1, fechaCad, fechaEnv, "Pais");
		ProductosFrescos prodFresco2 = new ProductosFrescos();
		
		//PRODUCTOS REFIGERADOS
		ProductosRefrigerados prodRefri1 = new ProductosRefrigerados();
		ProductosRefrigerados prodRefri2 = new ProductosRefrigerados("OrgSupAli", 24);
		ProductosRefrigerados prodRefri3 = new ProductosRefrigerados(2, fechaCad, fechaEnv, "Pais3", "OrgSupAli", 30);
		
		//PRODUCTOS CONGELADOS POR AGUA
		CongeladoAgua prodCongAgua1 = new CongeladoAgua(10);
		CongeladoAgua prodCongAgua2 = new CongeladoAgua(4, fechaCad, fechaEnv, "Pais1", 34, 10);
		
		//PRODUCTOS CONGELADOS POR AIRE
		CongeladosAire prodCongAire1 = new CongeladosAire(10, 10, 10, 70);
		CongeladosAire prodCongAire2 = new CongeladosAire(5, fechaCad, fechaEnv, "Pais2", 34, 10, 10, 10, 70);

		System.out.println(prodFresco1.toString());
		System.out.println(prodFresco2.toString());
		System.out.println(prodRefri1.toString());
		System.out.println(prodRefri2.toString());
		System.out.println(prodRefri3.toString());
		System.out.println(prodCongAgua1.toString());
		System.out.println(prodCongAgua2.toString());
		System.out.println(prodCongAire1.toString());
		System.out.println(prodCongAire2.toString());
	}

}
