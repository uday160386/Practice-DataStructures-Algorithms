package code.ds.ll;

public class ListNode
{
	public  ListNode next;
	public int data;
	
	public ListNode(int data, ListNode next)
	{
		this.data=data;
		this.next= next;
	}
	
	public void setNext(ListNode next)
	{
		this.next=next;
	}
	public void setdata(int data)
	{
		this.data=data;
		
	}
	
	public ListNode getNext()
	{
		return next;
	}
	
	public int getData()
	{
		return data;
	}
}

