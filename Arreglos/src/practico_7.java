public class practico_7 {

	final static int max = 10;

	public static void main (String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,10,20};
		int ultimo = arr[max-1];
		int primero =0;
		int tamañoReal = max-1;
		int pos = 0;
		
		metodos.imprimirArreglo(arr);
		System.out.println("");

		while(pos<tamañoReal){
	
			primero = arr[0];
	
			metodos.corrimiento_izquierda(arr, pos,tamañoReal);
	
			arr[tamañoReal]=primero;
	
			tamañoReal--;
		}
		
		arr[0]=ultimo;
	
		metodos.imprimirArreglo(arr);
	}	
}