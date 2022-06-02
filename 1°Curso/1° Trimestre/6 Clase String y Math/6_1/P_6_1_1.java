import java.util.Scanner;

public class P_6_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String nombreLargo = "";
        String nombreCorto = "";
        String continuar;
        
        int masLargo = 0;
        int masCorto=0;
		
		System.out.println("Escribe nombres y te dire cual es el mas largo y el mas corto:");
        nombre = sc.next();
		nombreCorto=nombre;
		nombreLargo=nombre;

        //Bucle de accion hasta terminar de pedir nombres
        do {
            //Pedir nombres
            System.out.println("Escribe nombres y te dire cual es el mas largo y el mas corto:");
            nombre = sc.next();
           
            if (nombre.length()>nombreLargo.length()){
                nombreLargo=nombre;
            }else if(nombre.length()<nombreCorto.length()){
                nombreCorto=nombre;
            }

            //Continuar
            System.out.print("\n¿Desea continuar? ");
            System.out.println("S / N");
            continuar = sc.next();
        }while (continuar.equalsIgnoreCase("s"));

        //Resultados de los nombres
        System.out.println("El nombre mas largo es "+nombreLargo+" con "+nombreLargo.length()+" caracteres");
        System.out.println("El nombre mas corto es "+nombreCorto+" con "+nombreCorto.length()+" caracteres");

    }
}