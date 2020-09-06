	
	import java.io.BufferedReader; 
	
	import java.io.InputStreamReader;

	public class Ejemplo3 {

		public static void main(String[] args){
			int entero;
			try {
				BufferedReader entrada = new BufferedReader(new

						InputStreamReader(System.in));
				
				System.out.println ("Ingrese int: ");
				entero = new Integer(entrada.readLine());
				System.out.println ("Entero ingresado: " + entero);
			}
			
			catch (Exception exc ) {
				System.out.println(exc);
			}
		}
	}

