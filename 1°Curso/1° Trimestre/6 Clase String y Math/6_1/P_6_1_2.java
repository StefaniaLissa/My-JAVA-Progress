import java.util.Scanner;

public class P_6_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String continuar;

        //Bucle de accion hasta terminar de pedir nombres
        do {
            //Pedir nombres
            System.out.println("Nombres:");
            nombre = sc.next();

            System.out.println(nombre.toUpperCase());

            //Continuar
            System.out.print("\n¿Desea continuar? ");
            System.out.println("S / N");
            continuar = sc.next();
        }while (continuar.equalsIgnoreCase("s"));
    }
}