import java.util.*;

public class Controladora {
    public void main (String[]args){
        Scanner sc = new Scanner (System.in);
        CuentaCorriente Usuario1 = new CuentaCorriente();
    
        do{
            System.out.print("Que quiere hacer?\r1- IngresarDinero\r2- SacarDinero\r3- Mostrar\r4- Modificar\r5- Terminar");
            opcion=sc.nextInt();
    
            switch (opcion) {
                case 1:
                Usuario1.IngresarDinero()
                    break;
                
                case 2:

                Usuario1.SacarDinero();
                    break;
                
                case 3:
                Usuario1.Mostrar();
                    break;
    
                case 4:
                Usuario1.Modificar();
                    break;

                default:
                System.out.println("FIN");
            }
        }while(opcion<6);

    }
}
