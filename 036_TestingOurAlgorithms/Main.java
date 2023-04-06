import java.util.Random;

public class Main 
{
	public static int[] nums = new int[1000];
	public static int[] reset;
	public static int comps = 0, swaps = 0;
	
	public static void main(String[] args) 
	{
		long startTime, stopTime;
		long rntm = 0;
		
		// - Random gen - //
		Random rnd = new Random();
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = rnd.nextInt(1000);
		}
		reset = nums.clone();
		
		System.out.println("		Runtime		Comparisons	Swaps");
		
		// - Quick sort - //
		for(int i = 0; i < 10; i++)
		{
			startTime = System.nanoTime();
			quickSort(0,nums.length-1);
			stopTime = System.nanoTime();
			rntm += runTime(startTime, stopTime);
			nums = reset.clone();
		}
		
		System.out.print("Quick Sort	" + rntm/10 + "		" + comps/10 + "		" + swaps/10 + System.lineSeparator());
		resetStats();
		
		// - Select sort - //
		for(int i = 0; i < 10; i++)
		{
			startTime = System.nanoTime();
			selectionSort();
			stopTime = System.nanoTime();
			rntm += runTime(startTime, stopTime);
			nums = reset.clone();
		}
		
		System.out.print("Selection Sort	" + rntm/10 + "		" + comps/10 + "		" + swaps/10 + System.lineSeparator());
		resetStats();
		
		// - Bubble sort - //
		for(int i = 0; i < 10; i++)
		{
			startTime = System.nanoTime();
			bubbleSort();
			stopTime = System.nanoTime();
			rntm += runTime(startTime, stopTime);
			nums = reset.clone();
		}
		
		System.out.print("Bubble Sort	" + rntm/10 + "		" + comps/10 + "		" + swaps/10 + System.lineSeparator());
		resetStats();
		
		// - insert sort - //
		for(int i = 0; i < 10; i++)
		{
			startTime = System.nanoTime();
			insertSort();
			stopTime = System.nanoTime();
			rntm += runTime(startTime, stopTime);
			nums = reset.clone();
		}
		
		System.out.print("Insert Sort	" + rntm/10 + "		" + comps/10 + "		" + swaps/10 + System.lineSeparator());
		resetStats();	
	}

	public static void resetStats() 
	{
		nums = reset.clone();
		comps = 0; 
		swaps = 0;
	}

	public static long runTime(long startTime, long stopTime)
	{
		return(stopTime - startTime);
	}
	
	private static void Swap(int e1, int e2) 
	{
		swaps++;
		int e = nums[e1];
		nums[e1] = nums[e2];
		nums[e2] = e;
	}
	
	// - insert sort - //
	public static void insertSort()
	{
		for(int i = 1; i<nums.length; i++)
		{
			for(int j = i; j>0; j--)
			{
				comps++;
				if(nums[j]<nums[j-1]) { Swap(j, j-1);}
			}
		}
	}
	
	// - bubble sort - //
	public static void bubbleSort()
	{
		for(int i = 0; i < nums.length-1; i++)
		{
			for(int j = 0; j < nums.length-i-1; j++)
			{
				comps++;
				if(nums[j]>nums[j+1]) {Swap(j, j+1);}
			}
		}
	}
	
	// - Selection Sort - //
	public static void selectionSort()
	{
		for(int i = 0; i<nums.length-1; i++)
		{
			int minVal = i; 
			
			for(int j = i; j < nums.length; j++)
			{
				comps++;
				if(nums[j]<nums[minVal]) {minVal = j;}
			}
			
			Swap(minVal, i);
		}
	}

	// - Quick Sort - //
	
	public static void quickSort(int low, int high)
	{
		comps++;
		if(low<high)
		{
			int pivot = partition(low, high);
			quickSort(low, pivot-1);
			quickSort(pivot+1, high);
		}
	}
	
	public static int partition(int low, int high)
	{
		int pivot = nums[high];
		int i = low-1;
		
		for(int j = low; j<= high-1; j++)
		{
			comps++;
			if(nums[j]<pivot)
			{
				i++;
				Swap(i,j);
			}
		}
		
		Swap(i+1, high);
		return (i+1);
	}
}