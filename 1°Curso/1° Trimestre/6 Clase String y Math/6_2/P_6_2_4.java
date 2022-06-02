import java.util.*;

public class P_6_2_4{
    public static void main(String args[]){
        String str = new String();

        Scanner sc = new Scanner (System.in);

        do{
			System.out.print(" Introduce una palabra: (fin para terminar)");
			str = sc.next();
			if (!str.equals("fin")){
				if (str.endsWith("ar")||str.endsWith("er")||str.endsWith("ir")){
					System.out.println("Esta palabra es infinitiva");
				}else{
					System.out.println("Esta palabra no es infinitiva");
				}
			}
        }while(!str.equals("fin"));
    }
}