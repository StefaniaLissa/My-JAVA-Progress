import java.util.*;

public class Fecha {
    //Atributos
     int dia;
     int mes;
     int anio;
    
    //Constructores
    public Fecha (int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public Fecha (){}

    //Metodo
    public boolean EsBisiesto(){
        if((anio%4==0 && anio%100!=100) || (anio%400==0)){
            return true;
        }else{
            return false;
        }
    }

    public int TiempoTranscurrido(int diaRef, int mesRef, int anioRef){
    	int dias1, dias2;
    	//Dias transcuridos desde el 1/1/1 hasta la fecha del objeto
    	dias1=(anio-1)*360+(mes-1)*30+dia;
    	
    	//Dias transcuridos desde la fecha de referencia
    	dias2=(anioRef-1)*360+(mesRef-1)*30+diaRef;
    	
    	int dias=Math.abs(dias1-dias2);
        return dias;
    }
    
    public static String CadenaFecha (int d, int m, int a){
    	String fecha = String.valueOf(d)+"/"+String.valueOf(m)+"/"+String.valueOf(a);
    	// String fecha = Integer.toString(d)+"/"+Integer.toString(m)+"/"+Integer.toString(a);
    	return fecha;
    	//return fecha.format("%02d/%02d/%04d", dia, mes, anio);
    }
}
