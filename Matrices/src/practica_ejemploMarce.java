public class practica_ejemploMarce {

	public static final int N=10;
	
	public static void main(String[] args) {
		
		int[]arr= {0,5,8,9,0,3,2,5,0,3};
		int[]patron= {5,8,9};
		int[]cambio= {7,9,9};
		int inicio=0;
		int fin=-1;
		int tam;
		int z;

		while(inicio<N) {
			inicio=buscarInicio(arr,fin+1);

			if(inicio<N) {
				
				fin=buscarFin(arr,inicio);
				tam=fin-inicio+1;
				z=contidadig(arr,inicio,fin,cambio,patron);

				if(tam==z) {
					insertar( arr,  inicio,  fin,cambio);
				}
			}
		}
		imprimir(arr);

	}
	public static int contidadig(int[] arr, int inicio, int fin,int[]cambio,int[]patron) {
		int z=patron.length;
		int contador=0;
		int j=0;
		if((fin-inicio+1)==z) {
			for(int i=inicio;i<fin+1;i++) {
				if (arr[i]==patron[j]) {
					j++;
					contador++;
				}
			}
		}
		System.out.println(contador);
		return contador;
	}
	public static void imprimir(int[] arr) {
		for(int pos=0;pos<N;pos++){
			System.out.print( arr[pos]+ " ");//aca imprime a todo el arreglo.//
		}

	}
	public static void insertar(int[] arr, int inicio, int fin,int[]cambio) {
		int z=0;
		for(int j=inicio;j<fin+1;j++) {
			arr[j]=cambio[z];
			z++;
		}

	}
	public static int buscarFin(int[] arr, int inicio) {
		int i= inicio;
		while (i<N && arr[i]!=0){
			i++;
		}
		return (i-1);
	}
	public static int buscarInicio(int[] arr, int fin) {
		int i=fin;
		while (i<N && arr[i] ==0){
			i++;
		}
		return i; 

	}


}