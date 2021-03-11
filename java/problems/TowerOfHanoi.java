package code.problems;

public class TowerOfHanoi {

	/*
	 * Move top n-1 elements from Source to Auxilary
	 * Move nth disk elements from Source to Destination
	 * Move n-1 elements from auxilary to destination
	 * 2T(n-1)+1
	 * f(n)=g(2t(n-1)+1
	 *     2(2t(n-1)+1)
	 *     2 power2(2t(n-1)) 
	 * Big O =O(2 power n) 
	 */
	public void moveTower(int n,String S,  String D, String A )
	{
		if(n==1)
		{
			System.out.println("Moved disk from Source:"+S+"to Destination"+D);
			return;
		}
		moveTower(n-1, S,A,D);
		System.out.println("Moved disk from Source:"+S+"to Destination"+D);
		moveTower(n-1, A,D,S);
	}
	public static void main(String args[])
	{
		TowerOfHanoi th = new  TowerOfHanoi();
		th.moveTower(10, "S","D","A");
		
	}
}
