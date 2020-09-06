
public class practico_2 {
	
	final static int filas = 10;
	final static int columnas = 10;
	
	public static void main(String[] args) {
			
			int [][] mat = new int [filas][columnas];
			int [] filaNueva = {0,2,4,8,1,6,6,0,4,3}; 
			int pos = 4;
			
			metodos.cargarMatriz(mat, filas, columnas, 10);
			
			metodos.imprimirMatriz(mat, filas, columnas);
			
			System.out.println();
			
			metodos.remplazarFila(mat, filaNueva, pos);
			
			metodos.imprimirMatriz(mat, filas, columnas);
	}	
}
