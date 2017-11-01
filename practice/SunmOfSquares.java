package practice;

public class SunmOfSquares {

	public boolean judgeSquareSum(int c) {
		
		int sum=0;
		int ret=0;
		for(int i=2;i<=c;i++)
		{
			sum=c/i;
			if(sum*sum==c)
			{
				return true;
			}
			else
			{
				ret=ret+sum*sum;
			}
			
			if(sum<=1)
			{
				break;
			}
		}
		if(c==2||c==1||ret==c)
		{
			return true;
		}
		else
		{
			return false;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SunmOfSquares ss= new SunmOfSquares();
		System.out.println(ss.judgeSquareSum(8));
	}

}
