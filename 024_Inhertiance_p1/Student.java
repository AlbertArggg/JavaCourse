
public class Student 
{
	// - data - //
	
	private String name;
	private int studentID;
	private float grade;
	
	// - getters - //
	
	public String getName() { return name; }
	
	public int getStudentID() { return studentID; }
	
	public float getGrade() { return grade; }
	
	// - setters - //
	
	public void setName(String _name)
	{
		name = _name;
	}
	
	public void setStudentID(int _studentID)
	{
		studentID = _studentID;
	}
	
	public void setGrade(float _grade)
	{
		grade = _grade;
	}
	
	// - Constructors - // Method overloading example
	
	public Student (String _name, int _studentID)
	{
		name = _name;
		studentID = _studentID;
	}
	
	public Student (String _name)
	{
		name = _name;
	}
	
	public Student()
	{
		name = "";
		studentID = 0;
		grade = 0;
	}

	// - toString - //
	
	public String toString()
	{
		return("name: " + this.name + System.lineSeparator()
		       + "ID: " + this.studentID + System.lineSeparator()
		       + "grade: " + this.grade + System.lineSeparator()
		       + "_________________________________");
	}
}




















