package hagiali;

import java.util.Scanner;
import java.text.DecimalFormat;
public class QuadraticEquation {

	
	/* Quadratic Equations
	 * It calculates your quadratic equations
	 * March 21, 2016
	 * Ayub Hagi Ali
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double a; // first number
		double b; // second number
		double c; // third number
		double x1; // first answer
		double x2; // second answer
		
		
		// ***inputs
		System.out.println("what is a?");
		a =  Double.parseDouble(scan.nextLine());
		System.out.println("what is b?");
		b =  Double.parseDouble(scan.nextLine());
		System.out.println("what is c?");
		c =  Double.parseDouble(scan.nextLine());
		
		
		
		// ***processing
		x1 = (-b + (Math.sqrt(Math.pow(b , 2) - 4 *a *c))) / ( 2 * a);
		x2 = (-b - (Math.sqrt(Math.pow(b , 2) - 4 *a *c ))) / ( 2 * a);
		
		
		// ***outputs
		if (Math.pow(b , 2) - 4 *a *c<0){
		System.out.println("There aren't any roots");
		}
		else if (Math.pow(b , 2) - 4 *a *c== 0){
			System.out.println("Your root is" + df.format(x1) );
			
		}
		else {
			System.out.println("Your roots are " + df.format(x1) + " and " + df.format(x2) );
		}
		
		
		}
		
		
	

}	