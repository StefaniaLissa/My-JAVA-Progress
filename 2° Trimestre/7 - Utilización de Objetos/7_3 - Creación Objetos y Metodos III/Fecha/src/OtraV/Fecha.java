//package PRACTICA_7_3;

public class Fecha {
    int dia, mes, anno;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    public boolean anioBisiesto(){
        boolean bisiesto=false;
        if (mes == 2 && dia == 29 && anno % 400 == 0 || (anno % 4 == 0 && anno % 100 != 0)) {
            bisiesto=true;
        }
        return bisiesto;
    }

    public int tiempoTranscurrido(int diaRef, int mesRef, int annoRef){
		//Dias transcurridos desde el 1/1/1 hasta la fecha del objeto.
		int dias1,dias2;
		dias1=(anno-1)*360+(mes-1)*30+dia;
		dias2=(annoRef-1)*360+(mesRef-1)*30+diaRef;
		int dias=Math.abs(dias1-dias2);
        return dias;
    }

    public String cadenaFecha (){
		String cadena = "";
		return cadena.format("%02d/%02d/%04d",dia,mes,anno);
		
    }
}
