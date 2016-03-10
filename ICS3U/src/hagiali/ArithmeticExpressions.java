package hagiali;

import java.util.Scanner;

public class ArithmeticExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double num1; //first number
		double num2; //second number
		double num3; //third number
		double num4; //fourth number
		double num5; //fifth number
		double answer1; //first answer
		double answer2; //second answer
		double answer3; //third answer
		double answer4; //fourth answer
		double answer5; //fifth answer
		double answer6; //sixth answer
		double answer7; //seventh answer
		
		
		// ***inputs
		System.out.println("what is your first number?");
		num1 = Double.parseDouble(scan.nextLine());
		System.out.println("what is your second number?");
		num2 = Double.parseDouble(scan.nextLine());
		System.out.println("what is your third number?");
		num3 = Double.parseDouble(scan.nextLine());
		System.out.println("what is your fourth number?");
		num4 = Double.parseDouble(scan.nextLine());
		System.out.println("what is your fifth number?");
		num5 = Double.parseDouble(scan.nextLine());
		
		// ***processing
		
		
		answer1 = num1 + num2 + num3 + num4 + num5;
		answer2 = num3 - num2;
		answer3 = num1 * num5;
		answer4 =  num4%num2;
		answer5 = num4 / num2;
		answer6 = (Double)Math.pow(num1, num3);
		answer7 = (Double)Math.sqrt(num5);
				
		// ***outputs
		
		System.out.println("The sum of all five numbers is " + answer1 + "");
		System.out.println("The result after subtracting the second number from the third " + answer2 + "");
		System.out.println("The product of the first and fifth numbers " + answer3 + "");
		System.out.println("The quotient of the fourth number divided by the second " + answer4 + "");
		System.out.println("The remainder when dividing the fourth number by the second " + answer5 + "");
		System.out.println("The first number raised to the power of the third number " + answer6 + "");
		System.out.println("The square root of the fifth number " + answer7 + "");
	}

}
