package ejerciciostema4;

public class TarjetaRegalo {
	private static int num=0;
	private int numero;
	private double saldo;
//constructores
	TarjetaRegalo(){
		this.saldo=0;
		TarjetaRegalo.num++;
		this.numero=TarjetaRegalo.num;
	}
	//gasta el saldo
	public void gasta(double cantidad) {
		//inrementa el saldo la cantidad que se le pasara como parametro
		
		if((this.saldo-cantidad)>=0)
			this.saldo-=cantidad;
		
	}
	//fusionar tarjeta
	public void FusionarTarjeta(TarjetaRegalo T, double cantidad) {
		this.saldo-=cantidad;
		
		T.setSaldo(cantidad+T.getSaldo());
	}
	
	//getter and setters
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		TarjetaRegalo.num = num;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


}
