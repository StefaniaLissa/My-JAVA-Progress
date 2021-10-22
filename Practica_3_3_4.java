import java.util.Scanner;

public class Practica_3_3_4{

    public static void main(String args[]) {
        int CantAlum, CostoViaje, autobus, CostePorAlum, CostoViajeTotal;

        CostoViaje=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos alumnos son?");
        CantAlum = sc.nextInt();

        if(CantAlum<30){
            System.out.println("No se puede realizar el viaje por ser menores de 30 alumnos");
        }
        else if (CantAlum<49){
            CostoViaje=95;
        }
        else if (CantAlum<99){
            CostoViaje=70;
        }
        else if (CantAlum>100){
            CostoViaje=65;
        }

         CostoViajeTotal = CantAlum * CostoViaje;

        System.out.println("A la agencia hay que pagarle "+ CostoViajeTotal);

        if (CantAlum<=60){
            autobus=4000;
        }
        else{
            autobus=8000;
        }

        System.out.println("De autobus serían "+ autobus);

        CostePorAlum = ((CostoViajeTotal+autobus)/CantAlum);

        System.out.println("Cada alumno tiene que pagar "+ CostePorAlum);
    }
}