package EjerciciosT10;

import java.util.*;

public class P10_1 {

	public static void main(String[] args) {
		
		int [] [] array = new int [pedirFilas()] [pedirColumnas()];
		
		cargarArray(array); mostrarArray(array);
		System.out.println("Array Ordenado: ");
		ordenarArray(array); mostrarArray(array);
	}
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int pedirFilas() {
		int filas=0;
		boolean error=true;
		
		while(error==true) {
			System.out.print("Numero de filas: ");
			try{
				error = false;
				filas=sc.nextInt();

			} catch(InputMismatchException a) {
	             	System.out.println("EL NUMERO INTRODUCIDO DEBE SER UN ENTERO");
		            System.out.println("Informacion getMessage ");
		            System.out.println(a.getMessage());           
		            System.out.println("Informacion toString ");
		            System.out.println(a.toString());
		            sc.next();
		            error=true;
	        }
			 catch(Exception ex){
		            System.out.println("SE HA PRODUCIDO UN ERROR");
		            System.out.println("Informacion getMessage");
		            System.out.println(ex.getMessage());           
		            System.out.println("Informacion toString ");
		            System.out.println(ex.toString());
		            sc.next();
		            error=true;
		     }
			if(filas<2 || filas>4) {
				sc.next();
	            error=true;
			}
		}
		return filas;
	}
	
	public static int pedirColumnas() {
		int columnas=0;
		boolean error=true;
		
		while(error==true) {
			System.out.print("Numero de columnas: ");
			try{
				error = false;
				columnas=sc.nextInt();
				
			} catch(InputMismatchException a) {
	             	System.out.println("EL NUMERO INTRODUCIDO DEBE SER UN ENTERO");
		            System.out.println("Informacion getMessage ");
		            System.out.println(a.getMessage());           
		            System.out.println("Informacion toString ");
			        System.out.println(a.toString());  
			        sc.next();
		            error=true;
	        }
			 catch(Exception ex){
		            System.out.println("SE HA PRODUCIDO UN ERROR");
		            System.out.println("Informacion getMessage");
		            System.out.println(ex.getMessage());           
		            System.out.println("Informacion toString ");
		            System.out.println(ex.toString());
		            sc.next();
		            error=true;
		     }
			if(columnas<2 || columnas>4) {
				sc.next();
	            error=true;
			}
		}
		return columnas;
	}
	
	public static void cargarArray(int array [] []) {
		int valor=0;
		boolean error=true;
		
		for (int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
            	
            	error=true;
            	while(error==true) {
        			System.out.print("Valor de fila "+i+" columna "+j+": ");
        			try{
        				error = false;
        				//array[i][j]=(int) (Math.random()*100)+1;
        				valor=sc.nextInt();
        				array[i][j]=valor;
        				
        			} catch(InputMismatchException a) {
        	             	System.out.println("EL NUMERO INTRODUCIDO DEBE SER UN ENTERO");
        		            System.out.println("Informacion getMessage ");
        		            System.out.println(a.getMessage());           
        		            System.out.println("Informacion toString ");
        			        System.out.println(a.toString());  
        			        sc.next();
        		            error=true;
        	        }
        			 catch(Exception ex){
        		            System.out.println("SE HA PRODUCIDO UN ERROR");
        		            System.out.println("Informacion getMessage");
        		            System.out.println(ex.getMessage());           
        		            System.out.println("Informacion toString ");
        		            System.out.println(ex.toString());
        		            sc.next();
        		            error=true;
        		     }
        		}
            }
        }
	}
	
	public static void mostrarArray(int array [] []) {
		for (int i=0;i<array.length;i++){
			 System.out.println();
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
        }
		System.out.println();
	}
	
	public static void ordenarArray(int array [] []) {
		for (int i=0;i<array.length;i++){
            Arrays.sort(array[i]);
        }
	}
}
