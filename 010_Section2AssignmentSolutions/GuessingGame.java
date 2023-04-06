// Write a program that generates a random number for the user to guess

import java.util.Scanner;	// import java utility Scanner object to accept user input
import java.util.Random;	// import java utility Random object to accept user input

public class GuessingGame 
{
	public static void main(String[] args) 						// Beginning of main method
	{
		Scanner sk = new Scanner(System.in);								// Instantiate a Scanner object and call it sk
		Random rnd = new Random();											// Instantiate a Random object and call it rnd
		
		int numberOfTries = 0; 												// instantiate int data type "numberOfTries" and store 0
		int randomNum = rnd.nextInt(10)+10;									// instantiate int data type "randomNum" and store random number between 0 - 10 + 10
																			// as in rnd.nextInt(10) = number between 0-10, rnd.nextInt(10)+10 = number between 10-20
		System.out.println("Guess a number between 10 and 20");				// prints "Guess a number between 10 and 20" to console
		boolean valid = false;												// instantiate bool data type "valid" and set as false
		
		while (valid == false)												// while loop that will repeat as long as valid is false
		{
			int input = sk.nextInt();
			numberOfTries++;
			
			if(input < randomNum)											// check if input is less than the random number
			{
				System.out.println("Go Higher");							// prints "Go Higher"
			}
			else if(input > randomNum)										// check if input is greater than the random number 
			{
				System.out.println("Go Lower");								// prints "Go Lower" 
			}
			else															// otherwise, 
			{
				System.out.println("YOU WIN");								// prints "YOU WIN" 
				System.out.println("Number of Tries: " + numberOfTries);	// prints number of tries
				valid = true;												// set valid to true to exit while loop
			}
		}
	}
}






