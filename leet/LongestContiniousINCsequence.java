package practice;

public class LongestContiniousINCsequence {

	 public int findLengthOfLCIS(int[] nums) {
		 if(nums.length==0)return 0;
		 if(nums.length==0)return 1;
		 int lon=0;
		 int counter=0;
		 if(nums.length>1)
		 {
			 int f=nums[0];
			 
			 for(int i=1;i<nums.length;i++)
			 {
				 if(f<nums[i])
				 {
					 counter++;
					 if(lon<counter)
						 lon=counter;
				 }
				 else
					 counter=0;
				 f=nums[i];
			 }
		 }
		return lon+1;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestContiniousINCsequence lcis = new LongestContiniousINCsequence();
		int [] nums={1,3,5,4,2,3,4,5};
		System.out.println(lcis.findLengthOfLCIS(nums));
	}

}
