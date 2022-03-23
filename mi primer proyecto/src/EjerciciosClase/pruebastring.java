package EjerciciosClase;

public class pruebastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje="hola mundo";
		
		//longitud de una cadena
System.out.println("longitud de la cadena es "+ mensaje.length());
//caracter de una posicion de la cadena
System.out.println("caracter de la posicion 2 es "+ mensaje.charAt(2));//empieza contando desde 0
//encontrar posicion de una subcadena en una cadena
System.out.println("posición de la subcadena `mu` es "+ mensaje.indexOf("mu"));

//saber si una subcadena está dentro de una subcadena,aqui no debe de salir debido a que la subcadena esta en minuscula
String c1="en un lugar de la Mancha de cuyo nombre";
String sub="mancha";

if(c1.indexOf(sub)>=0) {
	System.out.println("si está");
	
	}else {
	System.out.println("no está");
	}

//comprobar si una subcadena esta dentro de una cadena ,obviando mayusculas

System.out.println(c1.indexOf(sub));
if((c1.toLowerCase()).indexOf(sub.toLowerCase())>=0) {
	System.out.println("si está");
	
	}else {
	System.out.println("no está");
	}

String minus=c1.toLowerCase();
String subminus=sub.toLowerCase();
if(minus.indexOf(subminus)>=0) {
	System.out.println("si está");
}else {
	System.out.println("no está");
}

//unir dos cadenas
String nombre="francisco";
String apellidos="martinez lopez";
String nombreapintar=nombre.concat(apellidos);//nombre + apellidos
System.out.println(nombreapintar);
System.out.println(nombre+" "+apellidos);//funciona igual

//subcadena de una cadena
String mensaje3="me gusta mucho java,cada vez mas";
//sacar java
System.out.println(mensaje3.substring(15,19));
int inicio=mensaje3.indexOf("java");//obtiene el 15
int fin=inicio+"java".length();//15+4
System.out.println(mensaje3.substring(inicio,fin));//substring(15,15+4)

//quitar espacios

String mensaje4="      hola";
System.out.println(mensaje4);
System.out.println(mensaje4.trim());



//pasar de string a int

int numero=Integer.parseInt("25");
System.out.println(numero+5);

//pasar de string a double

double decimal=Double.parseDouble("34.95");
System.out.println(decimal+0.05);

//pasar de string a double forma 2

double otrodecimal=Double.valueOf("34.95");
System.out.println(otrodecimal+0.05);



//comparar dos cadenas iguales

String cad1="estoy ya frito";
String cad2="estoy ya frito";
if(cad1.equals(cad2)) {
	System.out.println("son iguales");
}else {
	System.out.println("no son iguales");
}


//comparar alfabeticamente dos cadenas

String ca1="fernandez";
String ca2="Garcia";
if(ca1.compareTo(ca2)==0) {
	System.out.println("iguales");
}else if(ca1.compareTo(ca2)<0) {
	System.out.println(ca1+" "+ca2);
}else if(ca1.compareTo(ca2)>0) {
	System.out.println(ca2+" "+ca1);
}






	}

}
