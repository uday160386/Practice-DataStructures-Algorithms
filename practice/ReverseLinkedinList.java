package practice;

import java.util.Stack;

public class ReverseLinkedinList {

	 public ListNode reverseBetween(ListNode head, int m, int n) {
		 Stack s=new Stack();
		 ListNode temp=head;
		 ListNode tempAns=null;
		 int precounter=0,postcounter=0;
			 
		 if(head==null) return head;
		 while(head!=null)
		 {
			 precounter++;
				if(precounter==m||precounter<=n)
					s.push(head);
				head=head.next;
		 }
		 
		 while(temp!=null)
		 {
			 postcounter++;
				if(postcounter==m||postcounter<=n)
				{
					tempAns.next=(ListNode)s.pop();
				}
				else
				{
					tempAns.next=temp;
				}
		 }
		return temp;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
