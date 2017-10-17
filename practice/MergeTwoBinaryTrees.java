package practice;

public class MergeTwoBinaryTrees {
	public class TreeNode {
		    int val;
		     TreeNode left;
		    TreeNode right;
		    TreeNode(int x) { val = x; }
		}
	 public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		 
		  if (t1 == null)
	            return t2;
	        if (t2 == null)
	            return t1;
	        t1.val += t2.val;
				 mergeTrees(t1.left,t2.left);
				 mergeTrees(t1.right,t2.right);
		 return t1;
	 }
		 
	 public static void main(String[] args)
	 {
		 MergeTwoBinaryTrees tree = new MergeTwoBinaryTrees();
		 TreeNode t1;
		 
		 
	 }
	
}
