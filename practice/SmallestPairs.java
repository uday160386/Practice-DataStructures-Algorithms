package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SmallestPairs {

	public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		
		    ArrayList al= new ArrayList();
			ArrayList ans=new ArrayList();
			
			if(nums1.length==0 || nums2.length==0) return al;
			for(int i=0;i<nums1.length;i++)
			{
				for(int j=0;j<nums2.length;j++)
				{
					int a[] =new int[2];
					a[0]=nums1[i];
					a[1]=nums1[j];
					al.add(nums1[i]+nums2[j]);
				}
			}
			return ans;
        
    }
	public static void main(String args[])
	
	{
		SmallestPairs sp = new SmallestPairs();
		int a[]={1,2,4,5,6};
		int b[]={3,5,7,9};
		sp.kSmallestPairs(a, b, 3);

	}
}
