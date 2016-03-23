package hagiali;
/* Random Name Program
 * It will tell you if we like your name or not
 * March 23, 2016
 * Ayub Hagi Ali
 */
import java.util.Scanner;
public class RandomNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		
		// variables 
		int choice; // the cpu's choice on your name
		String name; // your name
		
		
		// inputs
		System.out.println("What is your name?"); 
		name = scan.nextLine();
		
		// processing
		choice = (int)(Math.random()* 10);
		
		
		// outputs
		if (choice >= 6 )
		{
			System.out.println("That is my favorite name"); 
		}
		else
		{
			System.out.println("I hate that name"); 
		}
	}

}
