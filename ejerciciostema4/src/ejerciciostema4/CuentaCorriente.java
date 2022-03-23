package ejerciciostema4;

public class CuentaCorriente {
	
	//propiedades son privadas pq no se cambia desde fuera
private String numero;
private double saldo;

//constructor
CuentaCorriente(){
	this.saldo=0;
	//añadimos esto para poder generar el numero de cuenta
	this.numero="ES204005";
	this.numero=CuentaCorriente.generarNumero();
}


public CuentaCorriente(String numero, double saldo) {
	super();
	this.numero = numero;
	this.saldo = saldo;
}
public static String generarNumero() {
	//generar un numero de cuenta aleatorio
	StringBuilder sb=new StringBuilder("ES204005");
			for(int i=0;i<12;i++) {
				int num=(int)(Math.random()*10);  //de  0 a 9
				sb.append(num);
			}
			return sb.toString();
}

public void ingreso(double cantidad) {
	//inrementa el saldo la cantidad que se le pasara como parametro
	
	this.saldo+=cantidad;
	
}
public void cargo(double cantidad) {
	//inrementa el saldo la cantidad que se le pasara como parametro
	
	if((this.saldo-cantidad)>=0)
		this.saldo-=cantidad;
	
}
//traspaso de una cuenta a otra
public void transferencia(CuentaCorriente otra, double cantidad) {
	this.saldo-=cantidad;
	
	otra.setSaldo(cantidad+otra.getSaldo());
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("CuentaCorriente [numero=");
	builder.append(numero);
	builder.append(", saldo=");
	builder.append(saldo);
	builder.append("]");
	return builder.toString();
}


public double getSaldo() {
	return saldo;
}


public void setSaldo(double saldo) {
	this.saldo = saldo;
}


public String getNumero() {
	return numero;
}



}
