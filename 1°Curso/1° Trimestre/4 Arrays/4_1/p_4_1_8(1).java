import java.util.Arrays;
import java.util.Scanner;

public class p_4_1_8 {

	public static void main(String[] args) {
		int tbnum []= new int [100];
		int desplz=0;
		Scanner sc= new Scanner (System.in);
		//pedir datos
		do {
			System.out.println("Dime la posición del elemento que quieres eliminar");
			desplz = sc.nextInt();
		}while (desplz<1 || desplz>100);
		
		System.out.println("Estos son los numeros : ");
		//primer bucle para darle valor a la matriz
		for (int i = 0; i < tbnum.length; i++) {
			tbnum[i]=(int)(Math.random()*1001);
			System.out.print(tbnum[i]+"  ");
		}
		System.out.println("");
		//cambiar el valor de la matriz
		for (int i = desplz-1; i < tbnum.length-1; i++) {
				tbnum[i]=tbnum[i+1];
				
		}
		tbnum[tbnum.length-1]=0;
		System.out.println("Aqui los numeros con el cambio :");
		for (int i = 0; i < tbnum.length; i++) {
			System.out.print(tbnum[i]+"  ");
		}
	}
}


