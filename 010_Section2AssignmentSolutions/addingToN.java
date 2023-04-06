// Write a program that asks the user for a number n and adds all number from 1 - n (as in 1 + 2 + 3 + ... + n-1 + n)

import java.util.Scanner;	// import java utility Scanner object to accept user input

public class addingToN 
{
	public static void main(String[] args) 						// Beginning of main method
	{
		Scanner sk = new Scanner(System.in);					// Instantiate a Scanner object and call it sk
		
		System.out.println("give a number between 3 - 10 ");	// prints "give a number between 3 - 10 " to console
		
		int n = 0; 												// instantiate int data type "n" and store 0
		int sum = 0;											// instantiate int data type "sum" and store 0
		boolean valid = false;									// instantiate bool data type "valid" and set as false
		
		while (valid == false)									// while loop that will repeat as long as valid is false
		{
			n = sk.nextInt();									// accept user input 
			if(n<3 || n>10)										// check if user input is between 3 and 10
			{
				System.out.println("Invalid Input");			// prints "Invalid Input" if check returns false
			}
			
			else { valid = true; }								// otherwise sets valid = true
		}
		
		System.out.print("sum = ");								// prints "sum = " to console | Does not skip line
		
		for(int i = 1; i <=n; i++)								// for loop between 1 and n
		{
			if(i == 1)											// for make output pretty check if first iteration
			{
				System.out.print(i);							// prints i in case of first iteration
			}
			else												// otherwise, 
			{
				System.out.print(" + " + i);					// prints + i 
			}
			sum += i;											// we add i to sum so now sum = initial sum + i
		}
		System.out.println("");									// skips line (can use System.lineSeparator() too)
		System.out.println("sum = " + sum);						// prints final addition results
	}
}






