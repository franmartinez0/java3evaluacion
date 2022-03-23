package formas;

import java.util.Objects;

public class Triangulo extends Forma  {
	double base;
	double altura;
	
public void area() {
		
		double a =(this.base*this.altura)/2;
	}
public void dibujar() {
	System.out.println("metodo dibujar");
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Triangulo [base=");
	builder.append(base);
	builder.append(", altura=");
	builder.append(altura);
	builder.append("]");
	return builder.toString();
}
@Override
public int hashCode() {
	return Objects.hash(altura, base);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Triangulo other = (Triangulo) obj;
	return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
			&& Double.doubleToLongBits(base) == Double.doubleToLongBits(other.base);
}
public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}

}
