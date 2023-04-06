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
	
}


