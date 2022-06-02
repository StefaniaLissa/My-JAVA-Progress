import java.util.*;

public class Controladora {
	public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        RECTANGULO rectangulo = new RECTANGULO();
        int opcion;

        do {
	        System.out.println("Cual es la base?");
	        rectangulo.base=sc.nextInt();
        }while(rectangulo.base<=0 || rectangulo.base>=80);

        do {
		    System.out.println("Cual es la altura?");
		    rectangulo.altura=sc.nextInt();
        }while(rectangulo.altura<=0 || rectangulo.altura>=24);

        do{
            System.out.print("\nQue quiere hacer?\n1- Pintar\n2- PintarSigno\n3- Invertir\n4- CentrarHorizontal\n5- CentrarPantalla\n6- Area\n7- Perimetro\n8- Terminar\n");
            opcion=sc.nextInt();
    
            switch (opcion) {
                case 1:
                	rectangulo.Pintar();
                    break;
                
                case 2:
                    System.out.print("Que otro signo quiere usar?");
                    String str = sc.next(); 
                    char signo = str.charAt(0);
                	rectangulo.PintarSigno(signo);
                    break;
                
                case 3:
                	rectangulo.Invertir ();
                    break;
    
                case 4:
                	rectangulo.CentrarHorizontal ();
                    break;
    
                case 5:
                	rectangulo.CentrarPantalla ();
                    break;
            
                case 6:
                    rectangulo.Area ();
                    break;

                case 7:
                    rectangulo.Perimetro ();
                    break;
    
                default:
                System.out.println("FIN");
            }
        }while(opcion<8);

    }
}