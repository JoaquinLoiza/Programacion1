
public class practica_ejemplo {
	
	final static int N = 10;
	
	public static void main(String[] args) {
		int []arr = {0,5,8,9,0,3,2,5,0,3};
		int [] patron = {5,8,9};
		int [] cambio = {7,9,6};
		
		
		buscarSec(arr, patron, cambio);
		
	}

	private static void buscarSec(int[] arr, int[] patron, int[] cambio) {
		int inicio = 0;
		int fin = -1;
		int tam = 0;
		boolean verif = false;
		int tamPatron = 0;
		int inicioPatron=0;
		int finPatron=-1;
		
		inicioPatron=metodos.buscarInicio(patron, finPatron+1);
		finPatron=metodos.buscarFin(patron, inicioPatron);
		tamPatron= (finPatron-inicioPatron)+1;
		
		
		while(inicio<N) {
			inicio = metodos.buscarInicio(arr, fin+1);
			
			if(inicio<N) {
				fin = metodos.buscarFin(arr, inicio);
				tam = (fin-inicio)+1;
			}
			if (tam == tamPatron) {
				
				verif = verificarSec(arr, inicio, patron, tam);
							
				if (verif == true) {
						
					cambiarSec(arr, inicio, tam, cambio);
				}
			}
		}
		
		metodos.imprimirArreglo(arr);
		
	}

	private static void cambiarSec(int[] arr, int inicio, int tam, int[] cambio) {
		
		for (int i=0; i<tam; i++) {
			
			arr[inicio]= cambio[i];
			
			inicio++;
		}
	
		
	}

	private static boolean verificarSec(int[] arr, int inicio, int[] patron, int tam) {
		
		boolean verif = false;
		
		
		for (int i = 0; i<tam; i++) {
			
			if(arr[inicio] != patron[i]) {
			
				verif=false;
			}
			else 
				verif = true;
				inicio ++;
		}
		
		return verif;
	}

}
