import java.util.Arrays;

public class alLlamar {

	public static void main(String [] args) {
		//usuario, contraseña, nombre, num1, num2, int ... num) {
	
		String usuario="Usu";
		String contrasenia="Con";
		
		if (args[0].equals(usuario) && args[1].equals(contrasenia)) {
			System.out.println("Hola, "+args[2]);
			
			if (Integer.parseInt(args[3])>Integer.parseInt(args[4])) {
				System.out.println(args[3]+", "+args[4]);
			} else {
				System.out.println(args[4]+", "+args[3]);
			}
			
		int [] numeros = new int [args.length-5];

		for (int i=5 ; i<args.length ; i++) {
			numeros[i-5]=Integer.parseInt(args[i]);
		}
			Arrays.sort(numeros);
			for (int i=0 ; i<numeros.length ; i++) {
				System.out.print(numeros[i]+", ");
			}
			
		}

	}

}
