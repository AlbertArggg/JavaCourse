import java.util.Scanner; // Scanner utility

public class Main 
{	
	public static Scanner sk = new Scanner(System.in);
	
	// driver class
	public static void main(String[] args) 
	{
		// ask the user for a number of students
			
		Prof p = new Prof("Jay", 123, "Jay123", "wkefhb", 32000);		// create and print a Prof object
		System.out.println(p);
		
		User u = new User("John", 123, "Jhon123", "2wefih!");			// create and print a user object
		System.out.println(u);
		
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
			
			System.out.println("enter student username: ");	// ask for student username
			String username = sk.next();	// store input in name string
			
			System.out.println("enter student password: ");	// ask for student password
			String password = sk.next();	// store input in name string
			
			Student s = new Student(name, id, username, password);	// use constructor in Student class to build student
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
	
	// print out student objects (wont work) // need to build toString method
	public static void printArray(int num, Student[] sts) 
	{
		System.out.println("_________________________________");	// for make pretty
		for(int i = 0; i < num; i++)
		{
			System.out.println(sts[i]);
		}
	}
}




























