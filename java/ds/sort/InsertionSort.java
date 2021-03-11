package code.ds.sort;

public class InsertionSort {

	/*Algorithm:
	 * Step 1: First find the initial value
	 * Step 2: Pick the next element
	 * Step 3: Compare the element with the  sorted list
	 * Step 4: Shift all the element in the  sorted list if the elements are greater
	 * Step 5: Insert the  value
	 * Step 6: repeat the steps
	 * 
	 */
	public int[] sortArray(int[] arr)
	{
		int holevalue;
		int data;
		
		if(arr.length==1)
			return arr;
		for(int i=0;i<arr.length;i++)
		{
			data=arr[i];   
			holevalue=i;  
			
			while(holevalue>0 && arr[holevalue-1]>data)
			{
				arr[holevalue]=arr[holevalue-1];
				holevalue=holevalue-1;
			}
			arr[holevalue]=data;
		}
		return arr;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[] = {9,10,14,27,35,19,42,44};
		InsertionSort is = new InsertionSort();
		int[] j = is.sortArray(arr);
		
		for(int k=0;k<j.length;k++)
		{
			System.out.println(j[k]);
		}
	}

}
