
public class practico_2 {
	
	final static int max=10;

	public static void main(String[] args) {
		
		int [] arr = {12,20,33,45,51,69,70,88,93,101};		
		int pos = 4;
		
		metodos.corrimiento_derecha(arr, pos, max);
		
		for(int i=0; i<max;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
