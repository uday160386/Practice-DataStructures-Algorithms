package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PretreeTraversal {

	 public List<Integer> preorderTraversal(TreeNode root) {
		 
		 List al=new ArrayList();
		 Stack sa= new Stack();
		 if(root==null)return al;
		 sa.push(root);
		 while(!sa.isEmpty())
		 {
			 TreeNode rs=(TreeNode) sa.pop();
			 al.add(rs.val);
			 if(rs.right!=null)
			 {
				 sa.push(rs.right);
			 }
			 if(rs.left!=null)
			 {
				 sa.push(rs.left);
			 }
		 }
		return al;
	        
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PretreeTraversal pt= new PretreeTraversal();
	}

}
