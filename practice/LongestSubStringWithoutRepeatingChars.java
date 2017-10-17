package practice;

import java.util.HashSet;
import java.util.Set;

//3:https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubStringWithoutRepeatingChars {

	public int lengthOfLongestSubstring(String s) {
		
		int len=s.length();
		if(len==0)
		return 0;
		if(len==1)
			return 1;
		if(len>1)
		{
			Set<Character> ss = new HashSet<>();
	        int as = 0, i = 0, j = 0;
	        while (i < len && j < len) {
	            // try to extend the range [i, j]
	        	
	            if (!ss.contains(s.charAt(j))){
	            	ss.add(s.charAt(j++));
	                as = Math.max(as, j - i);
	            }
	            else {
	            	ss.remove(s.charAt(i++));
	            }
	        }
	        return  as;
		}
		return 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubStringWithoutRepeatingChars lswr =new LongestSubStringWithoutRepeatingChars();
		System.out.println(lswr.lengthOfLongestSubstring("abcabcbb"));
		//System.out.println(lswr.lengthOfLongestSubstring("a"));
	}

}
