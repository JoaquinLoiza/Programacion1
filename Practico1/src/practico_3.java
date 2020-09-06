import java.io.BufferedReader;

import java.io.InputStreamReader;

public class practico_3 {

	public static void main(String[] args) {
		
		double coordenada_x_de_el_punto_A;
		double coordenada_y_de_el_punto_A;
		
		double coordenada_x_de_el_punto_B;
		double coordenada_y_de_el_punto_B;
		
		double coordenada_x_de_el_punto_C;
		double coordenada_y_de_el_punto_C;
						
		try {
			BufferedReader entrada = new BufferedReader(new

			InputStreamReader(System.in));
			
			System.out.println("Ingrese el valor de X de el punto A: ");
			coordenada_x_de_el_punto_A = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el valor de Y de el punto A: ");
			coordenada_y_de_el_punto_A = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el valor de X de el punto B: ");
			coordenada_x_de_el_punto_B = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el valor de Y de el punto B: ");
			coordenada_y_de_el_punto_B = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el valor de X de el punto C: ");
			coordenada_x_de_el_punto_C = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el valor de Y de el punto C: ");
			coordenada_y_de_el_punto_C = Integer.valueOf(entrada.readLine());
			
			System.out.println("\nValor de X del punto A: "+coordenada_x_de_el_punto_A+"\nValor de Y del punto A: "+coordenada_y_de_el_punto_A);
			
			System.out.println("\nValor de X del punto B: "+coordenada_x_de_el_punto_B+"\nValor de Y del punto B: "+coordenada_y_de_el_punto_B);
			
			System.out.println("\nValor de X del punto C: "+coordenada_x_de_el_punto_C+"\nValor de Y del punto C: "+coordenada_y_de_el_punto_C);
			
	  }
				catch (Exception exc) {
			System.out.println(exc);
						
		}
		

	}
	
}
	
	