
public class User 
{
	// - data - //
	
	private String name;
	private int ID;
	private String username;
	private String password;
	
	// - getters - //
	
	public String getName() {return name;}							// getName function
	public int getID() {return ID; }								// getID function
	public String getUsername() {return username;}					// getUsername function
	public String getPassword() {return password; }					// getPassword function
	
	// - setters - //
	
	public void setName(String _name) {name = _name;}				  // set name to name passed as param
	public void setID(int _ID) {ID = _ID;}							  // set ID to ID passed as param
	public void setUsername(String _username) {username = _username;} // set username to username passed as param
	public void setPassword(String _password) {password = _password;} // set password to password passed as param
	
	// - constructors - //
	
	public User(String _name, int _ID, String _username, String _password)
	{
		name = _name;						// set name to name passed as param
		ID = _ID;							// set ID to ID passed as param
		username = _username;				// set username to username passed as param
		password = _password;				// set password to password passed as param
	}
	
	// - toString method - //
	
	public String toString()											// object toString method
	{
		return("Type: user" + System.lineSeparator()					// print ststemnt
		       + "name: " + this.name + System.lineSeparator()			// print name
		       + "ID: " + this.ID + System.lineSeparator()				// print ID
		       + "username: " + this.username + System.lineSeparator()  // print username
		       + "_________________________________");					// make pretty
	}
}







