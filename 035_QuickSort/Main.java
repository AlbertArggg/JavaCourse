
public class Main 
{
	public static int[] nums = {30,52,17,62,29,37,63,34,12,77,11,28,10,76,14};
	public static int[] reset = nums.clone();
	public static int comps = 0, swaps = 0;
	
	public static void main(String[] args) 
	{
		long startTime, stopTime;
		
		printArray("Original Array: ",0);
		
		startTime = System.nanoTime();
		insertSort();
		stopTime = System.nanoTime();
		printArray("Insert Sort:    ", runTime(startTime, stopTime));
		resetStats();
		
		startTime = System.nanoTime();
		bubbleSort();
		stopTime = System.nanoTime();
		printArray("Bubble Sort:    ", runTime(startTime, stopTime));
		resetStats();
		
		startTime = System.nanoTime();
		selectionSort();
		stopTime = System.nanoTime();
		printArray("Selection Sort: ", runTime(startTime, stopTime));
		resetStats();
		
		startTime = System.nanoTime();
		quickSort(0, nums.length-1);
		stopTime = System.nanoTime();
		printArray("Quick Sort:     ", runTime(startTime, stopTime));
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
	
	public static void printArray(String title, long rntm) 
	{
		System.out.print(title+ " ");
		
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " | ");
		}
		
		if(rntm>0) {System.out.print(" Runtime: " + rntm + "ns , Comparisons: " +comps + ", Swaps: " + swaps );}
		
		System.out.println();
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





























