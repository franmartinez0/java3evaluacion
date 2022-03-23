package ejerciciostema4;

public class pajaro {
	
	private int edad;
	private int color;
	
	public void setEdad(int e) {
		edad=e;
		//para diferenciar entre la edad y el valor que se le quiere añadir
		//o poner un this en la primera 
	
	}
	public void printEdad() {
		System.out.println(edad );
	}
	public void setColor (char c) {
		color=c;
	}
	public void printColor() {
		//los pajaros pueden ser verdes,amarillos,grises,negros o blancos
		//no existen pajaros de otros colores
		switch (color) {
		case'v':System.out.println("verde");break;
		case'a':System.out.println("amarillo");break;
		case'g':System.out.println("gris");break;
		case'n':System.out.println("negro");break;
		case'b':System.out.println("blanco");break;
		default:System.out.println("color no establecido");
		
		}
	}

	

}
