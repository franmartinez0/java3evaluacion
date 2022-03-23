package EjerciciosClase;

public class matriz {

	public static void pintarmatriz(int[][]matriz) {
		for(int i=0;i<matriz.length;i++) {
			
			for(int j=0;j<matriz[i].length;j++) {
				
				System.out.print(matriz[i][j]+"|");
			}
			System.out.println();
		}
		
	}
	
	public static void pintarmediaasignatura(int[][]matriz) {
		
		String[] asignaturas= {"fol","ssii","lm","bbdd","entornos","programacion"};
		for(int i=0;i<matriz.length;i++) {
			int total=0;
			for(int j=0;j<matriz[i].length;j++) {
				total=total+matriz[i][j];
			}
			System.out.println("la nota media de "+asignaturas[i]+" es "+total/matriz[0].length);
		}
	}
	
	public static void main(String[] args) {
	//asignaturas:fol,sistemas,leguaje,base de datos , entornos y programacion.
	//notas por asginaturas:6 notas diferentes.
		
	//matriz 6x4
		
		
		
	int notas[][]=new int[6][4];
	
	//llenamos la matriz con notas aleatorias.
	
	for(int i=0;i<notas.length;i++) { //filas
		for (int j=0;j<notas[i].length;j++) { //columnas
			notas[i][j]=(int)(Math.random()*10+1);
		}
	}
	//pintar la matriz	
	pintarmatriz(notas);	
	pintarmediaasignatura(notas);	
	}

}
