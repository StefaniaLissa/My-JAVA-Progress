import java.util.*;

public class Practica_3_6_4{
    public static void main(String args[]){
        int num, pares, impares, multp3;
        int sumapares, sumaimpares, sumamultp3;
        int i=1;

        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Introduce cantidad de numeros a sumar");
        num = sc.nextInt();
        }while(num<=0);

        while(pares<num || impares<num || multp3<3){
            if(i%2==0 && pares<num){
                pares++;
                sumapares+=i;
            }
            if(i%2!=0 && impares<num){
                impares++;
                sumaimpares+=i;
            }
            if(i%3==0){
                multp3++;
                multp3+=i;
            }
            i++;
        }
         
        System.out.prinln("La suma de los "+num+"primeros pares es"+pares);
        System.out.prinln("La suma de los "+num+"primeros pares es"+impares);
        System.out.prinln("La suma de los "+num+"primeros pares es"+multp3);
    }
}