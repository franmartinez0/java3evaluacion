package ejerciciostema4;

public class Jugador {
	
 //propiedades (privadas)
 private int vida; //del 1 al 100
 private int mana;//1-100
 private int damageFisico;
 private int damageMagico;
 private String nombre;
 private String clase;
 private Arma armaDerecha;
 private Arma armaIzquierda;
 
 //constructores
 Jugador() {
	 this.vida=100;
	 this.mana=100;
	 this.damageFisico=2;
	 this.damageMagico=15;
	 this.nombre="Joselito";
	 this.clase="Mago";
	 this.armaDerecha=null;
	 this.armaIzquierda=null;
 }

public Jugador(int vida, int mana, int damageFisico, int damageMagico, String nombre, String clase,Arma armaDerecha,Arma armaIzquierda) {
	super();//se supone que llama a la clase padre,por ahora no sirve.
	this.vida = vida;
	this.mana = mana;
	this.damageFisico = damageFisico;
	this.damageMagico = damageMagico;
	this.nombre = nombre;
	this.clase = clase;
	this.armaDerecha=armaDerecha;
	this.armaIzquierda=armaIzquierda;
}
public Arma getArmaDerecha() {
	return armaDerecha;
}

public void setArmaDerecha(Arma armaDerecha) {
	this.armaDerecha = armaDerecha;
}

public Arma getArmaIzquierda() {
	return armaIzquierda;
}

public void setArmaIzquierda(Arma armaIzquierda) {
	this.armaIzquierda = armaIzquierda;
}

//getter and setters
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getVida() {
	return vida;
}

public void setVida(int vida) {
	this.vida = vida;
}

public int getMana() {
	return mana;
}

public void setMana(int mana) {
	this.mana = mana;
}

public int getDamageFisico() {
	return damageFisico;
}

public void setDamageFisico(int damageFisico) {
	this.damageFisico = damageFisico;
}

public int getDamageMagico() {
	return damageMagico;
}

public void setDamageMagico(int damageMagico) {
	this.damageMagico = damageMagico;
}

public String getClase() {
	return clase;
}

public void setClase(String clase) {
	this.clase = clase;
}

@Override
public String toString() {
	return "Jugador [vida=" + vida + ", mana=" + mana + ", damageFisico=" + damageFisico + ", damageMagico="
			+ damageMagico + ", nombre=" + nombre + ", clase=" + clase + "]";
}

public void golpear(String tipo,Jugador rival) {
	if (tipo.equals("magico")) {
		//quitar vida a rival de mi golpe magico
		rival.setVida(rival.getVida()-this.damageMagico);
		if (this.mana>=5) {
			rival.setVida(rival.getVida()-this.damageMagico);
			this.mana-=5;
		}
	}else if(tipo.equals("fisico")) {
		//quitar 
		rival.setVida(rival.getVida()-this.damageFisico);
	}
	if (rival.getVida()<=0) {
		System.out.println(this.nombre+" win");
	}
}





 
 
 
 
}
