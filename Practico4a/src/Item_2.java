import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Item_2 {

	public static void main(String[] args) {

		int numero;
		boolean verif=false;

		while (verif==false) {
		
			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un numero: ");
				numero = new Integer (entrada.readLine());
				if (numero > 1 && numero < 10) {
					while (numero>=0) {
						System.out.println( numero );
						numero--;
					}
					
					verif=true;
					
				}
				else {
					System.out.println("el numero no está en el rango");

				}
			}
			
			catch (Exception exc) {
				System.out.println("Error");
			}
		}	

	}
}