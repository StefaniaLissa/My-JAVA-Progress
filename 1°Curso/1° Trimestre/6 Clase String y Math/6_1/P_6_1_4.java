import java.util.Scanner;

public class P_6_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tres palabras y te las ordeno según el diccionario:");
        String palabra1 = sc.next();
        String palabra2 = sc.next();
        String palabra3 = sc.next();

        System.out.println(palabra1.compareTo(palabra2));
        System.out.println(palabra1.compareTo(palabra3));
        System.out.println(palabra2.compareTo(palabra3));

        int comparacion1= palabra1.compareTo(palabra2);
        int comparacion2= palabra1.compareTo(palabra3);
        int comparacion3= palabra2.compareTo(palabra3);

        if (comparacion1<0 && comparacion2<0){
            if(comparacion3<0)System.out.println(palabra1+" "+palabra2+" "+palabra3);
			else System.out.println(palabra1+" "+palabra3+" "+palabra2);
        }else if(comparacion3<0 && comparacion1>0){
			if(comparacion2<0)System.out.println(palabra2+" "+palabra1+" "+palabra3);
			else System.out.println(palabra2+" "+palabra3+" "+palabra1);
        }else{
			if(comparacion1<0)System.out.println(palabra3+" "+palabra1+" "+palabra2);
			else System.out.println(palabra3+" "+palabra2+" "+palabra1);
        }
    }
}
