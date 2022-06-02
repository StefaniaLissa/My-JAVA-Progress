package ReservasPista;

import java.util.*;

public class Empleado {
        public static void main(String[] args) {
        int opcion=0;

        do {
            System.out.println("Que quiere hacer? \n1 - Ver Reservas \n2 - Hacer una Reserva \3 - Eliminar una Reserva \4 - Salir");
            switch (opcion) {
                case 1://Ver Reservas
                    visualizarTabla();
                    break;

                case 2://Hacer Reserva
                    hacerReserva();
                    break;

                case 3://Eliminar Reserva
                    eliminarReserva();
                    break;
            }
        } while (opcion<4);

    }

    public static String tabla [] [] = new String [4] [7];

    public static Cliente socios [] = new Cliente [21];

    public static void visualizarTabla(){
        String semana [] = {"LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};
        String horarios [] = {"6-7","7-8","8-9"};
        
        for(int f=0; f<tabla.length; f++) {
            for(int c=0; c<tabla[f].length; c++){
                //1°FILA DIAS DE LA SEMANA   
                tabla[0][c] = semana[c];
            } //1°COLUMNA HORARIOS
            tabla[f][0] = horarios[f];
        }

        for(int f=0; f<tabla.length; f++) {
            for(int c=0; c<tabla[f].length; c++){
                if(tabla[f][c]==null){
                    System.out.println("Libre");
                }else{
                    System.out.println(tabla[f][c]);
                }
            } 
        }
    }

    public static Scanner sc = new Scanner (System.in);

    public static void hacerReserva(){
        int diaReserva;
        int horarioReserva;

        visualizarTabla();
        System.out.println("Que dia quiere reservar: \n1 - Lunes \n2 - Martes \n3 - Miercoles \n4 - Jueves \n5 - Viernes \n6 - Sabado \n7 - Domingo");
        diaReserva=sc.nextInt();
        System.out.println("Que horario: \n1 - 6-7 \n2 - 7-8 \n3 - 8-9 ");
        horarioReserva=sc.nextInt();

        if (tabla[horarioReserva][diaReserva]==null){
            int libre=0;
            for (int i = 0; i < socios.length && socios[i]!=null; i++) {
                libre=i;
            }
            socios[libre] = new Cliente(); 

            System.out.println("Numero de socio: ");
            socios[libre].setNumSocio(sc.next());

            System.out.println("Nombre: ");
            socios[libre].setNombre(sc.nextLine());

            System.out.println("Hora de reserva: ");
            socios[libre].setHoraReserva(sc.nextLine());
            
            tabla[horarioReserva][diaReserva]=socios[libre].toString();
        }

    }

    public static void eliminarReserva(){
        int diaReserva;
        int horarioReserva;
        String numSocio;

        visualizarTabla();
        System.out.println("Dia: \n1 - Lunes \n2 - Martes \n3 - Miercoles \n4 - Jueves \n5 - Viernes \n6 - Sabado \n7 - Domingo");
        diaReserva=sc.nextInt();
        System.out.println("Horario: \n1 - 6-7 \n2 - 7-8 \n3 - 8-9 ");
        horarioReserva=sc.nextInt();

        if (tabla[horarioReserva][diaReserva]!=null){
            System.out.println("Numero de socio: ");
            numSocio=sc.next();
            for (Cliente cliente : socios) {
                if(cliente.equals(numSocio)){
                    tabla[horarioReserva][diaReserva]=null;
                }
            }
        }
    }
}
