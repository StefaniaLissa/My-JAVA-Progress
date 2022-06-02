import java.util.*;

public class A_8_1_1_Ordernar_Intercalar {
	
	public static void main (String [] args) {
		
		Scanner dato = new Scanner (System.in) ;
		
		int num ;
		int tamanio = 100 ;
		int [] TB_NUM = new int [tamanio] ;
		
		cargarVector (TB_NUM) ;
		
		System.out.println ("El vector cargado:") ;
		visualizarVector (TB_NUM) ;
		
		ordenarVector (TB_NUM) ;
		
		System.out.println ("\nEl vector ordenado:") ;
		visualizarVector (TB_NUM) ;
		
		System.out.println ("\nIntroduzca un valor para sustituirlo en el vector") ;
		num = dato.nextInt () ;
		
		reemplazarValor (TB_NUM , num) ;
		
		System.out.println ("El vector con el nuevo valor:") ;
		visualizarVector (TB_NUM) ;
		
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
		int cuentaintercambios = 0 , pasada = 0 ;
		boolean ordenado = false ; 		
		
		while (!ordenado) {	
			pasada++ ;	
			for (int i = 0 ; i < TB.length-pasada ; i++) {	
				if (TB [i] > TB [i+1]) {	
					int aux = TB [i];	
					TB [i] = TB [i+1];		
					TB [i+1] = aux ;		
					cuentaintercambios++;			
				}		
			}
			
			if (cuentaintercambios == 0) {	
				ordenado=true;		
			}
				cuentaintercambios = 0;
		}
		
	}
	
	public static void reemplazarValor (int [] TB , int num) {
		boolean encontrado = false ;
		int i ;

		for (i = 0 ; i < TB.length && !encontrado ; i++) {	
			if (num == TB [i]) {
				encontrado = true ;
			} else if (num < TB [i]) {
				encontrado = true ;
				TB [i] = num ;
			}
		}
		
		if (i == TB.length) TB [i-1] = num ;
	}
	
}