package ejerciciosarrays;

public class ejemplo1string {

	public static int contarvocales(String cad) {
		int contador=0;
		for(int i=0;i<cad.length();i++) {
			char car= cad.charAt(i);
			if(car=='a'|| car=='e'|| car=='i'|| car=='o'|| car=='u'|| car=='�'||car=='�'|| car=='�'|| car=='�'|| car=='�') {
			contador++;
			}
		}
		
	
		
	return contador;
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cadena="me gusta programar en Java los s�bados por la ma�ana";
		System.out.println(contarvocales(cadena));
	}

}
