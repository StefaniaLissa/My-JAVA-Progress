import java.util.*;

public class Practica_3_4_2{

    public static void main(String args[]) {
        double radio = 0;
        double area = (Math.PI*radio*radio);
        double longitud;
        double volumen;
        String respuesta;
        Scanner sc = new Scanner(System.in);
      
        do{
            System.out.println("Introducir el radio en cm");
            radio = sc.nextDouble();

            area = Math.PI*radio*radio;
            longitud = 2*Math.PI*radio;
            volumen = (Math.PI)*radio*radio;

            System.out.println("El area del circulo es "+area+" cm2");
            System.out.println("El longitud de la circunferencia es "+longitud+" cm2");
            System.out.println("El volumen de la esfera es "+volumen+" cm3");
            System.out.println("Desea continuar con otro caso? (S/N)");

            sc.nextLine();
            respuesta = sc.nextLine();
        }while(respuesta.toUpperCase().equals("S"));

        System.out.println("Programa finalizado");
    }
}