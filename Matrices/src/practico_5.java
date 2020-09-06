
public class practico_5 {
	
	final static int m = 4;
	final static int n = 5;
	
	public static void main(String[] args) {
		
		
		int[] nuevaFila = {4,1,3,0,2}; //suma 10
		int[][] mat = {
						{0,2,4,0,1}, // suma 7
						{2,0,5,3,1}, // suma 11
						{7,2,4,0,2}, // suma 15
						{8,5,6,0,4}	 //	suma 23	
					  };
		
			metodos.imprimirMatriz(mat, m, n);
		
			System.out.println();
		
		    insertarFilaOrdenada(mat, nuevaFila);
		    
		    metodos.imprimirMatriz(mat, m, n);	  
			
	}

	public static void insertarFilaOrdenada(int[][] mat, int []nuevaFila) {
		
		int suma = sumarFila(nuevaFila);
		
		int pos = buscarPosicion(mat, suma);
		
		metodos.remplazarFila(mat, nuevaFila, pos);
	}

	public static int buscarPosicion(int[][] mat, int suma) {
	
		int fila = 0;
		int sumaFila = sumarFila(mat[fila]);
		
		while (fila<n && suma > sumaFila) {
			fila++;	
			sumaFila = sumarFila(mat[fila]);
		}
		
		return fila;
	}

	public static int sumarFila(int [] nuevaFila) {
		
		 int suma = 0;
		 
		 for(int i=0; i < n; i++) {
			
			 suma += nuevaFila[i];
		 }		
		return suma;
	}	
}