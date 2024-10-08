// Java program to calculate average of array elements
class AverageOfArrays {
	
	// Function that return average of an array.
	static double average(int a[], int n)
	{
		
		// Find sum of array element
		int sum = 0;
		
		for (int i = 0; i < n; i++)
			sum += a[i];
	
		return (double)sum / n;
	}
	
	//driver code
	public static void main (String[] args)
	{
		
		int arr[] = {10, 7, 3, 4, 5, 6, 12, 8, 14};
		int n = arr.length;
	
		System.out.println(average(arr, n));
	}
}

