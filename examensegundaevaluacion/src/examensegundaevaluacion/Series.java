package examensegundaevaluacion;

public class Series extends Multimedia {
	


public Series(String titulo2, boolean plus2, int duracion, int temporadas2) {
		super(titulo2, plus2, duracion, temporadas2);
		// TODO Auto-generated constructor stub
	}

/**
 * generamos To String
 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Series [codigo=");
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
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
