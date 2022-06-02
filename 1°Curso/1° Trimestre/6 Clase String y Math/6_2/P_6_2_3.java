import java.util.*;

public class P_6_2_3{

    public static void main (String args[]){
        String nombre = new String();
        String apell = new String();
        String apell2 = new String();
        String nombreCompleto = new String();

        Scanner sc = new Scanner (System.in);

        System.out.print(" Ingrese el nombre: ");
        nombre = sc.nextLine();

        System.out.print(" Ingrese el primer apellido: ");
        apell = sc.nextLine();
		apell = " "+apell;

        System.out.print(" Ingrese el segundo apellido: ");
        apell2 = sc.nextLine();
		apell2 = " "+apell2;

        nombreCompleto = nombreCompleto.concat(nombre).concat(apell).concat(apell2);

        System.out.println(nombreCompleto);
    }
}