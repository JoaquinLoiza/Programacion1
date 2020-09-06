import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cincuentanum {

	final static int veces = 10;	

	public static void main (String[]args){

		int num1 = 0;
		int num2 = 0;
		int multoinp = 0;
		int suma = 0; 

		for (int i=0 ; i<veces ; i++){

			num2=pedirEnteroPositivo();

			while (num2<=num1){
				
				System.out.println("el numero debe ser mayor al anterior");

				num2=pedirEnteroPositivo();
			}
			if (num2 %7==0 || num2 %2!=0){
				multoinp++;
			}

			suma= suma+num2;

			num1 = num2;
		}

		System.out.println("\n"+"El promedio de los numeros ingresados es: "+(double)suma/veces);

		System.out.println("\n"+multoinp+" de los numeros fueron inpares o multiplos de 7");
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

	public static int pedirEnteroPositivo() {

		int num = pedirentero();
		boolean validar = false;

		while (validar==false) {

			if (num>0) {
				validar=true;
			}
			else {
				num = pedirentero();
			}
		}
		return num;		
	}

}