import java.util.*;

public class A_8_1_2_Buscar_Valor {
	
	public static void main (String [] args) {
		
		Scanner dato = new Scanner (System.in) ;
		
		int num ;
		
		int tamanio = 100 ;
		
		int izquierda , derecha , medio ;
		
		int [] TB_NUM = new int [tamanio] ;
		
		cargarVector (TB_NUM) ;
		
		System.out.println ("El vector cargado:") ;
		
		visualizarVector (TB_NUM) ;
		
		ordenarVector (TB_NUM) ;
		
		System.out.println ("\nEl vector ordenado:") ;
		
		visualizarVector (TB_NUM) ;
		
		System.out.println ("\nIntroduzca un valor para buscarlo en el vector") ;
		
		num = dato.nextInt () ;
		
		buscarValor (TB_NUM , num) ;
		
	}
	
	public static void cargarVector (int [] TB) {
		
		for (int i = 0 ; i < TB.length ; i++) {
			
			TB [i] = (int) (Math.random () * 200) ;
			
		}
		
	}
	
	public static void visualizarVector (int [] TB) {
		
		for (int i = 0 ; i < TB.length ; i++) {
			
			System.out.print (TB [i] + " ") ;
			
		}
		
	}
	
	public static void ordenarVector (int [] TB) {
		
		int cuentaintercambios = 0 ;
		
		for (boolean ordenado = false ; !ordenado ;) {	
			
			for (int i = 0 ; i < TB.length-1 ; i++) {
				
				if (TB [i] > TB [i+1]) {
						
					int aux = TB [i];
						
					TB [i] = TB [i+1];
						
					TB [i+1] = aux ;
						
					cuentaintercambios++ ;
						
				}
					
			}
			
			if (cuentaintercambios == 0) {
				
				ordenado = true ;
					
			}
		   
			cuentaintercambios = 0 ;
				
		}
		
	}
	
	public static void buscarValor (int [] TB , int num) {
		
		int izquierda , derecha , medio ;
		
		izquierda = 0 ;
		
		derecha = TB.length-1 ;
		
		boolean encontrado = false ;
		
		while (!encontrado && izquierda <= derecha) {
		
			encontrado = false ;
			
			medio = (izquierda + derecha) / 2 ;
			
			if (TB [medio] == num) {
			
				encontrado = true ;
				
				System.out.printf ("El valor %d se ha encontrado en la posicion %d" , num , medio + 1) ;
				
			} else if (TB [medio] > num) {
				
				derecha = medio - 1 ;
				
			} else {
				
				izquierda = medio + 1 ;
				
			}
			
		}
		
		if (!encontrado) {
			
			System.out.printf ("El valor %d no se ha encontrado en el vector" , num) ;

		}
		
	}
	
}