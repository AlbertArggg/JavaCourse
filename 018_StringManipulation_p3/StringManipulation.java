import java.util.Scanner;

public class StringManipulation 
{
	public static Scanner sk = new Scanner(System.in);
	
	public static void main(String[] args)		// driver method
	{
		//backwords();
		//charArrayToString();
		//sum();
		//splitter();
		//makeCap();
		//alternateCharPrinter();
		//binHexOct();
		//bigT();
		//passwordChecker();
		//wordCounter();
		websiteValidator();
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

	public static void makeCap()
	{
		System.out.println("input: ");							// output "input: "
		
		String str1 = sk.nextLine();							// store input in str1
		String str2 = "";										// create var String str2
		
		boolean cap = true;										// create var bool cap and set to true
		
		for(int i = 0; i < str1.length(); i++)					// loop through length of string
		{
			char ch = str1.charAt(i);							// store charAt pos i in ch
			
			if(cap)												// if cap == true
			{
				str2 += String.valueOf(ch).toUpperCase();		// make ch upper case and add to str2
				cap = false;									// set cap to false
			}
			
			else												// else
			{
				str2 += String.valueOf(ch);						// add ch to str2
				if(ch == ' ')									// if ch is a space character
				{
					cap = true;									// set cap to true so that we can capitalize the next character
				}
			}
		}
		
		System.out.println("output: " + str2);					// print out the output
	}

	public static void alternateCharPrinter()
	{
		String str = "Hello Freaks Lets Learn Some String Manipulation";	// string here
		
		System.out.println(str);											// print str as is, no alternate chars
		
		for(int i = 0; i < str.length(); i++)								// loop through length of str
		{
			if(i%2==0)														// if pos of char % 2 = 0
			{
				System.out.print(str.charAt(i));							// print char
			}
			else
			{
				System.out.print('_');										// else print '_'
			}
		}
	}

	public static void binHexOct()
	{
		System.out.print("integer input: ");									// output "Integer input"
		int i = sk.nextInt();													// store input in i
		System.out.println("input binary: " + Integer.toBinaryString(i));		// i->BinaryString
		System.out.println("input hexadecimal: " + Integer.toHexString(i)); 	// i->HexString
		System.out.println("input Octal: " + Integer.toOctalString(i));			// i->OctString
	}
	
	public static void bigT()
	{
		System.out.print("input: ");					// output "input"
		String str1 = sk.nextLine();					// input -> str1
		String str2 = "";								// var type String str2
		
		for(int i = 0; i < str1.length(); i++)			// loop through str1 length
		{
			if(str1.charAt(i) == 't') { str2+= 'T'; }	// if character at pos i = t then char at pos i = T
			else { str2+= str1.charAt(i); }				// else just concat with character
		}
		
		System.out.println("output: " + str2);			// print str2
	}
	
	public static void passwordChecker()
	{
		System.out.println("password: ");		// output "password"
		String pass = sk.nextLine();			// input -> pass
		
		boolean isDigit = false;				// boolean variable set to false
		boolean isUpCase = false;
		boolean isLowCase = false;
		boolean isSymbol = false;
		boolean longEnough = false;
		
		if(pass.length() >=12) {longEnough = true; }	// set long enough = true if pass >= 12 characters
		
		for(int i = 0; i < pass.length(); i++)			// loop through pass 
		{
			if(Character.isDigit(pass.charAt(i))) { isDigit = true; }				// check for digits. set true if found
			else if(Character.isUpperCase(pass.charAt(i))) {isUpCase = true; }		// check for uppercase set true if found
			else if(Character.isLowerCase(pass.charAt(i))) {isLowCase = true; }		// check for lowercase set true if founds
			else {isSymbol = true; }												// if is neither of the 3 above, then must be symbol
		}
		
		if(isDigit && isUpCase && isLowCase && isSymbol && longEnough)		// if all checks return true, then pass is valid
		{
			System.out.println("password is valid");
		}
		else
		{
			System.out.println("Password sucks");							// otherwise, password sucks
		}
	}

	public static void wordCounter()
	{
		System.out.print("input: ");						// OUTPUT "INPUT"
		String str = sk.nextLine();							// input -> str
		int counter = 0;									// int var counter set to 0
		
		for(String x: str.split(" "))						// split at char = ' ' and increment counter
		{
			counter++;
			System.out.println(x + ": " + counter);			// output word and count
		}
		
		System.out.println("total count: " + counter);		// output total count of words in given string
	}

	public static void websiteValidator()
	{
		System.out.println("input: ");						// output "input"
		String str = sk.nextLine();							// input -> str
		
		str = str.toUpperCase();							// str = STR, since .com != .COM, uppercase so validator is valid
		
		if(str.endsWith(".COM") && str.startsWith("WWW."))	// if ends with .COM, and starts with WWW. then is valid
		{
			System.out.println("website valid");
		}
		else												// otherwise, website is not valid
		{
			System.out.println("website invalid");
		}
	}
}





















