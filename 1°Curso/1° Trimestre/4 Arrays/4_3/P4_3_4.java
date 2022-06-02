import java.util.Scanner;

public class P4_3_4 {
    public static void main(String[] args) {
        //Declaro variables
        int mat[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Rellenar matriz de 4x4 solo con 1 y 0:");
        //Recorrer array por filas y rellenarlo
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                System.out.println("Valor de fila " + f + " y columna " + c + ":");
                mat[f][c] = sc.nextInt();
                while (mat[f][c] != 1 && mat[f][c] != 0) {
                    System.out.println("Tiene que ser 1 o 0, pruebe otra vez:");
                    mat[f][c] = sc.nextInt();
                }
            }
        }
        recorrerArray(mat);
		if(siIdentidad(mat)) System.out.println("Es identidad");
		else System.out.println("No es identidad");
    }

    public static void recorrerArray(int[][] mat){
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                System.out.print(mat[f][c] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean siIdentidad(int[][] vector) {
        for (int i=0;i<vector.length;i++) {
            for (int j=0;j<vector[0].length;j++){
                if(i==j){
                    if(vector[i][j]!=1){
                        return false;
                    }
                }
                if(i!=j){
                    if(vector[i][j]!=0){
                        return false;
                    }
                }
            }
        }
		return true;
    }
}
