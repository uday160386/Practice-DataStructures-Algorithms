package code.ds.sort;

public class ShellSort {

	public int[] sortArray(int[] arr)
	{
		int len = arr.length;
		
		for(int gap=len/2;gap>0;gap/=2)
		{
			for(int i=gap;i<len;i++)
			{
				int temp=arr[i];
				int k;
				for(k=i;k>=gap&&arr[k-gap]>temp;k-=gap)
				{
					arr[k]=arr[k-gap];
				}
				arr[k]=temp;
			}
		}
		
		return arr;
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[] = {9,10,14,27,35,19,42,44};
		ShellSort is = new ShellSort();
		int[] j = is.sortArray(arr);
		
		for(int k=0;k<j.length;k++)
		{
			System.out.println(j[k]);
		}
	}

}
