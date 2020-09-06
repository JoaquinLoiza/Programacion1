
public class practico_1 {

	final static int max=10;

	public static void main(String[] args) {

		int[] arr = new int [max];
		
		for(int i=0; i<max; i++) {

			System.out.println("Ingrese el entero nro: "+i );
			
			arr[i] = metodos.pedirentero();
		}
		
		System.out.println("\n");
		
			for(int i=0; i<max; i++) {
				
				System.out.print(arr[i]+" ");
			}
	}
}
