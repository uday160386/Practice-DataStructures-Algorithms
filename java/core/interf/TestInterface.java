package code.core.interf;
public interface TestInterface {

	String S_Flow="Normal";
	
	public static void getSpeeed()
	{
		System.out.println("Printing the speed");
	}
	public default void getSpeeeding()
	{
		System.out.println("Printing the speeding");
	}
	
	
	public abstract void getColor(String color);
}
