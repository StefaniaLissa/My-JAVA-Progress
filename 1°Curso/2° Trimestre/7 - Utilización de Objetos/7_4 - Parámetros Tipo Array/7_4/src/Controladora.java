package vectores;
import java.util.*;

public class Controladora {
	
	public static void main (String[]args){
        OperacionesVector vector = new OperacionesVector();
        Scanner sc = new Scanner (System.in);
        int t;
        
        do {
        	System.out.print("Cuantos valores quiere almacenar en el vector?: ");
            t=sc.nextInt();
        }while(t<=0);
        
        int [] array = new int [t];

        vector.cargar (array); 

        vector.visualizar(array);
        
        System.out.println();
    
        System.out.println("El valor maximo del array es: "+vector.maximo(array));
    
        System.out.println("El valor minimo del array es: "+vector.minimo(array));
    
        System.out.println("La media del array es: "+vector.media(array));
    
        System.out.println("La mediana del array es: "+vector.mediana(array));
    
        System.out.println("La suma del array es: "+vector.suma(array));
    }
}