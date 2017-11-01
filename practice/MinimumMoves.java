package practice;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumMoves {
	 long counter=0;
	 ArrayList al = new ArrayList();
	 public int minMoves(int[] nums) {
		 
		 if(nums.length==0||nums.length==1)
			 return 0;
		 else if (nums.length==2)
			 return nums[1]-nums[0];
		 else
		 {
			 for(int i=0;i<nums.length;i++)
			 {
				if(!al.contains(nums[i]))
					al.add(nums[i]);
			 }
			 Collections.sort(al);
			 for(int i=0;i<al.size();i++)
				counter=counter+((int)al.get(al.size()-1)-(int)al.get(i));
			return (int) (counter>Integer.MAX_VALUE?Integer.MAX_VALUE-1:counter); 
		 }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumMoves mm= new MinimumMoves();
		int a[]={5,6,8,8,5};
		System.out.println(mm.minMoves(a));
	}

}
