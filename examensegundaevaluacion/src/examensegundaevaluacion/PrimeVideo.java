package examensegundaevaluacion;

import java.util.ArrayList;

public class PrimeVideo {
	ArrayList<Multimedia> catalogo;
	ArrayList<Cliente> suscriptores;
	double ganancias;
	/**
	 * @param catalogo
	 * @param suscriptores
	 * @param ganancias
	 */
	public PrimeVideo(ArrayList<Multimedia> catalogo, ArrayList<Cliente> suscriptores, double ganancias) {
		super();
		this.catalogo = new ArrayList<>();
		this.suscriptores = new ArrayList<>();
		this.ganancias = 0;
	}
	public ArrayList<Multimedia> getCatalogo() {
		return catalogo;
	}
	public void setCatalogo(ArrayList<Multimedia> catalogo) {
		this.catalogo = catalogo;
	}
	public ArrayList<Cliente> getSuscriptores() {
		return suscriptores;
	}
	public void setSuscriptores(ArrayList<Cliente> suscriptores) {
		this.suscriptores = suscriptores;
	}
	public double getGanancias() {
		return ganancias;
	}
	
	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}
	
	/**
	 * añadimos un metodo para añadir suscriptores
	 * @param c1
	 */
	public void addsuscriptor(Cliente c1) {
		if (suscriptores.add(c1))
			this.suscriptores.addAll(suscriptores);
		
	}
	
	
}
