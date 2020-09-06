import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio2 {

	public static void main(String[] args) {		
		resolver();
	}

	public static String obteneropcion() {

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		String opcion = "x";
		boolean validar = false;

		while (validar == false)
			try { 
				System.out.println("Ingrese opción a o b: ");
				opcion = entrada.readLine();

				switch (opcion) {

				case "a": validar=true; break;
				case "b": validar=true; break;

				default: validar = false;
				}

			} 
		catch (Exception exc) {

		}

		return opcion;				

	}


	public static void resolver() {
		final int MAX=10;
		final int MULTIPLO=3;

		for (int i=1; i<=MULTIPLO; i++) {

			System.out.println("tabla de multiplicar del "+i);
			for (int j=1; j<=MAX; j++) {

				System.out.println(j + "*" + i +"="+ j*i);
			}
		} 
	}
}