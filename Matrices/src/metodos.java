import java.io.BufferedReader;

import java.io.InputStreamReader;


public class metodos {
	
	final static int Invalido = -1;
	
	public static int pedirentero() {
		
		int entero = 0;
		boolean validar = false;

		while (validar == false)
			try { 
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				entero = Integer.valueOf(entrada.readLine());
				validar = true;
			} 
			catch (Exception exc) {
				System.out.println("Valor invalido, ingreselo nuevamente");
			}
		return entero;
	}
	
	public static void corrimiento_derecha(int[] arr, int pos, int max) {
	
		for(int i=max-1; i>pos; i--) {
			
			arr[i]=arr[i-1];
		} 
		
	}
	
	public static void corrimiento_izquierda(int[] arr, int pos, int max) {
		
		
		for(int i=pos; i<max; i++) {
			
			if(i!=max-1)
			
				arr[i]=arr[i+1];
			
			else {
				arr[max-1]=0;
			}			
		}		
	}
	
	public static void imprimirArreglo(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
	}

	public static int buscarInicio(int [] arr, int pos) {
		
		
		while (pos < arr.length && arr[pos] == 0) {
			
			pos++;
		}
		
		return pos;
		
	}

	public static int buscarFin(int[] arr, int pos) {
		
		while (pos < arr.length && arr[pos] != 0) {
			
			pos ++;
		}
		
		 return pos-1;
				
	}

	public static int sumarSecuencia(int[] arr, int inicio, int fin) {
		
		int suma = 0;
		
		for (int j = inicio; j<=fin; j++) {
			
			suma += arr[j];
		}
				
		return suma;
	}

	public static int buscarInicioReversa(int[] arr, int pos) {

		while (pos >= 0 && arr[pos] == 0) {
			
			pos--;
		}
		return pos;
	}

	public static int buscarFinReversa(int[] arr, int pos) {
		
		while (pos >=0 && arr[pos] != 0) {
			
			pos--;
		}
		
		return pos+1;

	}	

 	public static void imprimirMatriz(int mat [][], int filas, int columnas) {
 		
 		for (int i=0; i<filas; i++) {
 			
 			for(int j=0; j<columnas; j++) {
 				
 				System.out.print(mat[i][j]+" ");
 			}
 			System.out.println();
 		}
 	}

	public static void cargarMatriz(int[][] mat, int filas, int columnas, int max) {
		
		for (int i=0; i<filas; i++) {
 			
 			for(int j=0; j<columnas; j++) {
 				
 				mat[i][j]=(int)(Math.random()*max);
 			}
 		}	
	}

	public static void remplazarFila(int[][] mat, int[] filaNueva, int pos) {
		
		for(int j=0; j<mat[0].length; j++) {
			
			mat[pos][j] = filaNueva[j];
		}	
	}

	public static void eliminarFila(int[][] mat, int pos, int columnas) {
		
		for(int i=pos; i<mat.length;i++) {
			
			if(i!=mat.length-1) {
			
				for(int j=0; j<mat[i].length; j++) {
				
					mat[i][j]=mat[i+1][j];
				}
			}
			
			else {
				
				for(int j=0; j<mat[i].length; j++) {
					
					mat[i][j] = 0;
				}
			}
		}		
	}
	
	public static void ordenarArregloAscendente(int[] arr) {
		
		int aux = 0;
		
		for(int i = 1; i<arr.length;i++) {
			
			for(int j = 0; j<arr.length-1 ;j++) {
				
				if(arr[j] >arr[j+1]) {
					
					aux = arr[j];
					
					arr[j]=arr[j+1];
					
					arr[j+1]=aux;
				}
			}
		}	
	}

	public static void ordenarFilasMatAsc(int[][] mat) {
		
		for(int i=0; i<mat.length;i++) {
		
			ordenarArregloAscendente(mat[i]);
		}
	}
}
