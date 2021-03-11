package practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;

public class UniqueCharacter {
	  public int firstUniqChar(String s) {
		  char ret = 0;
		  if(s.length()==0)return -1;
		  if(s.length()==1)return 0;
		  else
		  {
			  Map<Character,Integer> hm =new HashMap();
			  for(int i=0;i<s.length();i++)
			  {
				  int counter=1;
				  if(hm.get(s.charAt(i))!=null)
				  {
					  hm.put(s.charAt(i), ((int)hm.get(s.charAt(i))+1));
					  
				  }
				  else
				  {
					  hm.put(s.charAt(i), counter);
				  }
			  }
			  for(int i=0;i<s.length();i++)
			  {
				  if(hm.get(s.charAt(i))==1)
					  return i;
			  }
		  }
		return -1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharacter uc= new UniqueCharacter();
		System.out.println(uc.firstUniqChar("leetcode"));
	}

}
