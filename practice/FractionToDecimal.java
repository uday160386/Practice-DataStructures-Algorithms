package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FractionToDecimal {

	public String fractionToDecimal(int numerator, int denominator) {
		
		Double d=(double)numerator/denominator;
		String ans=String.valueOf(d);
		System.out.println(ans);
		int ind=ans.indexOf(".");
		String bef=ans.substring(0,ind);
		String aft=ans.substring(ind+1,ans.length());
		int counter=0;
		if(aft.length()>1)
		{
			HashMap<Character,Integer> al = new HashMap();
			for(int i=0;i<aft.length();i++)
			{
				if(al.containsKey(aft.charAt(i)))
					al.put(aft.charAt(i), ((int)al.get(aft.charAt(i))+1));
				else
					al.put(aft.charAt(i), counter);
			}
				
			String ansfin=bef+".";
			
			for(Map.Entry<Character,Integer> s:al.entrySet())
			{
				if(s.getValue()>1)
					ansfin=ansfin+"("+s.getKey()+")";
				else
					ansfin=ansfin+s.getKey();
			}
			return ansfin;
		}
		else if(aft.length()==1&&aft.charAt(0)!='0')
			return bef+"."+aft;
		else
			return bef;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FractionToDecimal ftd= new FractionToDecimal();
		System.out.println(ftd.fractionToDecimal(1,99));
	}

}
