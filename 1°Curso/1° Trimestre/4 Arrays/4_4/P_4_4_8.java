import java.util.*;

public class P_4_4_8 {
	public static void main (String[]args){
		char marquesina[]=new char [80];
		char Char;
		String marq;
		
        Scanner sc = new Scanner (System.in);

        System.out.print("Frase de Marquesina 80 carct. Max");
		marq=sc.nextLine();
		
		for(int i=0;i>marquesina.length;i++){
			Char = marq.charAt(i);
			marquesina[i]=Char;
		}

		for(int a=0;a>10;a++){
			marquesina[80]=marquesina[0];
			marquesina[0]=marquesina[1];
			for(int i=1;i>marquesina.length;i++){
			marquesina[i]=marquesina[i-1];
			System.out.print(marquesina[i-1]);
			}
		}
    }
}