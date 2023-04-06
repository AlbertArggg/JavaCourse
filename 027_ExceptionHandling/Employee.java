public class Employee 
{
	// - data - //
	
	private String name;		// data type String name
	private double pay;			// data type double pay
	private int hours;			// data type int hours
	
	// - getters - //
	public String getName() { return name; }		// get name function, returns name variable
	public double getPay() { return pay; }			// get pay function, returns pay variable
	public int getHours() { return hours; }			// get hours function, returns hours variable
	
	// - setters - //
	public void setName(String _name) { this.name = _name; }		// set name function, accepts String parameter, sets name variable to parameter value
	public void setPay(double _pay) { this.pay = _pay; }			// set pay function, accepts double parameter, sets pay variable to parameter value
	public void setHours (int _hours) { this.hours = _hours; }		// set hours function, accepts int parameter, sets hours variable to parameter value
	
	// - constructors - //
	public Employee(String _name, double _pay, int _hours)			// constructor for employee object, accepts string param _name, double param _pay and int param _hours
	{
		name = _name;												// set name variable to _name param value
		pay = _pay;													// set pay variable to _pay param value
		hours = _hours;												// set name variable to _name param value
	}
	
	// - functions - //
	public double getCheck()										// getCheck function, returns double
	{
		return(this.pay * this.hours);								// returns pay x hours 
	}
	
	// - toString method - //
	public String toString()												// to String method to print object
	{
		return ("Name: " + this.name + System.lineSeparator()				// prints name + skip line
		       + "pay: $" + this.pay + "/hour" +System.lineSeparator()		// prints pay + skips line
		       + "hours: " + this.hours + System.lineSeparator()			// prints hours + skips line
		       + "check: $" + getCheck() + System.lineSeparator()			// prints check total + skips line
		       + "__________________________________");						// prints line of underscores 
	}
}















