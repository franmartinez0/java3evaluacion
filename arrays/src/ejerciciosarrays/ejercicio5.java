package ejerciciosarrays;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,3,4,5};
		int b[]=new int[] {1,2,3,4,5};
		
		int c[]=new int[10];
		int j=0;
		for(int i=0;i<a.length;i++) {
			
			c[j]=a[i];j++;
			c[j]=b[i];j++;
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		
	}

}
