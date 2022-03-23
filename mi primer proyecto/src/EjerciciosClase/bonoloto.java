package EjerciciosClase;

public class bonoloto {

	public static void pintarvector(int numeros[]) {
		
		System.out.print("[");
		for (int i=0;i<numeros.length;i++)
			System.out.print(numeros[i]+"|");
		
		System.out.println("]");
	}
	
	public static boolean estarepetido(int numero,int[]vector) {
		boolean estarepetido=false;
		for (int i=0;i<vector.length;i++) {
			if (vector[i]==numero) {
				estarepetido=true;
				break;
			}
		}
		return estarepetido;
	}
	
	
	
	public static int generaraleatorio() {
		int numero=0;
		numero=(int)(Math.random()*49+2);
		return numero;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//programa que genere una combinacion de 6 numeros loteria
//esos numeros van de 1 a 49 //
//no puede haber ninguno repetido
		
		
		int combinacion[]=new int[6];
	
		int numero=0;
		for(int i=0;i<combinacion.length;i++) {
			do {
			numero=generaraleatorio();
			}while(estarepetido(numero,combinacion));
			
			combinacion[i]=numero;
			
		}
		
		
		pintarvector(combinacion);
	}

}
