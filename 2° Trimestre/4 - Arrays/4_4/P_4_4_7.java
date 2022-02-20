import java.util.*;

public class P_4_4_7 {
	public static void main (String[]args){
		String moneda[]={"dolar", "libra esterlina", "yen", "dirham"};
        double equivEuro[]={0.82, 1.072, 0.0075, 0.084};
        double cant;
        String monedaAct;
        String monedaConv;
        double euros;

        Scanner sc = new Scanner (System.in);

        System.out.print("Que moneda tienes?");
        monedaAct=sc.nextLine();

        System.out.print("Cuantas monedas tienes?");
        cant=sc.nextFloat();

        System.out.print("A que divisa quiere convertirlo?");
        monedaConv=sc.nextLine();

        for (int f=0;f<moneda.length;f++){
            for(int c=0;c<moneda[f].length;c++){
                if(monedaAct==moneda[c]){
                     System.out.print("Introdujo "+cant+" "+moneda[c]+" son "+euros+" euros");
                }
            }
        }

        for (int f=0;f<moneda.length;f++){
            for(int c=0;c<moneda[f].length;c++){
                if(monedaConv==moneda[c]){
                     euros=cant*equivEuro[c];
                     System.out.print("Y recibe: "+(euros*equivEuro[c]));
                }
            }
        }
    }
}