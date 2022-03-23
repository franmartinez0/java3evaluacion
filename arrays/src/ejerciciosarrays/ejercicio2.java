package ejerciciosarrays;

public class ejercicio2 {
public static void pintarvector(int numeros[]) {
		
		for (int i=0;i<numeros.length;i++)    
			System.out.print(numeros[i]+"|");
			System.out.print("");
			
	}
public static int mediavector(int numeros[]) {
	int media=0;
	for(int i=0;i<numeros.length;i++) {
		
		media=media+numeros[i];
		
	}
	media=media/numeros.length;
return media;

}
public static int mayorvector(int numeros[]) {
	int mayor=0;
	for(int i=0;i<numeros.length;i++) {
		
		if(numeros[i]>mayor) {
			mayor=numeros[i];
		}
		
	}
	
return mayor;

}
public static int menorvector(int numeros[]) {
	int menor=0;
	for(int i=0;i<numeros.length;i++) {
		
		if(numeros[i]<menor) {
			menor=numeros[i];
		}
		
	}
	
return menor;

}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numeros[]=new int[10];

				for(int i=0;i<9;i++) {
						numeros[i]=(int)(Math.random()*100+1);
						
				
				}
				
				pintarvector(numeros);
				System.out.println(" ");
				
				System.out.println(mediavector(numeros));
				
				System.out.println(" ");
				
				System.out.println(mayorvector(numeros));
				System.out.println(" ");
				
				System.out.println(menorvector(numeros));
	
	
	}

}
