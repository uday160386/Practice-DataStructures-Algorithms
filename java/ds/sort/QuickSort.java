package code.ds.sort;

public class QuickSort {

	public int Partfunc(int arr[],  int low, int high)
	{
		int pos=low-1;
		int piviot=arr[high];
		
		for(int i=low;i<high;i++)
		{
			if(arr[i]<=piviot)
			{
				pos++;
				int temp =arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
			}
		}
		int temp = arr[pos+1];
		arr[pos+1]=arr[high];
		arr[high]=temp;
		
		return pos+1;
	}
	public int[] sort(int arr[], int low,  int high)
	{
		if(low<high)
		{
			int partion = Partfunc(arr,low,high);
			sort(arr,low,partion-1);
			sort(arr,partion+1,high);
		}
		return arr;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[] = {9,10,14,27,35,19,42,44};
		QuickSort is = new QuickSort();
		int[] j = is.sort(arr,0,arr.length-1);
		
		for(int k=0;k<j.length;k++)
		{
			System.out.println(j[k]);
		}
	}

}
