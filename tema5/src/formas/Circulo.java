package formas;

import java.util.Objects;

public class Circulo extends Forma {
double radio;

 public void radio() {
	double radioElevado= Math.pow(radio, 2);
 }
 public void area() {
	
	double a =(Math.PI*this.radio);
}

 public void dibujar() {
		System.out.println("metodo dibujar");
	}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Circulo [radio=");
	builder.append(radio);
	builder.append("]");
	return builder.toString();
}
@Override
public int hashCode() {
	return Objects.hash(radio);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Circulo other = (Circulo) obj;
	return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
}
public double getRadio() {
	return radio;
}
public void setRadio(double radio) {
	this.radio = radio;
}
 
 
}
