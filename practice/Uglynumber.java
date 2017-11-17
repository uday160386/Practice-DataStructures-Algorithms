package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Uglynumber {

	public int nthUglyNumber(int n) {
        
		int counter=1;
		HashMap s=new HashMap();
		s.put(1, 1);
		s.put(2, 2);
		s.put(3, 3);
		s.put(5, 5);
		
		System.out.println(s.get(5));
		if(n==1)return counter;
		else
		{
			for(int i=2;i<Integer.MAX_VALUE;i++)
			{
			
				if(i%2==0||i%3==0|i%5==0)
				{
					if(s.get(i)!=null)
					{
						System.out.println(counter +"      "+n);
						if(counter==n)
						{
							return i;
						}
					}
					else if(i%2==0&&i%3==0||i%3==0&&i%5==0||i%2==0&&i%5==0)
					{
						s.put(i, i);
					}
					counter++;
				}
			}
		}
			return counter;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uglynumber un= new Uglynumber();
		System.out.println(un.nthUglyNumber(12));
		
	}

}
