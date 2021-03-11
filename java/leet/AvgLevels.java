package practice;

import java.util.ArrayList;
import java.util.List;

///637. Average of Levels in Binary Tree
public class AvgLevels {

	List l=new ArrayList();
	int height=0;
	int lh=0,rh=0;
	 public List<Double> averageOfLevels(TreeNode root) {
		 
		System.out.println(getheight(root));
		return l;
		
	    }
	 public int getheight(TreeNode root)
	 {
		 if(root==null)
		 {
			 return 0;
		 }
		 
			int lh=getheight(root.left);
			int rh=getheight(root.right);
			return Math.max(lh, rh)+1;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AvgLevels avl= new AvgLevels();
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		avl.averageOfLevels(root);
	}

}
