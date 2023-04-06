import java.util.Scanner;
public class breakContinueReturn 
{
	public static void main(String[] args)
	{
		System.out.println("Main Menu:");						// print statement
		mainMenu();												// calls main menu method
	}

	private static void mainMenu() 									// main menu method
	{
		System.out.println("   1) press 1 for continue");			// menu, 1 to continue. 2 for break, 3 for return
		System.out.println("   2) press 2 for break");
		System.out.println("   3) press 3 for return");
		System.out.println("_________________________________");
		
		Scanner sk = new Scanner(System.in);						// instantiate scanner object
		int input = sk.nextInt();									// accepts user input as int and stores value in input variable
		
		System.out.println("In Driver");							// prints in driver (not really but just a demo of our code)
		
		method1(input);												// calls method 1 -> input in () is getting sent to that method so that it can access it
		method2();													// calls method 2
	}

	private static void method1(int input) 							// method1
	{
		System.out.println("In Method 1");							// prints in method 1
		for(int i = 0; i < 21; i++)									// loop
		{
			if(i%2 != 0)											// checks if i is even 
			{
				if(input == 1) { continue;}							// if user input is 1, continue instruction
				else if(input == 2) {break; }						// if user input is 2, break instruction
				else {return; }										// if user input is ! 1 or 2, return instruction
			}
			
			System.out.println("i = " + i);							// prints i = and the value of i
		}
		System.out.println("Exited Loop");							// prints exited loop
	}

	private static void method2() 									// method 2
	{
		System.out.println("In Method 2");							// prints in method 2
		System.out.println("_________________________________");
		mainMenu();													// infinite recursion where main menu method calls method 2 and method 2 calls main menu forever.
	}
}
