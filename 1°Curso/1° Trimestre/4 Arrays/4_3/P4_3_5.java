public class P4_3_5 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        for (int f = 0; f < matriz.length; f++) {

            for (int c = 0; c < matriz[0].length; c++){
                int aleatorio=(int)(Math.random()*(20+1)+0);
                matriz[f][c] = aleatorio;
            }
        }
        recorrerArray(matriz);
        sumaFilasColumnas(matriz);
    }

    public static void recorrerArray(int[][] mat){
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                System.out.print(mat[f][c] + "\t");
            }
            System.out.println();
        }
    }

    public static void sumaFilasColumnas(int[][]mat){
        for (int f = 0; f < mat.length; f++) {
            int sumaFilas=0;
            for (int c = 0; c < mat[0].length; c++) {
                sumaFilas = sumaFilas + mat[f][c];
            }
            System.out.println("Suma de fila "+f+": "+sumaFilas);
        }
        for (int c=0;c<mat[0].length;c++){
            int sumaColumnas=0;
            for (int f=0;f< mat.length;f++){
                sumaColumnas += mat[f][c];
            }
            System.out.println("Suma de columna "+c+": "+sumaColumnas);
        }
    }
}
