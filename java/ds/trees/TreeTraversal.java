package code.ds.trees;

public class TreeTraversal {

	Node root;
	
	public void inOrder(Node n)
	{
		if(n!=null)
		{
			inOrder(n.leftNode);
			System.out.println(n.data+" ");
			inOrder(n.rightNode);
		}
	}
	public void preOrder(Node n)
	{
		if(n!=null)
		{
			System.out.println(n.data+" ");
			preOrder(n.leftNode);
			preOrder(n.rightNode);
		}
	}
	
	public void postOrder(Node n)
	{
		if(n!=null)
		{
			postOrder(n.leftNode);
			postOrder(n.rightNode);
			System.out.println(n.data+" ");
		}
	}
	public  int getheight(Node n)
	{
		if(n!=null)
		{
			int lh = getheight(n.leftNode);
			int rh = getheight(n.rightNode);
			if(lh>rh)
				return lh+1;
			else
				return rh+1;
		}
		else
		{
			return 0;
		}
	}
	
	 void printLevelOrder(Node root)
	 {
		 int j= getheight(root);
		 for(int i=0;i<=j;i++)
			 printLevelNodes(root,i); 
	 }
	 public void printLevelNodes(Node root, int level)
	 {
		 if(root==null)
			 return;
		 else if(level==1)
			 System.out.println(root.getData());
		 else
		 {
			 printLevelNodes(root.leftNode, level-1);
			 printLevelNodes(root.rightNode, level-1);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeTraversal iot = new TreeTraversal();
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode =  new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode=new Node(5);
		
		iot.inOrder(root);
		System.out.println("--------------------------------");
		iot.preOrder(root);
		System.out.println("--------------------------------");
		iot.postOrder(root);
		System.out.println("--------------------------------");
		iot.printLevelOrder(root);
		System.out.println("--------------------------------");
		
		
		
	}

}
