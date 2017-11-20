package practice;

import java.util.ArrayList;

public class MaxEnvelopee {

	public int maxEnvelopes(int[][] envelopes) {
		
		if(envelopes.length==0)return 0;
		if(envelopes.length==1)return 1;
		int[] tempans=new int[2];
		tempans[0]=envelopes[0][0];
		tempans[1]=envelopes[0][1];
		int counter=1;
		for(int i=1;i<envelopes.length;i++)
		{
			if((envelopes[i][0]>tempans[0]&&envelopes[i][1]>tempans[1])||(envelopes[i][0]<tempans[0]&&envelopes[i][1]<tempans[1]))
			{
				counter++;
				tempans[0]=envelopes[i][0];
				tempans[1]=envelopes[i][1];		
			}
		}
		return counter;
     
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxEnvelopee me= new MaxEnvelopee();
		int a[][]={{30,50},{12,2},{3,4},{12,15}};
		System.out.println(me.maxEnvelopes(a));
	}

}
