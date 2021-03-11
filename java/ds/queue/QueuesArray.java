package code.ds.queue;

public class QueuesArray {

	int capacity=3;
	int a[]=  new int[capacity];
	int size=-1;
	
	public void push(int data)
	{
		if(++size<capacity)
		{
			a[size]=data;
		}
		else
		{
			expand();
			a[size]=data;
		}
		
		System.out.println(data+"     "+size);
	}
	public int pop()
	{
		int z=a[0];
		shrink();
		size--;
		return z;
	}
	public int getsize()
	{
		return size+1;
	}
	public void expand()
	{
		int newcapacity = size<<1;
		int b[]=new int[newcapacity];
		System.arraycopy(a, 0, b, 0, size);
		a=b;
		this.capacity=newcapacity;
	}
	
	public void shrink()
	{
		int newcapacity=size>>1;
		int b[]= new int [newcapacity+1];
		System.arraycopy(a, 1, b, 0, size-1);
		a=b;
		this.capacity=newcapacity;
	}
	public static void main(String args[])
	{
		QueuesArray qa= new QueuesArray();
		qa.push(10);
		qa.push(20);
		qa.push(30);
		qa.push(40);
		System.out.println(qa.getsize());
		System.out.println(qa.pop());
		System.out.println(qa.pop());
		System.out.println(qa.pop());
		System.out.println(qa.pop());
		System.out.println(qa.getsize());
	}
}
