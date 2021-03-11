package code.problems;

public class SortingByFactorial {

	/*
	 * Input = n elements
	 * First, if only one elmenet return it  , base code
	 * Seconds, compare n-1 > n-2 and if yes use recursive
	 * third, if second faile return false
	 * O= O(n)
	 */
	public boolean sortFact(int a[],int n)
	{
		boolean b;
		if(n==1)
			return true;
		else 
			b=a[n-1]<a[n-2]?false:sortFact(a,n-1);
		return b;
	}
	
	public static void main(String []args)
	{
		SortingByFactorial sf = new SortingByFactorial();
		int a[]={20,12,12,3,2,1};
		System.out.println(sf.sortFact(a, a.length));
	}
}
