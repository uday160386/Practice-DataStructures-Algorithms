package code.ds.sort;

public class MergeSort {

	/*Algorithm:
	 * Step 1: First find the initial value
	 * Step 2: Pick the next element
	 * Step 3: Compare the element with the  sorted list
	 * Step 4: Shift all the element in the  sorted list if the elements are greater
	 * Step 5: Insert the  value
	 * Step 6: repeat the steps
	 * 
	 */
	
	public void merge(int[] arr, int l,int m, int r)
	{
		int l1 = m-l+1;
		int l2 = r-m;
		
		int L1[] = new int[l1];
		int L2[] = new int[l2];
		
		for(int i=0;i<l1;i++)
		{
			L1[i]=arr[l+i];
		}
		
		for(int j=0;j<l2;j++)
		{
			L2[j]=arr[m+1+j];
		}
		int i=0,j=0,k=l;
		
		while(i<l1 && j<l2)
		{
			if(L1[i]<=L2[j])
			{
				arr[k]=L1[i];
				i++;
			}
			else
			{
				arr[k]=L2[j];
				j++;
			}
			k++;
		}
		while(i<l1)
		{
			arr[k]=L1[i];
			i++;k++;
		}
		while(j<l2)
		{
			arr[k]=L2[j];
			j++;k++;
		}
	}
	
	public int[] sortArray(int[] arr, int l, int r)
	{
		if(l<r)
		{
			int m = (l+r)/2;
			sortArray(arr,l,m);
			sortArray(arr,m+1,r);
			
			merge(arr,l,m,r);
			
		}
		return arr;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[] = {9,10,14,27,35,19,42,44};
		MergeSort is = new MergeSort();
		int[] j = is.sortArray(arr,0,arr.length-1);
		
		for(int k=0;k<j.length;k++)
		{
			System.out.println(j[k]);
		}
	}

}
