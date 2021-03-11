package code.ds.queue;

import code.ds.ll.*;
public class QueesUsingCircularList {

	
	CircularLinkedinList head;
	CircularLinkedinList tail;
	int len=0;
	
	public void stack(int data)
	{
		CircularLinkedinList node= new CircularLinkedinList(data,null);
		if(head==null)
		{
			head=node;
			tail=head;
			System.out.println(head.getData());
		}
		else
		{
			node.setLink(head.getLink());
			head=node;
			head.setLink(tail);
			tail.setLink(head);
			System.out.println(head.getData()+"ukkkk");
		}
		len++;
	}
	public int pop()
	{

		CircularLinkedinList ptr = head;

        head = ptr.getLink();        

        if (head == null)

            tail = null;

        len-- ;        

        return ptr.getData();
		
	}
	public int getlength()
	{
		return len;
	}
	public static void main(String args[])
	{
		QueesUsingCircularList qcl = new QueesUsingCircularList();
		qcl.stack(10);
		qcl.stack(20);
		qcl.stack(30);
		System.out.println(qcl.getlength());
		qcl.pop();
		qcl.pop();
		System.out.println(qcl.getlength());
		
	}
}
