package hagiali;
/* Rolling Dice Program
 * You will roll a dice with the cpu
 * March 23, 2016
 * Ayub Hagi Ali
 */
import java.util.Scanner;
public class RollingDiceModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		// variables
		int dice; // your dice
		int dice2; // cpu's dice
		String username; // your username
		String playagain = "yes"; //asks if you want to play again
		
		//  inputs
		System.out.println("What is your user name?"); 
		username = scan.nextLine();

		while (playagain.equals("yes")){
			
			dice = 	(int)(Math.random()* 6) + 1;
			dice2 = (int)(Math.random()* 6) + 1;
		
		
		
		// processing
		dice = 	(int)(Math.random()* 5) + 1;
		dice2 = (int)(Math.random()* 5) + 1;
		
		playagain = "yes";
		

		
		// outputs
		if (dice > dice2)
		{
			System.out.println( username + ", you beat the cpu by a score of " + dice + "  to " + dice2); 
		}
		else if (dice < dice2)
		{
			System.out.println( username +", you lost to the cpu by a score of " + dice + "  to " + dice2);
		}
		else
		{
			System.out.println( username + ", you have tied with the cpu");
		}
		System.out.println("Do you want to play again?"); 
		playagain = scan.nextLine();
		

	

		
		

	}
		
}
}

