package practice;
import java.util.HashMap;
public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		HashMap hm= new HashMap();
		boolean status=true;
		String a[]=str.split(" ");
		String temp=a[0];int counter=0;
		
			
		
		if(a.length==1||pattern.length()==1)
		{
			if(pattern.length()==1&&a.length==1)
				return true;
			else 
				return false;
		}
				
		else
		{
			for(int j=0;j<pattern.length();j++)
			{
				System.out.println(a[j]);
				if(temp.equalsIgnoreCase(a[j]))
					counter++;
			}	
		}
		
		if(counter==pattern.length())
			return false;
		for(int i=0;i<pattern.length();i++)
		{
			if(!(hm.containsKey(pattern.charAt(i))))
				hm.put(pattern.charAt(i), a[i]);	
			
			if(!(hm.get(pattern.charAt(i)).equals(a[i])))
				return false;
		}
		return status;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordPattern wp= new WordPattern();
		System.out.println(wp.wordPattern("query", "query"));
	}

}
