import java.util.*;

public class P_4_4_6 {
	public static void main (String[]args){
		int cant[][]={{31, 42, 64},{50, 101, 194}};
		double precioU[]={19.61, 23, 86.4};
        double sum=0;
        double sumAlm=0;
        double sumPieza=0;

		for(int f = 0; f < precioU.lenght; f++){    
			for(int c = 0; c < precioU[f].lenght; c++){    
				  sum=sum+cant[f][c]*precioU[c];
			}   
            sumAlm=sumAlm+cant[f][c]*precioU[c]; 
            System.out.print("Valor total en Almacen "+f+" :"+sumAlm);
		}
        for(int c = 0; c < precioU[f].lenght; c++){    
			for(int f = 0; f < precioU.lenght; f++){    
				  sum=sum+cant[f][c]*precioU[c];
			}   
            sumPieza=sumPieza+cant[f][c]*precioU[c]; 
            System.out.print("Valor total Pieza "+c+" :"+sumPieza);
		} 
        System.out.print("Valor total: "+sum);
        
	}
}