package ejerciciosarrays;

import java.util.Scanner;

public class ejercicio13 {
	public static void pintarmatriz(int numeros[][]) {
		
		for(int i=0; i<numeros.length; i++) {
			for(int j=0;j<numeros[i].length;j++) {
				System.out.print(numeros[i]+"");
			}
			System.out.println();
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
 int matriz[][]=new int [3][4];
 
 
 
 for(int i=0;i<matriz.length;i++) {
	 System.out.print("fila "+i);
	 
	 
	 for(int j=0;j<matriz[i].length;j++) {
		System.out.println("introduce valor "+j); 
		matriz[i][j]=Integer.parseInt(sc.nextLine());
		
	 }
	 System.out.println();
 }
 	pintarmatriz(matriz);
 
 for(int j=0;j<matriz[0].length;j++) {
	 int sumac=0;
	 for(int i=0;i<matriz.length;i++) {
		 sumac+=matriz[i][j];
		 
		 
	 }
	 System.out.println("la suma de la columna "+j+ "es "+j+sumac);
 }
 
 
 
 
	}

}
