import java.util.*;

public class Controladora {
    public void main (String[]args){
        Scanner sc = new Scanner (System.in);
        CuentaCorriente Usuario1 = new CuentaCorriente();
        int opcion;
        double dinero = 0;
    
        do{
            System.out.print("Que quiere hacer?\r1- IngresarDinero\r2- SacarDinero\r3- Mostrar\r4- Modificar\r5- Terminar");
            opcion=sc.nextInt();
    
            switch (opcion) {
                case 1:
                System.out.print("Cuanto dinero quiere ingresar?");
                dinero = sc.nextInt();
                Usuario1.IngresarDinero(dinero, Usuario1.saldo);
                    break;
                
                case 2:
                System.out.print("Cuanto dinero quiere sacar?");
                dinero = sc.nextInt();
                Usuario1.SacarDinero(dinero, Usuario1.saldo);
                    break;
                
                case 3:
                Usuario1.Mostrar(Usuario1.saldo);
                    break;
    
                case 4:
                Usuario1.Modificar(Usuario1.nombre, Usuario1.apellido, Usuario1.dni, Usuario1.direccion);
                    break;

                default:
                System.out.println("FIN");
            }
        }while(opcion<6);

    }
}
