import java.io.BufferedReader;

import java.io.InputStreamReader;

public class practico_2 {

	public static void main(String[] args) {
		
		double radio;
		double coordenada_x;
		double coordenada_y;
		
		try {
			BufferedReader entrada = new BufferedReader(new

			InputStreamReader(System.in));
			
			System.out.println("Ingrese el radio: ");
			radio = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese la coordenada X: ");
			coordenada_x = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese la coordenada Y: ");
			coordenada_y = Integer.valueOf(entrada.readLine());
			
			System.out.println( "se dibujará un circulo de radio: "+radio+" con centro en x: "+coordenada_x+" e y: "+coordenada_y);
			
	  }
				catch (Exception exc) {
			System.out.println(exc);
						
		}
		

	}
	
}
	
	