package ejerciciostema4;

public class TestCuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 CuentaCorriente cc1=new CuentaCorriente();
 cc1.ingreso(100);
 cc1.cargo(50);
 cc1.cargo(75);
 System.out.println(cc1);
 
 CuentaCorriente cc2=new CuentaCorriente();
 cc2.ingreso(2000);
 System.out.println(cc2);
 cc2.transferencia(cc1, 1000);
 System.out.println(cc1);
 System.out.println(cc2);
 cc1.transferencia(cc2, 100);
 System.out.println(cc1);
 System.out.println(cc2);
 
	}

}
