package practice;

public class ArrayPartition {

	public int arrayPairSum(int[] nums) {
		int counter=0;
		int i=0;
		
		int holeValue=0;
		int data;
		for(int j=0;j<nums.length;j++)
		{
			int min=j;
			data=nums[j];
			holeValue=j;
			while(holeValue>0&&nums[holeValue-1]>data)
			{
				nums[holeValue]=nums[holeValue-1];
				holeValue=holeValue-1;
			}
				nums[holeValue]=data;	
		}
		while(i<nums.length)
		{
			counter=counter+Math.min(nums[i], nums[++i]);
			i++;
		}
		return counter;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPartition ap = new ArrayPartition();
		int[] nums={7,3,1,0,0,6};
		ap.arrayPairSum(nums);
	}

}
