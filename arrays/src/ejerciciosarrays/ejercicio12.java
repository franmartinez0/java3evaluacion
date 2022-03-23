package ejerciciosarrays;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][]=new int[8][6];
		
		for(int i=0;i<matriz.length;i++) {
			
			for(int j=0;j<matriz[0].length;j++) {
				if(i==0) {
					matriz[i][j]=1;
				}else if(i==matriz.length-1){
					matriz[i][j]=1;
				}else if(j==0) {
					matriz[i][j]=1;
				}else if(j==matriz[i].length-1) {
					matriz [i][j]=1;
				}else
					matriz[i][j]=0;
				System.out.print(matriz[i][j]+" | ");
			}
			System.out.println();
		}
		
	}

}
