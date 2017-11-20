package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PalidromePairs {

	 public List<List<Integer>> palindromePairs(String[] words) {
		 
		 List anslist= new ArrayList();
		 StringBuffer sb;
		 for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words.length;j++)
			{
				if(!words[i].equals(words[j]))
				{
					sb=new StringBuffer();
					sb.append(words[i]+words[j]);
					if((words[i]+words[j]).equals(sb.reverse().toString()))
					{
						List a=new ArrayList();
						a.add(i);
						a.add(j);
						anslist.add(a);
					}
				}
				
			}
		}
		return anslist;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalidromePairs pp= new PalidromePairs();
		String a[]={"abcd", "dcba", "lls", "s", "sssll"};
		pp.palindromePairs(a);
	}

}
