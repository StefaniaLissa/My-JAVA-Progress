public class Fecha {
    //Atributos
    static int dia;
    static int mes;
    static int annio;
    
    //Constructores
    public Fecha (int dia, int mes, int annio){
        dia = 1;
        mes = 1;
        annio = 2000;
    }

    //Metodo
    public boolean EsBisiesto(){
        if((anio%4==0 && anio%100!=100) || (anio%400==0)){
            return true;
        }else{
            return false;
        }
    }

    public String TiempoTranscurrido(int d, int m, int a){
    
        
        return dia+"/"+mes+"/"+annio+"/";
    }
}
