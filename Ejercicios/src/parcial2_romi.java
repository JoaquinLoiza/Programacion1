
public class parcial2_romi {
	final static int M=3;
	final static int N=10;
	public static void main(String[] args) {
		int [][] mat = {
				{0,1,2,0,5,6,7,3,2,1},
				{9,2,3,0,0,3,4,0,0,0},
				{0,5,9,4,5,6,7,8,9,1}
				};
		int inicioM = 0;
		int finM = 0; 
		
		for(int i=0; i<M; i++) {
			
			System.out.println();
			
			int inicio = 0;
			int fin = -1;
			int tam = 0;
			int tamM = 0; 
			
			while(inicio<N) {
				inicio = buscarInicio(mat[i],fin+1);
				if(inicio<N) {
					fin=buscarfin(mat[i], inicio); 
					tam = (fin-inicio)+1; 
					if(tam>tamM) {
						System.out.println("fila "+i);
						System.out.println("INI " + inicio);
						System.out.println("fin " + fin);
						tamM = tam;
						inicioM = inicio;
						finM = fin;
					}
				}
			}
			
			invertirSec(mat[i], inicioM, finM); 
		}
		
		imprimirMatriz(mat);
	}
	private static void imprimirMatriz(int[][] mat) {
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	
	private static int buscarfin(int[] arr, int pos) {
		while(pos<N && arr[pos]!=0) {
			pos++;
		}
		return pos-1;
	}
	
	private static int buscarInicio(int[] arr, int pos) {
		while(pos<N && arr[pos]==0) {
			pos++;
		}
		return pos;
	}
	
	private static void invertirSec(int[] arr, int inicioM, int finM) {
		int i = inicioM;
		int f = finM;
		int aux = 0;
		
		while(i<f) {
			aux = arr[i];
			arr[i] = arr[f]; 
			arr[f] = aux;
			i++;
			f--;
		}	
	}
	
}
