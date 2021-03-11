package code.ds.trees;

public class TreeManipulations {

	Node root;
	
    public TreeManipulations()

    {
        root = null;
    }
	public void insert(int data)
	{
		root = insertNode(root, data);
	}
	public Node insertNode(Node node,  int data)
	{
		
		if(node==null)
		{
			node=new Node(data);
		}
		else
			
		{
			if(node.getData()<=data)
			{
				node.leftNode=insertNode(node.leftNode,data);
			}else
			{
				node.rightNode= insertNode(node.rightNode,data);
			}
		}
		return node;
	}
	public int getCountofNodes()
	{
		return countNodes(root);
	}
	
	public void deleteNode(int data)
	{
		
		if(root ==null)
		{
			System.out.println("No node to delete");
		}
		else if(searchNode(data)==false)
		{
			System.out.println("Root not available");
		}
		else
		{
			root = deleteSNode(root, data);
		}
	}
	
	public Node deleteSNode(Node node, int data)
	{
		Node n;
		Node lt, rt;
		Node p, p2;
		System.out.println(node);
		if(node.getData()==data && node!=null)
		{
            lt = root.getLeftNode();

            rt = root.getRightNode();

            if (lt == null && rt == null)

                return null;

            else if (lt == null)

            {

                p = rt;

                return p;

            } else if (rt == null)

            {

                p = lt;

                return p;

            } else

            {

                p2 = rt;

                p = rt;

                while (p.getLeftNode() != null)

                    p = p.getLeftNode();

                p.setLeftNode(lt);

                return p2;

            }
		}
		if(data<node.getData())
		{
			 n =deleteSNode(node.getLeftNode(), data);
			 node.setLeftNode(n);
		}
		else
		{
			n =deleteSNode(node.getRightNode(), data);
			 node.setRightNode(n);
		}
		return node;
	}
	public int countNodes(Node node)
	{
		int l=1;
		if(node==null)
			return 0;
		else
		{
			l += countNodes(node.getLeftNode());
			l += countNodes(node.getRightNode());	
		}
		return l;
	}
	
	public boolean searchNode(int data)
	{
		return search(root,data);
	}
	public boolean search(Node node, int data)
	{
		if(node.getData()==data)
		{
			return true;
		}
		if(node.leftNode!=null)
		{
			if(search(node.leftNode, data))
			{
				return true;
			}
		}
		if(node.rightNode!=null)
		{
			if(search(node.rightNode, data))
			{
				return true;
			}
		}
		return false;
	}
	public void print()
	{
		printNodes(root);
	}
	public void printNodes(Node node)
	{
        if (node != null)
        {
		printNodes(node.getLeftNode());
		System.out.println(node.getData());
		printNodes(node.getRightNode());
        }
	}
	public static void main(String args[])
	{
		TreeManipulations tm = new TreeManipulations();
		tm.insert(10);
		tm.insert(5);
		tm.insert(30);
		tm.insert(2);
		tm.insert(3);
		tm.insert(7);
		
		System.out.println(tm.getCountofNodes());
		//System.out.println(tm.searchNode(5));
		tm.deleteNode(10);
		tm.print();
	}
}
