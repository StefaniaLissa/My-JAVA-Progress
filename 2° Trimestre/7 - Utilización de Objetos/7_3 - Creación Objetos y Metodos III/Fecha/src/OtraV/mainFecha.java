//package PRACTICA_7_3;

import java.util.Scanner;

public class mainFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fecha fechaNacimiento = new Fecha(11, 4, 1996);
        Fecha fechaReferencia = new Fecha();
		String cadenaFecha="";
		int diaInt=0,mesInt=0,annoInt=0;
        do {
			System.out.print("Introduce la fecha (dd/mm/yyyy): ");
			cadenaFecha=sc.next();
			if(cadenaFecha.matches("([0123][0-9])/([01][0-9])/([0-9]{4})")){
				diaInt=Integer.parseInt(cadenaFecha.substring(0,2));
				mesInt=Integer.parseInt(cadenaFecha.substring(3,5));
				annoInt=Integer.parseInt(cadenaFecha.substring(6));
				if(!validarFecha(diaInt,mesInt,annoInt)){
					System.out.println("FECHA NO VALIDA");
				}else{
					fechaReferencia.dia=diaInt;
					fechaReferencia.mes=mesInt;
					fechaReferencia.anno=annoInt;
				}
			}else System.out.println("FORMATO INCORRECTO");
        } while (!validarFecha(diaInt, mesInt, annoInt));

        //Metodo anioBisiesto
        if (fechaNacimiento.anioBisiesto()) System.out.println("El año "+fechaNacimiento.anno+" es bisiesto!");
        else System.out.println("El año "+fechaNacimiento.anno+" NO es bisiesto!");
        if (fechaReferencia.anioBisiesto()) System.out.println("El año "+fechaReferencia.anno+" es bisiesto!");
        else System.out.println("El año "+fechaReferencia.anno+" NO es bisiesto!");

        //Metodo cadenaFecha
        System.out.println(fechaNacimiento.cadenaFecha());
        System.out.println(fechaReferencia.cadenaFecha());

        //Metodo tiempoTranscurrido
        System.out.println("Dias entre el "+ fechaNacimiento.cadenaFecha()+" y "+ fechaReferencia.cadenaFecha()+" = "+fechaNacimiento.tiempoTranscurrido(diaInt,mesInt,annoInt));

    }

    public static boolean validarFecha(int diaRef, int mesRef, int annoRef) {
        boolean fechaValida = false;
        if ((diaRef > 0 && diaRef < 31) && (mesRef > 0 && mesRef < 13) && (annoRef > 0)) {
            fechaValida = true;
        }
        return fechaValida;
    }
}
