import java.util.Scanner;		// import scanner from java utilities 

public class Main 
{
	public static void main(String[] args) 	// beginning of main function
	{
		Scanner sk = new Scanner(System.in);	// instantiate Scanner object

		boolean valid = false;					// boolean variable used in while loop initialization 
		
		while(valid == false)					// while loop (condition: while invalid)
		{
			System.out.println("number of iterations: ");	// print statement to console
			int iterations = sk.nextInt();					// integer variable stores number of iterations from user input
			
			if(iterations < 3 || iterations > 20)		// if statement, checks if iterations is less than 3 or greater than 20
			{
				System.out.println("invalid input");	// if less than 3 or greater than 20, print invalid input to console
			}
			
			else				// otherwise
			{
				valid = true;		// set valid to true so that we can exit while loop
				
				System.out.println("valid input");			// print input valid to console
				
				System.out.println("________________________________________________");
				System.out.println("  Ascending  order: ");
				System.out.println("________________________________________________");
				
				for(int i = 0; i < iterations; i++)			// loops in ascending order
				{
					System.out.println("  i = " + i);		// prints "i = " and concatenates the value of i to statement
				}
				
				System.out.println("________________________________________________");
				System.out.println("  Descending order: ");
				System.out.println("________________________________________________");
				for(int i = iterations; i > 0; i--)			// loops in decending order
				{
					System.out.println("  i = " + i);		// prints "i = " and concatenates the value of i to statement
				}
				System.out.println("________________________________________________");
			}
		}
	}
}
