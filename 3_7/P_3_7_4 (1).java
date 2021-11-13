import java.util.Scanner;

public class P_3_7_4{
	public static void main (String args[]){
		double hora, horaE, trabajo;
		
		Scanner sc = new Scanner (System.in);
		
		do{
			System.out.print("Introducir las horas trabajadas semanales");
			trabajo=sc.nextDouble();
			
			System.out.print("Introducir la razón de euros por hora");
			hora=sc.nextDouble();
			
			 if(trabajo<=40)
				 System.out.println("Al trabajador se le paga "+trabajo*hora+" euros semanales");
			 else{
				 horaE=hora+(hora*0.50);
				 System.out.println("Al trabajador se le paga "+((hora*40)+(horaE*(trabajo-40)))+" euros semanales");
			 }
		 }while(trabajo>1);
	}
}