import java.util.*;

public class Practica_3_6_2{
    public static void main(String args[]){
        int n, termino, razon;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el termino");
        n = sc.nextInt();

        System.out.println("Introduce el primer termino");
        termino = sc.nextInt();

        System.out.println("Introduce la razon");
        razon = sc.nextInt();

        int acumulador = termino;

        while (n>=1){
            termino = termino * razon;
            acumulador = acumulado + termino;
            n = n -1;
        }
        System.out.println(acumulador);
    }
}
