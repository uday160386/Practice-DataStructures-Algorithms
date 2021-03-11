package code.core.cla;

import code.core.interf.TestInterface;

public class TestInterfaces implements TestInterface {

	@Override
	public void getColor(String color) {
		// TODO Auto-generated method stub
		
		System.out.println(color);
		System.out.println(TestInterface.S_Flow);
	}
	public static void main(String args[])
	{
		TestInterfaces ti  = new TestInterfaces();
		TestInterface.getSpeeed();
		
		
	}
}
