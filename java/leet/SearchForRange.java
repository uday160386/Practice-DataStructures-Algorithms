package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SearchForRange {

	public int[] searchRange(int[] nums, int target) {
      
		ArrayList al= new ArrayList();
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==target)
				
				al.add(i);
		}
		Collections.sort(al);
		int[] ans;
		if(al.size()==0)
		{
			ans=new int[2];
			ans[0]=-1;
			ans[1]=-1;
		}
		else if(al.size()==1)
		{
			ans=new int[2];
			ans[0]=(int)al.get(0);
			ans[1]=(int)al.get(0);
		}
		else
		{
			ans=new int[2];
			ans[0]=(int)al.get(0);
			ans[1]=(int)al.get(al.size());
		}
		return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchForRange sr= new  SearchForRange();
		int a[]={5, 7, 7, 8, 8, 10};
		sr.searchRange(a, 8);
	}

}
