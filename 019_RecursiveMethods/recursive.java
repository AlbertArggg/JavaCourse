public class recursive 
{
	public static void main(String[] args) 
	{
		long[] nums = {2,4,6,8,10,12}; // array of longs (longs = long integers)
		
		for(int i = 0; i < nums.length; i++) // loop throwugh array of longs
		{
			System.out.println("factorial [" + nums[i] + "] : " + getFactorial(nums[i])); // call factorial method
		}
		
		// getFactorial(12347832);  // this will throw a stack overflow exception
	}
	
	public static long getFactorial(long num)	// recursive get factorial function
	{
		if(num>1)								// recursive case
		{
			return num* getFactorial(num-1);	// returns the number multiplied by the factorial of that number -1
		}
		
		else									// base case
		{
			return 1;							// returns 1
		}
	}
}
