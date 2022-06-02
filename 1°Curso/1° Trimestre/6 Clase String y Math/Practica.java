import java.util.Scanner;

public class Practica{
	public static void main (String args[]){
	String n1, n2, n3;
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce el primer nombre ");
		n1 = sc.nextLine();
		
		System.out.print("Introduce el segundo nombre ");
		n2 = sc.nextLine();
		
		System.out.print("Introduce el tercer nombre ");
		n3 = sc.nextLine();
	
		if (n1.compareToIgnoreCase(n2)<0 && n1.compareToIgnoreCase(n3)<0){
			if (n2.compareToIgnoreCase(n3)<0){
				System.out.println(n1+", "+n2+", "+n3);
			}else{ 
			System.out.println(n1+", "+n3+", "+n2);}
			
		} else if (n2.compareToIgnoreCase(n1)<0 && n2.compareToIgnoreCase(n3)<0){
			if (n1.compareToIgnoreCase(n3)<0){
				System.out.println(n2+", "+n1+", "+n3);
			}else{ 
			System.out.println(n2+", "+n3+", "+n1);}
			
		} else if (n1.compareToIgnoreCase(n2)<0){
			System.out.println(n3+", "+n1+", "+n2);
			}else {
				System.out.println(n3+", "+n2+", "+n1);}
	}
}