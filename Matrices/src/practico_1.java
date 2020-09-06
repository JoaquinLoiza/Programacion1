
public class practico_1 {
	
	final static int filas = 10;	
	final static int columnas = 10;

	public static void main(String[] args) {
		
		int [][] mat = new int [filas][columnas];
		int suma = 0;
		int filaInvertir = 0;
		int aux = 0;

						
		metodos.cargarMatriz(mat, filas, columnas, 10); //el num 10 indica hasta que numero quiero el Random, 
														//en este caso de 0 a 9.	
		metodos.imprimirMatriz(mat, filas, columnas);
		
		System.out.println();
	//a)
		
		suma = sumaDiagonal(mat);
		
		System.out.println("La suma de la diagonal es: " + suma +"\n");
		
	//b)
		 
		aux = mat[filaInvertir][0];
		
		mat[filaInvertir][0] = mat[filaInvertir][columnas-1];
		
		mat[filaInvertir][columnas-1] = aux;
			
		metodos.imprimirMatriz(mat, filas, columnas);
		
	}
	
	private static int sumaDiagonal(int[][] mat) {
		int suma = 0;
		for (int j = 0; j < columnas; j++) {
			suma += mat[j][j];
		}
		return suma;
	}
}
