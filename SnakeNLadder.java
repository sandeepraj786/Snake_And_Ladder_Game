import java.util.Random;

public class SnakeNLadder {
	int player_position=0;
	int wining_Position=100;
	public int rollDice()
	{
		int n = 0;
		Random r = new Random();
		n=r.nextInt(7);
		return (n==0?1:n);
	}
	
	public void checkOption() {
		Random ran =new Random();
		while(true) {
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
		
		if(player_position<=0)
			player_position=0;
		int previous_position = 0;
		if(player_position>100)
			player_position=previous_position;
			
		if(player_position==wining_Position)
			System.out.println("Player reach winning position");
		break;
			
		}



	}
	

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game");
		



	}

}
