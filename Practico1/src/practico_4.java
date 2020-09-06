import java.io.BufferedReader;

import java.io.InputStreamReader;

public class practico_4 {

	public static void main(String[] args) {

		String nombre;
		byte edad;
		double altura;
		String ocupacion;


		try {
			BufferedReader entrada = new BufferedReader(new

					InputStreamReader(System.in));

			System.out.println("Ingrese su nombre: ");
			nombre = entrada.readLine();

			System.out.println("Ingrese su edad: ");
			edad = new Byte(entrada.readLine());  

			System.out.println("Ingrese su altura: ");
			altura = new Double(entrada.readLine());

			System.out.println("Ingrese su ocupación: ");
			ocupacion = entrada.readLine();

			System.out.println("\nNombre: "+nombre+"\nedad: "+edad+"\naltura: "+altura+"\nocupación: "+ocupacion);

		} 

		catch (Exception exc) {
			System.out.println(exc);

		}
	}
}

