
public class practico9_arreglos {
	
	final static int MAX=20;
	
	public static void main(String[] args) {

		int [] arr = {0,0,1,2,3,4,0,8,9,0,9,9,8,0,0,5,6,4,0,2};
		int inicio = 0;
		int fin = -1;
		int suma = 0;
		int inicioMayor = 0;
		int finMayor = 0;
		int sumaMayor = 0;
		
		while (inicio<MAX) {
			inicio = buscarInicio(arr, fin+1);
			if(inicio<MAX) {
				fin = buscarFin(arr, inicio);
				suma = sumarSec(arr, inicio, fin);
				
				if(suma>sumaMayor) {
					sumaMayor=suma;
					inicioMayor=inicio;
					finMayor=fin;
				}
			}
		}
		System.out.println("la suma mayor es: "+sumaMayor);
		System.out.println("el inicio es: "+inicioMayor);
		System.out.println("el fin es: "+finMayor);
	}

	private static int sumarSec(int[] arr, int inicio, int fin) {

		int suma=0;
		for(int i=inicio; i<=fin; i++) {
			suma+=arr[i];
		}
		return suma; 
	}

	private static int buscarFin(int[] arr, int pos) {
		
		while (pos < MAX && arr[pos] != 0) {
			
			pos ++;
		}
		
		 return pos-1;
	}

	private static int buscarInicio(int[] arr, int pos) {
		
		while(pos<MAX && arr[pos]==0) {
			pos++;
		}
		return pos;
	}
}
