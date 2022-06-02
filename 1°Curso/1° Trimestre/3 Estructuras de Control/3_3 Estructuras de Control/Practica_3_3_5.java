import java.util.*;

public class Practica_3_3_5{

    public static void main(String args[]) {
        double hora, duracion, min5, min8, min10, minResto;
		double coste;
		
		coste=0;
        String dia;
        min5=1;
        min8=0.80;
        min10=0.70;
        minResto=0.50;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir la duracion de la llamada en minutos.");
        duracion = sc.nextDouble();

        if (duracion<=5){
            coste=min5;
        }
        else if (duracion>5 && duracion<=8){
            coste=min5+min8;
        }
        else if (duracion>8 && duracion<=10){
            coste=min5+min8+min10;
        }
        else if (duracion>10){
            coste = min5+min8+min10+(minResto*(duracion-10));
        }
		
		sc.nextLine();
        System.out.println("Ingrese el dia de la semana.");
        dia = sc.nextLine();

        if (dia.equalsIgnoreCase("DOMINGO")){
            coste=(coste+(coste*0.3));
            System.out.println("Tarifa extra de 3% por llamar el domingo.");
        }else{
		
			do {
			System.out.println("Hora de la llamada");
			hora = sc.nextDouble();
			 if (hora<0 || hora>23) System.out.println("Debe ingresar una hora entre 00 y las 24 hrs.");
			} while (hora<0 || hora>23);
			
			if (hora<14){
				coste=(coste+(coste*0.15));
				System.out.println("Tarifa extra de 15% por llamar en la mañana.");
			}
			else{ coste=(coste+(coste*0.10));
			System.out.println("Tarifa extra de 10% por llamar en la tarde.");
			}
		}
		System.out.println("El coste de la llamada ha sido de "+coste+" euros");
    }
}
