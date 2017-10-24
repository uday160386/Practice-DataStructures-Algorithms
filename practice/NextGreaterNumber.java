package practice;

import java.util.HashMap;

public class NextGreaterNumber {

	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		 
		 HashMap hm=  new HashMap();
		 int c[]=new int[nums1.length];
		 
		 for(int n=0;n<nums2.length;n++)
			 hm.put(nums2[n], n);
		 
		 for(int i=0;i<nums1.length;i++)
		 {
			for(int j = (int) hm.get(nums1[i]);j<nums2.length;j++)
			{
				
				if(nums1[i]<nums2[j])
				{
					c[i]=nums2[j];
					break;
				}
				else
					c[i]=-1;
				continue;
			}
		 }
		return c;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextGreaterNumber ngn= new NextGreaterNumber();
		int[] num1={2,4};
		int[] num2={1,2,3,4};
		int f[]=ngn.nextGreaterElement(num1, num2);
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}

}
