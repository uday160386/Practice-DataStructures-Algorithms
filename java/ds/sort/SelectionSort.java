package code.ds.sort;

public class SelectionSort {

	/*
	 * Algorithm:
	 * Step 1: Set min element to first element location
	 * Step 2: Find the min element in the list from first location+1
	 * Step 3: Compare the first element with minnium element
	 * Step 4: Swap  the  element if the first element is greater than the minimum element
	 * Step 5: Repeat the  steps till the array is sorted.
	 * 
	 * Note: If sorting needs to be in descending order than instead of finding smallest element we need to find the largest element 
	 */
	public int[] sortArray(int [] arr)
	{
		int len =arr.length;
		for(int i=0;i<len-1;i++)
		{
			int min=i;
			for(int j=i+1;j<len;j++)
			{
				if(arr[j]<arr[min])
					min=j;
			}
			if(i!=min)
			{
				int temp;
				temp =arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		return arr;
	}
	public static void main(String args[])
	{
		SelectionSort ss= new SelectionSort();
		int arr[] = {14,33,27,10,35,19,42,44};
		int j[] = ss.sortArray(arr);
		for(int k=0;k<j.length;k++)
		{
			System.out.println(j[k]);
		}
		
	}
}
