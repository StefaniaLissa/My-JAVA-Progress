import java.util.*;
import java.util.regex.Pattern;

public class CuentaCorriente {
    //Atributos
    String nombre;
    String apellido;
    String dni;
    String direccion;
    long numCuenta;
    double saldo;

    //Constructores
    public CuentaCorriente() {}
    
    public CuentaCorriente(String nombre, String apellido, String dni, String direccion, long numCuenta, double saldo) {
    	this.nombre=nombre;
    	this.apellido=apellido;
    	this.dni=dni;
    	this.direccion=direccion;
    	this.numCuenta=numCuenta;
    	this.saldo=saldo;
       }
    
    //Metodos
    public void IngresarDinero(double d){
        saldo=saldo+d;
    }
    
    public void SacarDinero(double d){
    	saldo=saldo-d;
    }
    
    public void Mostrar(){
        System.out.print("Saldo de la cuenta: "+saldo);
    }
    
    public void Modificar(){
    	String dniExp = "\\d{8}[A-HJ-NP-TV-Z]";
    	
        Scanner sc = new Scanner (System.in);

        System.out.print(nombre);
        nombre=sc.nextLine();

        System.out.print(apellido);
        apellido=sc.nextLine();

        do {
        	if(!Pattern.matches(dniExp, dni){
        		System.out.print("Intentelo de nuevo: ");
        	}
        	System.out.print(dni);
        	dni=sc.nextLine();
        }while(!Pattern.matches(dniExp, dni));

        System.out.print(direccion);
        	direccion=sc.nextLine();
        }
    }
