/*
 *Convert a given Binary Tree to Doubly Linked List | Set 1
*Given a Binary Tree (Bt), convert it to a Doubly Linked List(DLL). 
*The left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL. 
*The order of nodes in DLL must be same as Inorder of the given Binary Tree. 
*The first node of Inorder traversal (left most node in BT) must be head node of the DLL.
*/

package code.problems;

import code.ds.trees.*;
import code.ds.ll.*;
public class ConvertTreeToDLL {

	Node root;
	DoublyLinkedList head=null,tail=null;
	int size=0;
	
	//In Order
	public void inOrder(Node n)
	{
		if(n!=null)
		{
			inOrder(n.leftNode);
			pushElementToLast(n.getData());
			inOrder(n.rightNode);
		}
	}
	public void pushElementToLast(int data)
	{
		DoublyLinkedList node= new DoublyLinkedList(data, null, null);
		if(head==null)
		{
			head=node;
			tail=head;
			head.prev=null;
			tail.next=null;
			size++;
		}
		else
		{
			tail.setNext(node);
			tail=node;
			size++;
		}
	}
	public void printLinkedList()
	{
		DoublyLinkedList temp;
		if(head!=null)
		{
			while(head!=null)
			{
				System.out.println(head.getData());
				head=head.getNext();
			}
		}
	}
	public static void main(String args[])
	{
		ConvertTreeToDLL ctdll = new ConvertTreeToDLL();
		
		ctdll.root=new Node(10);
		ctdll.root.leftNode= new Node(12);
		ctdll.root.leftNode.leftNode= new Node(25);
		ctdll.root.leftNode.rightNode= new Node(30);
		
		ctdll.root.rightNode= new Node(15);
		ctdll.root.rightNode.leftNode= new Node(36);
		ctdll.inOrder(ctdll.root);
		ctdll.printLinkedList();
	}
}
