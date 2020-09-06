
public class practico_8 {
	
	final static int Invalido = -1;
	final static int Max = 20;

	public static void main(String[] args) {
		
		int [] arr = {0,0,0,2,5,7,1,4,0,3,9,8,5,0,0,0,6,0,3,4};
		
		int inicio = 0;
		
		int fin = 0;
		
		inicio = metodos.buscarInicio(arr, fin); //busco inicio desde la posicion fin
		
		System.out.println("El inicio es: " + inicio + "\n");
		
		if (inicio != Invalido) {
		
			fin = metodos.buscarFin(arr, inicio);
		
			System.out.println("El fin es: " + fin);
		}
		
		else 
			
			System.out.println("No existen secuencias");
			
	}

}