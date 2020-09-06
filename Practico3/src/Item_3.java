import java.io.BufferedReader;	

import java.io.InputStreamReader;

public class Item_3 {

	public static void main(String[] args) {

		byte ingresarnumero;

		try {
			BufferedReader entrada = new BufferedReader(new

					InputStreamReader(System.in));

			System.out.println("Ingrese un numero del 1 al 7: ");
			ingresarnumero = new Byte(entrada.readLine());

			// procesamiento de salida

			// ahora usar switch

			switch (ingresarnumero) {

			case 1: System.out.println("Lunes"); break;
			case 2: System.out.println("Martes"); break;			
			case 3: System.out.println("Miercoles"); break;
			case 4: System.out.println("Jueves"); break;
			case 5: System.out.println("Viernes"); break;
			case 6: System.out.println("Sabado"); break;
			case 7: System.out.println("Domingo"); break;

			default: System.out.println("no es un dia de la semana, ingrese otro numero valido");				
			}

		}

		catch (Exception exc) {
			System.out.println(exc);
		}

	}

}