/* One Away: There are three types of edits that can be performed on strings: insert a character, remove and replace.
 * Given two strings write a fucntion to check if they are one edit away.
*/
public class OneAway {

	public static void main(String[] args){
		String s1="pale";
		String s2="bake";
		System.out.println(compare(s2,s1));
	}

	private static boolean compare(String s2, String s1) {
		// TODO Auto-generated method stub
		String l,s;
		int odd = 0;
		//case1: lengths are the same;
		if(s1.length() == s2.length()){
			for(int i =0; i<s1.length();i++){
				if(s1.charAt(i)!= s2.charAt(i)){
					odd ++;
					if(odd > 1) {
						//System.out.println("Same length");
						return false;
					}
				}
			}	
			return true;
		}
		
		if(s1.length()>s2.length()){
			 l = s1;
			 s = s2;
 		}
		else {
			s = s1;
			l = s2;
		}
		
		
		for(int i =0; i< l.length();i++){
			String test = l.substring(0,i)+l.substring( i+1, l.length());
			//System.out.println(test);
			//System.out.println(s);
			if(test.equals(s)) return true;
		}
		return false;
	}
}
