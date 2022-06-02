import java.util.*;

public class Controladora {
    String nombre;
    int telefono;
    int edad;

    Persona persona1 = new Persona();

    System.out.println("Introducir el nombre de la persona1;");
    nombre=sc.nextString();
    persona1.setNombre(nombre);

    System.out.println("Introducir el telefono de la persona1;");
    telefono=sc.nextInt();
    persona1.setTelefono(telefono);

    System.out.println("Introducir el edad de la persona1;");
    edad=sc.nextInt();
    persona1.setEdad(edad);

    System.out.println("Nombre de la persona1;"+persona1.getNombre());
    System.out.println("Telefono de la persona1;"+persona1.getTelefono());
    System.out.println("Edad de la persona1;"+persona1.getEdad());


    System.out.println("Introducir el nombre de la persona2;");
    nombre=sc.nextString();

    System.out.println("Introducir el telefono de la persona2;");
    telefono=sc.nextInt();

    System.out.println("Introducir el edad de la persona2;");
    edad=sc.nextInt();

    Persona persona2 = {nombre, telefono, edad};

    if(persona1.getEdad()<persona2.getEdad()){
        System.out.print(persona1.getEdad());
    }else{
        System.out.print(persona2.getEdad());
    }

}