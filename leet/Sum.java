package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Sum {

	public boolean threeSum(int[] nums) {
		
		if(nums.length<3)return false;
		HashSet<String> s = new HashSet();
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length&&nums[i]<nums[j];j++)
			{
				for(int k=j+1;k<nums.length&&nums[k]<nums[j];k++)
				{
					if(nums[i]<nums[k])
						return true;
				}
			}
		}
		return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s= new Sum();
		int a[] ={3,5,0,3,4};
		System.out.println(s.threeSum(a));
		
	}

}
