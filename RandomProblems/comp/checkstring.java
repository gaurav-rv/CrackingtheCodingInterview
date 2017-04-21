package comp;

import java.util.Arrays;
import java.util.HashSet;

public class checkstring {
	public static void main(String args[]){
		String n = "aabbcde";
		String n1 = "abcde";
		System.out.println(Check(n));
		System.out.println(Check(n1));
		System.out.println(Check1(n));
		System.out.println(Check1(n1));
	}

	private static boolean Check1(String n1) {
		// TODO Auto-generated method stub
		char[] chars = n1.toCharArray();
		Arrays.sort(chars);
		for(int i=1; i<chars.length;i++){
			if(chars[i]==chars[i-1]) return false;
		}
		return true;
	}

	private static boolean Check(String n) {
		// TODO Auto-generated method stub
		if(n.length() == 0) return true;
		HashSet<Character> hash = new HashSet<Character>();
		for(int i =0; i < n.length();i++ ){
			if(hash.contains(n.charAt(i))) return false;
			else hash.add(n.charAt(i));
		}
		return true;
	}
	
	
}
