package practice;

public class SumOfTwo {
	
	public int getSum(int a, int b) {
		
		while(b!=0){
		       int c = a&b;
		       a=a^b;
		       b=c<<1;
		   }
		 
		   return a;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfTwo sw=new SumOfTwo();
		System.out.println(sw.getSum(2, 3));
	}

}
