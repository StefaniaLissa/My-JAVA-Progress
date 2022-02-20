import java.util.Arrays;

public class P_8_1_4 {
	public static void main(String[] args) {
		
		int[] vector = new int[200];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*49+1);			
		}
		System.out.println("VECTOR GENERADO ALEATORIAMENTE");
		System.out.println(Arrays.toString(vector)+"\n");
		
		//Declaración y preparación de la tabla de conteo de repeticiones
		int [][] tablaRepeticiones = new int[2][49];
		for (int i = 0; i < tablaRepeticiones[0].length; i++) {
			tablaRepeticiones[0][i]=i+1;			
		}
		
		//Contar repeticiones de elementos de vector
		int contenido=0;
		for (int i = 0; i < vector.length; i++) {
			contenido=vector[i];
			tablaRepeticiones[1][contenido-1]++;
			//tablaRepeticiones[1][vector[i]-1]++;
			
		}
		System.out.println("Tabla de repeticiones antes de ordenar");
		for (int i = 0; i < tablaRepeticiones.length; i++) {
			for (int j = 0; j < tablaRepeticiones[i].length; j++) {
				System.out.printf("%2d - ",tablaRepeticiones[i][j]);
			}
			System.out.println();
		}
		
		/*
		 * System.out.println(Arrays.toString(tablaRepeticiones[0]));
		 * System.out.println(Arrays.toString(tablaRepeticiones[1]));
		 */
		
		//Ordenar tablaRepeticiones
		int aux,cont=0;
		
		boolean ordenado=false;
				
		for (int p = 0; p < tablaRepeticiones[0].length && !ordenado; p++) {
			ordenado=true;
			for (int i = 0; i < tablaRepeticiones[0].length-1-p; i++) {
				cont++;				
				if(tablaRepeticiones[1][i]<tablaRepeticiones[1][i+1]) {
					ordenado=false;
					aux=tablaRepeticiones[1][i];
					tablaRepeticiones[1][i]=tablaRepeticiones[1][i+1];
					tablaRepeticiones[1][i+1]=aux;	
					aux=tablaRepeticiones[0][i];
					tablaRepeticiones[0][i]=tablaRepeticiones[0][i+1];
					tablaRepeticiones[0][i+1]=aux;				
				}				
			}			
		}
		
		System.out.println("Tabla de repeticiones después de ordenar");
		for (int i = 0; i < tablaRepeticiones.length; i++) {
			for (int j = 0; j < tablaRepeticiones[i].length; j++) {
				System.out.printf("%2d - ",tablaRepeticiones[i][j]);
			}
			System.out.println();
		}
		
		//Mostrar lo 5 valores más repetidos
		System.out.println("Los 5 valores más repetidos son : ");
		for(int i=0;i<5;i++) {
			System.out.printf("[ %2d ]",tablaRepeticiones[0][i]);
		}
		
		
	}
}
