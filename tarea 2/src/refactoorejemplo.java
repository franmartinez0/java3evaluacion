import java.util.Scanner;

public class refactoorejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("pon un numero");
		numero=sc.nextInt();
		
		System.out.println("el cuadrado seria"+extracted(numero));
	}

	private static int extracted(int numero) {
		return numero*numero;
	}

}
