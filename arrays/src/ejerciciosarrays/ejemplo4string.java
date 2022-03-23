package ejerciciosarrays;

public class ejemplo4string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//elimina todos los espacios en blanco de una cadena
		
		String cadena="     hay   muchos   espacios en esta    cadena  ";
		cadena=cadena.trim();					//elimina los espacios en el principio y el final
		System.out.println(cadena+".");
		
		
		//recorremos la cadena pasandola a otra resultado , si encuentra espacios en blanco no los pasa a la cadena resultado
		
		
		String resultado="";
		for(int i=0;i<cadena.length();i++) {
			
		if(cadena.charAt(i)!=' ') {
			resultado+=cadena.charAt(i);
		}
		
	}
		System.out.println(resultado);
}
}