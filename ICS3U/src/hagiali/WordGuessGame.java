package hagiali;
/* Word Guessing Program
 * You are trying to guess the letter the cpu gives you
 * May 12, 2016
 * Ayub Hagi Ali
 */
import java.util.Scanner;
public class WordGuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scan = new Scanner(System.in);
		
		
		
		
		
		// Variables
		String[] animals = {"cat" , "elephant" , "tiger" , "lion" , "zebra",  "monkey" , "donkey" , "dog" , "mouse" , "duck" , "brazilian tapir"};
		int random; 
		String letterguess = null;
		String finalguess;
		int  number;
		boolean fullword = false;

		//processing and outputs
		random = (int) (Math.random() * animals.length);
		String word = "";

		for (int i = 0; i < animals[random].length(); i++) 
		{
			word = word + "_";
		}
			System.out.println("Welcome to the word guessing game! You have to try to guess the word in order to win.");
			System.out.println("To enter the full word, please type '!'. If you get the word wrong, you lose. Good luck (please only type in lower case)");
			System.out.println(word);

		do
		{
			if (word.equals(animals[random]))
			{
				fullword = true;
			}
			
			else
			{
				System.out.println("Guess a letter");
				letterguess = scan.nextLine();
			
					if (letterguess.equals("!"))
					{
						fullword = true;
					}
					
					else
					{
						number = animals[random].indexOf(letterguess);
		
			
						if (number== -1)
						{
							System.out.println("There's no letter there.");
						}
						else
						{
							word = word.substring(0, number) + letterguess + word.substring ((number+1), word.length()); 

							System.out.println(word);
						}
					}
			}
		}
			while (!fullword);
		
			if (letterguess.equals("!"))
			{
				System.out.println("Enter the whole word");
				finalguess = scan.nextLine();
				
				if (finalguess.equalsIgnoreCase(animals[random]))
				{
					System.out.println("You got the word! Congrats, thanks for playing!");
				}
				else
				{
					System.out.println("Sorry, you got it wrong. Please restart this program to play again.");
				}
			}
			else 
			{
				System.out.println("You got the word! Next time, try guessing the whole word. Thanks for playing!");
			}



		}


		        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


