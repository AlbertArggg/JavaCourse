import java.util.Scanner;

public class StringManipulation 
{
	public static Scanner sk = new Scanner(System.in);
	
	public static void main(String[] args)		// driver method
	{
		//backwords();
		//charArrayToString();
		//sum();
		splitter();
	}
	
	public static void backwords()
	{
		System.out.println("Input: ");			// output to console, "Input"
		String str = sk.nextLine();				// ask user for input 
		System.out.print("Backwards: ");		// output to console "Backwards"
		
		for(int i = str.length()-1; i>=0; i--)	// i starts at last char in string, ends at 1, dec(--) instead of inc(++)
		{
			System.out.print(str.charAt(i));	// prints char at position i in String
		}
	}
	
	public static void charArrayToString()
	{
		char[] arr = {'h', 'e', 'l', 'l', 'o'};				// array of characters 'h', 'e', 'l', 'l', 'o'
		String str = String.valueOf(arr);					// String str = contents of char array
		System.out.println("char array to string: "+ str);	// output to console value of str
	}
	
	public static void sum()
	{
		System.out.println("Enter String of numbers");	// output "enter..."
		String str = sk.nextLine();						// input into str
		int sum = 0;									// variable sum for addition
		
		for(int i = 0; i < str.length(); i++)			// loop through characters to add to sum
		{
			char c = str.charAt(i);						// set charat(i) in c
			int temp = Character.getNumericValue(c);	// get numerical value of char (will throw error if not 0-9)
			sum = temp + sum;							// add temp to sum
		}
		
		System.out.println("sum: " + sum);				// output sum to console
	}
	
	public static void splitter()
	{
		System.out.println("enter words seperated by , : ");	// output "enter words..."
		String str = sk.nextLine();								// input from user into str
		
		for(String x: str.split(","))							// split at "," and store in x
		{
			System.out.print(x+" ");							// output value of x
		}
	}
}





















