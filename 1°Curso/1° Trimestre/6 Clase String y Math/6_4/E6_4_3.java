import java.util.Scanner;
public class E6_4_3 {
public static void main (String[]arg){
	char letra;
	Scanner dato=new Scanner(System.in);
	System.out.println("Dime un caracter");
	letra=dato.next().charAt(0);
	if (Character.isUpperCase(letra)){
		if((letra=='A'|| letra=='E'|| letra=='I'|| letra== 'O'|| letra=='U'))
			System.out.println ("EL CARACTER ES UNA VOCAL MAYUSCULA");
		else
			System.out.println ("El caracter es una consonante en Mayúscula");
	}else 	
		if (Character.isLowerCase(letra)){
			if((letra=='a'|| letra=='e'|| letra=='i'|| letra== 'o'|| letra=='u'))
				System.out.println ("EL CARACTER ES UNA VOCAL MINÚSCULA");
		}else
				System.out.println ("El caracter es una consonante en Minúscula");
	
		
	}
}