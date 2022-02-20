package vectores;

import java.util.*;

public class OperacionesVector {

    public void cargar (int a[]){
        for (int i=0;i<a.length;i++){
            a[i]=(int)Math.floor(Math.random()*(200+1));
        }
    }

    public void visualizar(int a[] ){
    	for (int i: a) {
    		System.out.print(i+" ");
    	}
    }

    public int maximo(int a[]){
        int max = a[0];
        for (int j: a){
            if (j>max){
                max = j;
            }
        }
        return max;
    }

    public int minimo(int a[]){
        int min = a[0];
        for (int j: a){
            if (j<min){
                min = j;
            }
        }
        return min;
    }

    public double media(int a[]){
    	double med = a[0];
        med=(double)suma(a)/a.length;
        return med;
    }

    public double mediana(int a[]){
    	double med;
    	 Arrays.sort(a);
    	 visualizar(a);
    	 if(a.length%2==0) {
    		 med=a[(a.length/2)] + a[((a.length/2)-1)];
    		 med=(double)med/2;
    	 }else{
    		 med=a[(a.length/2)];
    	 }
    	 return med;
    }
    public int suma(int a[]){
    	int sum = a[0];
        for (int j: a){
            sum=sum+j;
        }
        return sum;
    }
}
