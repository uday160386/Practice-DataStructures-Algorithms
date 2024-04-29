package practice;

import java.math.BigInteger;

public class FlowerAdj {

	 public boolean canPlaceFlowers(int[] flowerbed, int n) {
		 
			 String sum="";
			 int sumi=0;
			 for(int i=0;i<flowerbed.length;i++)
			 {
				 if(flowerbed[i]==1)
					 sumi=sumi+(int)Math.pow(2, (flowerbed.length-1)-i);
			 }
			
			byte[] bytesy = Integer.toBinaryString(sumi).getBytes();
			System.out.println(~bytesy[0]);
			return false;
	    }
	public static void main(String[] args )
	{
		FlowerAdj fd=new FlowerAdj();
		int a[]={1,0,0,0,1};
		System.out.println(fd.canPlaceFlowers(a,1));
	}
}
