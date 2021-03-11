package code.ds.sort;

public class BubbleSortImprovised {

	/*
	 * Algorithm:
	 * Step 1: Compare 1st and next element 
	 * Step 2: If first element is greater than next then swap
	 * Step 3: If swipe not happened then break the loop
	 */
	public int[] sortArray(int [] arr)
	{
		int len =arr.length;
		
		for(int i=0;i<len-1;i++)
		{
			boolean isSwapped=false;
			for(int j=0;j<len-1;j++)
			{
				int min =j;
				if(arr[j]>arr[min+1])
				{
					int temp = arr[j];
					arr[j]=arr[min+1];
					arr[min+1]=temp;
					isSwapped=true;
				}
			}
			if(!isSwapped)
			{
				break;
			}
		}
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSortImprovised bsi = new BubbleSortImprovised();
		int arr[] = {14,33,27,35,19,49,44,42};
		
		
		int j[] = bsi.sortArray(arr);
		for(int k=0;k<j.length;k++)
		{
			System.out.println(j[k]);
		}
	}

}
