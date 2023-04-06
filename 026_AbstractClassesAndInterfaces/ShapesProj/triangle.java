
public class triangle extends shapesData implements shapesFunc		// triangle class, inherits from shapesData and implements functionality of ShapesFunc
{
	public triangle(float w, float h) 								// triangle constructor
	{
		super(w, h);												// super = superclass, so, superclass constructor pass w and h
	}

	public float getArea() 											// implementation of getArea 
	{
		return ((super.getHeight()*super.getWidth())/2);			// returns ((width*heigh)/2) / super.getHeight, super.getWidth -> calls superclass method to get height / width
	}

	public String toString() 										// toString method implementation
	{
		return ("Triangle: " + System.lineSeparator()
			    +"width: " + super.getWidth() + System.lineSeparator()
		        + "height: " + super.getHeight() + System.lineSeparator()
		        + "Area: " + this.getArea() + System.lineSeparator()
		        +"________________________________________________________");
	}
}
