
public class Parcial {

	final static int par=2;
	final static int multiplo=4;

	public static void main(String[] args) {

		char opcion=obtenerCaracterValido();
		int num1=ejeralumnos.PedirEnteroPositivo();
		int num2=num1;
		int existentes=num1;
		int suma=0;

		while(num2>=num1){
			num2=ejeralumnos.PedirEnteroPositivo();
		}

		if (opcion=='a'){

			while (existentes>=num2){
				existentes--;
				System.out.println(existentes);
			}
		}

		else if (opcion=='b'){

			suma=num1+num2;

			System.out.println("el promedio es: "+(double)suma/par);
		}

		else if (opcion=='c'){

			existentes=num1;

			while (existentes>num2){
				existentes--;

				if(existentes%par==0){
					System.out.println(existentes);
				}

			}
		}

		else if (opcion== 'd'){

			if(num1%multiplo==0 && num2%multiplo==0){

				System.out.println("Si los numeros son multiplos de 4");
			}
		}
	}
	public static char obtenerCaracterValido() {
		char caracter=Evaluación.pedirCaracter();
		boolean validar=false;

		while(validar==false) {
			if (caracter=='a'||caracter=='b'||caracter=='c'||caracter=='d') {
				validar=true;
			}
			else {
				caracter=Evaluación.pedirCaracter();
			}
		}

		return caracter;
	}

}
