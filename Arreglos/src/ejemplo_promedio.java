
public class ejemplo_promedio {
	
	final static int MAX = 10;
	public static void main(String args[]) {
		
	int B[]=new int[MAX];
	
		for (int pos=0;pos<MAX;pos++) {
			
			B[pos]=(int)(MAX* Math.random() +1);
		
			System.out.print(B[pos]+" ");
		}
		
		System.out.println("\n");
		
		System.out.println("el promedio es: " + promedio(B));
	}
	
	public static double promedio(int[] arr){
		
		double prom = 0;
		
		for (int pos=0;pos<MAX;pos++) {
			
			prom += arr[pos];
		
		}
		return (prom/MAX);
	}

}
