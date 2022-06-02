package Excepciones;
import java.util.Comparator;

public class ordenaPorInt implements Comparator<Alumno>{
    public int compare (Alumno uno, Alumno dos){
        return uno.getEdad()-dos.getEdad();
    }
    
}