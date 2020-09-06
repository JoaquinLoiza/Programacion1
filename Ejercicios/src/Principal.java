import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) {
	
			resolverej();	
	}
	
	public static int pedirentero() {

		int entero = 0;
		boolean validar = false;

		while (validar == false)
			try { 
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un numero");
				entero = Integer.valueOf(entrada.readLine());
				validar = true;
			} 
		catch (Exception exc) {
			System.out.println("Error al ingesar el valor, ingreselo nuevamente");
		}
		return entero;
	}
	
	public static void resolver() {

		int num = 0;
		int sum = 0;
		int neg = 0;
		int mult = 0;
		
		for (int i=0;i<10;i++) {
			num = pedirentero();
			if (num<0) {
				neg++;
			}
			if (num%15 == 0) {
				mult++;
			}
			if (num%2 ==0) {
				sum+=num;
			}
			
		}
		System.out.println("En la lista ingresada hay "+neg+" números negativos, "+mult+" múltiplos de 15 y la suma de todos los números pares da un total de "+sum);
	}
	
	public static char obteneropcion() {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		char opcion = 'x';
		boolean validar = false;

		while (validar == false)
			try { 
				System.out.println("Ingrese opción a o b: ");
				opcion = (char) (entrada.readLine().charAt(0));
				
				if ((opcion == 'a')||(opcion == 'b')) {
					validar = true;					
				}				
				
			} 
			catch (Exception exc) {
			
			}
		
		return opcion;				
		
	}
		
	//Submetododo valoresvalidos
	
	public static int valoresvalidos() {
		int valor = 0;
		int max = 9;
		
		System.out.println("Ingresar valor menor que 10: \n");
		
		do {
			valor = pedirentero();
		}
		
		while (valor>max);
		
		return valor;		
	}

	public static void resolverej() {
		int valor = 0;
		char opcion = obteneropcion();
		int n = valoresvalidos();
		int m =	valoresvalidos();
		
		
			if (opcion == 'a') {
								
				valor = n+m;
			}
			else {
				
				valor = n-m;
			}
			
			System.out.println("el resultado es "+valor);
																			
	}
}
