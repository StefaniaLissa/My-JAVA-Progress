// 1er. paso Importar el paquete(libreria)
import java.util.Scanner;

public class P_3_7_3 {
	public static void main (String args[]) {
		//Entorno
		int anio,dia,mes;
		boolean correcta;
		//2º paso:instanciar objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);
		
		//Proceso
		//Pedir día
		do {
			System.out.print("\nIntroduzca el día de la fecha:");
			//3er. paso: uso del método nextInt()
			dia=dato.nextInt();
			if(dia<=0||dia>31) System.out.print("El día introducido debe estar entre 1 y 31");
		}while(dia<=0||dia>31);
		
		//Pedir mes
		do {
			System.out.print("\nIntroduzca el mes de la fecha:");
			//3er. paso: uso del método nextInt()
			mes=dato.nextInt();
			if(mes<=0 || mes>12) System.out.print("El mes debe estar entre 1 y 12");
		}while(mes<=0 || mes>12);
		
		//Pedir el año
		do {
			System.out.print("\nIntroduzca un año a partir de 1900:");
			//3er. paso: uso del método nextInt()
			anio=dato.nextInt();
			if(anio<1900) System.out.print("El año introducido debe ser >= 1900");
		}while(anio<1900);
		
		correcta=true;
		
		switch (mes){
			case 4: case 6: case 9: case 11: 
				if(dia==31) correcta=false; 
				break;
			case 2:
				if((anio%4==0 && anio%100!=100) || (anio%400==0)){
					if(dia>29) 
						correcta=false;
				}
				else 
						if(dia>28) correcta = false;			
		}
		
		if(correcta){
			System.out.println("La fecha "+dia+"/"+mes+"/"+anio+" es correcta");
			
			dia++;
			
			switch (mes){
			case 4: case 6: case 9: case 11: 
				if(dia==31) correcta=false; 
				break;
			case 2:
				if((anio%4==0 && anio%100!=100) || (anio%400==0)){
					if(dia>29) 
						correcta=false;
				}
				else 
						if(dia>28) correcta = false;			
		}
		
			if(correcta=false){
				dia--;
				mes++;
				if (mes==13){
					mes=1;
					anio++;
				}
			}
		
			System.out.println("La fecha siguente es "+dia+"/"+mes+"/"+anio);
		}
		else
			System.out.println("La fecha "+dia+"/"+mes+"/"+anio+" no es válida");
		
	}
}
