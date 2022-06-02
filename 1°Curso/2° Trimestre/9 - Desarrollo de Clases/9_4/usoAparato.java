package practica9_4;

public class usoAparato {

	public static void main(String[] args) {
		
		AparatoElectrico bombilla =new AparatoElectrico(150,false);
		AparatoElectrico plancha =new AparatoElectrico(2000,false);
		AparatoElectrico.setConsumoTotal(0);
		
		
		System.out.println("El consumo total de los aparatos es: "+AparatoElectrico.getConsumoTotal());
		
		bombilla.enciende();
		System.out.println("El consumo total de los aparatos es: "+bombilla.getConsumoTotal());
		
		plancha.enciende();
		System.out.println("El consumo total de los aparatos es: "+plancha.getConsumoTotal());
		
		bombilla.apaga();
		System.out.println("El consumo total de los aparatos es: "+bombilla.getConsumoTotal());
		
		System.out.println(bombilla.toString());
		System.out.println(plancha.toString());
	}

}
