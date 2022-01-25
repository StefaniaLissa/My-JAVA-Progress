
public class RECTANGULO {
    //Atributos
     int base;
     int altura;

    //Metodos
    public void Pintar (){
    	PintarSigno('*');
    }

    public void PintarSigno(char s){
    	for(int i=0;i<altura;i++){
            for(int j=0;j<base;j++){
            	if(i!=0 && i!=altura-1 && j!=0 && j !=base-1) {
            		System.out.print(" ");
            	}else {
            		System.out.print(s);
            	}
            }
            System.out.println("");
        }
    }

    public void Invertir (){
    	RECTANGULO rec2 = new RECTANGULO();
    	rec2.base=altura;
    	rec2.altura=base;
    	rec2.Pintar();
    }

    public void CentrarHorizontal (){
    	int pantalla = 40-(altura/2);
	        
	        for(int i=0;i<altura;i++){
	            for (int k=0;k<=pantalla;k++){
	                System.out.print(" ");
	            }
	            for(int j=0;j<base;j++){
	            	if(i!=0 && i!=altura-1 && j!=0 && j !=base-1) {
	            		System.out.print(" ");
	            	}else {
	            		System.out.print("*");
	            	}
	            }
	            System.out.println("");
	        }
    	}

    public void CentrarPantalla (){
        int vertical = 12-(altura/2);
        
        for(int i=0;i<=80;i++){
            System.out.print("-");
        }
        
        for(int i=0;i<=vertical;i++){
            System.out.println("");
        }
        
        CentrarHorizontal();
        
        for(int i=0;i<=vertical;i++){
            System.out.println("");
        }
        
        for(int i=0;i<=80;i++){
            System.out.print("-");
        }
    }

    public void Area (){
        System.out.println("El area es de: "+(altura*base)+" signos^2");
    }

    public void Perimetro (){
        System.out.println("El perimetro es de: "+(2*altura+base*2)+" signos");
    }
}