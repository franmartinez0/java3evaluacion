package examensegundaevaluacion;
/**
 * 
 * @author alumno
 *
 */
public class Cliente {
 String nombre;
String dni;
String email;
public int PrecioMensual;

public Cliente(String dni,String nombre,String email) {
	super();
	this.dni=dni;
	this.nombre=nombre;
	this.email=email;
	
}
/**
 * generamos el constructor
 */
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Cliente [nombre=");
	builder.append(nombre);
	builder.append(", dni=");
	builder.append(dni);
	builder.append(", email=");
	builder.append(email);
	builder.append(", PrecioMensual=");
	builder.append(PrecioMensual);
	builder.append("]");
	return builder.toString();
}

/**
 * generamos getters y setters
 * @return
 */

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getPrecioMensual() {
	return PrecioMensual;
}

public void setPrecioMensual(int precioMensual) {
	PrecioMensual = precioMensual;
}


}
