package practice;

public class IntegerReplacement {
	public int integerReplacement(int n) {
		int counter1=0;
		if(n>0)
		{
			while(n!=1)
			{
				if(n%2==0)
				{
					n=n/2;
				}
				else
				{
					 if(n == 3) {
						 counter1 += 2;
			                break;
			            }
					n=(n & 2) == 2 ? n + 1 : n - 1;
				}
				counter1++;
			}
		}
		return counter1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerReplacement ir= new IntegerReplacement();
		System.out.println(ir.integerReplacement(10000));
	}

}
