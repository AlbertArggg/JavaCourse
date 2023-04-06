// ask user for first and last name and print "Hello, name lastName what can I help you with? "

import java.util.Scanner;	// import java utility Scanner object to accept user input

public class NameLastName 
{
	public static void main(String[] args) 		// Beginning of main method
	{
		Scanner sk = new Scanner(System.in);	// Instantiate a Scanner object and call it sk
		
		System.out.println("Hey whats your name guy? ");	// prints "Hey whats your name guy? " to console
		String name = sk.nextLine();						// accepts user given input 
		
		System.out.println("Hey whats your last name " + name + "?");	// prints "Hey whats your last name + name + guy? "
		String lastName = sk.nextLine();								// accepts user given input
		
		System.out.println("Hello, " + name + " " + lastName + " What can I help you with? ");	// print "Hello, name lastName what can I help you with? "
	}
}






