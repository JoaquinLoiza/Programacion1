
import java.io.BufferedReader;	

import java.io.InputStreamReader;

public class Item_4 {

	public static void main(String[] args) {

		char ingresarletra;

		try {
			BufferedReader entrada = new BufferedReader(new

					InputStreamReader(System.in));

			System.out.println("Ingrese una letra: ");
			ingresarletra = (char) (entrada.readLine().charAt(0));

			// procesamiento de salida

			// ahora usar switch

			switch (ingresarletra) {

			case 'a': case'A': System.out.println("es vocal"); break;
			case 'e': case'E': System.out.println("es vocal"); break;			
			case 'i': case'I': System.out.println("es vocal"); break;
			case 'o': case'O': System.out.println("es vocal"); break;
			case 'u': case'U': System.out.println("es vocal"); break;			

			default: System.out.println("no es una vocal");				
			}

		}

		catch (Exception exc) {
			System.out.println(exc);
		}

	}

}