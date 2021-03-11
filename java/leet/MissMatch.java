package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MissMatch {

	 public int[] findErrorNums(int[] nums) {
		 int a[]=new int[2];
		 int c=0;
		 ArrayList al= new ArrayList();
		 for(int i=0;i<nums.length;i++)
		 {
			 al.add(nums[i]);
		 }
		 //Collections.sort(al);
		 Collections.reverse(al);
		 if(nums.length==0)return a;
		 else
		 {
			 for(int i=1;i<=al.size();i++)
			 {
				 int ret=i-1;
				 System.out.println(i+"      "+nums[ret]);
				 if(i!=nums[ret])
				 {
					 a[0]=nums[ret];
					 a[1]=i;
					 break;
				 }
			 }
				return a; 
		 }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissMatch mm = new MissMatch();
		int a[]={3,2,2};
		System.out.println(mm.findErrorNums(a)[0]);
	}

}
