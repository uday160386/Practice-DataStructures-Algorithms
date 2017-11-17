package practice;

import java.util.ArrayList;
import java.util.Collections;

public class SplitArray {

	 public int splitArray(int[] nums, int m) {
		 
		 ArrayList al=new ArrayList();
		 int sum=0;
		 int counter=0;
		 if(nums.length==0) return 0;
		 
		 else if(nums.length==1) return nums[0];
		 else
		 {
			 for(int i=0;i<nums.length;i++)
			 {
				 sum=sum+nums[i];
				 counter++;
				 System.out.println(Math.abs(nums.length/m));
				 if(counter==Math.abs(nums.length/m))
				 {
					 al.add(sum);
					 counter=0;
					 sum=0;
				 }
			 }
			 Collections.sort(al);
		 }
		return (int) al.get(al.size()-1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitArray sa= new  SplitArray();
		int a[]={7,2,5,10,8};
		System.out.println(sa.splitArray(a, 2));
	}

}
