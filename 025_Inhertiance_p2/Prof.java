public class Prof extends User
{
	// - data - //
	private float salary;
	
	// - getters - //
	public float getSalary() {return salary;}
	
	// - setters - //
	public void setSalary(float _salary) {salary = _salary; }
	
	// - constructors - //
	public Prof(String _name, int _ID, String _username, String _password)
	{
		super(_name, _ID, _username, _password);	// super keyword refers to the superclass user and tells the program to use the user constructor for these params
	}
	
	public Prof(String _name, int _ID, String _username, String _password, float _salary)
	{
		super(_name, _ID, _username, _password);	// super keyword refers to the superclass user and tells the program to use the user constructor for these params
		salary = _salary;							// sets the salary var to the _salary parameter
	}		
	
	// - toString - //
	public String toString()
	{		
		return("Professor:" + System.lineSeparator()					// String return when calling the toString method
		       + "name: " + super.getName() + System.lineSeparator()
		       + "ID: " + super.getID() + System.lineSeparator()
		       + "salary: " + this.salary +  System.lineSeparator()
		       + "_________________________________");
	}
}
