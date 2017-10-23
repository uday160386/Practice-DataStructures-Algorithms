package practice;

public class RouteCircle {
	 public boolean judgeCircle(String moves) {
		 int j=0,k =0;
		 for(int i=0;i<moves.length();i++)
		 {
			switch(moves.charAt(i))
			{
			case 'U':
				j++;break;
			case 'D':
				j--;break;
			case 'R':
				k++;break;
			case 'L':
				k--;break;
			}
		 }
		return j==0 && k==0;
	}
	public static void main(String[] args) {
		RouteCircle rc= new RouteCircle();
		System.out.println(rc.judgeCircle("LL"));
	}
}
