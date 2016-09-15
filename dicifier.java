/****************************************************************************
 *
 * Created by: Jess and Craig
 * Created on: Sept 2016
 * This program randomly generates a number and allows you to guess it. It
 *     then tells you how many guesses it took. Also allows you to pick 
 * the max number
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class dicifier {

	public static int DiceRoll(int numberOfSides ) {
		//this randomly generates the nubmer rolled  , max number being numberOfSides inputted by the user
		
		 int diceNumber = (int )(Math.random() * numberOfSides + 1);
		 
		return diceNumber; 
	}
	
	
	public static void main(String[] args) throws IOException
	 {
		System.out.println("How many sides does your DIE have?"); 
		
	   int userNumber = 0;
	   
	  // int diceNumber = (int )(Math.random() * 6 + 1);
	   
	   InputStreamReader r = new InputStreamReader(System.in);
	   BufferedReader br = new BufferedReader(r);
	   int  numberOfSides = Integer.parseInt(br.readLine());  
	   int numberOfGuesses = 1;
	   
	   int diceNumber =DiceRoll(numberOfSides); 
	   System.out.println("Guess what number was rolled bruh"); 
	   while (!(diceNumber == userNumber))
	    {

	   // InputStreamReader r = new InputStreamReader(System.in);
	   // BufferedReader br = new BufferedReader(r);

	    userNumber = Integer.parseInt(br.readLine());

	    if (userNumber == diceNumber) {

	    	System.out.println("You guessed the number " + diceNumber + " in " + numberOfGuesses + " tries!");
	    	} else {

	    		numberOfGuesses++;
	    		System.out.println("Guess again!");
	    	}

	   }


	    //System.out.println(diceNumber);
	 }
	
}
