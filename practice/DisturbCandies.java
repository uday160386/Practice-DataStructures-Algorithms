package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DisturbCandies {

	 public int distributeCandies(int[] candies) {
		 
		   Set<Integer> kinds = new HashSet<>();
	        for (int candy : candies) kinds.add(candy);
	        System.out.println(candies.length / 2);
	        return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisturbCandies dc= new DisturbCandies();
		int [] candies={1,1,2,2,3,3,4,5};
		System.out.println(dc.distributeCandies(candies));
		
	}

}
