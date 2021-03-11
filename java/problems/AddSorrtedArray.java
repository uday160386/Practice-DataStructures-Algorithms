package code.problems;

import java.util.Arrays;

class AddSorrtedArray {
	public double findMedianSortedArrays(int[] A, int[] B) {
        int  a = A.length;
        int  b = B.length;
		
        if(a>b)
        {
        	int temp[]=A;A=B;B=temp;
        	int c=a; a=b;b=c;
        }
        for(int i=0;i<a;i++)
        {
        	for(int j=0;j<b;j++)
        	{
        		if(A[i]!=B[j] && A[i]>B[j]&&j>=i)
        		{
        			
        			//System.out.println("Added element"+ A[i]);
        			System.out.println(B[j]);
        			//System.out.println(A[i]);
        		}
        		
        		else
        		{
        			//System.out.println(A[i]);
        		}
        	}
        	
        }
        
        return 0;
    }
    
    public static void main(String args[])
    {
    	AddSorrtedArray aa= new AddSorrtedArray();
    	int nums1[]={1,2,7};
    	int nums2[]={0,1,2,3,4,5};
    	
    	//case1: 6/3=2
    	//Case 2: 
    	System.out.println(aa.findMedianSortedArrays(nums1, nums2));
    }
}