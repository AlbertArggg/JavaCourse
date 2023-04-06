public abstract class shapesData 					// abstract class <shapesData>
{
	private float width;							// width data
	private float height;							// height data
	
	public float getHeight() {return height;}		// height getter
	public float getWidth() {return width;}			// width getter
	
	public void setHeight(float h) {height = h; }	// height setter
	public void setWidth(float w) {width = w; }		// width setter
	
	public shapesData(float w, float h)				// constructor
	{
		height = h;									// set height var = h parameter
		width = w;									// set width var = w parameter 
	}
	
	public abstract String toString();				// toString method, no body (abstract method)
}