package code.core.bit;

public class PowerTwo {
	
	//Time Complexity O(logN)
	public boolean isPowTwo(int x)
	{
		if(x==0)
			return false;
		else
		{
			while(x%2==0)
				x/=2;
			return x==1;
		}
	}
	
	//Famous ones that checks if non-negative integer is a power of 2 or not:
	boolean isPowTeoBitManipulation(int x)
	{
	    return (x > 0) && ((x & (x - 1)) == 0);
	}
	//Detect if two integers have opposite signs.
	boolean isIntegerHavingOppositeSign(int x, int y)
	{
		return ((x ^ y) < 0);
	}
	
	//Compute the integer absolute value (abs) without branching.
	public int computeABSValue(int n)
	{
		int mask = n>>31;
		
		 return (mask^n) - mask ^ n ;
		
	}
	//Compute the minimum (min) or maximum (max) of two integers without branching.
	public void minimumoftwo(int x, int y)
	{
		int r;
//		r = y ^ ((x ^ y) & -(x < y)); // min(x, y)
//		r = x ^ ((x ^ y) & -(x < y)); // max(x, y)
	}
	//Brain Kernighan's method.
	
	public void countbits(int x)
	{
		x ^= 1 << x;
		System.out.println(x);
	}
	
	public void swapnumbers()
	{
		int a=10;
		int b=20;
		b = (a+b) - (a=b);
		System.out.println("A:"+a+" B:"+b); 
	}
	public static void main(String [] args)
	{
		PowerTwo fb = new PowerTwo();
		//System.out.println(fb.isPowTeoBitManipulation(4));
		//System.out.println(fb.computeABSValue(150));
		//fb.countbits(10);
		fb.swapnumbers();
	}
}
