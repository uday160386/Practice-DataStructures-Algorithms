package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordBreak {

	public boolean wordBreak(String s, List<String> wordDict) {
        boolean ans=true;
        HashMap hm = new HashMap();
        String s1;
		String s2;
		
		for(int j=0;j<wordDict.size();j++)
	        	hm.put(wordDict.get(j), true);	
		 
		if(wordDict.size()==0||s.length()==0)return false;
		else if(s.length()==1)
		{
			if(hm.get(s)!=null) return true;
			else return false;
		}
		else
		{
			 for(int i=0;i<s.length();i++)
				{
				 for(int j=i+1;j<s.length();j++)
				 {
					 s1= s.substring(i, j); 
					 s2=s.substring(j, s.length());
					 System.out.println(s1+"      "+s2);
					 if((hm.get(s1)!=null && hm.get(s2)!=null)&&((boolean)hm.get(s1)||(boolean)hm.get(s2)))
							return true;
				 }
				}
		}
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordBreak wb = new WordBreak();
		List s=new ArrayList();
		s.add("a");
		s.add("abc");
		s.add("b");
		s.add("cd");
		System.out.println(wb.wordBreak("abcd", s));
	}
}
