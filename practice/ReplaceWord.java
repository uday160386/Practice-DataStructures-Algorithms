package practice;

import java.util.ArrayList;
import java.util.List;

public class ReplaceWord {

	 public int minDistance(String word1, String word2) {
	       
		 int count=0;
		 if(word2.length()==0||word1.equalsIgnoreCase(word2))return 0;
		 else if(word1.length()==0) return word2.length();
		 else
		 {
			 int word1len=word1.length();
			 int word2len=word2.length();
			 List ll= new ArrayList();
			 for(int j=0;j<word1len;j++)
			 {
				 ll.add(word1.charAt(j));
			 }
			 for(int i=0;i<word2len;i++)
			 {
				 if(word2.charAt(i)!=word1.charAt(i))
					 count++;
			 }
			 if(count!=word2.length())
				 count=count+(word2.length()-count);
			 return count;
		 }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceWord rw = new ReplaceWord();
		System.out.println(rw.minDistance("abcde", "bc"));
	}

}
