import java.util.*;

public class Controladora {
    public static void main (String args[]){
        Fecha Constructor = new Fecha();
        Fecha Constructor2 = new Fecha(1,1,2022);
        int dia = Fecha.dia;
        int mes = Fecha.mes;
        int anio = Fecha.annio;
        Scanner dato = new Scanner (System.in);

        boolean correcta = true;

		Fecha miFechaNacimiento = new Fecha(24,05,2002);
		Fecha fechaReferencia = new Fecha();

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
				if(Fecha.EsBisiesto){
					if(dia>29) 
						correcta=false;
				}
				else 
						if(dia>28) correcta=false;			
		}
		
		if(correcta){
			System.out.println("La fecha "+dia+"/"+mes+"/"+anio+" es correcta");
			
			dia++;
			
			switch (mes){
			case 4: case 6: case 9: case 11: 
				if(dia==31) correcta=false; 
				break;
			case 2:
				if(Fecha.EsBisiesto){
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
			}	System.out.println("La fecha siguente es "+dia+"/"+mes+"/"+anio);
		} else System.out.println("La fecha "+dia+"/"+mes+"/"+anio+" no es válida");
   
	
		Fecha.TiempoTranscurrido (dia, mes, anio);


	}
}
