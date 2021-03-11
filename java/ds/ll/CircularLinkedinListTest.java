package code.ds.ll;

public class CircularLinkedinListTest {

	int size;
	CircularLinkedinList start,end;
	
	public CircularLinkedinListTest()
	{
		start=null;
		end=null;
		size=0;
	}
	
	public boolean isEmpty()
	{
		return start==null;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void insertAtStart(int data)
	{
		CircularLinkedinList cll = new CircularLinkedinList(data,null);
		cll.setLink(start);
		if(start==null)
		{
			cll.setLink(start);
			start=cll;
			end=start;
		}
		else
		{
			end.setLink(cll);
			end=cll;
		}
		
		size++;
	}
	public static void main(String args[])
	{
		CircularLinkedinListTest test =new CircularLinkedinListTest();
		test.insertAtStart(10);
		System.out.println(test.getSize());
	}
}
