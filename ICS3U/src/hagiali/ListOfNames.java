package hagiali;
import java.util.Scanner;

public class ListOfNames {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int [] x = new int [100];
		
		
		int numberofnames;
		
		System.out.println("How much names do you want");
		numberofnames = Integer.parseInt(scan.nextLine());
		
		String names [] = new String[numberofnames];
		
		System.out.println("Enter the " + numberofnames + " names that you want");
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
