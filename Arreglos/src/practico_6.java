
public class practico_6 {

	final static int max = 10;

	public static void main (String[] args) {

		int arr[]={3,10,80,33,50,51,60,70,89,2};
		int tama�oReal=max;
		int pos = 0;

		while(pos<tama�oReal){
		
			if(arr[pos] %2==0){

				metodos.corrimiento_izquierda(arr, pos, max);
				tama�oReal--;
			}
			else {
				pos++;
			}
		}

		for(int i=0; i<max;i++){

			System.out.print(arr[i]+" ");
		}

	}
	
}
