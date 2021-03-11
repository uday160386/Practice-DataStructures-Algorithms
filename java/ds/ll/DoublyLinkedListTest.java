package code.ds.ll;

public class DoublyLinkedListTest {

	
	DoublyLinkedList head;
	DoublyLinkedList tail;
	int length;
	int data;
	
	public void insertNodeAtStart(int data)
	{
		DoublyLinkedList node= new DoublyLinkedList(data, null, head);
		++length;
		
		if(head==null)
		{
			head=node;
			tail=head;
			//head.setNext(tail);
			head.next=tail;
			head.prev=null;
			tail.next=null;
		}
		else
		{
			node.setNext(head);
			head=node;
			tail.setPrev(head);
		}
	}
	
	public int  getLength()
	{
		return length;
	}
	
	public void insertAtLast(int data)
	{
		DoublyLinkedList node= new DoublyLinkedList(data, tail, null);
		
			++length;
		if(tail==null)
		{
			//node.setNext(head);
			node.next=head;
			head=node;
		}
		else
		{
			//tail.setNext(node);
			tail.next=node;
			//node.setPrev(tail);
			node.prev=tail;
			tail=node;
		}
	}
	
	public void insertAtPOS(int data, int position)
	{
		
		DoublyLinkedList node= new DoublyLinkedList(data, head, tail);
		DoublyLinkedList next=head;
		DoublyLinkedList headM=head;
		for(int i=0;i<length;i++)
		{
			if(i==position-1)
			{
				DoublyLinkedList tmp= next.getNext();
				headM.setNext(node);
				node.setNext(tmp);
				node.setPrev(headM);
				tmp.setPrev(node);
			}
			headM=next;
			next=next.getNext();
		}
		length++;
	}
	
	public void deleteFirstNode()
	{
		DoublyLinkedList node= new DoublyLinkedList(data, null, null);
		if(head!=null)
		{
			DoublyLinkedList tmp = head.getNext();
			head = tmp;
			tmp.setPrev(null);
			length--;
		}
		System.out.println(head.getData());
	}
	
	public static void main(String args[])
	{
		DoublyLinkedListTest dllt =new  DoublyLinkedListTest();
		
		dllt.insertNodeAtStart(10);
		dllt.insertAtLast(30);
		dllt.insertAtPOS(20,1);
		dllt.insertAtLast(40);
		dllt.insertAtLast(50);
		dllt.deleteFirstNode();
		System.out.println(dllt.getLength());
	}
}
