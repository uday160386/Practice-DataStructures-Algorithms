package practice;

import java.util.TreeSet;

public class ContainsDuplicate {

	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		
		if (k < 1 || t < 0) return false;

	    TreeSet<Integer> set = new TreeSet<>();
	    for (int i = 0; i < nums.length; i++) {
	        int c = nums[i];
	        System.out.println(c+"       "+set.floor(c));
	        if (set.floor(c) != null && set.floor(c) >= c - t
	         || set.ceiling(c) != null && set.ceiling(c) <= c + t) {
	            return true;
	        } else {
	            set.add(c);
	            if (i >= k)  set.remove(nums[i - k]);
	        }
	    }
	    return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsDuplicate cd= new ContainsDuplicate();
		int a[]={-1,2147483647};
		System.out.println(cd.containsNearbyAlmostDuplicate(a, 1, 2147483647));
	}

}
