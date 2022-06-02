import java.util.*;

public class Controladora {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        CuentaCorriente Usuario1 = new CuentaCorriente("Stefi","Lissa","123456789","01234567C",12345678,12345);
       
        int opcion;
        double dinero = 0;
    
        do{
            System.out.print("\nQue quiere hacer?\n1- IngresarDinero\n2- SacarDinero\n3- Mostrar\n4- Modificar\n5- Terminar\n");
            opcion=sc.nextInt();
    
            switch (opcion) {
                case 1:
                	do {
                		Usuario1.Mostrar();
                		System.out.print("Cuanto dinero quiere ingresar?");
                        dinero = sc.nextInt();
                	}while(dinero<=0);
                	Usuario1.IngresarDinero(dinero);
                    break;
                
                case 2:
                	do {
                		System.out.print("Cuanto dinero quiere sacar?");
    	                dinero = sc.nextInt();
                	}while(dinero<=Usuario1.saldo || dinero<=0);
	                Usuario1.SacarDinero(dinero);
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
        }while(opcion<5);

    }
}
