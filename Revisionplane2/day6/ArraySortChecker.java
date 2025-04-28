public class ArraySortChecker 
{
	void checkArraySort(int[] arr) 
	{
		boolean Ascending = true;
		boolean Descending = true;

		for (int i = 0; i < arr.length - 1; i++) 
		{
			if(arr[i] > arr[i + 1]) 
			{
				Ascending = false;
			}
			if(arr[i] < arr[i + 1]) 
			{
				Descending = false;
			}
		}
		if (Ascending) 
		{
			System.out.println("The array is sorted in ascending order.");        
		}		 
		else if(Descending) 
		{
			System.out.println("The array is sorted in descending order.");
		}
		else 
		{
			System.out.println("The array is not sorted.");
		}	 
	}
}
public class ArraySortChecker
{
	public static void main(String[] args) 
	{
        int[] arr = {1, 2, 3, 4, 5};
		int temp=checkArraySort(arr);
        System.out.println(temp);

	}
}