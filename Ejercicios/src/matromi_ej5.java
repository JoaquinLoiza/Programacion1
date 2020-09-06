
public class matromi_ej5 {

	final static int M = 5;
	final static int N = 3;
	
	public static void main(String[] args) {

		int [][] mat = {
				{0,1,2},
				{0,3,4},
				{0,2,8},
				{0,9,4},
				{0,9,8},
		};
		int [] newFila = {0,0,9};
		int suma = 0;
		int sumaArr = sumarFila(newFila);
		boolean corte = false;
		int i =0;
		
		while(i<M) {	
			suma=sumarFila(mat[i]);
			if(sumaArr<suma) {
				while(corte==false) {				
					insertarFila(mat[i], newFila);
					corte=true;
				}
			}
			i++;
		}
		imprimirMatriz(mat);
	}
	private static void insertarFila(int[] arr, int[] newFila) {
		for(int i=0; i<N;i++) {
			arr[i]=newFila[i];
		}
	}
	
	private static int sumarFila(int [] newFila) {
		 int suma = 0;
		 
		 for(int i=0; i < N; i++) {
			
			 suma += newFila[i];
		 }		
		return suma;
	}
	
 	public static void imprimirMatriz(int mat [][]) {
 		
 		for (int i=0; i<M; i++) {
 			
 			for(int j=0; j<N; j++) {
 				
 				System.out.print(mat[i][j]+" ");
 			}
 			System.out.println();
 		}
 	}

}
