package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class NumberDisapeared {
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		HashMap hm = new HashMap();
		ArrayList altemp= new ArrayList();
		for(int i=0;i<nums.length;i++)	hm.put(nums[i], nums[i]);
		for(int j=1;j<=nums.length;j++)	{if(!hm.containsKey(j))altemp.add(j);}
		return altemp;
    }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		NumberDisapeared sw=new NumberDisapeared();
		int a[]={1,1};
		System.out.println(sw.findDisappearedNumbers(a));
	}
}
