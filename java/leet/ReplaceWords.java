package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReplaceWords {
	public String replaceWords(List<String> dict, String sentence) {
		
		Set dictset=new HashSet();
		dictset.addAll(dict);
		String words[]=sentence.split(" ");
		
		String word="";
		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words[i].length();j++)
			{
				if(dictset.contains(words[i].substring(0, j+1)))
				{
					words[i]=words[i].substring(0, j+1);
					break;
				}
			}
		}
		
		for(int n=0;n<words.length;n++)
		{
			word=word+words[n]+" "; 
		}
		return word.substring(0,word.length()-1);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceWords rw= new ReplaceWords();
		List<String>  s=new ArrayList();
		
		s.add("a");
		s.add("aa");
		s.add("aaa");
		s.add("aaaa");
		rw.replaceWords(s, "a aanbnf a aaaa aaa aaa aaa aaaaaa bbb baba ababa");
		
 	}

}
