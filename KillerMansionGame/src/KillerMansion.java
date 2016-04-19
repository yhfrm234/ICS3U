


import java.util.Scanner;
import hsa_new.*;
import java.awt.*;
public class KillerMansion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Console c = new Console(); 
		
		String leftans = null; //The answer for the left side
		int runChance; //the chance you can escape
		int floorChance = 0; //the chance you have to enter the right floor
		int floorChance2 = 0; // the chance you have to enter the right floor
		

		String playagain = "yes"; // the playagain key
		String direction; //where you will go
		String rightans;//the answer to the right side
		int randomlock;//the chance to unlock a lock
		randomlock = (int)(Math.random()* 4) + 1; 
		int tries = 0;// how much tries you get
		int lockcombo = 0;// the lock combo
		int randomchance = (int)(Math.random()* 99) + 1;
		int cabinentcode = (int)(Math.random()* 4) + 1;
		int cabinentguess = 0;// the cabinet guess
		int tries2 = 0; // how much tries you get
		
		// All images in the program
		Image jpgKitchen;
		jpgKitchen = Toolkit.getDefaultToolkit ().getImage ("Kitchen.jpg");
		Image jpgElevator;
		jpgElevator = Toolkit.getDefaultToolkit ().getImage ("Elevator.jpg");
		Image jpgGameOver;
		jpgGameOver = Toolkit.getDefaultToolkit ().getImage ("GameOver.jpg");
		Image jpglock;
		jpglock = Toolkit.getDefaultToolkit ().getImage ("lock.jpg");
		Image jpgRoom;
		jpgRoom = Toolkit.getDefaultToolkit ().getImage ("Room.jpg");
		Image jpgTwoDoors;
		jpgTwoDoors = Toolkit.getDefaultToolkit ().getImage ("TwoDoors.jpg");
		Image jpgYouWin;
		jpgYouWin = Toolkit.getDefaultToolkit ().getImage ("YouWin.jpg");
		Image jpgCYF;
		jpgCYF = Toolkit.getDefaultToolkit ().getImage ("CYF.jpg");
		Image jpg1elevator;
		jpg1elevator = Toolkit.getDefaultToolkit ().getImage ("1elevator.jpg");
		Image jpg2elevator;
		jpg2elevator = Toolkit.getDefaultToolkit ().getImage ("CYF.jpg");
		Image jpg2door;
		jpg2door = Toolkit.getDefaultToolkit ().getImage ("2door.jpg");
		Image jpgstaircase;
		jpgstaircase = Toolkit.getDefaultToolkit ().getImage ("staircase.jpg");
		
		
		//***inputs, processing, and outputs
		
		while(playagain.equalsIgnoreCase ("yes"))
		{
		runChance = (int)(Math.random() * 100);
		c.clear();
		c.drawImage (jpgCYF, 0, 100, 675, 400, null);
		c.print("You are on a run from a serial killer in a mansion. You got in but you don't know how to get out. You just escaped him from the room in which you were captured. You see a hallway, go straight, or turn right or left. Choose your faith.(left/straight/right) ");
		direction = c.readLine();
		if (direction.equalsIgnoreCase ("straight"))
		{
			c.clear();
			 c.drawImage (jpgGameOver, 200, 100, 300, 300, null);
			c.print("You reach a dead end, and the killer kills you. ");
		}
		else if (direction.equalsIgnoreCase ("right"))
		{
			c.clear();
			c.drawImage (jpgCYF, 0, 350, 175, 175, null);
			 c.drawImage (jpgTwoDoors , 200, 100, 300, 300, null);
			c.print("It is a dead end! Luckly, there are two different doors, and you don't know where these doors lead you. You have to choose between right door, or left door. - Choose your faith.(right / left)  ");
			rightans = c.readLine();
			if (rightans.equalsIgnoreCase ("right"))
			{			c.clear();
			c.drawImage (jpgCYF, 0, 350, 175, 175, null);
			 c.drawImage (jpgRoom , 200, 100, 300, 300, null);c.print("You are in a room with a window amd a bed. Do you jump, hide or fight? (hide / jump / fight)");
				rightans = c.readLine();
				if (rightans.equalsIgnoreCase ("jump"))
				{
					c.clear();
					 c.drawImage (jpgGameOver , 200, 100, 300, 300, null);
					c.print("You land on your neck, you die...");

					
				}
				else if (rightans.equalsIgnoreCase ("hide"))
				{
					c.clear();
					c.drawImage (jpgCYF, 0, 350, 175, 175, null);
					 c.drawImage (jpgElevator, 200, 100, 300, 300, null);
					c.print("You manage to escape, but you have little time. You find an elevator, but it says do not use. Do you use the elevator or keep running? (elevator / run)"   );
					rightans = c.readLine();
					if (rightans.equalsIgnoreCase ("elevator"))
					{			c.clear();
						c.print("the elevator doesn't show up, you die.....");

					}
					else if (rightans.equalsIgnoreCase ("run"))
					{		c.clear();
					c.drawImage (jpgCYF, 0, 350, 175, 175, null);
					 c.drawImage (jpglock , 200, 100, 300, 300, null);
						c.print("You reach the exit, but you have very little time. There is a 1 digit lock combo from 1 - 5. You have 3 tries to get it right, or else you will die. (choose from 1 - 5)");
						
						while (lockcombo != randomlock && tries != 3 )
						{
							c.drawImage (jpgCYF, 0, 350, 175, 175, null);
								c.print("What is your guess?");
								lockcombo = Integer.parseInt(c.readLine());
								if(lockcombo != randomlock  && tries != 3)
								{
									c.print("Try again");
									tries = tries + 1;
								}
							
							}
							if (tries == 3)
							{		c.clear();
							 c.drawImage (jpgGameOver, 200, 100, 300, 300, null);
								c.print("You took too long and the killer came and killed you.");

							}
							if (lockcombo == randomlock)
							{		c.clear();
							 c.drawImage (jpgYouWin , 200, 100, 300, 300, null);
								c.print("You manage to escape just before the killer came for you");

							}
							
						}
					}
				}

				else if (rightans.equalsIgnoreCase("fight"))
				{
					if (randomchance <= 59)
					{		c.clear();
					 c.drawImage (jpgGameOver , 200, 100, 300, 300, null);
						c.print("You fought for your life, but sadly you have been killed by the killer.");

					}
					else if (randomchance >= 60)
					{		c.clear();
					c.drawImage (jpgCYF, 0, 350, 175, 175, null);
						c.print("You have fought for your life and managed to escape, but you have little time. You reach the exit, but you have very little time. There is a 1 digit lock combo from 1 - 5. You have 3 tries to get it right, or else you will die.");
						while (lockcombo != randomlock && tries < 3)
						{
							{				 
								c.drawImage (jpgCYF, 0, 350, 175, 175, null);
								c.drawImage (jpglock , 200, 100, 300, 300, null);
								c.print("What is your guess?");
								lockcombo = Integer.parseInt(c.readLine());
								if(lockcombo != randomlock  && tries < 3)
								{
									c.print("Try again. ");
									tries = tries + 1;
								}
							
							}
							if (tries == 3)
							{		c.clear();
							 c.drawImage (jpgGameOver , 200, 100, 300, 300, null);
								c.print("You took too long and got killed by the killer");

							}
							if (lockcombo == randomlock)
							{		c.clear();
							 c.drawImage (jpgYouWin , 200, 100, 300, 300, null);
								c.print("You escape and manage to make it out. Congrats!");

							}
							
						}
					}
						
				}
				else if (rightans.equalsIgnoreCase("left"))
				{c.clear();
				c.drawImage (jpgCYF, 0, 350, 175, 175, null);
				 c.drawImage (jpgKitchen , 200, 100, 300, 300, null);
					c.print("Your in the kitchen with a knife. Do you jump, hide or fight?(jump / fight / hide)");
					rightans = c.readLine();
					if (rightans.equalsIgnoreCase("jump"))
					{c.clear();
					 c.drawImage (jpgGameOver , 200, 100, 300, 300, null);
						c.print("You break your neck and die.");
					}
					else if (rightans.equalsIgnoreCase("fight"))
					{c.clear();
					c.drawImage (jpgCYF, 0, 350, 175, 175, null);
					 c.drawImage (jpglock , 200, 100, 300, 300, null);
						c.print("The knife is locked in a cabinent with a 1 digit lock from 1-5. You have only 3 tries to unlock it before the killer comes!(choose from 1-5)");
						while (cabinentcode != cabinentguess && tries2 < 3 )
						{
							c.drawImage (jpgCYF, 0, 350, 175, 175, null);
								c.print("What is your guess?");
								cabinentguess = Integer.parseInt(c.readLine());
								if(cabinentcode != cabinentguess  && tries2 < 3)
								{
									c.clear();
									c.print("Try again. ");
									tries2 = tries2 + 1;
								}
							
							
							
						}
						if (tries2 == 3)
						{	c.clear();
						c.drawImage (jpgGameOver, 200, 100, 300, 300, null);
							c.print("You die, sorry.");
							
							
						}
						else if (cabinentcode == cabinentguess)
						{	c.clear();
						 c.drawImage (jpgYouWin , 200, 100, 300, 300, null);
							c.print("You got the knife, and you luckly kill the killer! Congrats you made it out.");
							
						}
					}
					else if (rightans.equalsIgnoreCase("hide"))
					{	c.clear();
						c.drawImage (jpgGameOver, 200, 100, 300, 300, null);
						c.print("You tried to hide, but you were very limited. You die:(");
						
					}
				}
			}
		if (direction.equalsIgnoreCase("left"))
		{

		c.clear();
		 c.drawImage (jpgstaircase , 200, 100, 300, 300, null);
			c.drawImage (jpgCYF, 0, 350, 175, 175, null);
		c.print("You are facing a stair case. Go up the staircase or go down. Choose your faith.(down/up)");
		leftans = c.readLine();


		if(leftans.equalsIgnoreCase("up")){

		c.clear();
		c.drawImage (jpg2door, 0, 350, 175, 175, null);
		c.drawImage (jpgCYF, 0, 350, 175, 175, null);
		c.print("You go upstairs and see a door across the hallway which shows the outside. You also see an elevator on the right. Choose your faith.(door/elevator)");

		leftans = c.readLine();

		if(leftans.equalsIgnoreCase("door")){
		c.clear();
		 c.drawImage (jpgGameOver , 200, 100, 300, 300, null);
		c.print("You are dead. The door was locked from the outside, therefore it was a dead end.");
		}	
		else if(leftans.equalsIgnoreCase("elevator")){
			
		c.clear();
		 c.drawImage (jpg1elevator , 200, 100, 300, 300, null);
			c.drawImage (jpgCYF, 0, 350, 175, 175, null);
		c.print("Choose the right floor.Between 1, 2, 3, 5, and 6");
		leftans = c.readLine();

		while(floorChance < 2 && !leftans.equals("2")){	
			c.drawImage (jpgCYF, 0, 350, 175, 175, null);
		floorChance = floorChance + 1;
		c.print("Wrong floor, try again.");
		leftans = c.readLine();

		}

		if(leftans.equals("2")){
		c.clear();
		 c.drawImage (jpgYouWin , 200, 100, 300, 300, null);
		c.print("You survived. You seen the exit to the outside which lead you to run from the mansion.");
		}
		else{
		c.clear();
		 c.drawImage (jpgGameOver , 200, 100, 300, 300, null);
		c.print("You are dead. The killer appeared right in your face as the elevator opened.");
		}






		}




		}
		if (leftans.equalsIgnoreCase("down")){
			c.clear();
				c.drawImage (jpgCYF, 0, 350, 175, 175, null);
			c.print("You are in a basement with no exit but the way you came in. There is a small plank of wood on a table. You see the killer and it's coming right for you. Decide to either run or try to stop him with the plank of wood. Choose your faith.(run/wood)");
			leftans = c.readLine();
			}
			if (leftans.equalsIgnoreCase("wood")){
			c.clear();
			 c.drawImage (jpgGameOver , 200, 100, 300, 300, null);
			c.print("You are dead. The killer grabed the wood as you swinged then you were beaten to death.");
			}
			
			else if (leftans.equalsIgnoreCase("run") && runChance <=30){
			c.clear();
			 c.drawImage (jpgGameOver , 200, 100, 300, 300, null);
			c.print("You are dead. ");
			}
			else if (leftans.equalsIgnoreCase("run") && runChance <=100){
			c.clear();

			c.drawImage (jpgCYF, 0, 350, 175, 175, null);
			c.drawImage (jpg2door, 0, 350, 175, 175, null);
			c.print(" You go upstairs and you pause, you could keep going up to the staircase to the fourth floor or turn right and head for a room and try to hide. Choose your faith.(room/fourth)");	
			leftans = c.readLine();
			}
			if(leftans.equalsIgnoreCase("room")){
			c.clear();
			 c.drawImage (jpgGameOver , 200, 100, 300, 300, null);
			c.print("You are dead. The room had no hiding spot because it was completely empty the killer was right behind you as you entered.");
			}	
			else if(leftans.equalsIgnoreCase("fourth")){
			c.clear();
				c.drawImage (jpgCYF, 0, 350, 175, 175, null);
			c.print("You see two elavators one left one right, choose the one you think is safer.(right elevator/left elevator)");
			leftans = c.readLine();

			if(leftans.equalsIgnoreCase("left elevator")){
			c.clear();
			c.print("You selected a one way elevator which lead you to escape the mansion.");
			}

			else if(leftans.equalsIgnoreCase("right elevator")){
			c.clear();
			c.drawImage (jpgCYF, 0, 350, 175, 175, null);
			c.print("Choose the right floor.Between 1, 2, 3, 5, and 6");
			leftans = c.readLine();

			while(floorChance2 < 2 && !leftans.equals("2")){	
				c.drawImage (jpgCYF, 0, 350, 175, 175, null);
			floorChance2 = floorChance2 + 1;
			c.print("Wrong floor, try again.");
			leftans = c.readLine();

			}

			if(leftans.equals("2")){
			c.clear();
			c.print("You survived. You chose the floor which lead you to escape the mansion.");
			}
			else{
			c.clear();
			c.print("You are dead. Killer appeared as the elevator opened.");
			}
		}
	

		}

		}	

		c.print("You are either dead, or you won, or an invalid answer was written.Play again?(yes/no)");
		playagain = c.readLine();

			
	}




		}



	}

	


