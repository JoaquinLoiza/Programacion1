
public class recuperatorio {
	
	final static int M = 3;
	final static int N = 13;
	
	public static void main (String[]args) {
		
		int [][] mat = {
			{0,2,0,0,6,7,0,1,4,2,0,8,0},
			{0,5,4,4,0,1,6,0,1,5,0,1,0},
			{0,6,2,0,4,1,2,0,4,9,0,0,0}
		  };
		int sumaMayor = 0;
		int tamMayor = 0;
		int inicioSecMayor = 0;
		int finSecMayor = 0;
		int fila = 0;
		
		for(int i=0;i<M;i++) {
			
			int inicio = 0;
			int fin = -1;
			int tam = 0;
			int suma = 0;
			
			while(inicio<N) {
				inicio = buscarInicio(mat[i],fin+1);
				if(inicio<N) {
					fin = buscarFin(mat[i], inicio);
					tam = (fin-inicio)+1;
					suma = sumarSec(mat[i], inicio, fin);
					
					if(suma>=sumaMayor) {
						sumaMayor = suma;
						tamMayor = tam;
						inicioSecMayor = inicio;
						finSecMayor = fin;
						fila = i;
					}
				}
			}
		}
		System.out.println("Suma de la secuencia: "+sumaMayor);
		System.out.println("Empieza en: Fila "+fila+" "+"columna "+inicioSecMayor);
		System.out.println("Termina en: Fila "+fila+" "+"columna "+finSecMayor);
		System.out.println("Tamaño: " + tamMayor);
	}

	private static int buscarFin(int[] arr, int pos) {
		
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

	private static int sumarSec(int[] arr, int inicio, int fin) {
		int suma = 0;
		for(int i=inicio; i<=fin;i++) {
			suma += arr[i];
		}
		return suma;
	}
}
