import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Item_1 {

	public static void main(String[] args) {

		int numero;
		boolean verif=false;
		
		while (verif==false) {
		
			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un numero : ");
				numero = new Integer (entrada.readLine());
				
				if (numero !=0 ) {
					
					System.out.println(numero);													
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
