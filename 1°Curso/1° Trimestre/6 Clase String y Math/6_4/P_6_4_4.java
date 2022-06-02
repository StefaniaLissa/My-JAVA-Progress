public class P_6_4_4{
    public static void main(String args[]){
		int min = 1;
        int max = 49;
		
		for(int i=0; i<6; i++)
        System.out.println((int)Math.floor(Math.random()*(max-min+1)+min));
    }
}