package ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class testahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ahorcado miJuego=new ahorcado();
		System.out.println(miJuego);
		Scanner sc = new Scanner (System.in);
		int opcion=0;
		boolean resuelto=false;
		do {
			System.out.println("1. intentar letra");
			System.out.println("2.resolver");
			
			opcion=Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1:
				
			System.out.println("dime una letra:");
			//leer una letra
				String letra = sc.nextLine();
				miJuego.intentar(letra.charAt(0));
				System.out.println("tu palabra "+ Arrays.toString(miJuego.getPalabraIntentada()));
				System.out.println("fallos: " + miJuego.getFallos());
				
				//comprobar que esta solucionado
				if(miJuego.solucion()) {
					System.out.println("has ganado , enhorabuena");
					resuelto=true;
				}
				break;

			case 2: 
				
				break;

			default:
				System.out.println("opcion incorrecta,prueba otra vez");
		}
		}while(!resuelto||miJuego.getFallos()<0);
		
		
		
		}
	}



