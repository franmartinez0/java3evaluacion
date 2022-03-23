package EjerciciosClase;


public class ejercicio7arrays {
	public static void pintarvector(int numeros[]) {
			
		for (int i=0;i<numeros.length;i++)    
			System.out.print(numeros[i]+"|");
			System.out.print("");
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numeros[]=new int[10];

				for(int i=0;i<8;i++) {
						numeros[i]=(int)(Math.random()*100+1);
	
				}
				System.out.println("introduzca una posicion entre el 0 y el 7");
				pintarvector(numeros);
					Scanner sc=new Scanner(System.in);
					


					
					
					//introduce la posicion ddonde vamos a meter el nuevo valor
					int posicion=0;
					try {
						posicion=Integer.parseInt(sc.nextLine());
	
					}catch (Exception e) {
						System.out.println(e.getMessage());
					}
					while(posicion<0||posicion<7);

					
					
					
					//introduce la cifra
					System.out.println("introduzca una cifra de 0 a 99");

					int numero=0;
					try {
						numero=Integer.parseInt(sc.nextLine());
	
					}catch (Exception e) {
						System.out.println(e.getMessage());
					}

					//mover todos los elementos desde posicion hasta lenght-1 a la derecha
					//me voy al final  voy moviendo todos los numero hasta la posicion que hemos elegido
					for(int i=8;i>=posicion;i--) {	
						numeros[i+1]=numeros[i];
					}
	
					//insertar el numero en la posicion seleccionada
					numeros[posicion]=numero;
					pintarvector(numeros);
					
	}
	
}
