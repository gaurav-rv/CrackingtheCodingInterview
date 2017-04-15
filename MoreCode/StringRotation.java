/*
 * Given 2 strings write code if s2 is roatation of s1 using only one call 
 */
public class StringRotation {

	public static void main(String[] args){
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(Compare(s1,s2));
	}

	private static boolean Compare(String s1, String s2) {
		if(s1.length()!=s2.length())return false;
		String test = s1;
		for(int i =0; i<s1.length();i++){
			if( test.equals(s2) )return true;
			else{
				test = test.substring(1,s1.length())+test.charAt(0); 
			}
		}
		return false;
	}
}

