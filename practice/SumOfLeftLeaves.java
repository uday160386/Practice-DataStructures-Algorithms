package practice;

public class SumOfLeftLeaves {
	int sum=0;
	public int sumOfLeftLeaves(TreeNode root) {
		
		if(root==null)
			return 0;
		if(root!=null)
		{
			
			if(isLeaf(root.left))
				sum=sum+root.left.val;
			else
				sumOfLeftLeaves(root.left);
				
			sumOfLeftLeaves(root.right);
			
		}
		return sum;
        
    }
	 boolean isLeaf(TreeNode node) 
	 {
	        if (node == null)
	            return false;
	        if (node.left == null && node.right == null)
	            return true;
	        return false;
	    }
}
