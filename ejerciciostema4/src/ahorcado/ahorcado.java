package ahorcado;

import java.util.Arrays;

public class ahorcado {
//propiedades
	private static String[] diccionario= {"pelota","caramelo","payaso","centinela"};
	//static porque no cambia mientras se juega
	
	
	private String palabraAAdivinar;
	private char [] palabraIntentada; //almacena todos los caracteres se puede utilizar el stringbuilder
	private char[] letrasProbadas; //para mostrar las letras utilizadas
	private int fallos;
	
	
	//elige de forma aleatoria una palabra del diccionario
	public ahorcado() {
		int posicion = (int)(Math.random()*ahorcado.diccionario.length);
		this.palabraAAdivinar = ahorcado.diccionario[posicion];
		 
		 
		 //reservo tantos caracteres como palabraIventada como longitud de palabraAAdivinar
		this.palabraIntentada = new char[this.palabraAAdivinar.length()];
		 
		 
		 //rellena con guiones tantas veces como letras tiene la longitud de la palabra
		 
		for(int i=0;i<this.palabraAAdivinar.length();i++) {
			 this.palabraIntentada[i] ='-';
			 
		 }
		//iniciar el tamaño del array de letras palabras
		this.letrasProbadas=new char[27];
		
		this.fallos=0;
	}
	//solo los getters

public static String[] getDiccionario() {
		return diccionario;
	}


	public String getPalabraAAdivinar() {
		return palabraAAdivinar;
	}


	public char[] getPalabraIntentada() {
		return palabraIntentada;
	}


	public char[] getLetrasProbadas() {
		return letrasProbadas;
	}


	public int getFallos() {
		return fallos;
	}


	//source generate toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ahorcado [palabraAAdivinar=");
		builder.append(palabraAAdivinar);
		builder.append(", palabraIntentada=");
		builder.append(Arrays.toString(palabraIntentada));
		builder.append(", letrasProbadas=");
		builder.append(Arrays.toString(letrasProbadas));
		builder.append(", fallos=");
		builder.append(fallos);
		builder.append("]");
		return builder.toString();
	}
	
	//la letra introducida
	public boolean intentar (char letra) {
		//buscar la letra tantas veces como salga
		boolean encontrado=false;
		for(int i=0; i<this.palabraAAdivinar.length();i++) {
			//si coincide en alguna posicion la pongo en palabraIntentada
			if(this.palabraAAdivinar.charAt(i)== letra){
				this.palabraIntentada[i] =letra;
				encontrado=true;
			
			}//no poner un else a falso porque de por si el boleano esta en falso 
		}
		if(encontrado=false)
			this.fallos++;
		
		return encontrado;
	}
	
	
	//comprueba que la palarabaAAdivinar y la palabraintentada son iguales
	public boolean solucion() {
		boolean solucionado=true;
		for(int i=0;i<this.palabraAAdivinar.length();i++) {
			if(this.palabraAAdivinar.charAt(i)!=this.palabraIntentada[i]) {
				solucionado=false;
			}
		}
		return solucionado;
		
	}
}
