import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class MedianOfSortedArray {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		ArrayList ts= new ArrayList();
		double temp = 0;
		if(nums1.length!=0&&nums2.length!=0)
		{
			for(int i=0;i<nums1.length;i++)
				ts.add(nums1[i]);
			for(int j=0;j<nums2.length;j++)
				ts.add(nums2[j]);
			Collections.sort(ts);
			Iterator i= ts.iterator();
			int counter=0;
			nums1=new int[ts.size()];
			while(i.hasNext()&&counter<=ts.size()-1)
			{
				nums1[counter]=(int) i.next();
				counter++;
			}
			
		}
		
		else if(nums1.length==0)
			nums1=nums2;
		
		int  size=nums1.length;
		if(size%2==0 &&size>1)
			temp=(nums1[(size/2)]+nums1[size/2-1])/2.0;
		else
		{
			if(size==1)
				temp=nums1[0];
			else
				temp=nums1[size/2];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianOfSortedArray msa = new MedianOfSortedArray();
		int [] L1={1,3};
		int [] L2={2};
		System.out.println(msa.findMedianSortedArrays(L1, L2));
	}

}
