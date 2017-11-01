package practice;

public class LongestPalindrome {

	 public int longestPalindrome(String s) {
		 
		 for(int i=0;i<s.length()-1;i++)
		{
			for(int j=0;j<s.length();j++)
			{
				System.out.println(s.substring(i, j));
			}
		}
		return 0;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindrome lp=new LongestPalindrome();
		lp.longestPalindrome("abccccdd");
		
	}

}
