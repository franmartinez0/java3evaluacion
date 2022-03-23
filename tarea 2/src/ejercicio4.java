
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int euros=362;

		int b200=0;
		int b100=0;
		int b50=0;
		int b20=0;
		int b10=0;
		int eurossueltos=0;
		//200
		b200=(int)euros/200;
		//100
		if(euros%200!=0) {
			b100=(euros%200)/100;
		//50
			b50=((euros%200)%100)/50;
		//20
			b20=(((euros%200)%100)%50)/20;
		//10
			b10=((((euros%200)%100)%50)%20)/10;
		//lo que sobre
			eurossueltos=(((((euros%200)%100)%50)%20)%10);
		}
		System.out.println("de 200 "+b200);
		System.out.println("de 100 "+b100);
		System.out.println("de 50 "+b50);
		System.out.println("de 20 "+b20);
		System.out.println("de 10"+ b10);
		System.out.println("y en monedas"+ eurossueltos);
		
	}

}
