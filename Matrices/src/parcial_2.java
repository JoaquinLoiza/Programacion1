
public class parcial_2 {
	final static int M = 3;
	final static int N = 13;
	
	public static void main(String[] args) {
		
		int [][] mat = {
				{1,2,0,0,6,7,0,1,4,2,1,8,0},
				{0,5,4,2,0,1,6,0,2,0,0,1,0},
				{0,1,2,3,4,5,6,7,8,9,0,0,0}
		};
		
		metodos.imprimirMatriz(mat, M, N);
		System.out.println();
		
		for(int i=0; i<M; i++) {
						
			invertirSecMayor(mat[i]);	
		}
		
		metodos.imprimirMatriz(mat, M, N);
	}

	private static void invertirSecMayor(int [] arr) {
		int tam = 0;
		int tamMayor = 0; 
		int inicio = 0;  
		int fin = -1;
		int inicioMayor = 0;
		
		while(inicio<N) {
			
			inicio = buscarInicio(arr, fin+1);
			
			if (inicio<N) {
				fin = buscarFin(arr, inicio);
				tam = (fin-inicio)+1;
			}
			if (tam>tamMayor) {
				tamMayor=tam;
				inicioMayor=inicio;
			}
			
		}
		
		invertirSec(arr, inicioMayor, tamMayor);
		
	}

	private static void invertirSec(int[] arr, int inicio, int tam) {
		
		int fin = inicio+tam-1;
		int aux = 0;
		
		while(inicio<fin) {
			
			aux = arr[inicio];
			arr[inicio]= arr[fin];
			arr[fin] = aux;
			
			inicio++;
			fin--;
		}
		
	}
	
	private static int buscarFin(int[] arr, int pos) {
		
		while(pos<N && arr[pos] != 0) {
			pos++;
		}
		return pos -1;
	}

	private static int buscarInicio(int[] arr, int pos) {
		while(pos<N && arr[pos] == 0) {
			pos++;
		}
		return pos;
	}

}
