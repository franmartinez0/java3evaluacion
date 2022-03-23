package examensegundaevaluacion;

import java.util.Objects;

/**
 * le damos las cualidades necesarias a la clase multimedia
 * @author alumno
 *
 */


public class Multimedia {
protected long codigo;
protected String Titulo;
protected boolean plus;
protected int precio;
protected String Genero;
protected int duracion;
protected int temporadas;
protected int visitas;
public Multimedia(String titulo, boolean plus, int precio) {
	super();
	Titulo = titulo;
	this.plus = plus;
	this.precio = precio;
}


/**
 * generamos getters y setters
 * @return
 */
public String getTitulo() {
	return Titulo;
}
public void setTitulo(String titulo) {
	Titulo = titulo;
}
public boolean isPlus() {
	return plus;
}
public void setPlus(boolean plus) {
	this.plus = plus;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}

public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}

/**
 * generamos el constructor
 */
@Override
public int hashCode() {
	return Objects.hash(Titulo, codigo, plus);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Multimedia other = (Multimedia) obj;
	return Objects.equals(Titulo, other.Titulo) && codigo == other.codigo && plus == other.plus;
}
/**
 * añadimos la opcion de añadir visitas a las peliculas
 */

public void reproducir() {
	System.out.println("Reproduciendo "+ this.visitas);
	this.visitas++;
}
public void getReproducciones() {
	System.out.println(this.Titulo+ " se ha reproducido "+this.visitas+" veces.");
}



public Multimedia(String titulo2, boolean plus2, int duracion, int temporadas2) {
	super();
	this.duracion = duracion;
}
public Multimedia(int duracion2) {
	// TODO Auto-generated constructor stub
}
public int getTemporadas() {
	return temporadas;
}
public void setTemporadas(int temporadas) {
	this.temporadas = temporadas;
}






}
