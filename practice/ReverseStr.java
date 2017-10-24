package practice;

public class ReverseStr {
	
	public String reverseStr(String s, int k) {
		
		String temp="";
		if(s.length()==1)
		{
			return s;
		}
		else if(s.length()<=k)
		{
			for(int i=s.length()-1;i>=0;i--)
				temp=temp+s.charAt(i);
			
			return temp;
		}
		else
			
		{
			for(int i=0;i<=s.length()-1;i+=k*2)
			{
				int tempi;
				int j=i;
				{
					if(j+k>=s.length())
					{
						tempi=s.length();
					}
					else
					{
						tempi=j+k;
						
					}
					temp=s.substring(i, tempi);
					String s2="";
					for(int n=temp.length()-1;n>=0;n--)
						s2=s2+temp.charAt(n);
					
					if(i!=0)
						s=s.substring(0,i)+s2+s.substring(tempi, s.length());
					else
						s=s2+s.substring(j+k,s.length());
				}
			}
		}
		return s;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStr st= new ReverseStr();
		System.out.println(st.reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl",39));
	}

}
