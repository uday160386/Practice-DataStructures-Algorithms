package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Firstpositive {

	 public int firstMissingPositive(int[] nums) {
		 Set ss=new TreeSet();
		 if(nums.length==0||nums.length==1&&nums[0]!=1)return 1;
		 for(int i=0;i<nums.length;i++)
		 {
			 if(nums[i]>0)
				 ss.add(nums[i]);
		 }
			
		 int counter=1;
		 Iterator i= ss.iterator();
		 while(i.hasNext())
		 {
			 int a=(int)i.next();
			 if(counter==a)
				 counter++;
			 else
				 return counter;
		 }
		 if(counter<nums.length)
				return counter;
		return counter;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firstpositive fp=new Firstpositive();
		int a[]={3,4,-1,1};
		System.out.println(fp.firstMissingPositive(a));
	}

}
