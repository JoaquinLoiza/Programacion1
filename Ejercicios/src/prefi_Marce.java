
public class prefi_Marce {

	public static final int N=19;

	public static void main(String[] args) {

		int []arr = {0,1,2,0,3,2,5,0,4,5,6,0,0,4,5,0,3,2,0};
		int []arrP= {8,8,8};
		boolean z;
		int tamM=arrP.length;
		int inicio=0;
		int fin=-1;
		int tam;

		while(inicio<N) {
			inicio=buscarInicio(arr, fin+1);
			if(inicio<N) {
				fin=buscarFin(arr, inicio);
				tam=fin-inicio+1;
				z=esAscendente(arr,inicio,fin);	

				if(z == true && tam<tamM) {  //cuando el tamaño de la sec es menor
					for(int i=0;i<tamM-tam;i++) {
						corrimiento_Derecha(arr,inicio);
						insetarArreglo(arr,arrP,inicio,inicio+tam);
					}
					fin=inicio+tamM-1;		
				}
				else if (z == true && tam>=tamM){
					if (tam == tamM) {  //cuando el tamaño de la sec es igual
						insetarArreglo(arr,arrP,inicio,fin);
					}
					else {   //cuando el tamaño de la sec es mayor
						for(int i=tam; i>tamM; i--) {
							corrimiento_izq(arr,inicio);
							insetarArreglo(arr,arrP,inicio,inicio+tamM-1);
						}
						fin=inicio+tamM-1;	
					} 	
				}	
			}
		}
		imprimirArreglo(arr);
	}

	private static void imprimirArreglo(int[] arr) {
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void insetarArreglo(int[] arr, int[] arrP, int inicio, int fin) {
		int j=0;
		for(int i=inicio;i<=fin;i++) {
			arr[i]=arrP[j];
			j++;
		}	
	}

	private static void corrimiento_izq(int[] arr, int inicio) {	
		for (int i = inicio; i<N ;i++) {
			if (i != N-1) { 
				arr[i] = arr[i+1];
			}
			else {
				arr[i] = 0;
			}
		}
	}

	private static void corrimiento_Derecha(int[] arr, int inicio) {
		for(int i=N-1;i>inicio;i--){
			arr[i]=arr[i-1];
		}
	}	

	private static boolean esAscendente(int[] arr, int inicio, int fin) {
		boolean w=false;
		while(inicio<fin) {
			if (arr[inicio] < arr[inicio+1]) {
				w=true;
				inicio++;
			}
			else {
				w=false;
				inicio=fin;	
			}	
		}
		return w;
	}

	private static int buscarFin(int[] arr, int i) {
		while (i<N && arr[i]!=0){
			i++;
		}
		return i-1;
	}

	private static int buscarInicio(int[] arr, int i) {
		while (i<N && arr[i] ==0){
			i++;
		}
		return i;
	}

}