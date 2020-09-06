import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio3 {
	
	public static void main(String[] args) {
	
		int N=1;
		int digitos=0;
		
		while (N!=0) {
			
			N=pedirNumValidos();
			
			if(N>0 && N<10) {
				digitos=1;
			}
			else if(N>9 && N<100) {
				digitos=2;
			}
			else if (N>99 && N<1000) {
				digitos=3;
			}
			else {
				System.out.println("Programa finalizado");
				digitos=0;
			}
			
				if(digitos==1||digitos==2) {
					System.out.println("La cantidad de digitos es: "+digitos);
				}
				else if(digitos==3) {
					System.out.println("La cantidad de digitos es: "+digitos+" y el numero es: "+N);
				}
		}		
	}
	public static int pedirNumValidos() {
		
		int num=0;
		boolean validar=false;
		
		while(validar==false) {
			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un numero entre 0 y 999:");
				num = Integer.valueOf(entrada.readLine());
				
				if(num>=0 && num<1000) {
					validar=true;
				}
				else {
					System.out.println("El numero no está en el rango");
				}
			}
			catch (Exception exc) {
				System.out.println("Numero invalido");
			}			
		}
		return num;
	}
}