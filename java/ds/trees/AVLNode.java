package code.ds.trees;

public class AVLNode {

	AVLNode left,right;
	int data,height;
	public AVLNode()
	{
		left=null;
		right=null;
		data=0;
		height=0;
		
	}
	public AVLNode(int data)
	{
		left=null;
		right=null;
		data=data;
		height=0;
	}
}
