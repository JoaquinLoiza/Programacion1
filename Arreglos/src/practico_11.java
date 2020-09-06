
public class practico_11 {
	
	final static int Max = 20;
	
	public static void main(String[] args) {
		
		int [] arr = {0,0,0,9,9,7,1,4,0,3,9,8,5,0,0,0,6,5,0,4};
		int num = 0;
		int inicio = 0;
		int fin = -1;
		int tamañoSecuencia = 0;
		
		System.out.println("Ingrese un tamaño de secuencia a borrar");
		num = metodos.pedirentero();
		
		while(inicio < Max) {
			
			inicio = metodos.buscarInicio(arr, fin+1);
			
			fin = metodos.buscarFin(arr, inicio);
				
			tamañoSecuencia = (fin - inicio) + 1;
			
			if(num == tamañoSecuencia) {
				
				for (int i = inicio; i<=fin; i++) {
					
					metodos.corrimiento_izquierda(arr, inicio, Max);
				
				}	
				fin = fin-tamañoSecuencia;
			}
					  					
		}
		
		metodos.imprimirArreglo(arr);
		
	}
}
