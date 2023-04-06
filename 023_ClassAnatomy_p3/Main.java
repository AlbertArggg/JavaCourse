import java.util.Scanner; // Scanner utility

public class Main 
{	
	public static Scanner sk = new Scanner(System.in);
	
	// driver class
	public static void main(String[] args) 
	{
		// ask the user for a number of students
		System.out.println("students: ");	// ask for num of students
		int num = sk.nextInt();				// store input in num
		Student[] sts = new Student[num]; 	// array of student objects (num long)

		instantiateAndPopulate(num, sts); 	// call instantiate and populate method
		assignGrades(num, sts);				// call assign grades method
		printArray(num, sts); 				// call print array method
	}
	
	// instantiate those students and store them in an array
	public static void instantiateAndPopulate(int num, Student[] sts) 
	{
		for(int i = 0; i < num; i++)	// loop through array of students
		{
			System.out.println("enter student name: ");	// ask for student name
			String name = sk.next();	// store input in name string
			
			System.out.println("enter student ID");	// ask for student ID
			int id = sk.nextInt();	// store in id variable
			
			Student s = new Student(name, id);	// use constructor in Student class to build student
			sts[i] = s;		// store Student s in sts[position i]
		}
	}
	
	// assign students grades
	public static void assignGrades(int num, Student[] sts) 
	{	
		for(int i = 0; i < num; i++)	// loop through array of students
		{
			System.out.println("student grade: ");	// ask for student grade
			sts[i].setGrade(sk.nextFloat()); 	// store student grade in student grade var
		}
	}
	
	// print out student objects -> will not work until we have a to String method
	public static void printArray(int num, Student[] sts) 
	{
		System.out.println("_________________________________");	// for make pretty
		for(int i = 0; i < num; i++)
		{
			System.out.println(sts[i]);								// print student object using toString method we override in Student
		}
	}
}




























