public class recuperatorio_romi {
	final static int M=3;
	final static int N=3; 

	public static void main(String[] args) {
		int [][] mat = {
				{0,1,0},
				{9,2,3},
				{0,5,9}
				};
		int inicioMayor = 0;
		int finMayor = 0; 
		int sumaMayor = 0; 
		int tam = 0; 
		int fila = 0;
		
		for(int i=0; i<M; i++) {
			
			int inicio = 0;
			int fin = -1;
			int suma = 0;
			
			while(inicio<N) {
				inicio =  buscarInicio(mat[i], fin+1); 
				if(inicio<N) {
					fin = buscarFin(mat[i], inicio); 
					suma = sumarSec(mat[i], inicio, fin);
					if (suma>=sumaMayor){
						sumaMayor = suma;
						inicioMayor=inicio; 
						finMayor=fin;
						tam = (fin-inicio)+1; 
						fila=i;
					}
				}
			}

		}
		
		System.out.println("La suma es: "+sumaMayor);
		System.out.println("Empieza en la poscicion: Fila " + fila + " columna "+ inicioMayor);
		System.out.println("Termina en la poscicion: Fila " + fila + " columna " + finMayor);
		System.out.println("El tamaño es: "+tam);

	}


	private static int sumarSec(int[] arr, int inicio, int fin) {
		int total=0;
		
		for(int i=inicio; i<=fin; i++){
			total += arr[i];
		}
		return total;
	}

	private static int buscarFin(int[] arr, int pos) {
		while(pos<N && arr[pos]!=0) {
			pos++;
		}
		return pos-1;
	}

	private static int buscarInicio(int[] arr, int pos) {
		while(pos<N && arr[pos]==0){
			pos++;
		}
		return pos;
	}
}
