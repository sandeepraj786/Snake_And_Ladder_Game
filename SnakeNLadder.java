import java.util.Random;

public class SnakeNLadder {
	int player_position=0;
	public int rollDice()
	{
		int n = 0;
		Random r = new Random();
		n=r.nextInt(7);
		return (n==0?1:n);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game");
		
		
	}

}
