package practice;

import java.util.HashMap;

public class ExcelColumnNumber {
	 public int titleToNumber(String s) {
		 String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 
		 if(s.length()==1)
		 {
			 return alpha.indexOf(s)+1;
		 }else
		 {
			 
		 }
		 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelColumnNumber r= new ExcelColumnNumber();
		System.out.println(r.titleToNumber("BA"));
	}

}
