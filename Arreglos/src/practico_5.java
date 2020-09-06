
public class practico_5 {
	
	final static int max=10;

	public static void main(String[] args) {
		
		int [] arr = {95,84,76,65,59,43,32,24,11,5};
		
		int pos = 2;
		
		metodos.corrimiento_izquierda(arr, pos, max);
		
		arr[max-1] = 0;
		
		for(int i=0; i<max;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
