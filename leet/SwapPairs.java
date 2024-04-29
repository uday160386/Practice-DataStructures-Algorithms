package practice;

public class SwapPairs {

	public ListNode swapPairs(ListNode head) {
		 if(head==null)return head;
		 ListNode temp=head;
			 while(temp!=null && temp.next!=null)
			 {
				 
				 int a=temp.val;
				 temp.val=temp.next.val;
				 temp.next.val=a;
				 temp=temp.next.next;
			 }
		return head;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapPairs sp = new SwapPairs();
	}

}
