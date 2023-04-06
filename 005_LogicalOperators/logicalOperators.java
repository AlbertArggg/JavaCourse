public class logicalOperators 
{
	public static void main(String[] args)
	{
		boolean T = true;
		boolean F = false;

		// && operator (AND)
		System.out.println("&& operator");
		System.out.println("_____________________________________");
		System.out.println("True  && True   = " + ((T)&&(T)));
		System.out.println("True  && false  = " + ((T)&&(F)));
		System.out.println("false && false  = " + ((F)&&(F)));
		System.out.println("_____________________________________");
		
		// || operator (OR)
		System.out.println("|| operator");
		System.out.println("_____________________________________");
		System.out.println("True  || True   = " + ((T)||(T)));
		System.out.println("True  || false  = " + ((T)||(F)));
		System.out.println("false || false  = " + ((F)||(F)));
		System.out.println("_____________________________________");
		
		// ! operator (NOT)
		System.out.println("! operator");
		System.out.println("_____________________________________");
		System.out.println("!True  = " + (!T));
		System.out.println("!false = " + (!F));
		System.out.println("_____________________________________");
	}
}
