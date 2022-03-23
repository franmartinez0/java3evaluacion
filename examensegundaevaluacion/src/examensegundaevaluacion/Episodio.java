package examensegundaevaluacion;

public class Episodio extends Series{

	
		
	public Episodio(String titulo2, boolean plus2, int duracion, int temporadas2) {
		super(titulo2, plus2, duracion, temporadas2);
		// TODO Auto-generated constructor stub
	}

	

	/**
	 *generamos getters y setters
	 */
	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return super.getTitulo();
	}

	@Override
	public void setTitulo(String titulo) {
		// TODO Auto-generated method stub
		super.setTitulo(titulo);
	}

	@Override
	public boolean isPlus() {
		// TODO Auto-generated method stub
		return super.isPlus();
	}

	@Override
	public void setPlus(boolean plus) {
		// TODO Auto-generated method stub
		super.setPlus(plus);
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return super.getPrecio();
	}

	@Override
	public void setPrecio(int precio) {
		// TODO Auto-generated method stub
		super.setPrecio(precio);
	}

	@Override
	public int getDuracion() {
		// TODO Auto-generated method stub
		return super.getDuracion();
	}

	@Override
	public void setDuracion(int duracion) {
		// TODO Auto-generated method stub
		super.setDuracion(duracion);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		super.reproducir();
	}

	@Override
	public void getReproducciones() {
		// TODO Auto-generated method stub
		super.getReproducciones();
	}

	@Override
	public int getTemporadas() {
		// TODO Auto-generated method stub
		return super.getTemporadas();
	}

	@Override
	public void setTemporadas(int temporadas) {
		// TODO Auto-generated method stub
		super.setTemporadas(temporadas);
	}

/**
 * generamos to String
 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Episodio [codigo=");
		builder.append(codigo);
		builder.append(", Titulo=");
		builder.append(Titulo);
		builder.append(", plus=");
		builder.append(plus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", Genero=");
		builder.append(Genero);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", temporadas=");
		builder.append(temporadas);
		builder.append(", visitas=");
		builder.append(visitas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getTitulo()=");
		builder.append(getTitulo());
		builder.append(", isPlus()=");
		builder.append(isPlus());
		builder.append(", getPrecio()=");
		builder.append(getPrecio());
		builder.append(", getDuracion()=");
		builder.append(getDuracion());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", getTemporadas()=");
		builder.append(getTemporadas());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append("]");
		return builder.toString();
	}

}
