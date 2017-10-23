package practice;

import java.util.ArrayList;
import java.util.Collections;

public class MaxConsectiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		
		int counter=0;
		int temp=0;
		if(nums.length==0)return 0;
		else
		{
			for(int j=0;j<nums.length;j++)
			{
				if(nums[j]==1)
				{
					counter++;
					if(temp<counter)
					{
						temp=counter;
					}
				}
				else
					counter=0;
			}
		}
		return temp;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxConsectiveOnes mo = new MaxConsectiveOnes();
		int [] nums={0,1};
		System.out.println(mo.findMaxConsecutiveOnes(nums));
	}

}
