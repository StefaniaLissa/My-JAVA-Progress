
public class RECTANGULO {
    //Atributos
     int base;
     int altura;

    //Metodos
    public void Pintar (int a, int b){
        for(int i=0;i<=a;i++){
            for(int j=0;j<=b;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void PintarSigno(int a, int b, char s){
        for(int i=0;i<=a;i++){
            for(int j=0;j<=b;j++){
                System.out.print(s);
            }
            System.out.println("");
        }
    }

    public void Invertir (int a, int b){
        for(int i=0;i<=b;i++){
            for(int j=0;j<=a;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void CentrarHorizontal (int a, int b){
        int pantalla = 40-(a/2);
        
        for(int i=0;i<=a;i++){
            for (int k=0;k<=pantalla;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=b;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void CentrarPantalla (int a, int b){
        int pantalla = 40-(b/2);
        int vertical = 12-(a/2);
        
        for(int i=0;i<=vertical;i++){
            System.out.println("");
        }
        for(int i=0;i<=a;i++){
            for(int j=0;j<=b;j++){
                for (int k=0;k<=pantalla;k++){
                    System.out.print(" ");
                }
                for(int l=0;l<=b;l++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for(int i=0;i<=vertical;i++){
            System.out.println("");
        }
    }

    public void Area (int a, int b){
        System.out.println("El area es de: "+(a*b)+" signos");
    }

    public void Perimetro (int a, int b){
        System.out.println("El perimetro es de: "+(2*a+b*2)+" signos");
    }
}