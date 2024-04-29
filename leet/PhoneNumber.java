package practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class PhoneNumber {

	List ll = new ArrayList();
	String temp = null;
	List templist= new ArrayList();
	public List<String> letterCombinations(String digits) {
		
		char splitchar[] = digits.toCharArray();
		
		String temp = null;
		if(splitchar.length==0)
			return ll;
		else if(splitchar.length==1)
		{
			String value=getchars(splitchar[0]); 
			for(int i=0;i<value.length();i++)
			{
				ll.add(Character.toString(value.charAt(i)));
			}
		}
		else if(splitchar.length>1)
		{
				temp=getchars(splitchar[0]);
				for(int i=0;i<temp.length();i++)
					ll.add(temp.charAt(i));
				
				ll= chain(ll, splitchar,1);
		}	
		
		return ll;
    }
	
	public List chain(List ll, char[] splitchar, int counter)
	{
		List llnew=new ArrayList();
		templist=ll;
		if(counter<splitchar.length)
		{
			temp=getchars(splitchar[counter]);
			for(int i=0;i<ll.size();i++)
			{
				for(int j=0;j<temp.length();j++)
				{
					llnew.add(ll.get(i)+""+temp.charAt(j));
				}
			}
			counter++;
			chain(llnew,splitchar,counter);
		}
		return templist;
	}
	public String getchars(char ch)
	{
		String s="abcdefghijklmnopqrstuvwxyz";
		switch(ch)
		{
			case '2':
				return s.substring(0, 3);
			case '3':
				return s.substring(3, 6);
			case '4':
				return s.substring(6, 9);
			case '5':
				return s.substring(9, 12);
			case '6':
				return s.substring(12, 15);
			case '7':
				return s.substring(15, 19);
			case '8':
				return s.substring(19, 22);
			case '9':
				return s.substring(22, 26);
			case '1':
				return "";
			case '0':
				return "";
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneNumber pn = new PhoneNumber();
		System.out.println(pn.letterCombinations("34562789"));
	}

}
