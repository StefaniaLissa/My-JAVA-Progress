public class P_6_4_5{
    public static void main(String args[]){
        int segundo, minuto, hora;

        for (hora=0;hora<24;hora++){
            for(minuto=0;minuto<60;minuto++){
                for(segundo=0;segundo<60;segundo++){
                    System.out.print(hora+":"+minuto+":"+segundo);
                }
            }
        }
    }
}