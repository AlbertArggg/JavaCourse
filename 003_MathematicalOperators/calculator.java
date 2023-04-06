public class calculator 
{
	public static void main(String[] args)
	{
		int num1 = 5;
		int num2 = 10;
		float fl1 = 20f;
		float fl2 = 8f;
		
		System.out.println("Calculator");
		
		System.out.println("__________________________________");				// addition 
		System.out.println("Addition: ");
		System.out.println("__________________________________");
		System.out.println("results = num1 + num2 ");
		System.out.println("results = " + num1 + " + " + num2);
		System.out.println("results = " + (num1 + num2));
		
		System.out.println("__________________________________");				// subtraction
		System.out.println("subtraction: ");
		System.out.println("__________________________________");
		System.out.println("results = num1 - num2 ");
		System.out.println("results = " + num1 + " - " + num2);
		System.out.println("results = " + (num1 - num2));
		
		System.out.println("__________________________________");				// multiplication
		System.out.println("multiplication: ");
		System.out.println("__________________________________");
		System.out.println("results = num1 X num2 ");
		System.out.println("results = " + num1 + " x " + num2);
		System.out.println("results = " + (num1 * num2));
		
		System.out.println("__________________________________");				// division
		System.out.println("division: ");
		System.out.println("__________________________________");
		System.out.println("results = fl1 / fl2 ");
		System.out.println("results = " + fl1 + " / " + fl2);
		System.out.println("results = " + (fl1 / fl2));
		
		System.out.println("__________________________________");				// Modulo
		System.out.println("Modulo: ");
		System.out.println("__________________________________");
		System.out.println("results = num1 % num2 ");
		System.out.println("results = " + num1 + " % " + num2);
		System.out.println("results = " + (num1 % num2));
		
		System.out.println("__________________________________");				// increment
		System.out.println("increment: ");
		System.out.println("__________________________________");
		System.out.println("results = num1++ ");
		System.out.println("results = " + num1 + "++ ");
		num1++;
		System.out.println("results = " + num1);
		
		System.out.println("__________________________________");				// decrement
		System.out.println("decrement: ");
		System.out.println("__________________________________");
		System.out.println("results = num1-- ");
		System.out.println("results = " + num1 + "-- ");
		num1--;
		System.out.println("results = " + num1);
		System.out.println("__________________________________");
	}
}
