import java.util.*;

public class Controladora {
	public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        RECTANGULO Rectangulo = new RECTANGULO();
        int opcion;

        System.out.println("Cual es la base?");
        Rectangulo.base=sc.nextInt();

        System.out.println("Cual es la altura?");
        Rectangulo.altura=sc.nextInt();

        do{
            System.out.print("Que quiere hacer?\n1- Pintar\n2- PintarSigno\n3- Invertir\n4- CentrarHorizontal\n5- CentrarPantalla\n6- Area\n7- Perimetro\n8- Terminar\n");
            opcion=sc.nextInt();
    
            switch (opcion) {
                case 1:
                	Rectangulo.Pintar(Rectangulo.altura, Rectangulo.base);
                    break;
                
                case 2:
                    System.out.print("Que otro signo quiere usar?");
                    String str = sc.next(); 
                    char signo = str.charAt(0);
                	Rectangulo.PintarSigno(Rectangulo.altura, Rectangulo.base, signo);
                    break;
                
                case 3:
                	Rectangulo.Invertir (Rectangulo.altura, Rectangulo.base);
                    break;
    
                case 4:
                	Rectangulo.CentrarHorizontal (Rectangulo.altura, Rectangulo.base);
                    break;
    
                case 5:
                	Rectangulo.CentrarPantalla (Rectangulo.altura, Rectangulo.base);
                    break;
            
                case 6:
                    Rectangulo.Area (Rectangulo.altura, Rectangulo.base);
                    break;

                case 7:
                    Rectangulo.Perimetro (Rectangulo.altura, Rectangulo.base);
                    break;
    
                default:
                System.out.println("FIN");
            }
        }while(opcion<8);

    }
}