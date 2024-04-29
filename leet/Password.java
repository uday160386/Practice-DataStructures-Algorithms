package practice;

public class Password {
	public int strongPasswordChecker(String s) {
		
		int lowchar=0;
		int uppchar=0;
		int numchar=0;
		if(s.length()==0)return 6;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				if(numchar==1)
					numchar=1;
				else
					numchar++;
			}
			if(Character.isUpperCase(s.charAt(i)))
			{
				if(uppchar==1)
					uppchar=1;
				else
					uppchar++;
			}
			if(Character.isLowerCase(s.charAt(i)))
			{
				if(lowchar==1)
					lowchar=1;
				else
					lowchar++;
			}
			if(lowchar==1&&numchar==1&&uppchar==1&&s.length()>=6 &&s.length()<=16)
				return 0;
			if(lowchar==1&&numchar==1&&uppchar==1)
				break;
		}
		if(s.length()>16)
		{
			if((lowchar+uppchar+numchar)==3)
			{
				return s.length()+(lowchar+uppchar+numchar)-16;
			}
			else
			{
				return 16-(lowchar+uppchar+numchar);
			}
			
		}
		else if(s.length()<6)
		{
			if((lowchar+uppchar+numchar)==3)
			{
				return 6-s.length();
			}
			else
			{
				return 6-(lowchar+uppchar+numchar);
			}
		}
			
		return numchar;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password p=new Password();
		System.out.println(p.strongPasswordChecker("aA123"));
	}

}
