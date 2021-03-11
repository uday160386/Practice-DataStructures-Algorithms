package code.core.bit;

import java.util.Iterator;
import java.util.Stack;

public class FindBit {

	public void searchBit(int i, int k)
	{
		System.out.println((i>>k)&1);
	}
	
	public void bitNot(int i)
	{
		int k= ~i;
		System.out.println(~i);
	}
	public boolean isSetOrNot(int i, int k)
	{
		return ((i>>k-1)&1)!=0?true:false;
	}
	
	public int toggleKthbit(int n, int k)
	{
		return (n ^ (1 << (k-1)));
	}
	public static void main(String [] args)
	{
		FindBit fb = new FindBit();
		fb.bitNot(1);
	}
}
