package P12_2;

import  java.util.*;

public class usoEmpleado {
	
	static Scanner  sc =  new Scanner(System . in);
	
	//1)
	public static ArrayList < Empleado > listaEmpleados =  new ArrayList<>(5);

	public static void main(String[] args) {
		
		//2)
		listaEmpleados.add(new  Empleado ("Empleado1", "111", 1000.0));
		listaEmpleados.add(new  Consultor ("Consultor1", "222", 900.0, 5.0, 20));
		listaEmpleados.add(new  Comercial ("Comercial1", "333", 900.0, 100.0));
		listaEmpleados.add(new  Empleado ("Empleado2", "444", 1000.0));
		
		visualiza();
		
		//3)
		int posicion;
		System.out.print("Posicion (0-4) de elemento a eliminar: ");
		posicion=sc.nextInt(); //TRY CATCH
		
		if (posicion<0  || posicion >= listaEmpleados.size()) {
			System.out.println( " Posicion erronea " );
		} else {
			System.out.println("Eliminando "+  listaEmpleados.get(posicion));
			listaEmpleados.remove(posicion);
		}
		
		visualiza();
		
		//4)
		String buscar;
		System.out.print("nSS de empleado a comprobar: ");
		buscar = sc.next();
		boolean encontrado = false;

		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i).getnSS().equals(buscar)) {
				System.out.println("Empleado encontrado en la posicion " + i);
				encontrado = true;
			}
		}

		if (!encontrado)
			System.out.println("Empleado no encontrado");

		visualiza();
		
		//5)
		System.out.print("Nombre de empleado a eliminar: ");
		buscar = sc.next();
		encontrado = false;

		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i).getNombre().equals(buscar)) {
				System.out.println("Empleado eliminado "+listaEmpleados.get(i).toString());
				listaEmpleados.remove(i);
				encontrado = true;
			}
		}

		if (!encontrado)
			System.out.println("Empleado no encontrado");
		
		visualiza();
		
		//6)
		//listaEmpleados.set(3, null);
		listaEmpleados.set(3, new  Empleado ("Empleado3", "555", 1000.0));
		
		visualiza();
		
		//7)
		Iterator <Empleado> miIterator = listaEmpleados.iterator();
		
		while(miIterator.hasNext()){
			Empleado elemento = miIterator.next();
			System.out.println(elemento.toString());
		}
		
		visualiza();
		
		//8)
		Object[] EmpleadosArray = listaEmpleados.toArray();

		for( Object e : EmpleadosArray) {
		    System.out.println(e.toString());
		}
		
		//9)
		class comparaNombres implements Comparator<Empleado>{
		    public int compare (Empleado uno, Empleado dos){
		        return uno.getNombre().compareTo(dos.getNombre());
		    }
		}
		
		Collections.sort(listaEmpleados, new comparaNombres());
		
		visualiza();

	}
	
	public static void visualiza() {
		System.out.println();
		for( Empleado e : listaEmpleados){
			System.out.println(e);
		}
		System.out.println();
	}

}
