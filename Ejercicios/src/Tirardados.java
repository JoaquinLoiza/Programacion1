
public class Tirardados {

	final static int veces=10000;
	
	public static void main (String[] args) {
		
	int valorrandom=0;
	int valor1 = 0;
	int valor2 = 0;
	int valor3 = 0;
	int valor4 = 0;	
	int valormax = 0;
	
		for(int i=0; i < veces ;i++) {
			
			valorrandom=(int)(Math.random()*4 + 1);
			
			if(valorrandom==1) {
				
				valor1++;
			}	
			else if (valorrandom==2) {
				
				valor2++;
			}
			else if (valorrandom==3) {
				
				valor3++;
			}
			else {
				valor4++;
			}						
		}
		//comprobar que valor salio mas veces
		
		if(valor1>valor2) {
			valormax=1;
		}
		else {
			valormax=2;
		}
		if (valormax==1) {
			
			if (valor3>valor1) {
				valormax=3;
			}
			else if (valor4>valor1) {
				valormax=4;
			}						
		}
		else if (valormax==2) {
			
			if (valor3>valor2) {
				valormax=3;
			}
			else if (valor4>valor2) {
				valormax=4;
			}
			
		}
		System.out.println("1= "+valor1+" "+"2= "+valor2+" "+"3= "+valor3+" "+"4= "+valor4);
		System.out.println(valormax);
		
		
	}
}