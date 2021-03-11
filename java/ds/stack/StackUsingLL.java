package code.ds.stack;

import code.ds.ll.*;

public class StackUsingLL {

	
	int size;
	ListNode head;
	public void push(int data)
	{
		ListNode ntpr= new ListNode(data,null);
		if(head==null)
		{
			head=ntpr;
		}
		else
		{
			ntpr.setNext(head);
			head=ntpr;
		}
		size++;
	}
	public int getsize()
	{
		return size;
	}
	public void pop()
	{
		if(head!=null)
		{
			head=head.getNext();
		}
		size--;
	}
	public static void main(String args[])
	{
		StackUsingLL sll = new  StackUsingLL();
		sll.push(10);
		sll.push(20);
		sll.push(20);
		System.out.println(sll.getsize());
		sll.pop();
		sll.pop();
		System.out.println(sll.getsize());
	}
}
