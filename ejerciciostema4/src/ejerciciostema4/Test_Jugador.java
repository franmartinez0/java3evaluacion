package ejerciciostema4;

public class Test_Jugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Jugador player1=new Jugador();
System.out.println(player1);
System.out.println(player1.getNombre());

Jugador player2=new Jugador(50,50,5,3,"la bruja lola","brujo");
System.out.println(player2);

player1.golpear("magico", player2);
System.out.println(player1);
System.out.println(player2);

player2.golpear("fisico", player1);
System.out.println(player1);
System.out.println(player2);

	}

}
