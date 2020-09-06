
public class practico_10 {

	final static int Max = 20;
	 
	public static void main(String[] args) {
		
		int [] arr = {0,0,0,9,9,7,0,4,1,3,9,8,5,1,2,5,6,1,3,4};
		int inicio = Max-1;
		int fin = Max;
		int contadorSecuencia = 0;

		while(inicio >= 0 && contadorSecuencia < 2) {
		
			inicio = metodos.buscarInicioReversa(arr, fin-1);
			
			fin = metodos.buscarFinReversa(arr, inicio);
			
			System.out.println(inicio);
			System.out.println(fin);
			
			contadorSecuencia++;
		}
		
		if (inicio == -1 || contadorSecuencia != 2) {
			System.out.println("No exite mas de 1 secuencia");
		}
		else {
			System.out.println("El inicio de la anteultima secuencia es: "+ fin);
			
			System.out.println("El fin de la anteultima secuencia es: "+ inicio);
		}
		
	}	
}