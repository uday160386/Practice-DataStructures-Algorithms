package code.ds.stack;

public class StackUsingArray {

	
	int capacity=3;
	int a[]=new int[capacity];
	int len=-1;
	public void push(int data)
	{
		if(++len<capacity)
		{
			a[len]=data;
		}
		if(len==capacity)
		{
			expand();
			a[len]=data;
		}
		
	}
	
	public int pop()
	{
		int b = a[len];
		len--;
		return b;
	}
	public int getsize()
	{
		return len+1;
	}
	
	public void expand()
	{
		int newcapacity=len<<1;
		int b[]=new int [newcapacity];
		System.arraycopy(a, 0, b, 0, len);
		a=b;
		this.capacity=newcapacity;
	}
	public static void main(String[] args)
	{
		StackUsingArray xord = new StackUsingArray();
		
		xord.push(10);
		xord.push(20);
		xord.push(40);
		xord.push(50);
		xord.push(60);
	System.out.println(xord.getsize());
		xord.pop();
		System.out.println(	xord.pop());
		System.out.println(xord.getsize());
		
		
	}
}
