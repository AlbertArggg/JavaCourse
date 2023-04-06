public class Student 						// a student class
{
	// - Data - // 
	private String name;					// private datatype String called name
	private int ID;							// private datatype int called ID
	private float grade;					// private dataType float called grade

	// - Getters - //
	public String getName() { return name; }	// public getter method that returns the String variable value in name
	public int getID() { return ID; }			// public getter method that returns the int variable value in ID
	public float getGrade() { return grade; }	// public getter method that returns the float variable value in grade	

	// - Setters - //
	public void setName(String name) { this.name = name; }		// public setter method that takes param of type String and sets the value of name = value of parameter
	public void setID(int _ID) { ID = _ID;}						// public setter method that takes param of type int and sets the value of ID = value of parameter
	public void setGrade(float grade) { this.grade = grade; }	// public setter method that takes param of type float and sets the value of grade = value of parameter
	
	// - Constructors - //
	public Student(String _name, int _ID)	// a Student Constructor with 2 parameters - String, int
	{
		name = _name;						// takes param of type String and sets the value of name = value of parameter (_name)
		ID = _ID;							// takes param of type int and sets the value of ID = value of parameter (_ID)
	}
	
	public Student(String _name)			// overloading Student constructor with single param constructor method 
	{
		name = _name;						// takes param of type String and sets the value of name = value of parameter (_name)
	}

	// - toString - //
	public String toString()										// override java toString method that returns object memory location
	{
		return("name: " + this.name + System.lineSeparator()		// prints name: and name variable content then skips line
		      + "ID: " + this.ID + System.lineSeparator()			// prints ID: and ID variable content then skips line
		      + "grade: " + this.grade + System.lineSeparator() 	// prints grade: and grade variable content then skips line
		      + "_________________________________");
	}
}


