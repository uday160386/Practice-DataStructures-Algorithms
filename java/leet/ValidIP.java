package practice;

import java.util.HashSet;
import java.util.Set;

public class ValidIP {

	public String validIPAddress(String IP) {
		String ipv4="IPv4";
		String ipv6="IPv6";	
		String ansret="";
		
		if(IP.startsWith(".")||IP.endsWith(".") ||IP.contains("..") ||IP.startsWith("0"))
			return "Neither";
		String ans[]=IP.split("\\.");
		if(ans.length==4&&IP.length()<=16&&IP.length()>=7 )
		{
			int counter256=0;
			for(int i=0;i<ans.length;i++)
			{
				if(ans[i].equals("256"))
					counter256++;
			}
			for(int i=0;i<ans.length;i++)
			{
				if(counter256==ans.length)
							return "Neither";
				else 
				{
					if(ans[i].length()<4)
					{
						if(ans[i].length()>1 &&ans[i].startsWith("0"))
								return "Neither";
						for(int k=0;k<ans[i].length();k++)
						{
							if(Character.isDigit(ans[i].charAt(k)))
								ansret=ipv4;
							else
								return "Neither";
						}
					}
					else
						return "Neither";
				}
			}
		}
		else if(IP.length()<=39 &&IP.length()>13)
		{
			String ansipv6[]=IP.split(":");
			
			if(ansipv6.length>8)
				return "Neither";
			else
			{
				for(int j=0;j<ansipv6.length;j++)
				{
					if(ansipv6[j].matches("^[0-9a-fA-F]+$"))
						ansret=ipv6;
					else
						return "Neither";
					if(ansipv6[j].length()>4)
						return "Neither";
				}
				
				if(IP.contains("::"))
					return "Neither";
				if(IP.equalsIgnoreCase(IP))
					ansret=ipv6;
				if(IP.startsWith(":")||IP.endsWith(":"))
					ansret="Neither";
			}
			
			
		}
		else
			ansret="Neither";
		return ansret;
        
    }
	public static void main(String args[])
	{
		ValidIP ip= new ValidIP();
		System.out.println(ip.validIPAddress("0.0.0.256"));
	}
}
