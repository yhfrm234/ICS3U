package hagiali;
/* Guessing Game Program
 * The CPU tries to guess your letter
 * May 6, 2016
 * Ayub Hagi Ali
 */

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		//variables
		String guess [] = new String[] {"a" , "b" , "c" , "d" , "e" , "f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",};
		boolean[] repeat = new boolean[19];
		int randomnumber;
		int numberguess = 0;
		String playagain;
		
		//inputs
		System.out.println("Choose a letter from a to t and let me try to guess it. I have 15 chances to get it right.");
		System.out.println("Do you want to play? Type "+"yes "+"if not type "+"no");
		playagain = scan.nextLine();
		
		//processing and outputs
		if(playagain.equalsIgnoreCase("yes")){

			while(playagain.equalsIgnoreCase("yes")){
				numberguess = 0;

				for(int i = 0; i <=14; i++){
					numberguess++;
					System.out.println("number of guesses: "+ numberguess);
					randomnumber =(int)(Math.random() * guess.length);
				
					while(repeat[randomnumber]){
						randomnumber =(int)(Math.random() * guess.length);
					}
					System.out.print("Is it "+ guess[randomnumber] + "?" );
					 
					repeat[randomnumber] = true;
					playagain = scan.nextLine();

					if(playagain.equalsIgnoreCase("yes") && numberguess!=15){

						System.out.print("I win.");
						i=15;

					}

					else if(numberguess == 15 && !playagain.equalsIgnoreCase("yes")){
						System.out.println("I lose.");
					}

				}

				System.out.println("Play again?(yes/no)");
				playagain = scan.nextLine();
			}
		}
	}
}



    