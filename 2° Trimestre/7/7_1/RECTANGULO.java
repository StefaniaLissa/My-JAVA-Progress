
public class RECTANGULO {
    //Atributos de la clase
     int base;
     int altura;

    //Metodos de la clase
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
            for(int j=0;j<=b;j++){
                for (int k=0;k<=pantalla;k++){
                    System.out.print(" ");
                }
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
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}