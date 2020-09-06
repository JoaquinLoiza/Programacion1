
public class practico_4 {
	
	final static int filas = 10;
	final static int columnas = 10;
	
	public static void main(String[] args) {
			
			int [][] mat = new int [filas][columnas];
			
			metodos.cargarMatriz(mat, filas, columnas, 10);
			
			metodos.imprimirMatriz(mat, filas, columnas);
			
			metodos.ordenarFilasMatAsc(mat);
			
			System.out.println("\n");
			
			metodos.imprimirMatriz(mat, filas, columnas);	
			
	}
}
