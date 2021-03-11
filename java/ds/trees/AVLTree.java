package code.ds.trees;

public class AVLTree {
	AVLNode root;
	
	public int height(AVLNode root)
	{
		return root==null?-1:root.height;
	}
	
	public int max(int lhs, int rhs)
	{
		return lhs>rhs?lhs:rhs;
		
	}
	public void insert(int data)
	{
		root=insert(data, root);
		
	}
	
	public AVLNode insert(int data, AVLNode root)
	{
		if(root ==null)
		{
			root=new AVLNode(data);
		}
		else if(data<root.data)
		{
			root.left=insert(data, root.left);
			if(height(root.left)-height(root.right)==2)
			{
				if(data<root.left.data)
				{
					root=rotatewithleftchild(root);
				}
				else
				{
					root=rotatewithdoubleleft(root);
				}
			}
		}
		else if(data>root.data)
		{
			root.right=insert(data, root.right);
			if(height(root.right)-height(root.left)==2)
			{
				if(data<root.right.data)
				{
					root=rotatewithrightchild(root);
				}
				else
				{
					root=rotatewithdoubleright(root);
				}
			}
		}
		else
		{
			root.height=max(height(root.right),height(root.left))+1;
		}
		return root;
	}
	
	public AVLNode rotatewithleftchild(AVLNode k1)
	{
		AVLNode k2 =k1.left;
		k1.left=k2.right;
		k2.right=k1;
		k1.height=max(height(k1.left),height(k1.right))+1;
		k2.height =max(height(k2.left),k1.height)+1;
		return k2;
	}
	
	public AVLNode rotatewithdoubleleft(AVLNode k1)
	{
		k1.left=rotatewithrightchild(k1.left);
		return rotatewithleftchild(k1);
	}
	
	public AVLNode rotatewithdoubleright(AVLNode k1)
	{
		k1.left=rotatewithleftchild(k1.left);
		return rotatewithrightchild(k1);
	}
	
	public AVLNode rotatewithrightchild(AVLNode k1)
	{
		AVLNode k2 =k1.right;
		k1.right=k2.left;
		k2.left=k1;
		k1.height=max(height(k1.left),height(k1.right))+1;
		k2.height =max(height(k2.right),k1.height)+1;
		return k2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLTree at = new AVLTree();
		at.insert(10);
		
	}

}
