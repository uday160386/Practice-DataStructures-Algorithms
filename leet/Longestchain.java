package practice;

import java.util.ArrayList;
import java.util.Collections;

public class Longestchain {

	 public int findLongestChain(int[][] pairs) {
		 
		 ArrayList al= new ArrayList();
		 int counter=0;
		 int tempc=0;
		 for(int i=0;i<pairs.length;i++)
		 {
			al.add(pairs[i][0]);
			al.add(pairs[i][1]);
		 }
		 Collections.sort(al);
		 for(int j=1;j<al.size();j++)
		 {
			 int t=j;
			 
			 if((int)al.get(j)-(int)al.get(t-1)<=1)
			 {
				 if((int)al.get(j)-(int)al.get(t-1)!=0)
				 {
					 counter=counter+1;
				 }
				 tempc=counter;
			 }
			 
			 else
			 {
				 counter=0;
				 counter++;
				 if(tempc<counter)
				 {
					 tempc=counter;
				 }
				 
			 }
		 }
		 System.out.println(tempc-1);
		return tempc-1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longestchain lc= new Longestchain();
		
		int a[][]={ {3,4}, {2,3}, {1,2}};
		lc.findLongestChain(a);
	}

}
