public class P_6_3_8{
    public static void main(String args[]){
		int min, max;
		
		sc Scanner = new Scanner (System.in);
		
		System.out.print("Introduce un valor minimo: ");
		min = sc.nextInt();
		
		do{
		System.out.print("Introduce un valor maximo: ");
		max = sc.nextInt();
		}while(max<min);
		
		for(int i=0; 1<10; i++)
        System.out.print((int)Math.floor(Math.random()*(max-min+1)+min));
    }
}