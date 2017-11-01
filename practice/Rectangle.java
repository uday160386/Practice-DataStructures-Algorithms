package practice;

public class Rectangle {
	 public int[] constructRectangle(int area) {
		 
		int[] g1= new int[2];
		int diff=0;
		int tempdiff=0;
		 for(int i=1;i<=area;i++)
		 {
			 int[] temp = new int[2];
			 if(area%i==0)
			 {
				 temp[0]=area/i;
				 temp[1]=i;
				 
				 if(temp[1]<=temp[0])
				 {
					 diff=temp[1]-temp[0];
					 if(diff<=tempdiff)
						 tempdiff=diff;
					g1=temp;
				 }
			 }
		 }
		return g1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r= new Rectangle();
		r.constructRectangle(4);
	}

}
