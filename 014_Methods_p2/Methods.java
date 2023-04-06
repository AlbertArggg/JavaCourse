import java.util.Scanner; // Scanner utility
public class Methods 
{	
	public static void main(String[] args) 
	{
		Scanner sk = new Scanner(System.in);
		makeCookies("Chocolate Chip");
		makeCookies("Banana");
		makeCookies("Mango");
	}
	
	public static void makeCookies(String ingredient)
	{
		System.out.println(ingredient + " Cookie: ");
		System.out.println("Prep dough");
		System.out.println("Add " + ingredient);
		System.out.println("bake for 20 minutes");
		System.out.println("Remove and let sit");
		System.out.println("wrap cookie");
		System.out.println("display");
		System.out.println("");
	}
}




























