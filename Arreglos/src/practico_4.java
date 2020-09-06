
public class practico_4 {
	
	final static int max = 10;

	public static void main(String[] args) {
		
		int [] arr = {95,84,76,65,59,43,32,24,11,5};
		
		int entero = 0;
		
		int pos = 0;
		
		System.out.println("Ingrese un numero");
		
			entero = metodos.pedirentero();
						
		while (pos<max && entero<arr[pos]) {
				
				pos++;
				
		}	
		
				metodos.corrimiento_derecha(arr, pos, max);
				
				arr[pos] = entero;				
					
		for(int i=0; i<max;i++) {
			System.out.print(arr[i]+" ");
		}
	}	
}
