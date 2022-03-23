package ejerciciostema4;

public class Arma {
	//propiedades
private String nombre;
private int damageFisico;
private String tipo;
//constructores
public Arma() {
	 this.nombre="espada";
	 this.damageFisico=2;
	 this.tipo="fisico";
}

//generate constructors using fields
public Arma(String nombre, int damageFisico, String tipo) {
	super();
	this.nombre = nombre;
	this.damageFisico = damageFisico;
	this.tipo = tipo;
}

//esto es lo que pide siempre generar al to string
@Override
public String toString() {
	return "Arma [nombre=" + nombre + ", damageFisico=" + damageFisico + ", tipo=" + tipo + "]";
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getDamageFisico() {
	return damageFisico;
}
public void setDamageFisico(int damageFisico) {
	this.damageFisico = damageFisico;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}


}
