package practice;

import java.util.BitSet;

public class HammingDistance {

	public int hammingDistance(int x, int y) {
		
		return Integer.bitCount(x^y);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HammingDistance hd = new  HammingDistance();
		System.out.println(hd.hammingDistance(4, 14));
	}

}
