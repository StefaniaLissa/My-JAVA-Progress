public class deberes {
	public static void main (String[]args) {
		int [][] arraMagic = {{4,15,16,2},{10,8,7,13},{6,12,11,9},{17,3,4,14}};
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
		int newSum=0;
		//Se comprueba fila a fila
		for (int i=0;i<arraMagic.length;i++) {
			for (int h=0;h<arraMagic[i].length;h++) {
				newSum+=arraMagic[i][h];
			}
			if (newSum!=diaggSum) return false;
			newSum=0;
		}
		//Se comprueba la diagonal principal y la secundaria
		int newSum2=0;
		for (int i=0;i<arraMagic.length;i++) {
			for (int h=0;h<arraMagic[i].length;h++) {
				if (i==h) {newSum+=arraMagic[i][h];}
				if (i+h==arraMagic.length-1) {newSum2+=arraMagic[i][h];}
			}
		}
		if (newSum!=diaggSum || newSum2!=diaggSum) {return false;}
		newSum=0;
		//Se comprueba columna a columna
		for (int i=0;i<arraMagic.length;i++) {
			for (int h=0;h<arraMagic[0].length;h++) {
				newSum+=arraMagic[i][h];
			}
		if (newSum!=diaggSum) return false;
		newSum=0;
		}
	 return true;
	}
}