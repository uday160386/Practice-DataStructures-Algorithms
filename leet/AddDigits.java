package practice;

public class AddDigits {

	 public int addDigits(int num) {
		 
		 
		 return num==0?0:(num%9==0?9:(num%9));
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDigits ad= new AddDigits();
		System.out.println(ad.addDigits(123));
	}

}
