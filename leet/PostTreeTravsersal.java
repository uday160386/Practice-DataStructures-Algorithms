package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostTreeTravsersal {
	public List<Integer> postorderTraversal(TreeNode root) {
		ArrayList al = new ArrayList();
		if(root==null)return al;
		Stack s= new Stack();
		s.push(root);
		
		TreeNode  prev=null;
		while(!s.isEmpty())
		{
			TreeNode cur=(TreeNode)s.peek();
			if(prev==null || prev.left!=cur ||prev.right!=cur)
			{
				if(cur.left!=null)
				{
					s.push(cur.left);
				}
				else if(cur.right!=null)
				{
					s.push(cur.right);
				}
			}
			else if(cur.left==cur)
			{
				if(cur.right!=null)
				{
					s.push(cur.right);
				}
			}
			else
			{
				al.add(cur);
			}
			prev=cur;	
		}
		return al;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
