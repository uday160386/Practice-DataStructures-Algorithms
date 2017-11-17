package practice;

public class Number {

	public boolean isNumber(String s) {
        
		int i= Integer.parseInt(s);
		if(i>Integer.MAX_VALUE)return false;
		System.out.println(i);
		return false;
    }
	public static void main(String args[])
	{
		Number n=  new Number();
		System.out.println(n.isNumber("4836e66054"));
	}
}
