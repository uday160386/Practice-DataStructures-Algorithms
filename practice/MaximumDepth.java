package practice;

import java.util.List;

public class MaximumDepth {
	 public int maxDepth(TreeNode root) {
	 
		 if(root==null)
		 {
			 return 0;
		 }
		 else
		 {
			 int lh=maxDepth(root.left);
			 int rh=maxDepth(root.right);
			 if(lh>rh)
				 return lh+1;
			 else
				 return rh+1;
		 }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
