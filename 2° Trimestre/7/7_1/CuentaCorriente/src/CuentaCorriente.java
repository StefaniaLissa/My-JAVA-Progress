import java.util.*;

public class CuentaCorriente {
    //Atributos
    String nombre;
    String apellido;
    String dni;
    String direccion;
    long numCuenta;
    double saldo;

    //Metodo
    public double IngresarDinero(double d, double saldo){
        saldo=saldo+d;
        return saldo;
    }
    public double SacarDinero(double d, double saldo){
        saldo=saldo-d;
        return saldo;
    }
    public void Mostrar(double s){
        System.out.print("Slado de la cuenta: "+s);
    }
    public String Modificar(String n,String a,String dni,String d){
        int opcion;
        Scanner sc = new Scanner (System.in);

        System.out.print("Que quiere modificar?\n1-Nombre\n2- Apellido\n3- DNI\4- Direccion\n5- Treminar\n");
        opcion=sc.nextInt();
        switch (opcion) {
            case 1:
                n=sc.nextLine();
                return n;
            case 2:
                a=sc.nextLine();
                return a;
            case 3:
                dni=sc.nextLine();
                return dni;
            case 4:
                d=sc.nextLine();
                return d;
            default:
                System.out.print("Ese campo no se modifica");
                break;
        }
    }
}
