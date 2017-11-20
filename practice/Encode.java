package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Encode {

	 Map<Integer, String> map = new HashMap<>();
	 public String encode(String longUrl) {
		  int hash = longUrl.hashCode();
		  map.put(hash, longUrl);
	        return "http://tinyurl.com/" + hash;
	    }

	 
	    // Decodes a shortened URL to its original URL.
	    public String decode(String shortUrl) {
	    	 int hash = Integer.parseInt(shortUrl.replace("http://tinyurl.com/", ""));
	         return map.get(hash);
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encode e= new Encode();
		System.out.println(e.decode("834758304"));
		
	}

}
