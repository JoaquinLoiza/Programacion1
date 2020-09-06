
public class ejeralumnos {

	public static void main (String[]args){

		int N = PedirEnteroPositivo();
		int cant = 1;
		int nota = 0;
		int aprobados = 0;
		int desaprobados = 0;
		int max=1;
		int min=10;

		while(cant<=N){
			
			nota=ingresarnotas();

			if(nota>max){
				max = nota;
			}

			if(nota<min){
				min = nota;
			}

			if(nota>=7){
				aprobados++;
			}

			if(nota<7){
				desaprobados++;
			}

			cant++;
		}

		System.out.println("La cantidad de aprobados es: "+ aprobados);

		System.out.println("La cantidad de desaprobados es: "+ desaprobados);

		System.out.println("la nota maxima es: "+ max +" "+"y la nota minima es: "+min);

	}

	public static int PedirEnteroPositivo() {

		int num = Principal.pedirentero();
		boolean validar = false;

		while (validar==false) {

			if (num>0) {
				validar=true;
			}
			else {
				num = Principal.pedirentero();
			}
		}
		return num;		
	}


	public static int ingresarnotas() {

		int nota = PedirEnteroPositivo();
		boolean validar = false;

		while(validar==false) {
			if (nota>0 && nota<11) {
				validar = true;
			}
			else {
				nota = PedirEnteroPositivo();
			}
		}
		return nota;
	}
}