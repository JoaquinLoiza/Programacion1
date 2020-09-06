import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cuatro_en_linea {

		public static void main(String[] args) {
			
			System.out.println("Ingrese cantidad de filas del tablero con las que desea jugar:");
			int N = pedirTamaño();
			System.out.println("Ingrese cantidad de columnas del tablero con las que desea jugar:");
			int M = pedirTamaño();
			char [][] mat = new char [N][M];
			char color = ' ';
			int columna = -1;
			int jugadas = 0;
			int modo = 0;
			int posFila = 0;
			boolean ganador = false;
			
			System.out.println("Precione 1 - J1 vs J2");
			System.out.println("Precione 2 - J1 vs PC");
			
			modo = pedirModo();
			
			if (modo == 1) {
				System.out.println("Modo de juego - J1 vs J2");
			}
			else if (modo == 2) {
				System.out.println("Modo de juego - J1 vs PC");
			}

			System.out.println("\n-----  EL JUEGO HA COMENZADO!! -----");
			cargarMatriz(mat, N, M);

			while (jugadas != N*M && ganador != true) {	
				
				color = selecColor(jugadas);
				System.out.println("\nTurno del color: "+color);
				System.out.println("\nIngrese una columna:");
				
				if (modo == 2 && color=='A') {
					
					columna = (int)(Math.random()*M);
				}
				else {				
					columna = pedirenteroValido(M);
				}
				
				while (mat[0][columna]!='-') {
					
					if (modo == 2 && color=='A') {
						
						columna = (int)(Math.random()*M);
					}
					else {				
						
						System.out.println("Columna completa, ingrese otro valor:");
						columna = pedirenteroValido(M);
					}		
				}
				posFila = tirarFicha(mat, columna, color, N);
				imprimirMatriz(mat, N, M);
				System.out.println();
				jugadas++;
				ganador = verificarGanador(mat, posFila, columna, N, M, color);
			}
			
			if (jugadas == N*M && ganador != true) {
				System.out.print("----  ( .>__<)   JUEGO EMPATADO!!!  ----");
			}
			else {
				System.out.println("----  ( /^_^)/   GANÓ EL COLOR: "+color+"!!!"+" ----");
			}
		}

		private static int buscarHorizontal(char[][] mat, int fila, int columna, int M, char color) {
			
			int contador = 1;
			int fin = 0;
			int inicio = 0;
			inicio = buscarFinReversa(mat[fila], columna, color);
			fin = buscarFin(mat[fila], columna, M, color);
				
			for(int i=inicio; i<fin; i++) {
				if (mat[fila] [i] == mat[fila] [i+1]) {
					contador++;
				}
			}
			return contador;
		}
		
		private static int buscarVertical (char [][] mat, int fila, int columna, int N, char color ) {
			
			int contador = 1;
			int fin = 0;
			
			fin = buscarFinVertical(mat, fila, columna, N, color);
			
			for(int i=fila; i<fin; i++) {
				if (mat[i] [columna] == mat[i+1] [columna]) {
					contador++;
				}
			}
			return contador;	
		}
		
		private static int buscarDiagonalAsc(char[][] mat, int fila, int columna, int N, int M, char color) {
			
			int contador = 1;
			int filaAux = fila;
			int columAux = columna;
			int contadorA = 0;
			int contadorB = 0;
				
			while (filaAux>0 && filaAux<N && columAux>=0 && columAux<M-1) {
				
				if (mat[filaAux][columAux] == mat[filaAux-1][columAux+1]) {
					
					if (mat[filaAux][columAux] == color) {
					
						contadorA ++;
					}
				}
				filaAux --;
				columAux ++;
			}
			
			filaAux = fila;
			columAux = columna;
			
			while (filaAux>=0 && filaAux<N-1 && columAux>0 && columAux<M) {
				
				if (mat[filaAux][columAux] == mat[filaAux+1][columAux-1]) {
					
					if (mat[filaAux][columAux] == color) {		

						contadorB ++;
					}
				}	
				filaAux ++;
				columAux --;
			}
			contador = (contadorA+contadorB)+1;
			return contador;
		}
		
		private static int buscarDiagonalDesc(char[][] mat, int fila, int columna, int N, int M, char color) {
			
			int contador = 1;
			int filaAux = fila;
			int columAux = columna;
			int contadorA = 0;
			int contadorB = 0;
			
			while (filaAux>=0 && filaAux<N-1 && columAux>=0 && columAux<M-1) {
				
				if (mat[filaAux][columAux] == mat[filaAux+1][columAux+1] && mat[filaAux][columAux] == color) {
					
						contadorA ++;
				}
				filaAux ++;
				columAux ++;
			}
			
			filaAux = fila;
			columAux = columna;
			
			while (filaAux>0 && filaAux<N && columAux>0 && columAux<M) {
				
				if (mat[filaAux][columAux] == mat[filaAux-1][columAux-1] && mat[filaAux][columAux] == color) {
					
						contadorB ++;	
				}	
				filaAux --;
				columAux --;
			}
			contador = (contadorA+contadorB)+1;
			return contador;
		}
		
		private static boolean verificarGanador(char[][] mat, int fila, int columna, int N, int M, char color) {
			
			boolean ganador = false;
			
			int horizontal = 0;	
			int vertical = 0;	
			int diagonalAsc = 0;
			int diagonalDesc = 0;
						
			horizontal = buscarHorizontal(mat, fila, columna, M, color);
			vertical = buscarVertical(mat, fila, columna, N, color);
			diagonalAsc = buscarDiagonalAsc(mat, fila, columna, N, M, color);
			diagonalDesc = buscarDiagonalDesc(mat, fila, columna, N, M, color);
			
			if (horizontal > 3 || vertical > 3 ||diagonalAsc > 3 || diagonalDesc > 3 ) { 
				ganador = true;
			}	
			return ganador;
		}
		
		private static int buscarFinVertical(char[][] mat, int fila, int columna, int N, char color) {
			
			while (fila < N && mat[fila][columna] == color) {
				
				fila ++;
			}
			 return fila-1;
		}
		
		private static int buscarFinReversa(char[] arr, int pos, char color) {
			
			while (pos >=0 && arr[pos] == color) {
				
				pos--;
			}
			
			return pos+1;

		}
		
		private static int buscarFin(char[] arr, int pos, int M, char color) {
			
			while (pos < M && arr[pos] == color) {
				
				pos ++;
			}
			
			 return pos-1;
					
		}
		
		private static int pedirTamaño() {
			
			int num = pedirentero();
			
			while (num<4 || num>10) {
				System.out.println("El tamaño del tablero debe ser maximo 10x10, y minimo 4x4, ingrese otro valor:");
				num = pedirentero();
			}			
			return num;
		}
		
		private static int pedirenteroValido(int M) {
			
			int num = pedirentero();
			
			while (num>=M || num<=-1) {
				System.out.println("Ingrese un numero entre 0 y "+ (M-1));
				num = pedirentero();
			}
			return num;
		}
		
		private static int pedirModo() {
			
			int selec = pedirentero();
			
			while (selec != 1 && selec != 2) {
				System.out.println("numero incorrecto, ingrese 1 ó 2");
				selec = pedirentero();
			}

		return selec;			
		}
		
		private static char selecColor(int jugadas) {
			
			char color = ' ';
			
			if(jugadas%2 == 0) {	
				color = 'R';
			}
			else {
				color = 'A';
			}
			
			return color;
		}
		
		private static int tirarFicha(char[][] mat, int columna, char color, int N) {
			int i = N-1;
			while(i>=0 && mat[i][columna]!='-') {
			
				i--;
			}
			if (i != -1) {
				mat[i][columna]=color;	
			}
			return i;
		}
		
		private static void imprimirMatriz(char[][] mat, int filas, int columnas) {
			
			for (int j=0; j<columnas; j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
	 		for (int i=0; i<filas; i++) {
	 			
	 			for(int j=0; j<columnas; j++) {
	 				
	 				System.out.print(mat[i][j]+"  ");
	 			}
	 			System.out.println();
	 		}
			
		}
		
		private static void cargarMatriz(char[][] mat, int filas, int columnas) {
			
			for (int i=0; i<filas; i++) {
	 			
	 			for(int j=0; j<columnas; j++) {
	 				
	 				mat[i][j] = '-';
	 			}
	 		}	
		}
		
		private static int pedirentero() {
			
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
	}

