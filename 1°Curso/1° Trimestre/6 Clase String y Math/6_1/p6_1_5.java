import java.util.Scanner;
public class p6_1_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String frase;
		int tamano;
		frase=sc.nextLine();
		tamano=frase.length();
		for(int i=0; i<tamano; i++){

		System.out.print(frase.charAt(i)+"-");}
	}
}
