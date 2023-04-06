import java.util.Scanner;													// imports the java.util.Scanner package so we can use it to get input
public class CalcGrades 													// if its not working, its probably because your .java is not called CalcGrades.java
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")											// because i hate squiggly yellow lines. dont pay any mind to this. 
		Scanner sk = new Scanner(System.in);										// create a scanner object and call it sk, this will be used to get your input into console
		int grade = 0;													// int data type grade, will store student grade
		int counter = 0; 												// int data type counter, used to determine console output
		
		while(true)													// while loop, keep running forever since conditional always true
		{	
			if(counter==0)												// if + conditional
			{
				System.out.print("student grade: ");								// prints student grade if conditional is met
				counter++;											// increments counter
			}	
			
			else
			{
				System.out.print("next student:  ");								// prints next student if conditional not met
			}
			
			grade = sk.nextInt();											// gets your input from console and stores it in grade, only accepts datatype int
			System.out.println("Grade = " + grade + " student gets '" + passedClass(grade) + "' in the class");	// prints the final statement 
		}
	}
	
	public static char passedClass(int _grade)										// fruitful method that returns a char data type and takes in an int parameter
	{
		// your code here
	}
}


