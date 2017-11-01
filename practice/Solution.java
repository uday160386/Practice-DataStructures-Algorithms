package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Solution {
    List sum=new ArrayList();
    int height=0;
    int temp=1;
	 public List<Double> averageOfLevels(TreeNode root) {
		
		if(root!=null && height==0)
		{
			sum.add(root.val);
		}
		if(root.right==null && root.left!=null)
		{
			averageOfLevels(root.left);
		}
		if(root.left==null && root.right!=null)
		{
			averageOfLevels(root.right);
		}
		
			
		if(root.left!=null && root.right!=null)
		{
			sum.add((root.left.val+root.right.val)/2.0);
			averageOfLevels(root.left);
			averageOfLevels(root.right);
			height++;
			
		}
		return sum;
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(2);
		root.right =  new TreeNode(5);
		root.right.left = new TreeNode(4);
		root.right.right=new TreeNode(6);
	
		Solution s = new Solution();
		List a =s.averageOfLevels(root);
		
		Iterator i =a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}