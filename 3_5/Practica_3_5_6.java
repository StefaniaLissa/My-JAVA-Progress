import java.util.*;

public class Practica_3_5_6{
    public static void main(String args[]){
        double aPagar, pagoCliente, cambio, cantidad;

        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        do{
            System.out.println("Cuanto de le cobró al cliente?");
            aPagar = sc.nextDouble();

            if(aPagar<1 || aPagar>50){System.out.println("El numero debe ser positivo pero no mayor a 50");
            }
        }while(aPagar<1 || aPagar>50);

        do{
            System.out.println("Con cuanto pagó el cliente?");
            pagoCliente = sc.nextDouble();
    
            if(pagoCliente<aPagar){System.out.println("El numero debe mayor que el precio a pagar");
            }
        }while(pagoCliente<aPagar);

        cambio = pagoCliente-aPagar;
        cantidad = cambio;

        System.out.println("Al cliente se le debe dar de cambio:");

        if(cambio>=50){
            cantidad=(int)(cambio/50);
            System.out.println(+cantidad+" billete/s de 50");
            cambio=cambio-(cantidad*50);
        }
        if(cambio>=20){
            cantidad=(int)(cambio/20);
            System.out.println(+cantidad+" billete/s de 20");
            cambio=cambio-(cantidad*20);
        }
        if(cambio>=10){
            cantidad=(int)(cambio/10);
            System.out.println(+cantidad+" billete/s de 10");
            cambio=cambio-(cantidad*10);
        }
        if(cambio>=5){
            cantidad=(int)(cambio/5);
            System.out.println(+cantidad+" billete/s de 5");
            cambio=cambio-(cantidad*5);
        }
        if(cambio>=2){
            cantidad=(int)(cambio/2);
            System.out.println(+cantidad+" moneda/s de 2");
            cambio=cambio-(cantidad*2);
        }
        if(cambio>=1){
            cantidad=(int)(cambio/1);
            System.out.println(+cantidad+" moneda/s de 1");
            cambio=cambio-(cantidad*1);
        }
        if(cambio>=0.50){
            cantidad=(int)(cambio/0.50);
            System.out.println(+cantidad+" moneda/s de 0.50");
            cambio=cambio-(cantidad*0.50);
        }
        if(cambio>=0.20){
            cantidad=(int)(cambio/0.20);
            System.out.println(+cantidad+" moneda/s de 0.20");
            cambio=cambio-(cantidad*0.20);
        }
        if(cambio>=0.10){
            cantidad=(int)(cambio/0.10);
            System.out.println(+cantidad+" moneda/s de 0.10");
            cambio=cambio-(cantidad*0.10);
        }
        if(cambio>=0.05){
            cantidad=(int)(cambio/0.05);
            System.out.println(+cantidad+" moneda/s de 0.05");
            cambio=cambio-(cantidad*0.05);
        }
        if(cambio>=0.02){
            cantidad=(int)(cambio/0.02);
            System.out.println(+cantidad+" moneda/s de 0.02");
            cambio=cambio-(cantidad*0.02);
        }
        if(cambio>=0.01){
            cantidad=(int)(cambio/0.01);
            System.out.println(+cantidad+" moneda/s de 0.01");
            cambio=cambio-(cantidad*0.01);
        }
    }
}