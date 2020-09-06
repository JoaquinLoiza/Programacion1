import java.io.BufferedReader;


import java.io.InputStreamReader;

public class Item_6 {

	public static void main(String[] args) {

		int ingresarmes, anio;

		try {
			BufferedReader entrada = new BufferedReader(new

			InputStreamReader(System.in));

			System.out.println("Ingrese un numero del 1 al 12: ");
			ingresarmes = new Integer (entrada.readLine());

			System.out.println("Ingrese un año: ");
			anio = new Integer (entrada.readLine());
			
			// procesamiento de salida
			
			if ((ingresarmes == 4) || (ingresarmes == 6) || (ingresarmes == 9) || (ingresarmes == 11)) {
			
			System.out.println("\n30 dias");

			}
			else if ((ingresarmes == 1)||(ingresarmes == 3)||(ingresarmes == 5)||(ingresarmes == 7)||(ingresarmes == 8)||(ingresarmes == 10)||(ingresarmes == 12)) {
			
			System.out.println("\n31 dias");	
			}

			else if ((ingresarmes == 2) && ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))) {
				
			System.out.println("\nAño biciesto");	
			}
			
			else {	
			
				System.out.println("\nNo es año biciesto");	
			}
			
		}

		catch (Exception exc) {
			System.out.println(exc);
		}

	}

}