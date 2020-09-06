import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Item_4 {

	public static void main(String[] args) {

		int numero;
		boolean verif=false;
		
		while (verif==false) {
		
			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un numero del rango 0-999 : ");
				numero = new Integer (entrada.readLine());
				
				if (numero >= 0 && numero <=999) {
					
					if (numero >= 0 && numero <= 9) {
						System.out.println("tiene un digito");
					}
					if (numero >= 10 && numero <= 99) {
						System.out.println("tiene dos digitos");
					}
					if (numero >= 100 && numero <= 999) {
						System.out.println("tiene tres digitos: " + numero);
					}
					   
					     verif=true;
				}				
				else {
					System.out.println("el numero no esta en el rango");
				}
										
			}					
			
			catch (Exception exc) {
				System.out.println("Error, ingrese un valor valido");
			}
		}	
	}	
}
