
import java.io.BufferedReader;

import java.io.InputStreamReader;

public class practico_1 {

	public static void main(String[] args) {
		
		int entero_1;
		int entero_2;
		int entero_3;
		int entero_4;
		int entero_5;
		
		try {
			BufferedReader entrada = new BufferedReader(new

			InputStreamReader(System.in));

			System.out.println("Ingrese  primer entero: ");
			entero_1 = Integer.valueOf(entrada.readLine());

			System.out.println("Ingrese segundo entero: ");
			entero_2 = Integer.valueOf(entrada.readLine());

			System.out.println("Ingrese tercer entero: ");
			entero_3 = Integer.valueOf(entrada.readLine());

			System.out.println("Ingrese cuarto entero: ");
			entero_4 = Integer.valueOf(entrada.readLine());

			System.out.println("Ingrese quinto entero: ");
			entero_5 = Integer.valueOf(entrada.readLine());

			System.out.println("los numeros son: "+ entero_5 +" "+ entero_4 +" "+ entero_3 +" "+ entero_2 +" "+ entero_1);
			
		} 
		
		catch (Exception exc) {
			System.out.println(exc);
						
		}
	}
}

