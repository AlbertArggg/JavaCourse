import java.util.Random;
public class Array1 
{
	public static void main(String[] args)
	{
		Random rnd = new Random();						// instantiate a random object called rnd that we can use.
		
		int numsLessThan70 = 0;							// creates an integer variable called numsLessThan70 and initializes it to 0
		
		int[] allNumbers = new int[30];					// creates an array of integers that can hold 30 elements 
		
		for(int i = 0; i < allNumbers.length; i++)		// traverses entire length of array using for loop
		{
			allNumbers[i] = rnd.nextInt(100);			// sets the value of element at position i equal to random number generated by rnd.
			
			if(allNumbers[i] < 70)						// if random number in allNumbers[] at position i is less than 70
			{
				numsLessThan70++; 						// increments numLessThan70 by 1, (numsLessThan70 +1)
			}
		}
		
		System.out.println("Numbers less than 70: " + numsLessThan70);	// prints number of numbers < 70
		System.out.println("");	// skips line
		
		int counter = 0;										// creates counter set to 0
		
		int[] numsLessThan70Arr = new int[numsLessThan70];		// creates new array for numbers less than 70. 
		
		for(int i = 0; i < allNumbers.length; i++)				// traverses entire length of array using for loop
		{	
			if(allNumbers[i] < 70)								// if random number in allNumbers[] at position i is less than 70
			{
				numsLessThan70Arr[counter] = allNumbers[i];		// populate numsLessThan70Arr position counter = to allNumbers position i
				
				counter++; 										// increments counter by 1, (numsLessThan70 +1)
			}
		}
		
		// prints all numbers array
		
		System.out.print("allNumbers [] = { ");					// prints allNumbers [] = { to console
		
		for(int i = 0; i < allNumbers.length; i++)				// print all elements of allNumbers array - traverses through array using for loop
		{
			if(i == 0)
				System.out.print(allNumbers[i]);				// prints out array element at position i, if i = 5, prints out element number 5 of allNumbers array.
			
			else
				System.out.print(", " + allNumbers[i]); 		// same as line above, but we print a ',' before we print array element
		}
		
		System.out.print(" }");									// prints } to console. 
		
		System.out.println("");									// skip line x2
		System.out.println("");	
		
		// prints numsLessThan70Arr
		
		System.out.print("lessThan70 [] = { ");					// prints allNumbers [] = { to console
		
		for(int i = 0; i < numsLessThan70Arr.length; i++)		// print all elements of allNumbers array - traverses through array using for loop
		{
			if(i == 0)
				System.out.print(numsLessThan70Arr[i]);			// prints out array element at position i, if i = 5, prints out element number 5 of allNumbers array.
			
			else
				System.out.print(", " + numsLessThan70Arr[i]); 	// same as line above, but we print a ',' before we print array element
		}
		
		System.out.print(" }");									// prints } to console. 
	}
}