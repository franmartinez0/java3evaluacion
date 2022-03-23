package ejerciciosarrays;
import java.util.Scanner;

public class ejercicio7 {

	
	public static void pintarVector(int numeros[]) {
		System.out.print("[");
		for(int i=0; i<numeros.length; i++)
			System.out.print(numeros[i] + ", ");
		
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		
		//Dise�ar  una  aplicaci�n  que  declare  una  tabla  de  10  elementos
		//enteros.  Leer  mediante  el  teclado  8  n�meros <- ALEATORIO YO
		//Despu�s  se  debe  pedir  un  n�mero  y  una  posici�n,  insertarlo  en
		//la  posici�n  indicada,  desplazando  los  que  est�n detr�s.  

		int numeros[] = new int[10];
		
		for(int i=0; i < 8; i++) {
			numeros[i] = (int) (Math.random() * 100 + 1);
		}
		
		pintarVector(numeros);
		
		Scanner sc = new Scanner(System.in);
		
		//Introduce la posici�n donde vamos a meter un nuevo valor
		int posicion = 0;
		do {
			System.out.println("Introduce una posici�n entre 0 y 7");
		
			try {
				posicion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while(posicion < 0 || posicion > 7);
		
		//Pide por teclado el valor a introducir en esa posicion
		int numero = 0;
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Mover todos los elementos desde posicion hasta Length-1 a la derecha
		//Me voy al final, e intercambio lo que hay en la posici�n i, lo pongo en i+1
		for(int i=8; i>=posicion; i--) {
			numeros[i+1] = numeros[i];
		}
		//pintarVector(numeros);
		
		//Insertar el n�mero en la posici�n seleccionada
		numeros[posicion] = numero;
		
		pintarVector(numeros);
		
		
		
		
		
		
	}

}

