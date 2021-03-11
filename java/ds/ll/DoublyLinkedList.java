package code.ds.ll;

public class DoublyLinkedList {

	
	public DoublyLinkedList prev;
	public DoublyLinkedList next;
	int length;
	int data;
	
	public DoublyLinkedList getPrev() {
		return prev;
	}
	public void setPrev(DoublyLinkedList prev) {
		this.prev = prev;
	}
	public DoublyLinkedList getNext() {
		return next;
	}
	public void setNext(DoublyLinkedList next) {
		this.next = next;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public   DoublyLinkedList(int data,DoublyLinkedList prev, DoublyLinkedList next )
	{
		this.prev=prev;
		this.next=next;
		length=0;
		this.data=data;
	}
	
}
