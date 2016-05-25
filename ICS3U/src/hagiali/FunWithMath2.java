package hagiali;
/**
 *This program adds, subtracts, multiplies, and divides. The codes are rearranged. May 25, 2016
 * 
 * @author 323526723 Ayub Hagi Ali 
 *
 **/

import java.util.Scanner;

public class FunWithMath2 {

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


		
		
		System.out.println(num1 + "x" + num2 + "=" + printMultiply(num1, num2)); //Print out answer for multiplication
		System.out.println(num1 + "/" + num2 + "=" + printDivide(num1, num2)); //Print out answer for division
		System.out.println(num1 + "+" + num2 + "=" + printAdd(num1, num2)); //Print out answer for subtraction
		System.out.println(num1 + "-" + num2 + "=" + printSubtract(num1, num2)); //Print out answer for addition
		
		
		
		
		
		
		
	
		
	}

	
	
	
	
	
	public static int printMultiply(int num1, int num2)
	{
		
		/**
		 *This method multiplies the numbers
		 **/
		int total = num1 * num2; //Multiply
		return total; //Return the total

		
		
	}
	
	public static double printDivide(double num1, double num2)
	{
		
		/**
		 *This method divides the numbers
		 **/
		double total = num1 / num2; //Divide
		return total; //Return the total

		
		
	}
	
	public static int printAdd(int num1, int num2)
	{
		
		/**
		 *This method adds the numbers
		 **/
		int total = num1 + num2; //Subtract
		return total; //Return the total

		
	}
	
	
	public static int printSubtract(int num1, int num2)
	{
		
		/**
		 *This method subtracts the numbers
		 **/
		int total = num1 - num2; //Add
		return total; //Return the total

		
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		

	}
	


