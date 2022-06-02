public class P_6_4_1{
    public static void main(String args[]){
		int min = 100000;
        int max = 1000000;
        int num1;
        int num;
        String numI;
        String numII;
		
        num1 = (int)(Math.random()*(max-min+1)+min);
        System.out.println(num1);

        num = (int)(Math.random()*10);
        System.out.println(num);

        numI=Integer.toString(num1);
        numII=Integer.toString(num);

        if (numI.indexOf(numII)>0){
            numI = numI.replace(numII, "");
            System.out.println(numI);
        }else System.out.print(" No hay coincidencias");
    }
}