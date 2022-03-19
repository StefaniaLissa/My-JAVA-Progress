package Recursividad;

public class E5_Recursividad{
    public static void main(String[] args) {
        String num = "123456";
        System.out.println("El reverso es : " + recursivoReverso(num));
          
    }

    public static String recursivoReverso(String numero) {
        if ((numero == null) || (numero.length() <= 1))
            return numero;
        else {
            return recursivoReverso(numero.substring(1)) + numero.charAt(0);
        }
    }
}