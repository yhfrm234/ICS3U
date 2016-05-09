package hagiali;
import java.util.Scanner;
/* List of Names program
 * It will list your names
 * May 2, 2016
 * Ayub Hagi Ali
 */

public class ListOfNames {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int [] x = new int [100];
		
		
		int numberofnames;
		
		
		//inputs
		System.out.println("How much names do you want");
		numberofnames = Integer.parseInt(scan.nextLine());
		
		String names [] = new String[numberofnames];
		
		System.out.println("Enter the " + numberofnames + " names that you want");
		//processing and outputs
		for (int i=0; i<= numberofnames - 1; i++)
		{
			names[i] = scan.nextLine();
			

		}


		for (int i=0; i<= numberofnames - 1; i++)
		{

			System.out.println(names[i]);

		}
		
		for (int i=numberofnames - 1; i>= 0; i--)
		{

			System.out.println(names[i]);

		}
		
		
		
		
	}
	

}
