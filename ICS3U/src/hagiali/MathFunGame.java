package hagiali;
/**
 *This program adds, subtracts, multiplies, and divides. May 25, 2016
 * 
 * @author 323526723 Ayub Hagi Ali 
 *
 **/

import java.util.Scanner;
public class MathFunGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1; //The first number
		int num2; //The second number
		int total; //The total
		
		System.out.println("Welcome to the Fun with Math program. Give me two numbers and I'll add, subtract, multiply, and divide the numbers! ");
		System.out.println("Please input the first number.");
		num1 = Integer.parseInt(scan.nextLine()); //Scan the first number
		System.out.println("Please input the second number.");
		num2 = Integer.parseInt(scan.nextLine()); //Scan the second number
		
		printMultiply(num1, num2); //Print the multiplication
		printDivide(num1, num2); //Print the division
		printAdd(num1, num2); //Print the addition
		printSubtract(num1, num2); //Print the subtraction

		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	public static void printMultiply(int num1, int num2)
	{
		/**
		 *This method multiplies the numbers
		 **/

		
		int total = num1 * num2; //Multiply
		System.out.println("" + num1 + " X " + num2 + " = " + total);
		
		
		
	}
	
	public static void printDivide(double num1, double num2)
	{
		
		/**
		 *This method divides the numbers
		 **/

		double total = num1 / num2; //Divide
		System.out.println("" + num1 + " / " + num2 + " = " + total);
		
		
		
	}
	
	public static void printAdd(int num1, int num2)
	{
		/**
		 *This method adds the numbers
		 **/

		
		int total = num1 + num2; //Add
		System.out.println("" + num1 + " + " + num2 + " = " + total);
		
		
	}
	
	
	public static void printSubtract(int num1, int num2)
	{
		
		/**
		 *This method subtracts the numbers
		 **/

		int total = num1 * num2; //Subtract
		System.out.println("" + num1 + " - " + num2 + " = " + total);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
