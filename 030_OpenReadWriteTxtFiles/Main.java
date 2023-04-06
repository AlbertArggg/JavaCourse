import java.io.File;							// import all necessary utilities to read, write, create and load from txt files
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) throws FileNotFoundException			// add throws FileNotFoundException if you dont want to create try catch every 4 lines of code
	{
		String path = new File(".project").getAbsolutePath();					// attempt to locate a file called ".project" and store its directory path in String variable path
		path = path.replace(".project", "database.txt");						// we replace ".project" in path String to "database.txt"
		File f = new File(path);												// new File object and pass it the path we manipulated in the previous line of code
		
		if(f.exists()) { System.out.println("file exists"); }					// check if file at given path exists and let user know
		
		else { System.out.println("File not found");							// otherwise, let user know file is non-existent
			
			try {  f.createNewFile(); } 										// since file doesn't exist, TRY to create one
			catch (IOException e) { e.printStackTrace(); } 						// if try fails, throw me an IOException
		}
		
		String[] names = {"Josh", "Beth", "Lexi", "Albert", "Tim", "Joseph"};	// String[] of names, initialized with values
		String allNames = "";													// empty string
		
		for(int i = 0; i < names.length; i++) { allNames += names[i] + " "; }	// Concatenate all contents of names[] into a single String.
	
		try																		// TRY to
		{
			FileWriter writer = new FileWriter(path);							// create a FileWriter object and give it our file path
			writer.write(allNames);												// write into the file in file path, the String allNames
			writer.close();														// close the FileWriter Object
		}
		
		catch(IOException e) { e.printStackTrace(); }							// if try fails, catch here
		
		Scanner sk = new Scanner(f);											// create a new Scanner object, but instead of passing System.in (user input in console)
																				// we pass our File
		String[] names2 = null;													// create a new array called names2 and initialize it with nothing (NULL)
		
		while(sk.hasNextLine())													// as long as our file's text has a next line, 
		{
			names2 = sk.nextLine().split("\\s+");								// get the next line and split it every time we find 1 or more space characters ' ' 
		}
		
		for(int i = 0; i < names2.length; i++)									// loop through names2 and print value of all elements.
		{
			System.out.println(names2[i]);
		}
	}
}


