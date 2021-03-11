package practice;

public class PowerOfFour {
	public boolean isPowerOfFour(int num) {
		  while(num>0)
		  {
			  if(num==1)
				  return true;
			 
			  if(num%4!=0)
				  return false;
			  else
				  num=num/4;
		  }
		  
		  if(num<=Integer.MIN_VALUE)
			  return false;
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerOfFour pf= new PowerOfFour();
		System.out.println(pf.isPowerOfFour(16));
	}

}
