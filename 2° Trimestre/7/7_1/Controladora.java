import java.util.*;

public class Controladora {
	public void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int opcion;
        RECTANGULO Rectangulo = new RECTANGULO();

        System.out.println("Cual es la base?");
        Rectangulo.base=sc.nextInt();

        System.out.println("Cual es la altura?");
        Rectangulo.altura=sc.nextInt();

        do{
            System.out.print("Que quiere hacer?\r1- Pintar\r2- PintarSigno\r3- Invertir\r4- CentrarHorizontal\r5- CentrarPantalla\r6- Terminar");
            opcion=sc.nextInt();
    
            switch (opcion) {
                case 1:
                	Rectangulo.Pintar(altura, base);
                    break;
                
                case 2:
                System.out.print("Que otro signo quiere usar?");
                char signo = sc.nextChar();
                	Rectangulo.PintarSigno(altura, base, signo);
                    break;
                
                case 3:
                	Rectangulo.Invertir (altura, base);
                    break;
    
                case 4:
                	Rectangulo.CentrarHorizontal (altura, base);
                    break;
    
                case 5:
                	Rectangulo.CentrarPantalla (altura, base);
                    break;
            
                case 6:
                System.out.println("FIN");
                    break;
    
                default:
                System.out.println("No procede");
            }
        }while(opcion<6);

    }
}