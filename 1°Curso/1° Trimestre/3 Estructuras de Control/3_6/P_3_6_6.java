import java.util.Scanner;

public class P_3_6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumaImportes = 0;
        int totalFactura=0;
        double sumaAmbos=0;
        int importe=1;
        int iva=0;
        double sumaIva=0;
        double descuento=0;

        while (importe !=0){
            System.out.println("Importe:");
            importe=sc.nextInt();
            if (importe != 0){
				System.out.println("IVA:");
				iva = sc.nextInt();
				if(iva == 4 || iva == 7 || iva == 16){
					sumaImportes= importe + sumaImportes;
					sumaIva=(double)iva/100*importe+sumaIva;
				}else{
					System.out.println("ERROR, IVA incorrecto!");
				}
			}
        }
        if (sumaImportes < 1000){
            descuento=0;
            System.out.println("No tienes descuento.");
        }else if (sumaImportes >= 1000 && sumaImportes < 10000){
            descuento = 0.95;
            sumaImportes = sumaImportes * descuento;
            sumaIva = sumaIva * descuento;
            System.out.println("Tienes un descuento del 5% sobre el importe y el IVA");
        }else {
            descuento = 0.90;
            sumaImportes = sumaImportes * descuento;
            sumaIva = sumaIva * descuento;
            System.out.println("Tienes un descuento del 10% sobre el importe y el IVA");
        }
        System.out.println("Suma de importes: "+sumaImportes);
        System.out.println("Suma de IVA: "+sumaIva);

        sumaAmbos=sumaImportes + sumaIva;

        System.out.println("Suma de ambos: "+sumaAmbos);

    }
}