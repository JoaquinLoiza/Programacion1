import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Item_1 {

	public static void main(String[] args) {

		int numero;
		boolean verif=false;
		while (verif==false) {

			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un numero: ");
				numero = new Integer (entrada.readLine());
				if (numero > 0) {
					for (int i=1 ; i <= 10 ; i ++) {
						System.out.println( numero + "*" + i);
					}
					//Asignar un valor
					verif=true;
				}
				else {
					System.out.println("el numero debe ser mayor que cero");

				}
			}
			catch (Exception exc) {
				System.out.println("Error");
			}

		}
	}

}