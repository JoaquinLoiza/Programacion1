import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Item_3 {

	public static void main(String[] args) {

		int numero;
		boolean verif=false;
		
		while (verif==false) {
		
			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un numero mayor a 50: ");
				numero = new Integer (entrada.readLine());
				
				if (numero > 50) {
					
					if (numero%3==0) {
						System.out.println("es multiplo de 3");
					}
					if (numero%2==0) {
						System.out.println("es multiplo de 2");
					}
					   
					     verif=true;
				}				
				else {
					System.out.println("el numero no es mayor a 50");
				}
										
			}					
			
			catch (Exception exc) {
				System.out.println("Error, ingrese un valor valido");
			}
		}	
	}	
}


