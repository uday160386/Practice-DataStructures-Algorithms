package practice;

import java.util.ArrayList;
import java.util.Collections;

public class MaxGap {

	 public int maximumGap(int[] nums) {
	        
		 	int max=0;
	        if(nums.length<2)return 0;
	        ArrayList al = new ArrayList();
	        for(int i=0;i<nums.length;i++)
	        {
	        	al.add(nums[i]);
	        }
	        Collections.sort(al);
	        for(int j=0;j<al.size()-1;j++)
	        {
	        	System.out.println(al.get(j));
	        	max=Math.max(max, ((int)al.get(j+1)-(int)al.get(j)));
	        }
	        	
	        
	        System.out.println(max);
			return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxGap mg= new MaxGap();
		int a[]={1,4,5,6,7,2,3,40};
		mg.maximumGap(a);
	}

}
