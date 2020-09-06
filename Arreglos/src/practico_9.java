
public class practico_9 {
	
	final static int Max = 20;
 
	public static void main(String[] args) {
		
		int [] arr = {0,0,0,9,9,7,1,4,0,3,9,8,5,0,0,0,6,0,3,4};
		int inicio = 0;
		int fin = 0;
		int sumaMayor = 0;
		int suma = 0;
		int inicioMayor = 0;
		int finMayor = 0;
		
		while(inicio < Max) {
		
			inicio = metodos.buscarInicio(arr, fin);
			
			fin = metodos.buscarFin(arr, inicio);
			
			suma = metodos.sumarSecuencia(arr, inicio, fin);
						
				if (suma > sumaMayor){
					
					sumaMayor = suma;
					
					inicioMayor = inicio;
					
					finMayor = fin;
				}			
				
			suma = 0;
			
			inicio = fin+1;
			
			fin = fin+1;
			
		}
		
		System.out.println("la suma de la secuencia mayor es: " + sumaMayor);
		System.out.println("La posicion de inicio de la secuencia mayor es: "+ inicioMayor);
		System.out.println("La posicion de fin de la secuencia mayor es: "+ finMayor);		
		
	}

}
