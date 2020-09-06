import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Item_2 {

	public static void main(String[] args) {

		int numero, numero1, numero2;		
		boolean verif=false;

		while (verif==false) {

			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un numero distinto de cero : ");
				numero = new Integer (entrada.readLine());

				if (numero !=0 ) {

					System.out.println("Ingrese otro numero : ");
					numero1 = new Integer (entrada.readLine());

					System.out.println("Ingrese un ultimo numero: ");
					numero2 = new Integer (entrada.readLine());

					System.out.println(numero1+"*"+numero2+"="+numero1*numero2 );

					verif=true;
				}					

				else {
					System.out.println("el numero es cero");

					verif=true;					
				}

			}					

			catch (Exception exc) {
				System.out.println("Error, ingrese un valor valido");
			}
		}	
	}	
}

