
public class ejercicio11 {

	static int cuentaD(int num) {
		int contador=0;
		int division=0;
	
		do {
			division=(int)num/10;
			num=division;
			contador++;
			
		}while (division>0);
		return contador;
	}
	
	public static void main(String[] args) {
	
		System.out.println(cuentaD(123456789));		
	}

}
