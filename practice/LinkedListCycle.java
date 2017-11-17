package practice;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
	
	public boolean hasCycle(ListNode head) {
        boolean ans=false;
        if(head==null)return false;
        Set s=new HashSet();
        while(head!=null)
        {
        	if(head.val>head.next.val)
        	if(s.contains(head))
				return true;
        	else
        		s.add(head);
        	
        	head=head.next;
        }
		return ans;
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListCycle lc=  new LinkedListCycle();
		
	}

}
