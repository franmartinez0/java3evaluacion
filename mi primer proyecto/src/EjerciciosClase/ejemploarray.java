package EjerciciosClase;

import java.util.Scanner;

public class ejemploarray {
	
	public static void pintarvector(int notas[]) {
		for (int i=0;i<notas.length;i++) {     
			System.out.print(notas[i]+", ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
	
		
		int notas[];				//array de notas
		int numnotas=10;			//tamaño del array
		
		
		notas=new int[numnotas];	//iniciamos el array diciendo el tamaño
		
									//scanner de teclado
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<notas.length;i++) {           //o se pone i<=notas.length-1 se empieza en 0 siempre 
			System.out.println("dime una nota");
			int valor = sc.nextInt();
			
			notas[i]=valor;
		}
		
		pintarvector(notas);
		sc.close();
		
		//calcular nota media
		int total=0;
		for(int i=0;i<notas.length;i++) {
			total+=notas[i];//total=total+notas[i].
		}
		System.out.println("la nota media es"+ total/notas.length);
	}

}
