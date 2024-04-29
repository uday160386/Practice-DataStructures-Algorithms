package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class LargestNumber {

	 public String largestNumber(int[] nums) {
		 String[] arr= new String[nums.length];
		 for(int i=0;i<nums.length;i++)
			 arr[i]=String.valueOf(nums[i]);
		 
		 Arrays.sort(arr,new Comparator<String>(){
		        public int compare(String a, String b){
		        	System.out.println((b+a).compareTo(a+b));
		            return (b+a).compareTo(a+b);
		        }
		    });
	StringBuilder sb=new StringBuilder();	 
	for(String s:arr)
		sb.append(s);
	
	while(sb.charAt(0)=='0'&&sb.length()>1)
        sb.deleteCharAt(0);
		return sb.toString();
	        
	    }
	 
	 
	 public static void main(String[] args) {
		 LargestNumber l=new LargestNumber();
		 int a[]={3, 30, 34, 5, 9};
		System.out.println(l.largestNumber(a));
	 }
	 
}
