package ejerciciosarrays;

public class ejercicioclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//llena una matriz 4x6(4 filas y 6 columnas)
		
		int matriz[][]=new int[4][6];
		
		
		
		System.out.println("filas="+ matriz.length);
		System.out.println("columnas="+matriz[0].length);
		//cada columna
		for (int i=0;i<matriz.length;i++) {//se puede poner <4
			System.out.print("fila "+i);
			//cada columna
			for(int j=0;j<matriz[0].length;j++) {//se puede poner <6
				System.out.print("   col  "+j);
				matriz[i][j]=(int)(Math.random()*100)+1;
			}
			System.out.println();
		}
		
		//pintamos la matriz
		for (int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]+" | ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
