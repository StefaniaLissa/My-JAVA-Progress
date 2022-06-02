public class P_6_4_6{
    public static void main(String args[]){
        int p_1;
        int p_2;
        String subcadena;
        String srt;
        int numC;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase");
        srt = sc.nextLine();
        p_2 = srt.length();
		
        for(int i=0;i<5;i++){
			
        p_1 = (int)(Math.random()*(p_2));
        System.out.println(p_1);
		
        p_2 = (int)(Math.random()*(p_2));
        System.out.println(p_1);
		
		if(p_1>p_2){
			subcadena = subcadena.substring(p_2, p_1);
		}else{ subcadena = subcadena.substring(p_1, p_2);}
		
        System.out.println(subcadena);
		
        }
    }
}