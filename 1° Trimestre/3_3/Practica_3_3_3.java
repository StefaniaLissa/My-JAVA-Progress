import java.util.Scanner;
 
 public class Practica_3_3_3{

public static void main(String args[]) {
 
        Scanner sn = new Scanner(System.in);
 
		System.out.println("Introduce un anio");
        int anio = sn.nextInt();
         
        if (anio>1){
            System.out.println("El anio es correcto");
		}
         else {
            
			System.out.println("El anio es incorrecto");
        }
 
		System.out.println("Introduce un mes");
        int mes = sn.nextInt();
         
        if (mes>1 && mes<12){
            System.out.println("El mes es correcto");
		}
         else {
            
			System.out.println("El mes es incorrecto");
        }
 
        System.out.println("Introduce un día");
        int dia = sn.nextInt();
		
        if ((dia>1 && dia<31) && (((mes % 2==0 || mes==8) && (dia <= 31) ) || (mes % 2==1 && dia<=30))){


		 if ((((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) && mes==2 && dia<=29)){
			   System.out.println("Es año bisiesto");
               System.out.println("La fecha es correcta");
		   }

           else {
            System.out.println("La fecha es incorrecta");
             }
		}
        else {
            System.out.println("La fecha es incorrecta");
        }
 
 
    }
 
}