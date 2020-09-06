import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Item_1 {

	public static void main(String[] args) {

		double ingresarnumero;

		try {
			BufferedReader entrada = new BufferedReader(new

			InputStreamReader(System.in));

			System.out.println("Ingrese un numero: ");
			ingresarnumero = new Double(entrada.readLine());

			// procesamiento de salida

			if (ingresarnumero < 0) {

				System.out.println("es negativo");
			}

			else if (ingresarnumero >= 0) {

				System.out.println("es positivo");

			}

		}

		catch (Exception exc) {
			System.out.println(exc);
		}

	}

}