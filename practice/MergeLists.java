package practice;

import java.util.Iterator;
import java.util.TreeSet;

public class MergeLists {

	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 
		 ListNode head = new ListNode(0);
		 ListNode p=head;
		 ListNode p1=l1;
		 ListNode p2=l2;
		 while(p1!=null&&p2!=null)
		 {
			 if(p1.val<p2.val)
			 {
				 p=p1;
				 p1=p1.next;
			 }
			 else
			 {
				 p=p2;
				 p2=p2.next;
			 }
			 p=p.next;
		 }
		 while(p1!=null)
		 {
			 p.next=p1;
		 }
		 while(p2!=null)
		 {
			 p.next=p2;
		 }
		 
		return head.next;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeLists ml  = new MergeLists();
		ListNode L1 = new ListNode(2);
		
		
		ListNode L2 = new ListNode(1);
		
		ml.mergeTwoLists(L1, L2);
	}

}
