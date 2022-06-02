import java.util.*;

public class P_6_3_1{
    public static void main(String args[]){
        int enteros = 0;
        int convertidos = 0;
        int introducido = -1;

        Scanner sc = new Scanner (System.in);

        do{
            System.out.print(" Ingrese un numero: ");
                introducido++;
                enteros = sc.nextInt();

                if (enteros<0){
                enteros = Math.abs(enteros);
                convertidos++;}
        }while(enteros!=0);

        System.out.println("Se han introducido "+introducido+" de los cuales "+convertidos+" fueron convertidos a positivos");
    }
}