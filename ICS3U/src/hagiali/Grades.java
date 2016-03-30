package hagiali;
/* Rolling Dice Program
 * You will roll a dice with the cpu
 * March 23, 2016
 * Ayub Hagi Ali
 */
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		// variables
		int grade; // your grade
		int NumOfGrades; // the amount of grades
		
		//  inputs
		System.out.println("How much grades do you have"); 
		NumOfGrades = Integer.parseInt(scan.nextLine());

		// processing and outputs
		for (int i=0; i<= NumOfGrades - 1; i++)
		{
			System.out.println("Please enter your grade"); 
			grade = Integer.parseInt(scan.nextLine());
			if (grade >= 80 && grade <= 100)
			{
				System.out.println("Your grade is an A");
			}
			else if (grade >=70 && grade <= 79)
			{
				System.out.println("Your grade is a B");
			}
			else if (grade >=60 && grade <= 69)
			{
				System.out.println("Your grade is a C");
			}
			else if (grade >=50 && grade <= 59)
			{
				System.out.println("Your grade is a D");
			}
			else if (grade >=1 && grade <= 49)
			{
				System.out.println("Your grade is a F");
			}
			else if (grade <= 0)
			{
				System.out.println("Your grade is a X");
			}
			else if (grade > 100)
			{
				System.out.println("Your grade is a X");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
