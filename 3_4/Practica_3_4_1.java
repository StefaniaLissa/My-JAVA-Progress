import java.util.Scanner;

public class Practica_3_4_1{
  public static void main(String[] args) {

    char operador;
    Double num1, num2, resultado;

    Scanner input = new Scanner(System.in);

    System.out.println("Elige una operación: +, -, *, o /");
    operador = input.next().charAt(0);

    System.out.println("Ingrese el primer número");
    num1 = input.nextDouble();

    System.out.println("Ingrese el segundo número");
    num2 = input.nextDouble();

    switch (operador) {

      // SUMA
      case '+':
      resultado = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + resultado);
        break;

      // RESTA
      case '-':
      resultado = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resultado);
        break;

      // MULTIPLICACIÓN
      case '*':
      resultado = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + resultado);
        break;

      // DIVICIÓN
      case '/':
      resultado = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + resultado);
        break;

      default:
        System.out.println("Operador invalido");
        break;
    }

    input.close();
  }
}
