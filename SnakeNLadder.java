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
	public void checkOption() {
		Random ran =new Random();
		int option =ran.nextInt(3);
		System.out.println(option);
		if(option==0) 
			System.out.println("No Play stay in the same position");
		if(option==1)
			System.out.println("Ladder");
		player_position=player_position+rollDice();
		if(option==2)	
			System.out.println("Snake");
		player_position=player_position-rollDice();



	}

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game");
		



	}

}
