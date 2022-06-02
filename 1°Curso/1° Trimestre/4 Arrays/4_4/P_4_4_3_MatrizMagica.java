public class P_4_4_3_MatrizMagica {
	public static void main (String[]args) {
		int [][] arraMagic = {{5,15,16,2},{10,8,7,13},{6,12,11,9},{17,3,4,14}};
		int diaggSum=impriMagic(arraMagic);
		if (esMagic(arraMagic,diaggSum)) System.out.println("Es mágica");
			else System.out.println("No es mágica"); 
	}
	
	
	public static int impriMagic (int arraMagic [][]) {
		int diagSum=0;
		for (int i=0;i<arraMagic.length;i++) {
			for (int h=0;h<arraMagic[i].length;h++) {
				if (i==h) {diagSum+=arraMagic[i][h];};
				
				System.out.printf("%3d ",arraMagic[i][h]);
			 		
			}
			System.out.println();
		}
		return diagSum;
	}
	
	
	public static boolean esMagic (int arraMagic[][],int diaggSum) {
		int sumaFila=0,sumaColumna=0,sumaDiag2=0;
	
		//Se calcula suma de datos de cada fila, cada columna y diagonal secundaria
		for (int i=0;i<arraMagic.length;i++) {
			sumaFila=0;
			sumaColumna=0;
			sumaDiag2+=arraMagic[i][arraMagic.length-1-i];
			for (int h=0;h<arraMagic[i].length;h++) {
				sumaFila+=arraMagic[i][h];
				sumaColumna+=arraMagic[h][i];				
			}
			System.out.printf("Suma de la fila %2d : %4d\tSuma de la columna %2d : %4d\n",i,sumaFila,i,sumaColumna);
			if (sumaFila!=diaggSum || sumaColumna!=diaggSum ) return false;
		}
		System.out.printf("Suma de la diagonal principal : %4d\n",diaggSum);
		System.out.printf("Suma de la diagonal secundaria: %4d\n",sumaDiag2);
		if (sumaDiag2!=diaggSum) return false;
		else return true;
	}
}