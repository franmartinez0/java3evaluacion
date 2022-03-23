import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double factorial=1;
		double n=0;
		
		//pedimos el numero
		Scanner sc=new Scanner(System.in);
		System.out.println("dime un numero n>1");
		//n=sc.nextInt();
		//es lo mismo que lo que esta encima
		try {
			n= Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("por favor introduce un numero entero");
		}
		sc.close();
		//calcular factorial
		
		for(int  i=2;i<=n;i++) {
		factorial=factorial*i;
		}
		
		System.out.println("Factorial de "+n+" es "+factorial);
		
	}

}
