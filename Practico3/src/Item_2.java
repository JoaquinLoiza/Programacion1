import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Item_2 {

	public static void main(String[] args) {

		double ingresarnumero;

		try {
			BufferedReader entrada = new BufferedReader(new

			InputStreamReader(System.in));

			System.out.println("Ingrese un numero: ");
			ingresarnumero = new Double(entrada.readLine());

			// procesamiento de salida

			if (ingresarnumero <= 100) {

				System.out.println("es chico");
			}

			else if (ingresarnumero > 100) {

				System.out.println("es grande");

			}

		}

		catch (Exception exc) {
			System.out.println(exc);
		}

	}

}