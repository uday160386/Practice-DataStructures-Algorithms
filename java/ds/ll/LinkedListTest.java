/*
 * This program contains code for  
 * 
 * First element insertation
 * Last element Insertation
 * Inserting Element at given position
 * Delete first element
 * Delete last element
 * Delete all element
 * 
 * Delete element at give position
 * 
 * 
 * 
 * 
 * 
 * 
 */
package code.ds.ll;

import java.util.Scanner;

public  class LinkedListTest
{
	private ListNode head;
	private ListNode tail;
	private int  size;
	public LinkedListTest()
	{
		int size=0;;
		head=null;
		tail=null;
	}
	public void insertAtFirst(int data)
	{
		ListNode str =  new ListNode(data,null);
		size++;
		if(head==null)
		{
			head=str;
			tail=head;
		}
		else
		{
			str.setNext(head);
			head=str;
		}
	}
	public void insertAtEnd(int data)
	{
		ListNode str =  new ListNode(data,null);
		size++;
		if(head==null)
		{
			head=str;
			tail=head;
		}
		else
		{
			tail.setNext(str);
			tail=str;
		}
	}
	
	public void insertAtPos(int data, int pos)
	{
		ListNode tmp = new ListNode(data,null);
		ListNode ptr=head;
		pos=pos-1;
		for(int i=0;i<size;i++)
		{
			if(i==pos)
			{
				ListNode nextPtr=ptr.getNext();
				
				ptr.setNext(tmp);
				tmp.setNext(nextPtr);
			}
			ptr=ptr.getNext();
		}
		size++;
	}
	
	public void deleteFirstelement()
	{
		if(size==0)
		{
			System.out.println("List is empty"); return;
		}
			else
			{
				head=head.getNext();
				size--;
			}
	}
	
	public void deleteLastelement()
	{
		if(size==0)
		{
			System.out.println("List is  empty");
			return;
		}
		else
		{
			ListNode n1=head;
			ListNode n2=head;
			n2=n2.getNext();
			while(n2.getNext()!=null)
			{
				n1=n2;
				n2=n2.getNext();
			}
			n1.next=null;
			size--;
		}
	}
	
	public void deleteElementAtpos(int pos)
	{
		ListNode start=head;
		ListNode next=head;
		next=next.getNext();
		
		if(size==0)
		{
			System.out.println("List is  empty");
			return;
		}
		if(pos==0)
		{
			head.next=null;
			size--;
			return;
		}
		for(int i=0;i<size;i++)
		{
			if(i==pos)
			{
				head.setNext(next);
				return;
			}
			head=next;
			if(next.getNext()!=null)
			{
				next=next.getNext();
				size--;
			}
				
		}
	}
	public void deleteAll()
	{
		if(size==0)
			return;
		while(size!=0)
		{
			ListNode n1=head;
			ListNode n2=head;
			//n2=n2.getNext();
			while(n2.getNext()!=null)
			{
				n1=n2;
				n2=n2.getNext();
			}
			n1.next=null;
			size--;
		}
	}
	public void getDisplay()
	{
		if(size==0)
		{
			System.out.println("List is empty");return;
		}
		if(head.getNext()==null)
		{
			System.out.println(head.getData());
			return;
		}	
		
		ListNode str=head;
		System.out.println(str.getData()+"->");
		str=str.getNext();
		while(str.getNext()!=null)
		{
			System.out.println(str.getData()+"->");
			str=str.getNext();
		}
		
		System.out.println(str.getData());
	}
	
	public int getLength()
	{
		return size;
	}
	public static void  main(String args[])
	{
		LinkedListTest list= new  LinkedListTest();
		Scanner scanner= new Scanner(System.in);
		char ch;
		do{
			
			int input=scanner.nextInt();
		switch(input)
		{
		case 1:
			
			{
				System.out.println("Inserting the  Value at Begining of the node");
				list.insertAtFirst(10);
				System.out.println(list.getLength());
				break;
			}
			
		case 2:
		{
			
			System.out.println("Inserting element at end");
			list.insertAtEnd(20);
			list.insertAtEnd(30);
			list.insertAtEnd(40);
			System.out.println(list.getLength());
			list.getDisplay();
			break;
			
		}
		case 3:
			list.deleteFirstelement();
			list.getDisplay();
			System.out.println(list.getLength());
			break;
		case 4:
			list.deleteLastelement();
			list.getDisplay();
			System.out.println(list.getLength());
			break;
			
		case 5:
			list.deleteAll();
			list.getDisplay();
			System.out.println(list.getLength());
			break;
		case 6:
			list.deleteElementAtpos(2);
			list.getDisplay();
			System.out.println(list.getLength());
			break;
		}
		ch=scanner.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		
	}
}