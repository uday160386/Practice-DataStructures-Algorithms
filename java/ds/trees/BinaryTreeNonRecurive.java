package code.ds.trees;

import java.util.Stack;

public class BinaryTreeNonRecurive {
	Node root;
	
	//O(n2)
	public void inOrder(Node n)
	{
		Stack s = new Stack<>();
		while(n!=null)
		{
			s.push(n);
			n=n.leftNode;
		}

		while(s.size()>0)
		{
			n=(Node)s.pop();
			System.out.println(n.getData());
			if(n.rightNode!=null)
			{
				n=n.rightNode;
				while(n!=null)
				{
					s.push(n);
					n=n.getLeftNode();
				}
			}
			
		}
	}
	 void iterativePreorder()
	    {
		 inOrder(root);
	    }
	public void preOrder(Node node)
	{
		 // Base Case
        if (node == null) {
            return;
        }
 
        // Create an empty stack and push root to it
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);
 
        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (nodeStack.empty() == false) {
             
            // Pop the top item from stack and print it
            Node mynode = nodeStack.peek();
            System.out.print(mynode.data + " ");
            nodeStack.pop();
 
            // Push right and left children of the popped node to stack
            if (mynode.rightNode != null) {
                nodeStack.push(mynode.rightNode);
            }
            if (mynode.leftNode != null) {
                nodeStack.push(mynode.leftNode);
            }
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNonRecurive btr = new BinaryTreeNonRecurive();
		btr.root = new Node(1);
		btr.root.leftNode = new Node(2);
		btr.root.rightNode = new Node(3);
		btr.root.leftNode.leftNode = new Node(4);
		btr.root.leftNode.rightNode = new Node(5);
		btr.iterativePreorder();
	}

}
