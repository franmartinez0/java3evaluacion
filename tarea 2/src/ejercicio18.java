import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int mayor=0;
		int menor=1000000;
		Scanner sc= new Scanner (System.in);

		do {
			System.out.println("dime un numero");
			num=sc.nextInt();
			
		if(num==0) {break;}
		
		else if (num>mayor) {
				mayor=num;
		}
		else if (num<menor) {
			menor=num;
	}
		
		}
		while (num!=0);
		System.out.println("el mayor es "+mayor);
		System.out.println("el menor es "+menor);

		
		
		
		
	}

}
