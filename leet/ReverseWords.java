package practice;

public class ReverseWords {
	public String reverseWords(String s) {
		
		String list[]=s.trim().split(" ");
		String ans="";
		if(s.length()==0 ||s.length()==1) return s.trim();
		for(int i=list.length-1;i>=0;i--)
		{
			if(!list[i].equals(""))
				ans=ans+list[i]+" ";
		}
		return ans.trim();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWords rw=  new ReverseWords();
		System.out.println(rw.reverseWords("   a   b "));
	}

}
