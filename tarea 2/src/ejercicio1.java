import java.util.Scanner;

public class ejercicio1 {
	static int mayor (int a,int b, int c) {
		if ((a>=b) && (a>=c))
			return a;
		else if((b>=a)&&(b>=c))
			return b;
		else if((c>=a)&&(c>=b))
			return c;
		else 
		return -1;
	}
	
	static int mayorcuatro(int a, int b, int c, int d) {
		int intermedio;
		intermedio=mayor(a,b,c);
		return mayor(mayor(a,b,c),d,-1);
				
	}
	/**
	 * si escribes lo de arriba pones comentarios 
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=0,c=0;
a=6;
b=9;
c=1;
		int resultado;
		int resultado4;
		resultado=mayor(a,b,c);
		resultado4=mayorcuatro(a,b,c);
		System.out.println("el mayor es: "+ resultado);
		System.out.println("el mayor de los 4 es"+ resultado4);
		
	}

}
