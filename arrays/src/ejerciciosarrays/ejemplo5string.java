package ejerciciosarrays;

public class ejemplo5string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cadena="esto es una cadena";
 System.out.println(cadena.substring(0,cadena.length()/2));
 
 if(cadena.length()%2==0) {//longitud par
	 System.out.println(cadena.substring(0,cadena.length()/2));
 }else {//longitud impar
	 System.out.println(cadena.substring(0,cadena.length()/2+1));
 }
	}

}
