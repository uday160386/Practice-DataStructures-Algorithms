package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Movezeros {
	 public void moveZeroes(int[] nums) {
	     
		 
		 int counter=0;
		 int temp=0;
		 for(int i=0;i<nums.length;i++)
		 {
			if(nums[i]==0)
				counter++;
			else
			{
				nums[temp]=nums[i];
				temp++;
			}
		 }
		 for(int j=nums.length-counter;j<nums.length;j++)
			 nums[j]=0;
		 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movezeros mz= new Movezeros();
		int a[]={0, 1, 0, 3, 12};
		mz.moveZeroes(a);
	}

}
