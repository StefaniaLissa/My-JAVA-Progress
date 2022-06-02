import java.util.*;
import java.util.regex.Pattern;

public class Controladora {
    public static void main (String args[]){
        String cadenafecha;
        int dia, mes, anio;
        Scanner sc = new Scanner (System.in);
        
		Fecha FechaNacimiento = new Fecha(24,05,2002);
		Fecha fechaReferencia = new Fecha();
		
        do {
			System.out.print("\nIntroduzca una fecha con el formato DD/MM/AAAA: ");
			cadenafecha=sc.next();
        }while(!cadenafecha.matches("\\d{2}/\\d{2}/\\d{4}"));
        	
        dia=Integer.parseInt(cadenafecha.substring(0, 2));
        mes=Integer.parseInt(cadenafecha.substring(3, 5));
        anio=Integer.parseInt(cadenafecha.substring(6));
        	
        FechaValida(dia,mes,anio);
        fechaReferencia.dia=dia;
        fechaReferencia.mes=mes;
        fechaReferencia.anio=anio;
	
		int diasT=Fecha.TiempoTranscurrido(dia, mes, anio);
		System.out.print(diasT);
		
		System.out.print(Fecha.CadenaFecha(dia, mes, anio));
		
	}
        
        public static boolean FechaValida(int d, int m, int a) {
        	if(d<=0||d>31||m<=0 || m>12||a<1) {
        		System.out.print("El día introducido debe estar entre 1 y 31, el mes entre 1 y 12 y el año mayor que 1");
        		return false;
        	}else return true;
    	}
}
