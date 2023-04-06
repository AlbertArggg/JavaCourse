import java.util.ArrayList;
import java.util.Scanner;

public class arrListDemo 
{
	public static void main(String[] args) 
	{
		Scanner sk = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<>();		// create a new arrayList called names of type String
		
		boolean inp = true;					// boolean datatype used in while loop
		
		while(inp == true)					// while inp == true, loop
		{
			System.out.println("Enter name or press '0' to quit: ");	// output to console
			
			String input = sk.nextLine();			// input = sk (our scanner obj), next line (user input)
			
			if(input.equals("0")) { inp = false; }		// user wants to quit, so exit loop by setting inp = false
			
			else{ names.add(input); }			// otherwise, add new name to arrayList of names
		}
		
		for(int i = 0; i < names.size(); i++)			// loop through array list
		{
			System.out.println(names.get(i));		// print names 
		}
	}
}







