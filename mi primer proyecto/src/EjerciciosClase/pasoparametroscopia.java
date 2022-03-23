package EjerciciosClase;

public class pasoparametroscopia {
public static void modificar(int num) {
	num+=50;
	
}
public static void modificarstring(String cad) {
cad+="... fin";
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numero =5;
//numero se copia a num, pero lo que haga dentro de la funcion no se ve modificado
modificar(numero);
System.out.println("en el main"+numero);

String cadena="inicio";
modificarstring(cadena);
System.out.println("en el main"+cadena);

	}

}
