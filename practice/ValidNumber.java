//65. Valid Number 

package practice;

public class ValidNumber {
	 public boolean isNumber(String s) {
		 
		try
		{
			Integer.parseInt(s);
			Float.parseFloat(s);
			Double.parseDouble(s);
			Long.parseLong(s);
				return true;
		}
		catch(NumberFormatException e)
		{
			return false;	
		}
	    }
	 public static void main(String args[])
	 {
		 ValidNumber vn = new ValidNumber();
		 System.out.println(vn.isNumber("111"));
	 }
}
