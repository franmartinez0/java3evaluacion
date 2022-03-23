package EjerciciosClase;

public class abecedariovector {

public static void pintarvector(char letras[]) {
		
		System.out.print("[");
		for (int i=0;i<letras.length;i++)
			System.out.print(letras[i]+",");
		
		System.out.println("]");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char abecedario[]=new char[26];
char car='A';
for(int i=0;i<abecedario.length;i++) {
	abecedario[i]=car;
	car++;
}
pintarvector(abecedario);
	}
	

}
