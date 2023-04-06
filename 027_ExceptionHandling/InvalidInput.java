@SuppressWarnings("serial")							// suppresses no serial version ID number warning

public class InvalidInput extends Exception			// Invalid Input class, inherits functionality from Exception class (written by java people)
{
	public InvalidInput(String _error)				// constructor accepting String parameter
	{
		super("Invalid Input: " + _error);			// prints invalid input + custom msg sent by param (_error)
	}
}
























