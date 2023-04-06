public class Student extends User implements barbieGirl
{
	// - data - //
	private float grade;
	
	// - getters - //
	public float getGrade() { return grade; }
	
	// - setters - //
	public void setGrade(float _grade) { grade = _grade; }
	
	// - Constructors - // Method overloading example
	public Student(String _name, int _ID, String _username, String _password)
	{
		super(_name, _ID, _username, _password);		// super keyword refers to the superclass user and tells the program to use the user constructor for these params
	}
	
	public Student(String _name, int _ID, String _username, String _password, float _grade)
	{
		super(_name, _ID, _username, _password);		// super keyword refers to the superclass user and tells the program to use the user constructor for these params
		grade = _grade;									// sets the grade var to the _grade parameter
	}	
	
	// - toString - //
	
	public String toString()
	{
		String status;
		status = (this.grade<70) ? "Failing" : "Passing";				// if this.grade is less than 70, then status = failling, otherwise, status = passing
		
		return("name: " + super.getName() + System.lineSeparator()					// String return when calling the toString method
		       + "ID: " + super.getID() + System.lineSeparator()
		       + "grade: " + this.grade + "   " + status + System.lineSeparator()
		       + "_________________________________");
	}

	public void printBarbie() 
	{
		System.out.println("Im a barbie girl");
	}
}



















