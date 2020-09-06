
import java.io.BufferedReader;	

import java.io.InputStreamReader;

public class Item_5 {

	public static void main(String[] args) {

		double valor_1;
		double valor_2;
		double valor_3;

		try {
			BufferedReader entrada = new BufferedReader(new

			InputStreamReader(System.in));

			System.out.println("Ingrese un numero: ");
			valor_1 = new Double(entrada.readLine());
			
			System.out.println("Ingrese un numero: ");
			valor_2 = new Double(entrada.readLine());
			
			System.out.println("Ingrese un numero: ");
			valor_3 = new Double(entrada.readLine());
						
			// procesamiento de salida

			if (valor_1 < valor_2  && valor_2 < valor_3) {

				System.out.println("Creciente");
			}
			
			else if (valor_1 > valor_2  && valor_2 > valor_3) {

				System.out.println("Decreciente");
			}
			
			else System.out.println("ERROR");
			
		}

		catch (Exception exc) {
			System.out.println(exc);
		}

	}

}