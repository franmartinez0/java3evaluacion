package EjerciciosClase;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
 double a=0;
 double b=0;
 int option=0;
Scanner sc= new Scanner (System.in);

do {
	System.out.println("1.sumar");
	System.out.println("2.restar");
	System.out.println("3.multiplicar");
	System.out.println("4.dividir");
	System.out.println("5.salir");
	
	option = sc.nextInt();
	

		switch((int)option) {
		
		
		case 1:
			System.out.println("dime el primer numero");
			a=sc.nextDouble();
			System.out.println("dime el segundo numero");
			b=sc.nextDouble();
			System.out.println(a+b);break;
		
		case 2:
			System.out.println("dime el primer numero");
			a=sc.nextDouble();
			System.out.println("dime el segundo numero");
			b=sc.nextDouble();
			System.out.println(a-b);break;
		case 3:
			System.out.println("dime el primer numero");
		a=sc.nextDouble();
		System.out.println("dime el segundo numero");
		b=sc.nextDouble();
		System.out.println(a*b);break;
		
		case 4:
			System.out.println("dime el primer numero");
		a=sc.nextDouble();
		System.out.println("dime el segundo numero");
		b=sc.nextDouble();
		System.out.println(a/b);break;
		case 5:
			System.out.println("5.salir del curso pa siempre");break;
		default :System.out.println("numero no valido");break;
		}
}while (option!=5);

	
	 

	}

}
