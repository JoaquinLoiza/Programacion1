
public class practico_3 {
	
	final static int filas = 10;
	final static int columnas = 10;
	
	public static void main(String[] args) {
			
			int [][] mat = new int [filas][columnas];
			int pos = 4;
			
			metodos.cargarMatriz(mat, filas, columnas, 10);
			
			metodos.imprimirMatriz(mat, filas, columnas);
			
			metodos.eliminarFila(mat, pos, columnas);
			
			System.out.println("\n");
			
			metodos.imprimirMatriz(mat, filas, columnas);
								
	}
}