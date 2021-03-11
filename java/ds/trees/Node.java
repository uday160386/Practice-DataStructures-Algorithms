package code.ds.trees;

public class Node {

	public Node leftNode,rightNode;
	
	int data;
	 public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node(int item) 
	    {
	        data = item;
	        leftNode = rightNode = null;
	    }
}
