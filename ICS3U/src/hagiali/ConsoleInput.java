package hagiali;
import java.util.*;
public class ConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		// *** variables
		int age; //mom's age
		int kidsAge; //kid's age
		int yeardiff; // year difference between mom and kid
		String momsName; // mom's name
		String childsName; //kid's name
		
		// *** inputs
		System.out.println("What is the mother's name?"); 
		momsName = scan.nextLine();
		System.out.println("What is the child's name?");
		childsName = scan.nextLine();
		System.out.println("How old is  " + momsName + "");
		age = Integer.parseInt(scan.nextLine());
		System.out.println("How old is  " + childsName + "");
		kidsAge = Integer.parseInt(scan.nextLine());
		
		// *** processing
		yeardiff = age - kidsAge ; //how old would the mom be when she got the kid
		
		// *** outputs
		System.out.println("" + momsName + " you had your child " + childsName + " at the age of " + yeardiff + " years old");
				
	}

}
