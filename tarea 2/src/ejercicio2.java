import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("dime un numero");
		a=sc.nextInt();
		
		if (a%2==0||a%3==0||a%5==0||a%7==0){
			System.out.println("es multiplo de 2,3,5 o 7");
		}
		else if (a%2!=0||a%3!=0||a%5!=0||a%7!=0){
			System.out.println("no es multiplo de 2,3,5 o 7");
		}
		
		
		
		
	}

}
