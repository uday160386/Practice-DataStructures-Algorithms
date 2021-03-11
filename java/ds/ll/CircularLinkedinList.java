package code.ds.ll;

public class CircularLinkedinList {

	public int data;
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public CircularLinkedinList link;
	public CircularLinkedinList getLink() {
		return link;
	}

	public void setLink(CircularLinkedinList link) {
		this.link = link;
	}

	public CircularLinkedinList()
	{
		link=null;
		data=0;
	}
	
	public CircularLinkedinList(int data, CircularLinkedinList link)
	{
		this.link=link;
		this.data=data;
	}
}
