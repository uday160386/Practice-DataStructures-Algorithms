package practice;

import java.util.ArrayList;

public class Cuts {

	 public int minCut(String s) {
		 
		 ArrayList al =  new ArrayList();
		 for(int i=0;i<s.length();i++)
		 {
			 for(int j=i;j<s.length();j++)
			 {
				 al.add(s.substring(i, j+1));
			 }
		 }
		 int counter=0;
		 for(int k=0;k<al.size();k++)
		 {
			 String temp="";
			 String str=(String)al.get(k);
			 for(int n=str.length()-1;n>=0;n--)
				 temp=temp+str.charAt(n);
			 if(temp.equals(str))
				 counter++;
		 }
		 System.out.println(counter);
		return 0;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuts c= new Cuts();
		c.minCut("aab");
	}

}
