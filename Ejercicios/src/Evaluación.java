import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Evaluación {

	final static int mult1=2;
	final static int mult2=3;
		
	public static void main (String[] args) {
		
		int NUM = Principal.pedirentero();
		char caracter = ' ';
		
		if ( esMultiplo(NUM,mult1) && esMultiplo(NUM,mult2) ) {
			
			for (int i=0; i<NUM ;i++) {	
	
				caracter = pedirCaracter();
				
				if(Character.isUpperCase(caracter)) {
					System.out.println("Es mayuscula");
				}
				else if (Character.isLowerCase(caracter)) {
					System.out.println("Es minuscula");
				}
				else if (Character.isDigit(caracter)) {
					System.out.println("Es digito");
				}
				else {
					System.out.println("es otro");
				}
			}
		}											
	}
	
	public static boolean esMultiplo(int num1,int num2) {
		
		if (num1%num2==0) {
			
			return true;
		}
		else {
			return false;
		}								
	}
	
	public static char pedirCaracter() {
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			char opcion = ' ';
			boolean validar = false;
	
			while (validar == false)
				try { 
					System.out.println("Ingrese un caracter: ");
					opcion = (char) (entrada.readLine().charAt(0));	
					validar = true;					
				}
			
				catch (Exception exc) {				
				}
			
			return opcion;							
	}
}
