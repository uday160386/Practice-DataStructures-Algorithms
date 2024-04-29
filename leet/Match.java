package practice;

public class Match {

	 public boolean isMatch(String s, String p) {

		 if(s.length()==0||p.length()==0) return false;
		 if(s.equals(p)) return true;
		 
		 else
		 {
			 if(p.length()==1&&p.charAt(0)=='*')return true;
			 else if(p.length()==1&&p.charAt(0)=='?'&&s.length()==1)return true;
			 for(int i=0;i<p.length();i++)
			 {
				if(i==0&&p.charAt(0)=='*')return true;
				else if(p.contains("*"))
				{
					String t1= p.substring(0, p.indexOf('*'));
					if(s.length()>=t1.length())
					{
						String t2=s.substring(0, p.indexOf('*'));
						if(t1.equals(t2))return true;
					}
				}
			 }
			 for(int i=0;i<p.length();i++)
			 {
				 if(i==0&&p.charAt(0)=='?'&& s.length()==1)return true;
				 else if(p.contains("*"))
					{
						String t1= p.substring(p.indexOf('?')+1, p.length());
						if(s.length()>=t1.length())
						{
							String t2=s.substring(p.indexOf('?')+1, s.length());
							if(t1.equals(t2))return true; 	
						}
				 }
			 }
		 }
		return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Match m = new Match();
		System.out.println(m.isMatch("a", "ab*"));
	}

}
