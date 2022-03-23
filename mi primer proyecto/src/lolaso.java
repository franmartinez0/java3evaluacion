
public class lolaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for (i=1 ; i<=100;i++) {
			
		
			if (i%2==0)
				continue;
			
			if(i>50)
				break;
			
			System.out.println(i);
		}
	}
}