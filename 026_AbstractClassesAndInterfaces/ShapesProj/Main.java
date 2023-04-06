public class Main 
{
	public static void main(String[] args) 			// static = no need to instantiate
	{
		rectangle r = new rectangle(3, 2);			// instantiate rectangle with name r and width = 3, height = 2.
		triangle t = new triangle(3,2);				// instantiate triangle with name t and width = 3, height = 2.
		
		System.out.println(r);						// print object r (rectangle)
		System.out.println(t);						// print object t (triangle)
	}
}