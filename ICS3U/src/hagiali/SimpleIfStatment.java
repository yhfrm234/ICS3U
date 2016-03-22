package hagiali;
/* Number Output
 * It will test your number, and give results
 * March 22, 2016
 * Ayub Hagi Ali
 */
import java.util.Scanner;
public class SimpleIfStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		// variables 
		int num; // the number the user will enter
		
		// inputs
		System.out.println("What is your number?");
		num = Integer.parseInt(scan.nextLine());
		
		// processing and outputs

		
		if (num > 0)
		{
			System.out.println("Your number is positive"); 
		}
		else if (num < 0)
		{
			System.out.println("Your number is negative"); 
		}
		else
		{
			System.out.println("Your number is zero"); 
		}
		
		if (num%7 == 0)
		{
			System.out.println("Your number is divisible by 7"); 
		}
		else
		{
			System.out.println("Your number is not divisible by 7"); 
		}
	}

}
