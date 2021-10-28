import java.io.IOException;
import java.util.*;

public class Practica_3_5_2{
    public static void main(String args[]){
		char caracter;
		int codigo = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        caracter = scanner.next().charAt(0);

        codigo = (int)caracter;

		System.out.print("El caracter "+caracter+" es el codigo "+codigo+" y es ");

        if(codigo>=48 & codigo<=57){
			System.out.print("un numero");
        }else if(codigo>=65 & codigo<=90){
			System.out.print("una letra en mayuscula");
		}else if(codigo>=97 & codigo<=122){
			System.out.print("una letra en minuscula");
		}else{
			System.out.print("un signo");
		}

		}
	}
