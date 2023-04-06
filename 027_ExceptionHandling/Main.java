import java.util.Scanner;													// import java scanner utilities

public class Main 															// driver class Main
{
	public static Scanner sk = new Scanner(System.in);						// public Scaner object to scan user input
	
	public static void main(String[] args) 									// driver method main
	{
		System.out.println("Hello, please enter your details bellow");		// prints to console
		
		String name = checkName();		// new datatype String, called name, stores checkName return in name.
		double pay = checkPay();		// new datatype double, called pay, stores checkpay return in pay.
		int hours = checkHours();		// new datatype int, called hours, stores checkHours return in hours.
		
		Employee e = new Employee(name, pay, hours);			// create employee obj using name, pay and hours as parameters
		System.out.println(e);							// prints employee object to console, using employee toString method
	}
	
	public static String checkName()										// check name method
	{
		boolean valid = false;			// boolean data type valid set to false
		String name = "";				// String data type name initialized as empty String
		
		while(valid == false)			// while loop, iterates as long as valid == false
		{
			valid = true;				// sets valid to true, in case input is invalid, valid set to false in catch block
			System.out.println("Enter Name: ");		// prints to console
			
			try			// try block, will attempt to execute code in try brackets
			{
				name = sk.nextLine();		// accepts user input and stores it in name
				
				if(name.length()<3 ) 		// checks if name String length < 3
				{
					throw new InvalidInput("lets try an actual name this time");	// throws invalid input exception if name length < 3 + msg 
				}
				
				for(int i = 0; i < name.length(); i++)		// for loop, checks each character of name String,
				{
					if((Character.isLetter(name.charAt(i))|| name.charAt(i) == ' ') == false)		// if character at position i of name String is not a letter, and not a space char
					{
						throw new InvalidInput("okay mr. cyborg man, lets try an actual name this time");	// prints some stupid shit HR people would say
					}
				}
			}			// end of try block of code
			
			catch(InvalidInput e) 		// catch block, invalid input type error msg, (if name < 3 and has weird chars)	
			{
				valid = false;							// set valid = false
				System.out.println(e.getMessage());			// prints msg in invalid input exception
			}											// end catch invalid input exception
			
			catch(Exception e) 			// catch block, Exception type error, (any exception not manually thrown by us)
			{
				valid = false;												// set valid = false 
				System.out.println("Invalid Input: mistakes were made");			// prints to console
			}																// end catch exception
		}				// end while loop
			
		return name;			// if all is well, we exit while loop and return name
	}					// end of function

	public static double checkPay()											// check pay method
	{
		boolean valid = false;					// boolean valid set to false
		double pay = 0;							// double pay set to 0
		
		while(valid == false)					// while loop, iterated while valid == false
		{
			valid = true;							// set valid = true
			System.out.println("Enter Pay: ");		// output to console
			
			try										// try block starts here
			{
				pay = Double.parseDouble(sk.next());	// if this goes wrong, exception e
				if(pay<15.0) 							// check if pay < 15
				{
					throw new InvalidInput("I have to pay you minimum wage"); 	// throws Invalid Input Exception, + msg
				}
				
				if(pay>30)								// check if pay > 30
				{
					throw new InvalidInput("best i can do is 29.99"); 	// // throws Invalid Input Exception, + msg
				}
			}
			
			catch(InvalidInput e) 	// invalid input type error msg
			{
				valid = false;		// sets valid =  false
				System.out.println(e.getMessage());		// prints invalid input exception + msg
			}
			
			catch(Exception e) // any other error, error we did not manually throw exception for
			{
				valid = false;												// sets valid = false
				System.out.println("Invalid Input: must be a decimal");		// since most likely a bogus input, prints this error msg
			}
		}
		
		return pay;					// otherwise, all is well, we return the pay
	}

	public static int checkHours()											// check hours method
	{
		boolean valid = false;			// boolean valid = false
		int hours = 0;					// int hours = 0
		
		while(valid == false)			// while loop, iterates while valid == false
		{
			valid = true;							// set valid = true
			System.out.println("Enter Hours: ");		// enter hours output to console
			
			try											// try starts here
			{
				hours = Integer.parseInt(sk.next());	// if this goes wrong, exception e
				if(hours<1) 								// if hours < 1 
				{
					throw new InvalidInput("your fired"); 	// throw invalid input Exception + msg
				}
				
				if(hours>60)								// if hours > 60, 
				{
					throw new InvalidInput("touch grass"); // throw invalid input Exception + msg
				}
			}
			
			catch(InvalidInput e) 	// invalid input type error msg
			{
				valid = false;						// set valid = false
				System.out.println(e.getMessage());		// prints invalid input exception message
			}
			
			catch(Exception e) // any other error
			{
				valid = false;				// set valid = false
				System.out.println("Invalid Input: must be an integer");  // since most likely a bogus input, prints this error msg
			}
		}
		
		return hours;		// otherwise, all is well, we return the hours	
	}
}