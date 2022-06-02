package Excepciones;

import java.util.*;

public class Controladora {

    public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int tamanio;
        int opcion=0;

        System.out.println("Numero de alumnos en la clase: ");
        tamanio=sc.nextInt();sc.nextLine();

        Alumno alumnos[] = new Alumno[tamanio];
     
        for (int i = 0; i < tamanio; i++){
            alumnos[i] = new Alumno();
            System.out.println("Nombre del alumno "+i+": ");
            alumnos[i].setNombre(sc.nextLine());

            System.out.println("Genero del alumno "+i+": ");
            alumnos[i].setGenero(sc.nextLine());

            System.out.println("Edad del alumno "+i+": ");
            alumnos[i].setEdad(sc.nextInt());sc.nextLine();
        }

        visualizarVector(alumnos);

        System.out.println("La edad media de la clase es: "+mediaAlumnos(alumnos));
     
        do {
            System.out.println("Ordenar array por: 1-Nombre, 2-Edad, 3-Genero, 4-Salir");
              opcion=sc.nextInt();
            switch (opcion) {
                case 1:
                    Arrays.sort(alumnos);
                    break;
                case 2:
                    Arrays.sort(alumnos, new ordenaPorInt());
                    break;
                case 3:
                    Arrays.sort(alumnos);
                case 4: break;
            }
            visualizarVector(alumnos);
        }while(opcion<=4);
        
    }   

    public static void visualizarVector(Alumno vector []){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i].toString());
        }
    }

    public static int mediaAlumnos(Alumno vector []){
        int media=0;
        for (int i = 0; i < vector.length; i++) {
            media= media+vector[i].getEdad();
        }
        media=media/vector.length;
        return media;
    }
}
