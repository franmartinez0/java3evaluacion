package EjerciciosClase;

public class ejemploarrays {

	public static void pintarvector(int numeros[]) {
		
		System.out.print("[");
		for (int i=0;i<numeros.length;i++)
			System.out.print("");
		
		System.out.println("]");
	}
	
	public static void sumarimpares (int numeros[]) {
		int suma=0;
		for(int i=0;i<numeros.length;i+=2) {
			suma=suma+numeros[i];
		
		}
			System.out.print(", ");
		System.out.println("|");
	}
	
	public static void esprimo(int numero) {
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numeros[]=new int[20];
for (int i=0;i<numeros.length;i++)
	numeros[i]=(int)(Math.random()*100+1);


pintarvector(numeros);
System.out.println(sumarimpares(numeros));
	}

}
