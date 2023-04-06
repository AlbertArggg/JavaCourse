import java.util.Random;
public class ArrayProject001
{
	public static void main(String[] args)
	{
		Random rnd = new Random();						// instantiate a random object called rnd that we can use.
		
		int[] nums = new int[20];						// creates an array of integers that can hold 30 elements 
		
		for(int i = 0; i < nums.length; i++)			// traverses entire length of array using for loop
		{
			nums[i] = rnd.nextInt(100);					// sets the value of element at position i equal to random number generated by rnd.
		}
		
		// prints all numbers array
		System.out.println("_______________________________________________________________________________________________________________________________");
		
		System.out.print("allNumbers [] = { ");			// prints allNumbers [] = { to console
		
		for(int i = 0; i < nums.length; i++)			// print all elements of allNumbers array - traverses through array using for loop
		{
			if(i == 0)
				System.out.print(nums[i]);				// prints out array element at position i, if i = 5, prints out element number 5 of allNumbers array.
			
			else
				System.out.print(", " + nums[i]); 		// same as line above, but we print a ',' before we print array element
		}
		
		System.out.print(" }");							// prints } to console. 
		
		System.out.println("");							// skip line
		System.out.println("_______________________________________________________________________________________________________________________________");
		
		// sum of all numbers in array
		
		int sum = 0;									// create var of type int called sum and set it = to 0
		
		System.out.print("Sum:  ");						// prints sum
		
		for(int i = 0; i < nums.length; i++)			// print all elements of allNumbers array - traverses through array using for loop
		{
			if(i == 0)
				System.out.print(nums[i]);				// prints out array element at position i, if i = 5, prints out element number 5 of allNumbers array.
			
			else
				System.out.print(" + " + nums[i]); 		// same as line above, but we print a ',' before we print array element
			
			sum += nums[i];								// adds nums element at position i to sum
		}
		
		System.out.println(" = " + sum);
		
		System.out.println("_______________________________________________________________________________________________________________________________");
		
		// gets average value of array 
		System.out.println("average = " + (sum/nums.length));
		System.out.println("_______________________________________________________________________________________________________________________________");
		
		// find and print min and max values of array
		
		int maxVal = 0; 		// create a new int variable called maxVal and set it = min possible value
		
		int minVal = 100;		// create a new int variable called minVal and set it = max possible value
		
		for(int i = 0; i < nums.length; i++)			// traverses entire length of array using for loop
		{
			if(minVal > nums[i]) 			// if minVal is greater than element in nums position i, then nums position i is the new minVal
			{
				minVal = nums[i];
			}
			
			if(maxVal < nums[i])			// if maxVal is less than element in nums position i, then nums position i is the new maxVal	
			{
				maxVal = nums[i];
			}
		}
		
		System.out.println("Min Value: " + minVal + "       Max Value: " + maxVal);
		System.out.println("_______________________________________________________________________________________________________________________________");
		
		
		// prints array in reverse
		System.out.print("srebmuNlla [] = { ");			// prints allNumbers [] = { to console
		
		for(int i = (nums.length-1); i >= 0; i--)		// print all elements of allNumbers array - traverses through array using for loop
		{
			if(i == nums.length-1)
				System.out.print(nums[i]);				// prints out array element at position i, if i = 5, prints out element number 5 of allNumbers array.
			
			else
				System.out.print(", " + nums[i]); 		// same as line above, but we print a ',' before we print array element
		}
		
		System.out.print(" }");							// prints } to console. 
		
		System.out.println("");							// skip line
		System.out.println("_______________________________________________________________________________________________________________________________");
	}
}