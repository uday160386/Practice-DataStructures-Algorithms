package practice;

import java.util.ArrayList;
import java.util.List;

public class Concat {

	 public List<Integer> findSubstring(String s, String[] words) {
		 
		 List al=new ArrayList();
		 if(s.length()==0||words.length==0) return al;
		 
		 
		 extend(words,al);
		return al;
	        
	    }
	 
	 public void extend(String[] words, List al)
	 {
		 for(int i=0;i<words.length;i++)
		 {
			 al.add(words[i]);
		 }
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concat cc= new Concat();
		String word[]={"bar","foo", "the"};
		cc.findSubstring("barfoofoobarthefoobarman", word);
	}
}
