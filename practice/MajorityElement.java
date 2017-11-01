package practice;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	 public int majorityElement(int[] nums) {
		Map<Integer,Integer> hm = new  HashMap(); 
		if(nums.length==0)
			return 0;
		else if(nums.length==1)
			return nums[0];
		else
		{
			int c=1;
			int k=0;
			int kk=0;
			for(int i=0;i<nums.length;i++)
			{
				if(hm.get(nums[i])==null)
					hm.put(nums[i], c);
				else
					hm.put(nums[i], (int)hm.get(nums[i])+1);
			}
			for(Map.Entry<Integer,Integer> a: hm.entrySet())
			{
				if(k<a.getValue())
				{
					k=a.getValue();
					kk=a.getKey();
				}
					
			}
			return k>nums.length/2?kk:0;
		}
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorityElement me = new MajorityElement();
		int a[]={3,2,3};
		System.out.println(me.majorityElement(a));
	}

}
