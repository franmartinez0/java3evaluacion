package ejerciciosarrays;

public class ejercicio1 {
	public static void pintarvector(int numeros[]) {
		
		for (int i=0;i<numeros.length;i++)    
			System.out.print(numeros[i]+"|");
			System.out.print("");
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numeros[]=new int[10];

				for(int i=0;i<8;i++) {
						numeros[i]=(int)(Math.random()*100+1);
						
				
				}
				
				pintarvector(numeros);
				
				for (int i=9;i>=0;i--){
					System.out.print(numeros[i]+"|");
					System.out.print("");
				}
	
	}

}
