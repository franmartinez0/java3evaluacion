package examensegundaevaluacion;

import java.util.ArrayList;

public class Temporada {
protected int numero;
ArrayList<Temporada>Temporadas;
protected String Serie;






public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public ArrayList<Temporada> getTemporadas() {
	return Temporadas;
}
public void setTemporadas(ArrayList<Temporada> temporadas) {
	Temporadas = temporadas;
}
public String getSerie() {
	return Serie;
}
public void setSerie(String serie) {
	Serie = serie;
}
/**
 * @param numero
 * @param temporadas
 * @param serie
 */
public Temporada(int numero, ArrayList<Temporada> temporadas, String serie) {
	super();
	this.numero = numero;
	Temporadas = temporadas;
	Serie = serie;
}






}
